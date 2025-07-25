/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.edu.iftm.renthub.view;

import br.edu.iftm.renthub.control.ClienteController;
import br.edu.iftm.renthub.model.Cliente;
import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhonn
 */
public class BuscarCliente extends javax.swing.JDialog {
    private UtilsComponent estilo;
    private DefaultTableModel modelo;
    private Cliente cliente;
    private List<Cliente> clientes;
    private static ClienteController clienteController;
    private static BuscarContrato buscarContrato;
    private static TelaPrincipal tela;
    private int identificador;
    private Cliente clienteSelecionado;
    /**
     * Creates new form BuscarCliente
     */
    public BuscarCliente(java.awt.Frame parent, boolean modal, Connection conexao, TelaPrincipal tela) {
        super(parent, modal);
        this.tela = tela;
        clienteController = new ClienteController(conexao);
        buscarContrato = new BuscarContrato(parent, modal, conexao, this, tela);
        initComponents();
        estilo = new UtilsComponent();
        modelo = (DefaultTableModel) tbBuscarCliente.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTelaBuscarCliente = new javax.swing.JPanel();
        çbTituloNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbTituloCpf = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        btBuscar = new RoundedButton("");
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBuscarCliente = new javax.swing.JTable();
        btSelecionar = new RoundedButton("");
        btLimpar = new RoundedButton("");
        btSair = new RoundedButton("");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnTelaBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));

        çbTituloNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        çbTituloNome.setForeground(new java.awt.Color(0, 0, 0));
        çbTituloNome.setText("Nome:");

        tfNome.setBackground(new java.awt.Color(215, 215, 215));
        tfNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfNome.setForeground(new java.awt.Color(0, 0, 0));

        lbTituloCpf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloCpf.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloCpf.setText("CPF/CNPJ:");

        tfCpf.setBackground(new java.awt.Color(215, 215, 215));
        tfCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfCpf.setForeground(new java.awt.Color(0, 0, 0));

        btBuscar.setBackground(new java.awt.Color(240, 240, 240));
        btBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btBuscar.setText("Buscar");
        btBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btBuscarMouseExited(evt);
            }
        });
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        tbBuscarCliente.setBackground(new java.awt.Color(215, 215, 215));
        tbBuscarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbBuscarCliente.setForeground(new java.awt.Color(0, 0, 0));
        tbBuscarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "CPF/CNPJ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbBuscarCliente);
        if (tbBuscarCliente.getColumnModel().getColumnCount() > 0) {
            tbBuscarCliente.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbBuscarCliente.getColumnModel().getColumn(1).setPreferredWidth(300);
            tbBuscarCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        btSelecionar.setBackground(new java.awt.Color(240, 240, 240));
        btSelecionar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSelecionar.setForeground(new java.awt.Color(0, 0, 0));
        btSelecionar.setText("Selecionar");
        btSelecionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSelecionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSelecionarMouseExited(evt);
            }
        });
        btSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(240, 240, 240));
        btLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(0, 0, 0));
        btLimpar.setText("Limpar");
        btLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btLimparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btLimparMouseExited(evt);
            }
        });
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout pnTelaBuscarClienteLayout = new javax.swing.GroupLayout(pnTelaBuscarCliente);
        pnTelaBuscarCliente.setLayout(pnTelaBuscarClienteLayout);
        pnTelaBuscarClienteLayout.setHorizontalGroup(
            pnTelaBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaBuscarClienteLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnTelaBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTelaBuscarClienteLayout.createSequentialGroup()
                        .addComponent(btSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnTelaBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnTelaBuscarClienteLayout.createSequentialGroup()
                            .addGroup(pnTelaBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(çbTituloNome)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(pnTelaBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTituloCpf)
                                .addGroup(pnTelaBuscarClienteLayout.createSequentialGroup()
                                    .addComponent(tfCpf)
                                    .addGap(18, 18, 18)
                                    .addComponent(btBuscar))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnTelaBuscarClienteLayout.setVerticalGroup(
            pnTelaBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaBuscarClienteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnTelaBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(çbTituloNome)
                    .addComponent(lbTituloCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnTelaBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTelaBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTelaBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTelaBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseEntered
        estilo.aplicaHoverEntered(btBuscar);
    }//GEN-LAST:event_btBuscarMouseEntered

    private void btBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseExited
        estilo.aplicaHoverExited(btBuscar);
    }//GEN-LAST:event_btBuscarMouseExited

    private void btSelecionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSelecionarMouseEntered
        estilo.aplicaHoverEntered(btSelecionar);
    }//GEN-LAST:event_btSelecionarMouseEntered

    private void btSelecionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSelecionarMouseExited
        estilo.aplicaHoverExited(btSelecionar);
    }//GEN-LAST:event_btSelecionarMouseExited

    private void btLimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimparMouseEntered
        estilo.aplicaHoverEntered(btLimpar);
    }//GEN-LAST:event_btLimparMouseEntered

    private void btLimparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimparMouseExited
        estilo.aplicaHoverExited(btLimpar);
    }//GEN-LAST:event_btLimparMouseExited

    private void btSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseEntered
        estilo.aplicaHoverEntered(btSair);
    }//GEN-LAST:event_btSairMouseEntered

    private void btSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseExited
        estilo.aplicaHoverExited(btSair);
    }//GEN-LAST:event_btSairMouseExited

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        String nome = tfNome.getText();
        String cpf = tfCpf.getText();
        Cliente clienteTemp = new Cliente();
        clienteTemp.setNome(nome);
        clienteTemp.setDocumento(cpf);
        clientes = clienteController.listar(clienteTemp);
        modelo.setRowCount(0);
        for(Cliente clt : clientes){
            Object[] linha = {clt.getId(), clt.getNome(), clt.getDocumento()};
            modelo.addRow(linha);
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpaBuscarCliente();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        limpaBuscarCliente();
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    public void identificarTela(int identificador){
        this.identificador = identificador;
    }

    public Cliente selecionarCliente(){
        return clienteSelecionado;
    }

    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarActionPerformed
        int indice = tbBuscarCliente.getSelectedRow();
        if(indice == -1){
            JOptionPane.showMessageDialog(rootPane, "Selecione um equipamento!", "Busca de equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
            if (identificador == 1) {
                cliente = clientes.get(indice);
                clienteSelecionado = cliente;
                tela.preencheCliente(cliente.getId());
            } else if (identificador == 3) {
                cliente = clientes.get(indice);
                tela.preencheTelaCadastroCliente(cliente.getId());
            }
        }
        limpaBuscarCliente();
        dispose();
    }//GEN-LAST:event_btSelecionarActionPerformed
    
    public Cliente getCliente(){
        return cliente;
    }
    
    //Metodo para limpeza dos campos da tela
    public void limpaBuscarCliente(){
        tfNome.setText("");
        tfCpf.setText("");
        modelo.setRowCount(0);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSelecionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTituloCpf;
    private javax.swing.JPanel pnTelaBuscarCliente;
    private javax.swing.JTable tbBuscarCliente;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfNome;
    private javax.swing.JLabel çbTituloNome;
    // End of variables declaration//GEN-END:variables
}
