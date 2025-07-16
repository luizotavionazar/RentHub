package br.edu.iftm.renthub.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.iftm.renthub.model.Equipamento;
import br.edu.iftm.renthub.view.RegistrosLog;

public class EquipamentoDAO {
    private final Connection conexaoBanco;
    
    public EquipamentoDAO(Connection conexao) {
        this.conexaoBanco = conexao;
    }

    RegistrosLog log = new RegistrosLog();

    public boolean cadastrar(String descricao, Integer qtdTotal, Double vlrDiaria, Double vlrMensal) throws SQLException {
        log.registrarLog(1, "EquipamentoDAO", "cadastrar", "equipamento", "Cadastrando o Equipamento no Banco de Dados");
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO equipamento (descricao, valor_diaria, valor_mensal, qtd_total) ");
        query.append("VALUES (?, ?, ?, ?)");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(query.toString())){
            stmt.setString(1, descricao);
            stmt.setDouble(2, vlrDiaria);
            stmt.setDouble(3, vlrMensal);
            stmt.setInt(4, qtdTotal);
            stmt.executeUpdate();
            log.registrarLog(2, "EquipamentoDAO", "cadastrar", "equipamento", "Equipamento cadastrado no Banco de Dados com sucesso");
            return true;
        } catch (SQLException e) {
            log.registrarLog(4, "EquipamentoDAO", "cadastrar", "equipamento", "Erro ao cadastrar o equipamento no Banco de Dados: "+ e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean alterar(Integer id, String descricao, Integer qtdTotal, Double vlrDiaria, Double vlrMensal) {
        log.registrarLog(1, "EquipamentoDAO", "alterar", "equipamento", "Alterando o Equipamento no Banco de Dados");
        StringBuilder query = new StringBuilder();
        query.append("UPDATE equipamento ");
        query.append("SET descricao = ?, valor_diaria = ?, valor_mensal = ?, qtd_total = ? ");
        query.append("WHERE id_equipamento = ?");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(query.toString())) {
            stmt.setString(1, descricao);
            stmt.setDouble(2, vlrDiaria);
            stmt.setDouble(3, vlrMensal);
            stmt.setInt(4, qtdTotal);
            stmt.setInt(5, id);
            stmt.executeUpdate();
            log.registrarLog(2, "EquipamentoDAO", "alterar", "equipamento", "Equipamento alterado com sucesso no Banco de Dados");
            return true;
        } catch (SQLException e) {
            log.registrarLog(4, "EquipamentoDAO", "alterar", "equipamento", "Erro ao alterar o equipamento no Banco de Dados: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean deletar(Integer id) {
        log.registrarLog(1, "EquipamentoDAO", "deletar", "equipamento", "Deletando o Equipamento no Banco de Dados");
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM equipamento ");
        query.append("WHERE id_equipamento = ?");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(query.toString())) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            log.registrarLog(2, "EquipamentoDAO", "deletar", "equipamento", "Equipamento deletado com sucesso no Banco de Dados");
            return true;
        } catch (SQLException e) {
            log.registrarLog(4, "EquipamentoDAO", "deletar", "equipamento", "Erro ao deletar o equipamento no Banco de Dados: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public Equipamento buscarPorId(Integer id) {
        log.registrarLog(1, "EquipamentoDAO", "buscarPorId", "equipamento", "Buscando equipamento pelo ID no Banco de Dados");
        StringBuilder query = new StringBuilder();
        query.append("SELECT id, descri FROM equipamento ");
        query.append("WHERE id_equipamento = ?");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(query.toString())) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Equipamento equipamento = new Equipamento(
                    rs.getInt("id_equipamento"),
                    rs.getInt("qtd_total"),
                    rs.getInt("qtd_disponivel"),
                    rs.getString("descricao"),
                    rs.getDouble("valor_diaria"),
                    rs.getDouble("valor_mensal"));
                log.registrarLog(2, "EquipamentoDAO", "buscarPorId", "equipamento", "Equipamento encontrado com sucesso no Banco de Dados");
                return equipamento;
            } else {
                log.registrarLog(3, "EquipamentoDAO", "buscarPorId", "equipamento", "Equipamento encontrado no Banco de Dados");
                return null;
            }
        } catch (SQLException e) {
            log.registrarLog(4, "EquipamentoDAO", "buscarPorId", "equipamento", "Erro ao buscar o equipamento no Banco de Dados: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Equipamento> listar(String sqlFiltro, List<Object> filtros) throws SQLException {
        log.registrarLog(1, "EquipamentoDAO", "listar", "equipamento", "Listando os Equipamentos cadastrados no Banco de Dados");
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT id, descricao, valor_diaria, valor_mensal, qtd_total, qtd_disponivel ");
        sql.append("FROM equipamento ");
        sql.append("Where 1 = 1 ");
        sql.append(sqlFiltro);
        sql.append("ORDER BY descricao ASC");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(sql.toString())) {
            for(int i = 0; i < filtros.size(); i++){
                stmt.setObject(i+1, filtros.get(i));
            }
            ResultSet rs = stmt.executeQuery();
            List<Equipamento> equipamentos = new ArrayList<>();
            int qtdEquipamentos = 0;
            while (rs.next()) {
                Equipamento equipamento = new Equipamento();
                equipamento.setId(rs.getInt("id"));
                equipamento.setDescricao(rs.getString("descricao"));
                equipamento.setVlrDiaria(rs.getDouble("valor_diaria"));
                equipamento.setVlrMensal(rs.getDouble("valor_mensal"));
                equipamento.setQtdTotal(rs.getInt("qtd_total"));
                equipamento.setQtdDisponivel(rs.getInt("qtd_disponivel"));
                qtdEquipamentos++;
                equipamentos.add(equipamento);
            }
            if (!equipamentos.isEmpty()) {
                log.registrarLog(2, "EquipamentoDAO", "listar", "equipamento", "Equipamentos listados - foram encontrados " + qtdEquipamentos + " registros no Banco de Dados");
            } else {
                log.registrarLog(3, "EquipamentoDAO", "listar", "equipamento", "Não foram encontrados equipamentos no Banco de Dados");
            }
            return equipamentos;
        } catch (SQLException e) {
            log.registrarLog(4, "EquipamentoDAO", "listar", "equipamento", "Erro ao listar os equipamentos do Banco de Dados: "+ e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
