package br.edu.iftm.renthub.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import br.edu.iftm.renthub.control.TotalizacaoController;
import br.edu.iftm.renthub.model.Contrato;
import br.edu.iftm.renthub.model.Totalizacao;
import br.edu.iftm.renthub.view.RegistrosLog;

public class TotalizacaoDAO {
    private final Connection conexaoBanco;
    private TotalizacaoController totalizacaoController;

    public TotalizacaoDAO(Connection conexao) {
        this.conexaoBanco = conexao;
        this.totalizacaoController = new TotalizacaoController(conexao);
    }

    RegistrosLog log = new RegistrosLog();

    public boolean totalizar(Integer idContrato, double valor, double juros, double multa) {
        String sql = "INSERT INTO totalizacao (id_contrato, valor, juros, multa) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(sql)) {
            stmt.setInt(1, idContrato);
            stmt.setDouble(2, valor);
            stmt.setDouble(3, multa);
            stmt.setDouble(4, juros);
            stmt.executeUpdate();   
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public Totalizacao buscarPorContrato(Integer idContrato) {
        String sql = "SELECT id, valor, juros, multa FROM totalizacao where id_contrato = ?";
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(sql)){
            stmt.setInt(1, idContrato);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Totalizacao totalizacao = new Totalizacao(rs.getInt("id"), 
                                                          idContrato,
                                                          rs.getDouble("valor"),
                                                          rs.getDouble("juros"),
                                                          rs.getDouble("multa"),
                                                          totalizacaoController.calcularTotal(rs.getDouble("valor"), rs.getDouble("multa"), rs.getDouble("juros")));
            return totalizacao;
            } else {
                return null;
            }            
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
