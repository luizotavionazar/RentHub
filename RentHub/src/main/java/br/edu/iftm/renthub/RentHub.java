package br.edu.iftm.renthub;

import java.sql.Connection;
import java.sql.SQLException;

import br.edu.iftm.renthub.dao.ConexaoDAO;
import br.edu.iftm.renthub.view.RegistrosLog;
import br.edu.iftm.renthub.view.TelaPrincipal;

public class RentHub {
    private static Connection conexao;
    public static void main(String[] args) {
        RegistrosLog log = new RegistrosLog();
        try {
            log.registrarLog(1, "RentHub", "main", "", "Iniciando o sistema");
            conexao = ConexaoDAO.conexaoBd();
            java.awt.EventQueue.invokeLater(() -> {
                try {
                    TelaPrincipal tela = new TelaPrincipal(conexao);
                    tela.setVisible(true);
                    log.registrarLog(2, "RentHub", "main", "", "Sistema iniciado com sucesso");
                } catch (SQLException e) {
                    log.registrarLog(4, "RentHub", "main", "", "Erro ao iniciar o sistema: " + e.getMessage());
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            log.registrarLog(4, "RentHub", "main", "", "Erro ao tentar conectar ao banco de dados: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
