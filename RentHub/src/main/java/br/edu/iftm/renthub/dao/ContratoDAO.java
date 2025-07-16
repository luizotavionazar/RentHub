package br.edu.iftm.renthub.dao;

import br.edu.iftm.renthub.control.ClienteController;
import br.edu.iftm.renthub.control.EnderecoController;
import br.edu.iftm.renthub.model.Cliente;
import br.edu.iftm.renthub.model.Contrato;
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

public class ContratoDAO {
    private final Connection conexaoBanco;
    private ClienteController clienteController;
    private EnderecoController enderecoController;

    public ContratoDAO(Connection conexao) {
        this.conexaoBanco = conexao;
        clienteController = new ClienteController(conexao);
        enderecoController = new EnderecoController(conexao);
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
                query = new StringBuilder();
                query.append("INSERT INTO equipamento_contrato (id_contrato, id_equipamento, quantidade) ");
                query.append("VALUES (?, ?, ?)");
                try (PreparedStatement stmtEquip = conexaoBanco.prepareStatement(query.toString())) {
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

    //public Contrato buscarUltimoContrato () {
    //    String sql = "SELECT * " +
    //                 "FROM contrato "+
    //                 "ORDER BY id_contrato DESC " + 
    //                 "LIMIT 1";
    //    try (Connection conn = ConexaoDAO.conexaoBd();){
    //        PreparedStatement stmt = conn.prepareStatement(sql);
    //        ResultSet rs = stmt.executeQuery();
    //        if (rs.next()) {
    //            return new Contrato(rs.getInt("tipo"), rs.getInt("qtd_equip"), rs.getString("data_inicio"), 
    //            rs.getString("data_fim"), rs.getString("data_entrega"), rs.getString("status"));
    //        }
    //        return null;
    //    } catch (SQLException e) {
    //        e.printStackTrace();
    //        System.out.println("Erro ao obter o Último Contrato Cadastrado");
    //        return null;
    //    }
    //}

    public Contrato buscarContrato (int id) {
        String sql = "SELECT c.id_contrato, c.tipo, c.id_cliente, cl.nome AS nome_cliente, " +
                "c.id_equip, e.descricao AS descricao_equipamento, " +
                 "c.qtd_equip, c.data_inicio, c.data_fim, c.data_entrega, c.status " +
                 "FROM contrato c " +
                 "JOIN cliente cl ON c.id_cliente = cl.id_cliente " +
                 "JOIN equipamento e ON c.id_equip = e.id_equip " +
                 "WHERE id_contrato = ?";
        try (Connection conn = ConexaoDAO.conexaoBd();){
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                List<Equipamento> equipamentos = buscarEquipamentoContrato(id);
                Cliente cliente = clienteController.buscarPorId(rs.getInt("id_cliente"));
                Contrato contrato = new Contrato();
                contrato.setCliente(cliente);
                contrato.setEquipamentos(equipamentos);
                if(rs.getString("status").equals("ATIVO")){
                    contrato.setStatus(Contrato.Status.ATIVO);
                }else if(rs.getString("status").equals("CANCELADO")){
                    contrato.setStatus(Contrato.Status.CANCELADO);
                }else{
                    contrato.setStatus(Contrato.Status.FINALIZADO);
                }
                if(rs.getString("tipo").equals("DIARIO")){
                    contrato.setTipo(Contrato.Tipo.DIARIO);
                }else {
                    contrato.setTipo(Contrato.Tipo.MENSAL);
                }
                contrato.setDataInicio(rs.getDate("data_inicio").toLocalDate());
                contrato.setDataFim(rs.getDate("data_fim").toLocalDate());
                contrato.setDataEntrega(rs.getDate("data_entrega").toLocalDate());
                return contrato;
            }
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Equipamento> buscarEquipamentoContrato(int idContrato){
        List<Equipamento> equipamentos = new ArrayList<>();
        String sql = "SELECT e.id, e.descricao, e.valor_diaria, e.valor_mensal, ec.quantidade " +
                "FROM equipamento e " +
                "JOIN equipamento_contrato ec ON ec.id_equipamento = e.id" +
                "WHERE ec.id_contrato = ?";
        try(Connection conn = ConexaoDAO.conexaoBd()){
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                equipamentos.add(new Equipamento(rs.getInt("id"), rs.getString("descricao"), rs.getDouble("valor_diaria"), rs.getDouble("valor_mensal"), rs.getInt("quantidade")));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return equipamentos;
    }
    //public ArrayList<Contrato> listarContratoAtivo () {
    //    ArrayList<Contrato> contratos = new ArrayList<>();
    //    String sql = "SELECT c.id_contrato, c.tipo, c.id_cliente, cl.nome AS nome_cliente, " +
    //            "c.id_equip, e.descricao AS descricao_equipamento, " +
    //             "c.qtd_equip, c.data_inicio, c.data_fim, c.data_entrega, c.status " +
    //             "FROM contrato c " +
    //             "JOIN cliente cl ON c.id_cliente = cl.id_cliente " +
    //             "JOIN equipamento e ON c.id_equip = e.id_equip " +
    //             "WHERE c.status = 'A'";
    //    try (Connection conn = ConexaoDAO.conexaoBd();){
    //        PreparedStatement stmt = conn.prepareStatement(sql);
    //        ResultSet rs = stmt.executeQuery();
    //        while (rs.next()) {
    //            contratos.add(new Contrato(rs.getInt("id_contrato"), rs.getInt("id_cliente"), 
    //            rs.getString("nome_cliente"), rs.getInt("id_equip"), rs.getString("descricao_equipamento"), 
    //            rs.getInt("tipo"), rs.getInt("qtd_equip"), rs.getString("data_inicio"), 
    //            rs.getString("data_fim"), rs.getString("data_entrega"), rs.getString("status")));
    //        }
    //    } catch (SQLException e) {
    //        e.printStackTrace();
    //    }
    //    return contratos;
    //}

    //public ArrayList<Contrato> listarContratoEncerrado () {
    //    ArrayList<Contrato> contratos = new ArrayList<>();
    //    String sql = "SELECT c.id_contrato, c.tipo, c.id_cliente, cl.nome AS nome_cliente, " +
    //            "c.id_equip, e.descricao AS descricao_equipamento, " +
    //             "c.qtd_equip, c.data_inicio, c.data_fim, c.data_entrega, c.status " +
    //             "FROM contrato c " +
    //             "JOIN cliente cl ON c.id_cliente = cl.id_cliente " +
    //             "JOIN equipamento e ON c.id_equip = e.id_equip " +
    //             "WHERE c.status = 'F' or c.status = 'C'" + 
    //             "ORDER BY c.id_contrato ASC";
    //    try (Connection conn = ConexaoDAO.conexaoBd();){
    //        PreparedStatement stmt = conn.prepareStatement(sql);
    //        ResultSet rs = stmt.executeQuery();
    //        while (rs.next()) {
    //            contratos.add(new Contrato(rs.getInt("id_contrato"), rs.getInt("id_cliente"), 
    //            rs.getString("nome_cliente"), rs.getInt("id_equip"), rs.getString("descricao_equipamento"), 
    //            rs.getInt("tipo"), rs.getInt("qtd_equip"), rs.getString("data_inicio"), 
    //            rs.getString("data_fim"), rs.getString("data_entrega"), rs.getString("status")));
    //        }
    //    } catch (SQLException e) {
    //        e.printStackTrace();
    //    }
    //    return contratos;
    //}

    //public ArrayList<Contrato> listarContrato () {
    //    ArrayList<Contrato> contratos = new ArrayList<>();
    //    String sql = "SELECT c.id_contrato, c.tipo, c.id_cliente, cl.nome AS nome_cliente, " +
    //            "c.id_equip, e.descricao AS descricao_equipamento, " +
    //             "c.qtd_equip, c.data_inicio, c.data_fim, c.data_entrega, c.status " +
    //             "FROM contrato c " +
    //             "JOIN cliente cl ON c.id_cliente = cl.id_cliente " +
    //             "JOIN equipamento e ON c.id_equip = e.id_equip ";
    //    try (Connection conn = ConexaoDAO.conexaoBd();){
    //        PreparedStatement stmt = conn.prepareStatement(sql);
    //        ResultSet rs = stmt.executeQuery();
    //        while (rs.next()) {
    //            contratos.add(new Contrato(rs.getInt("id_contrato"), rs.getInt("id_cliente"), 
    //            rs.getString("nome_cliente"), rs.getInt("id_equip"), rs.getString("descricao_equipamento"), 
    //            rs.getInt("tipo"), rs.getInt("qtd_equip"), rs.getString("data_inicio"), 
    //            rs.getString("data_fim"), rs.getString("data_entrega"), rs.getString("status")));
    //        }
    //    } catch (SQLException e) {
    //        e.printStackTrace();
    //    }
    //    return contratos;
    //}

    //public String encerrarContrato (int id, String forma, LocalDate dataAtual) {
    //    String sql = "UPDATE contrato SET data_entrega = ?, status = ? WHERE id_contrato = ?";
    //    try (Connection conn = ConexaoDAO.conexaoBd();){
    //        PreparedStatement stmt = conn.prepareStatement(sql);
    //        stmt.setDate(1, Date.valueOf(dataAtual));
    //        stmt.setString(2, forma);
    //        stmt.setInt(3, id);
    //        stmt.executeUpdate();   
    //        return "Contrato encerrado com sucesso!";
    //    } catch (SQLException e) {
    //        return "Erro ao encerrar o Contrato";
    //    }
    //}

    //public boolean verificarEquipamentoEmContratoAtivo (int idEquip) {
    //    String sql = "SELECT COUNT(*) FROM contrato WHERE id_equip = ? AND status = 'A'";
    //    try (Connection conn = ConexaoDAO.conexaoBd();){
    //        PreparedStatement stmt = conn.prepareStatement(sql);
    //        stmt.setInt(1, idEquip);
    //        ResultSet rs = stmt.executeQuery();   
    //        if (rs.next() && rs.getInt(1) > 0) {
    //            return true;
    //        }
    //    } catch (SQLException e) {
    //        e.printStackTrace();
    //    } 
    //    return false;
    //}

    //public boolean verificarClienteEmContratoAtivo (int id) {
    //    String sql = "SELECT COUNT(*) FROM contrato WHERE id_cliente = ? AND status = 'A'";
    //    try (Connection conn = ConexaoDAO.conexaoBd();){
    //        PreparedStatement stmt = conn.prepareStatement(sql);
    //        stmt.setInt(1, id);
    //        ResultSet rs = stmt.executeQuery();   
    //        if (rs.next() && rs.getInt(1) > 0) {
    //            return true;
    //        }
  //    } catch (SQLException e) {
  //        e.printStackTrace();
  //    } 
  //    return false;
  //}
}
