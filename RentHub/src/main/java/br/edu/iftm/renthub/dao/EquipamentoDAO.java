package br.edu.iftm.renthub.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;

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

    public boolean alterar(int id, String descricao, Integer qtdTotal, Double vlrDiaria, Double vlrMensal) {
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

    public boolean deletar(int id) {
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

    public Equipamento buscarPorId(int id) {
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

    //FAZER SEMELHANTE A BUSCA FILTRADA UTILIZADA NO PROJETO NOSSO LAR
    //public List<Equipamento> listar() {
    //    List<Equipamento> equipamentos = new ArrayList<>();
    //    String query = "SELECT * FROM equipamento order by id_equip ASC";
    //    try (Connection conn = ConexaoDAO.conexaoBd();){
    //        PreparedStatement stmt = conn.prepareStatement(query);
    //        ResultSet rs = stmt.executeQuery();
    //        while (rs.next()) {
    //            
    //        }
    //    } catch (SQLException e) {
    //        e.printStackTrace();
    //    }
    //    return equipamentos;
    //}

    
}
