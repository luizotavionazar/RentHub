package br.edu.iftm.renthub.dao;

import br.edu.iftm.renthub.control.ClienteController;
import br.edu.iftm.renthub.model.Cliente;
import br.edu.iftm.renthub.model.Contrato;
import br.edu.iftm.renthub.model.Contrato.Status;
import br.edu.iftm.renthub.model.Contrato.Tipo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import br.edu.iftm.renthub.model.Equipamento;
import br.edu.iftm.renthub.view.RegistrosLog;
import java.util.ArrayList;
import java.sql.Date;

public class ContratoDAO {
    private final Connection conexaoBanco;
    private ClienteController clienteController;

    public ContratoDAO(Connection conexao) {
        this.conexaoBanco = conexao;
        clienteController = new ClienteController(conexao);
    }

    RegistrosLog log = new RegistrosLog();

    public boolean cadastrar(Integer idCliente, String tipo, String status, LocalDate dataInicio, LocalDate dataFim, List<Equipamento> equipamentos) throws SQLException {
        log.registrarLog(1, "ContratoDAO", "cadastrar", "contrato, equipamento_contrato", "Cadastrando o contrato no banco de dados");
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO contrato (id_cliente, tipo, status, data_inicio, data_fim) ");
        query.append("VALUES (?, ?, ?, ?, ?)");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(query.toString(), PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, idCliente);
            stmt.setString(2, tipo);
            stmt.setString(3, status);
            stmt.setObject(4, dataInicio);
            stmt.setObject(5, dataFim);
            stmt.executeUpdate();
            log.registrarLog(2, "ContratoDAO", "cadastrar", "contrato", "Contrato cadastrado no banco de dados");
            log.registrarLog(1, "ContratoDAO", "cadastrar", "equipamento_contrato", "Cadastrando a relação do equipamento com o contrato no banco de dados");
            Integer idContrato = null;
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    idContrato = rs.getInt(1);
                }
            } catch (SQLException e) {
                log.registrarLog(4, "ContratoDAO", "cadastrar", "contrato", "Erro ao obter o ID do contrato no Banco de Dados: "+ e.getMessage());
                e.printStackTrace();
            }
            List<Equipamento> temp = equipamentos;
            Iterator<Equipamento> iter = temp.iterator();
            while (iter.hasNext()) {
                Equipamento equipTemp = iter.next();
                StringBuilder queryRelacao = new StringBuilder();
                queryRelacao.append("INSERT INTO equipamento_contrato (id_contrato, id_equipamento, quantidade) ");
                queryRelacao.append("VALUES (?, ?, ?)");
                try (PreparedStatement stmtEquip = conexaoBanco.prepareStatement(queryRelacao.toString())) {
                    stmtEquip.setInt(1, idContrato);
                    stmtEquip.setInt(2, equipTemp.getId());
                    stmtEquip.setInt(3, equipTemp.getQtdContrato());
                    stmtEquip.executeUpdate();
                    log.registrarLog(2, "ContratoDAO", "cadastrar", "equipamento_contrato", "Relação de equipamento com  ocontrato cadastrada no banco de dados");
                } catch (SQLException e) {
                    log.registrarLog(4, "ContratoDAO", "cadastrar", "equipamento_contrato", "Erro ao cadastrar a relação do equipamento com o contrato no banco de dados: "+ e.getMessage());
                    e.printStackTrace();
                }
            }
            return true;
        } catch (SQLException e) {
            log.registrarLog(4, "ContratoDAO", "cadastrar", "contrato, equipamento_contrato", "Erro ao cadastrar o contrato no banco de dados: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public List<Contrato> listar(String filtrosSql, List<Object> filtros) throws SQLException {
        StringBuilder query = new StringBuilder();
        query.append("SELECT c.id AS id_contrato, cl.id AS id_cliente, cl.nome AS nome_cliente, c.data_inicio, c.data_fim, c.data_entrega, c.status , c.tipo ");
        query.append("FROM contrato c ");
        query.append("JOIN cliente cl ON cl.id = c.id_cliente ");
        query.append("WHERE 1=1 ");
        query.append(filtrosSql);
        query.append(" ORDER BY c.data_inicio ASC");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(query.toString())) {
            for (int i = 0; i < filtros.size(); i++) {
                Object campo = filtros.get(i);
                if (campo instanceof LocalDate) {
                    stmt.setDate(i + 1, java.sql.Date.valueOf((LocalDate) campo));
                } else {
                    stmt.setObject(i + 1, campo);
                }
            }
            ResultSet rs = stmt.executeQuery();
            List<Contrato> contratos = new ArrayList<>();
            int qtdContratos = 0;
            while (rs.next()) {
                Contrato contrato = new Contrato();
                contrato.setId(rs.getInt("id_contrato"));
                contrato.setTipo(Tipo.fromString(rs.getString("tipo")));
                contrato.setStatus(Status.fromString(rs.getString("status")));
                contrato.setDataInicio(rs.getDate("data_inicio").toLocalDate());
                contrato.setDataFim(rs.getDate("data_fim").toLocalDate());

                Date dataEntregaSql = rs.getDate("data_entrega");
                if (dataEntregaSql != null) {
                    contrato.setDataEntrega(dataEntregaSql.toLocalDate());
                }
                int idcliente = rs.getInt("id_cliente");
                Cliente cliente = clienteController.buscarPorId(idcliente);
                contrato.setCliente(cliente);
                contrato.setEquipamentos(buscarEquipamentoContrato(rs.getInt("id_contrato")));
                contratos.add(contrato);
                qtdContratos++;
            }
            if (!contratos.isEmpty()) {
                log.registrarLog(2, "ContratoDAO", "listarContratos", "contrato, cliente", "Foram encontrados " + qtdContratos + " contratos.");
            } else {
                log.registrarLog(3, "ContratoDAO", "listarContratos", "contrato, cliente", "Nenhum contrato encontrado.");
            }

            return contratos;

        } catch (SQLException e) {
            log.registrarLog(4, "ContratoDAO", "listarContratos", "contrato, cliente", "Erro ao listar contratos: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Equipamento> buscarEquipamentoContrato(int idContrato){
        List<Equipamento> equipamentos = new ArrayList<>();
        String sql = "SELECT e.id, e.descricao, e.valor_diaria, e.valor_mensal, ec.quantidade " +
                "FROM equipamento e " +
                "JOIN equipamento_contrato ec ON ec.id_equipamento = e.id " +
                "WHERE ec.id_contrato = ?";
        try(PreparedStatement stmt = conexaoBanco.prepareStatement(sql)){
            stmt.setInt(1, idContrato);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                equipamentos.add(new Equipamento(rs.getInt("id"), rs.getString("descricao"), rs.getDouble("valor_diaria"), rs.getDouble("valor_mensal"), rs.getInt("quantidade")));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return equipamentos;
    }

    public boolean encerrar(Integer id, String status, LocalDate dataAtual) {
        String sql = "UPDATE contrato SET data_entrega = ?, status = ? WHERE id = ?";
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(sql)) {
            stmt.setDate(1, Date.valueOf(dataAtual));
            stmt.setString(2, status);
            stmt.setInt(3, id);
            stmt.executeUpdate();   
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
