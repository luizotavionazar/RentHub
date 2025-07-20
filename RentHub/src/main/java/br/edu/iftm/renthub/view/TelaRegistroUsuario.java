/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.edu.iftm.renthub.view;

import br.edu.iftm.renthub.control.UsuarioController;
import br.edu.iftm.renthub.model.Usuario;
import java.awt.Color;
import java.sql.Connection;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;


// Criado por Jhonnie em 08/07/2023
public class TelaRegistroUsuario extends javax.swing.JDialog {
    private static Usuario usuario;
    private static UsuarioController usuarioController;

    private UtilsComponent estilo;

    public TelaRegistroUsuario(java.awt.Frame parent, boolean modal, Connection conexao) {
        super(parent, modal);
        usuarioController = new UsuarioController(conexao);
        initComponents();
        estilo = new UtilsComponent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        pfConfSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btRegistrar = new RoundedButton("");
        btCancelar = new RoundedButton("");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Usuario");

        jPanel1.setBackground(new java.awt.Color(217, 217, 217));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastro de Usuário");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuário");

        tfUsuario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Senha");

        pfSenha.setBackground(new java.awt.Color(255, 255, 255));

        pfConfSenha.setBackground(new java.awt.Color(255, 255, 255));
        pfConfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pfConfSenhaKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Confirme a Senha");

        btRegistrar.setBackground(new java.awt.Color(240, 240, 240));
        btRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btRegistrar.setText("Registrar");
        btRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btRegistrarMouseExited(evt);
            }
        });
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(240, 240, 240));
        btCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btCancelar.setText("Cancelar");
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCancelarMouseExited(evt);
            }
        });
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btRegistrar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(pfConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(tfUsuario)
                                    .addComponent(jLabel3)
                                    .addComponent(pfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRegistrar)
                    .addComponent(btCancelar))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        estilo.restauraCor(btRegistrar);
        String nomeUsuario = tfUsuario.getText();
        char[] senha = pfSenha.getPassword();
        char[] confSenha = pfConfSenha.getPassword();
        if(!nomeUsuario.isEmpty() && senha.length !=0 && confSenha.length !=0){
            boolean valida = Arrays.equals(senha, confSenha);
            if(valida){
                usuario = new Usuario(nomeUsuario, senha);
                if (!usuarioController.buscar(usuario)) {
                    if (usuarioController.cadastrar(usuario)) {
                        JOptionPane.showMessageDialog(rootPane, "Usuário cadastrado com sucesso!", "Cadastro de Usuário", JOptionPane.INFORMATION_MESSAGE);
                        pfConfSenha.setBorder(UIManager.getBorder("TextField.border"));
                        limpaCampos();
                        dispose();    
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Não foi possivel cadastrar o usuário!", "Cadastro de Usuário", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "O usuário "+ nomeUsuario +" já existe!", "Cadastro de Usuário", JOptionPane.WARNING_MESSAGE);
                }
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "As senhas não coincidem!", "Cadastro de Usuário", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Necessário preencher todos os campos!", "Cadastro de Usuário", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btRegistrarActionPerformed
    
    public Usuario getUser(){
        return usuario;
    }
    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        estilo.restauraCor(btCancelar);
        limpaCampos();
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void pfConfSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfConfSenhaKeyReleased
        char[] senha = pfSenha.getPassword();
        char[] confSenha = pfConfSenha.getPassword();
        if(Arrays.equals(senha, confSenha)){
            pfConfSenha.setBorder(new LineBorder(Color.blue, 2));
        }else{
            pfConfSenha.setBorder(new LineBorder(Color.red, 2));
        }
    }//GEN-LAST:event_pfConfSenhaKeyReleased

    private void btCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseExited
        estilo.aplicaHoverExited(btCancelar);
    }//GEN-LAST:event_btCancelarMouseExited

    private void btCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseEntered
        estilo.aplicaHoverEntered(btCancelar);
    }//GEN-LAST:event_btCancelarMouseEntered

    private void btRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegistrarMouseEntered
        estilo.aplicaHoverEntered(btRegistrar);
    }//GEN-LAST:event_btRegistrarMouseEntered

    private void btRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegistrarMouseExited
        estilo.aplicaHoverExited(btRegistrar);
    }//GEN-LAST:event_btRegistrarMouseExited
    
    public void limpaCampos(){
        tfUsuario.setText("");
        pfSenha.setText("");
        pfConfSenha.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pfConfSenha;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
