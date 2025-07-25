/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.edu.iftm.renthub.view;

import br.edu.iftm.renthub.model.Totalizacao;
import java.sql.Connection;

/**
 *
 * @author jhonn 
 */
public class VerTotalizazao extends javax.swing.JDialog {
    private UtilsComponent estilo;
    /**
     * Creates new form VerTotalizazao
     */
    public VerTotalizazao(java.awt.Frame parent, boolean modal, Connection conexao) {
        super(parent, modal);
        initComponents();
        estilo = new UtilsComponent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTelaTotalizacao = new javax.swing.JPanel();
        lbTituloValor = new javax.swing.JLabel();
        lbTituloMulta = new javax.swing.JLabel();
        lbTituloJuros = new javax.swing.JLabel();
        lbTituloTotal = new javax.swing.JLabel();
        lbTituloTotalizacao = new javax.swing.JLabel();
        ffMulta = new javax.swing.JFormattedTextField();
        ffValor = new javax.swing.JFormattedTextField();
        ffJuros = new javax.swing.JFormattedTextField();
        ffTotal = new javax.swing.JFormattedTextField();
        btSair = new RoundedButton("");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnTelaTotalizacao.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloValor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloValor.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloValor.setText("Valor");

        lbTituloMulta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloMulta.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloMulta.setText("Multa");

        lbTituloJuros.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloJuros.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloJuros.setText("Juros");

        lbTituloTotal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloTotal.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloTotal.setText("Total");

        lbTituloTotalizacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTituloTotalizacao.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloTotalizacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloTotalizacao.setText("Totalização Contrato Nº");

        ffMulta.setEditable(false);
        ffMulta.setBackground(new java.awt.Color(215, 215, 215));
        ffMulta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ffValor.setEditable(false);
        ffValor.setBackground(new java.awt.Color(215, 215, 215));
        ffValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ffJuros.setEditable(false);
        ffJuros.setBackground(new java.awt.Color(215, 215, 215));
        ffJuros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ffTotal.setEditable(false);
        ffTotal.setBackground(new java.awt.Color(215, 215, 215));
        ffTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btSair.setBackground(new java.awt.Color(240, 240, 240));
        btSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSair.setForeground(new java.awt.Color(0, 0, 0));
        btSair.setText("Sair");
        btSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSairMouseExited(evt);
            }
        });
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTelaTotalizacaoLayout = new javax.swing.GroupLayout(pnTelaTotalizacao);
        pnTelaTotalizacao.setLayout(pnTelaTotalizacaoLayout);
        pnTelaTotalizacaoLayout.setHorizontalGroup(
            pnTelaTotalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTituloTotalizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnTelaTotalizacaoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pnTelaTotalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTelaTotalizacaoLayout.createSequentialGroup()
                        .addGroup(pnTelaTotalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloTotal)
                            .addComponent(lbTituloJuros)
                            .addComponent(lbTituloMulta)
                            .addComponent(lbTituloValor))
                        .addContainerGap(290, Short.MAX_VALUE))
                    .addGroup(pnTelaTotalizacaoLayout.createSequentialGroup()
                        .addGroup(pnTelaTotalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ffValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(ffMulta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ffJuros, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ffTotal, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair)
                        .addGap(25, 25, 25))))
        );
        pnTelaTotalizacaoLayout.setVerticalGroup(
            pnTelaTotalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaTotalizacaoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTituloTotalizacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTituloValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ffValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTituloMulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ffMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTituloJuros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ffJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTituloTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnTelaTotalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ffTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTelaTotalizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTelaTotalizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseEntered
        estilo.aplicaHoverEntered(btSair);
    }//GEN-LAST:event_btSairMouseEntered

    private void btSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseExited
        estilo.aplicaHoverExited(btSair);
    }//GEN-LAST:event_btSairMouseExited

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        ffJuros.setText("");
        ffMulta.setText("");
        ffValor.setText("");
        ffTotal.setText("");
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    public void preencheCampos(Totalizacao totalizacao) {
        ffJuros.setText("R$ "+totalizacao.getJuros());
        ffMulta.setText("R$ "+totalizacao.getMulta());
        ffValor.setText("R$ "+totalizacao.getValor());
        ffTotal.setText("R$ "+totalizacao.getTotal());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JFormattedTextField ffJuros;
    private javax.swing.JFormattedTextField ffMulta;
    private javax.swing.JFormattedTextField ffTotal;
    private javax.swing.JFormattedTextField ffValor;
    private javax.swing.JLabel lbTituloJuros;
    private javax.swing.JLabel lbTituloMulta;
    private javax.swing.JLabel lbTituloTotal;
    private javax.swing.JLabel lbTituloTotalizacao;
    private javax.swing.JLabel lbTituloValor;
    private javax.swing.JPanel pnTelaTotalizacao;
    // End of variables declaration//GEN-END:variables
}
