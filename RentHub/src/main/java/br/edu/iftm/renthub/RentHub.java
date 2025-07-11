/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.iftm.renthub;

import java.sql.SQLException;

import br.edu.iftm.renthub.dao.ConexaoDAO;
import br.edu.iftm.renthub.view.TelaPrincipal;

public class RentHub {

    public static void main(String[] args) throws SQLException {
        boolean controle = false;
        try {
            ConexaoDAO.conexaoBd();
            controle = true;
        } catch (Exception e) {
            controle = false;
        }
        if (controle) {
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
        }
    }
}
