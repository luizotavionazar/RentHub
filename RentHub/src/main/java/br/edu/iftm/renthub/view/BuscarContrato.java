/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.edu.iftm.renthub.view;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import br.edu.iftm.renthub.control.ContratoController;
import br.edu.iftm.renthub.model.Cliente;
import br.edu.iftm.renthub.model.Contrato;
import br.edu.iftm.renthub.model.Contrato.Status;
import br.edu.iftm.renthub.model.Contrato.Tipo;
import java.util.ArrayList;
import java.util.Date;

public class BuscarContrato extends javax.swing.JDialog {
    private UtilsComponent estilo;
    private DefaultTableModel modelo;
    private static BuscarCliente buscarCliente;
    private static ContratoController contratoController;
    private static TelaPrincipal tela;
    private List<Contrato> contratos = new ArrayList<>();
    private Contrato contrato;
    private int identificador;

    public BuscarContrato(java.awt.Frame parent, boolean modal, Connection conexao, BuscarCliente buscarCliente,
            TelaPrincipal tela) {
        super(parent, modal);
        this.buscarCliente = buscarCliente;
        contratoController = new ContratoController(conexao);
        this.tela = tela;
        initComponents();
        estilo = new UtilsComponent();
        modelo = (DefaultTableModel) tbBuscarContrato.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTelaBuscarContrato = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBuscarContrato = new javax.swing.JTable();
        dtDataInicio = new com.toedter.calendar.JDateChooser();
        dtDataFim = new com.toedter.calendar.JDateChooser();
        dtDataEntrega = new com.toedter.calendar.JDateChooser();
        lbTituloDataInicio = new javax.swing.JLabel();
        lbTituloDataFim = new javax.swing.JLabel();
        lbTituloDataEntrega = new javax.swing.JLabel();
        lbTituloTipo = new javax.swing.JLabel();
        lbTituloStatus = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JComboBox<>();
        btSelecionar = new RoundedButton("");
        btSair = new RoundedButton("");
        btLimpar = new RoundedButton("");
        btFiltrar = new RoundedButton("");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RentHub - Busca de Contrato");

        pnTelaBuscarContrato.setBackground(new java.awt.Color(255, 255, 255));

        tbBuscarContrato.setBackground(new java.awt.Color(215, 215, 215));
        tbBuscarContrato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbBuscarContrato.setForeground(new java.awt.Color(0, 0, 0));
        tbBuscarContrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Data Inicio", "Data Fim", "Data Entrega", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbBuscarContrato);
        if (tbBuscarContrato.getColumnModel().getColumnCount() > 0) {
            tbBuscarContrato.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbBuscarContrato.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbBuscarContrato.getColumnModel().getColumn(2).setPreferredWidth(50);
            tbBuscarContrato.getColumnModel().getColumn(3).setPreferredWidth(50);
            tbBuscarContrato.getColumnModel().getColumn(4).setPreferredWidth(50);
            tbBuscarContrato.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        dtDataInicio.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        dtDataFim.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        dtDataEntrega.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        lbTituloDataInicio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloDataInicio.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloDataInicio.setText("Data de Inicio:");

        lbTituloDataFim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloDataFim.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloDataFim.setText("Data Final:");

        lbTituloDataEntrega.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloDataEntrega.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloDataEntrega.setText("Data de Entrega:");

        lbTituloTipo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloTipo.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloTipo.setText("Tipo:");

        lbTituloStatus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloStatus.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloStatus.setText("Status:");

        cbTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "DIARIO", "MENSAL" }));

        cbStatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ATIVO", "CANCELADO", "FINALIZADO" }));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

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

        btFiltrar.setBackground(new java.awt.Color(240, 240, 240));
        btFiltrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btFiltrar.setForeground(new java.awt.Color(0, 0, 0));
        btFiltrar.setText("Filtrar");
        btFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btFiltrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btFiltrarMouseExited(evt);
            }
        });
        btFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTelaBuscarContratoLayout = new javax.swing.GroupLayout(pnTelaBuscarContrato);
        pnTelaBuscarContrato.setLayout(pnTelaBuscarContratoLayout);
        pnTelaBuscarContratoLayout.setHorizontalGroup(
            pnTelaBuscarContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaBuscarContratoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnTelaBuscarContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnTelaBuscarContratoLayout.createSequentialGroup()
                        .addGroup(pnTelaBuscarContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dtDataInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(lbTituloDataInicio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloTipo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(pnTelaBuscarContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnTelaBuscarContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dtDataFim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(lbTituloDataFim, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lbTituloStatus))
                        .addGap(18, 18, 18)
                        .addGroup(pnTelaBuscarContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnTelaBuscarContratoLayout.createSequentialGroup()
                                .addComponent(lbTituloDataEntrega)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnTelaBuscarContratoLayout.createSequentialGroup()
                                .addComponent(dtDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnTelaBuscarContratoLayout.createSequentialGroup()
                        .addComponent(btSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
        );
        pnTelaBuscarContratoLayout.setVerticalGroup(
            pnTelaBuscarContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTelaBuscarContratoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnTelaBuscarContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTituloDataInicio)
                    .addComponent(lbTituloDataFim)
                    .addComponent(lbTituloDataEntrega))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnTelaBuscarContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnTelaBuscarContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dtDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTelaBuscarContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTituloTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTituloStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnTelaBuscarContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTelaBuscarContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTelaBuscarContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTelaBuscarContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btLimparActionPerformed
        limpaBuscarContrato();
    }// GEN-LAST:event_btLimparActionPerformed

    private void btSelecionarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btSelecionarMouseEntered
        estilo.aplicaHoverEntered(btSelecionar);
    }// GEN-LAST:event_btSelecionarMouseEntered

    private void btSelecionarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btSelecionarMouseExited
        estilo.aplicaHoverExited(btSelecionar);
    }// GEN-LAST:event_btSelecionarMouseExited

    private void btSairMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btSairMouseEntered
        estilo.aplicaHoverEntered(btSair);
    }// GEN-LAST:event_btSairMouseEntered

    private void btSairMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btSairMouseExited
        estilo.aplicaHoverExited(btSair);
    }// GEN-LAST:event_btSairMouseExited

    private void btLimparMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btLimparMouseEntered
        estilo.aplicaHoverEntered(btLimpar);
    }// GEN-LAST:event_btLimparMouseEntered

    private void btLimparMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btLimparMouseExited
        estilo.aplicaHoverExited(btLimpar);
    }// GEN-LAST:event_btLimparMouseExited

    private void btFiltrarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btFiltrarMouseEntered
        estilo.aplicaHoverEntered(btFiltrar);
    }// GEN-LAST:event_btFiltrarMouseEntered

    private void btFiltrarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btFiltrarMouseExited
        estilo.aplicaHoverExited(btFiltrar);
    }// GEN-LAST:event_btFiltrarMouseExited

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btSairActionPerformed
        limpaBuscarContrato();
        dispose();
    }// GEN-LAST:event_btSairActionPerformed


    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btSelecionarActionPerformed
        int indice = tbBuscarContrato.getSelectedRow();
        if (indice == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um contrato!", "Busca de equipamento",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            System.out.println(indice);
            contrato = contratos.get(indice);
            if (identificador == 1) {
                tela.preencheTelaContrato(contrato);
            } else if (identificador == 2) {
                tela.preencheTelaEncerrarContrato(contrato);
            }
        }
        limpaBuscarContrato();
        dispose();
    }// GEN-LAST:event_btSelecionarActionPerformed

    public void identificarTela(int identificador) {
        this.identificador = identificador;
        if (identificador == 2) {
            cbStatus.setSelectedIndex(1);
            cbStatus.setEnabled(false);
        } else {
            cbStatus.setSelectedIndex(0);
            cbStatus.setEnabled(true);
        }
    }

    private void btFiltrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btFiltrarActionPerformed
        Date dateInicio = dtDataInicio.getDate();
        Date dateFim = dtDataFim.getDate();
        Date dateEntrega = dtDataEntrega.getDate();
        LocalDate dataInicio = null;
        LocalDate dataFim = null;
        LocalDate dataEntrega = null;
        if (dateInicio != null) {
            dataInicio = dateInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
        if (dateFim != null) {
            dataFim = dateFim.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
        if (dateEntrega != null) {
            dataEntrega = dateEntrega.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
        String tipo = (String) cbTipo.getSelectedItem();
        String status = (String) cbStatus.getSelectedItem();
        Contrato contratoFiltro = new Contrato();

        if (tipo.equals("DIARIO")) {
            contratoFiltro.setTipo(Tipo.DIARIO);
        } else if (tipo.equals("MENSAL")) {
            contratoFiltro.setTipo(Tipo.MENSAL);
        }

        if (status.equals("ATIVO")) {
            contratoFiltro.setStatus(Status.ATIVO);
        } else if (status.equals("CANCELADO")) {
            contratoFiltro.setStatus(Status.CANCELADO);
        } else if (status.equals("FINALIZADO")) {
            contratoFiltro.setStatus(Status.FINALIZADO);
        } else {
            contratoFiltro.setStatus(null);
        }

        contratoFiltro.setDataInicio(dataInicio);
        contratoFiltro.setDataFim(dataFim);
        contratoFiltro.setDataEntrega(dataEntrega);

        contratos = contratoController.listar(contratoFiltro);

        modelo.setRowCount(0);
        for (Contrato ctr : contratos) {
            Object[] linha = { ctr.getId(), ctr.getCliente().getNome(), ctr.getDataInicio(), ctr.getDataFim(),
                    ctr.getDataEntrega(), ctr.getStatus() };
            modelo.addRow(linha);
        }
    }// GEN-LAST:event_btFiltrarActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_cbStatusActionPerformed


    public Contrato getContrato() {
        return contrato;
    }

    public void limpaBuscarContrato() {
        dtDataInicio.setDate(null);
        dtDataFim.setDate(null);
        dtDataEntrega.setDate(null);
        cbTipo.setSelectedIndex(0);
        if (identificador == 2) {
            cbStatus.setSelectedIndex(1);
        } else {
            cbStatus.setSelectedIndex(0);
        }
        modelo.setRowCount(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFiltrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSelecionar;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> cbTipo;
    private com.toedter.calendar.JDateChooser dtDataEntrega;
    private com.toedter.calendar.JDateChooser dtDataFim;
    private com.toedter.calendar.JDateChooser dtDataInicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTituloDataEntrega;
    private javax.swing.JLabel lbTituloDataFim;
    private javax.swing.JLabel lbTituloDataInicio;
    private javax.swing.JLabel lbTituloStatus;
    private javax.swing.JLabel lbTituloTipo;
    private javax.swing.JPanel pnTelaBuscarContrato;
    private javax.swing.JTable tbBuscarContrato;
    // End of variables declaration//GEN-END:variables
}
