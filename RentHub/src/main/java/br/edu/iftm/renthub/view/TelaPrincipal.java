package br.edu.iftm.renthub.view;

import br.edu.iftm.renthub.control.UsuarioController;
import br.edu.iftm.renthub.control.Endereco.ConsultaCep;
import br.edu.iftm.renthub.model.Usuario;
import java.awt.BasicStroke;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

// Criado por Jhonnie em 08/07/2023
public class TelaPrincipal extends javax.swing.JFrame {
    private static TelaRegistroUsuario telaUsuario;
    private CardLayout cdl;
    private CardLayout cdlPn;
    private UtilsComponent estilo;
    private ConsultaCep consulta;
    private static UsuarioController usuarioController;
    private static BuscarContrato buscarContrato;
    private static VerTotalizazao verTotalizazao;
    private static BuscarEquipamento buscarEquipamento;
    private static BuscarCliente buscarCliente;

    public TelaPrincipal(Connection conexao) throws SQLException {
        usuarioController = new UsuarioController(conexao);
        telaUsuario = new TelaRegistroUsuario(this, true, conexao);
        buscarContrato = new BuscarContrato(this, true, conexao);
        verTotalizazao = new VerTotalizazao(this, true, conexao);
        buscarEquipamento = new BuscarEquipamento(this, true, conexao);
        buscarCliente = new BuscarCliente(this, true, conexao);
        initComponents();
        cdl = (CardLayout) getContentPane().getLayout();
        cdlPn = (CardLayout) pnCdTelas.getLayout();
        estilo = new UtilsComponent();
        estilo.configJspinner(jsQtdEquipamento, jsQtdEstoqueEquipamento);
        consulta = new ConsultaCep();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgTipo = new javax.swing.ButtonGroup();
        popupPerfil = new javax.swing.JPopupMenu();
        menuSair = new javax.swing.JMenuItem();
        pnLogin = new javax.swing.JPanel();
        pnLogo = new javax.swing.JPanel();
        lbLogoLg = new javax.swing.JLabel();
        pnLogin1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        pfSenha = new javax.swing.JPasswordField();
        btEntrar = new RoundedButton("");
        btRegistro = new RoundedButton("");
        pnTela = new javax.swing.JPanel();
        pnTop = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbUsuarioLogado = new javax.swing.JLabel();
        lbPerfil = new javax.swing.JLabel();
        pnMenu = new javax.swing.JPanel();
        btMenuContrato = new RoundedButton("");
        btMenuEquipamento = new RoundedButton("");
        btMenuCliente = new RoundedButton("");
        btMenuRelatorio = new RoundedButton("");
        pnCdTelas = new javax.swing.JPanel();
        pnTelaHome = new javax.swing.JPanel();
        lbLogoHm = new javax.swing.JLabel();
        pnTelaCadastroCt = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btEncerrarContrato = new RoundedButton("");
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jsQtdEquipamento = new javax.swing.JSpinner();
        btAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        lbCadastrarContratoDataFinal = new javax.swing.JLabel();
        dcCadastroContratoFinal = new com.toedter.calendar.JDateChooser();
        lbCadastrarContratoDataInicio = new javax.swing.JLabel();
        lbCadastrarContratoDataEntrega = new javax.swing.JLabel();
        dcCadastroContratoInicio = new com.toedter.calendar.JDateChooser();
        dcCadastrarContratoEntrega = new com.toedter.calendar.JDateChooser();
        btTotalizacaoContrato = new RoundedButton("");
        jTextField11 = new javax.swing.JTextField();
        btContratoBuscarEquipamento = new RoundedButton("");
        jLabel39 = new javax.swing.JLabel();
        jFormattedTextField11 = new javax.swing.JFormattedTextField();
        btContratoRegistrar = new RoundedButton("");
        btContratoCancelar = new RoundedButton("");
        btContratoLimpar = new RoundedButton("");
        btBuscarContrato = new RoundedButton("");
        pnTelaEncerrarCt = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        btBuscarContratoEncerrarContrato = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfClienteEncerrarContrato = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jLabel29 = new javax.swing.JLabel();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jLabel30 = new javax.swing.JLabel();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        jLabel31 = new javax.swing.JLabel();
        jFormattedTextField8 = new javax.swing.JFormattedTextField();
        jLabel36 = new javax.swing.JLabel();
        btCancelarEncerrarContrato = new RoundedButton("");
        btLimparEncerrarContrato = new RoundedButton("");
        btRegistrarEncerrarContrato = new RoundedButton("");
        btNovoContrato = new RoundedButton("");
        pnTelaEquipamento = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        btBuscarEquipamento = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jsQtdEstoqueEquipamento = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        jFormattedTextField9 = new javax.swing.JFormattedTextField();
        jLabel35 = new javax.swing.JLabel();
        jFormattedTextField10 = new javax.swing.JFormattedTextField();
        btAlterarEquipamento = new RoundedButton("");
        btDeletarEquipamento = new RoundedButton("");
        jLabel46 = new javax.swing.JLabel();
        btLimparEquipamento = new RoundedButton("");
        btRegistrarEquipamento = new RoundedButton("");
        btCancelarEquipamento = new RoundedButton("");
        pnTelaCliente = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        btClienteAlterar = new RoundedButton("");
        btClienteDeletar = new RoundedButton("");
        jLabel42 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jFormattedTextField13 = new javax.swing.JFormattedTextField();
        jLabel44 = new javax.swing.JLabel();
        jFormattedTextField14 = new javax.swing.JFormattedTextField();
        jLabel45 = new javax.swing.JLabel();
        jFormattedTextField15 = new javax.swing.JFormattedTextField();
        jLabel49 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel50 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        btClienteBuscarCliente = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        btClienteCancelar = new RoundedButton("");
        btClienteSalvar = new RoundedButton("");
        pnRelatório = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        popupPerfil.add(menuSair);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RentHub");
        setBackground(new java.awt.Color(117, 117, 117));
        setName("janelaRentHub"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        pnLogin.setBackground(new java.awt.Color(153, 153, 153));
        pnLogin.setPreferredSize(new java.awt.Dimension(1280, 720));

        pnLogo.setBackground(new java.awt.Color(255, 255, 255));

        lbLogoLg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo_RentHub2.png"))); // NOI18N

        javax.swing.GroupLayout pnLogoLayout = new javax.swing.GroupLayout(pnLogo);
        pnLogo.setLayout(pnLogoLayout);
        pnLogoLayout.setHorizontalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lbLogoLg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(70, 70, 70))
        );
        pnLogoLayout.setVerticalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbLogoLg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        pnLogin1.setBackground(new java.awt.Color(217, 217, 217));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuário:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Senha:");

        btEntrar.setBackground(new java.awt.Color(240, 240, 240));
        btEntrar.setForeground(new java.awt.Color(0, 0, 0));
        btEntrar.setText("Entrar");
        btEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btEntrarMouseExited(evt);
            }
        });
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        btRegistro.setBackground(new java.awt.Color(240, 240, 240));
        btRegistro.setForeground(new java.awt.Color(0, 0, 0));
        btRegistro.setText("Registrar-se");
        btRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btRegistroMouseExited(evt);
            }
        });
        btRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnLogin1Layout = new javax.swing.GroupLayout(pnLogin1);
        pnLogin1.setLayout(pnLogin1Layout);
        pnLogin1Layout.setHorizontalGroup(
            pnLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnLogin1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnLogin1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        pnLogin1Layout.setVerticalGroup(
            pnLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogin1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(pnLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEntrar)
                    .addComponent(btRegistro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
        pnLogin.setLayout(pnLoginLayout);
        pnLoginLayout.setHorizontalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLoginLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(pnLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(125, 125, 125))
        );
        pnLoginLayout.setVerticalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70))
        );

        getContentPane().add(pnLogin, "cdTelaLogin");

        pnTela.setPreferredSize(new java.awt.Dimension(1280, 720));
        pnTela.setLayout(new java.awt.BorderLayout());

        pnTop.setBackground(new java.awt.Color(0, 0, 0));
        pnTop.setPreferredSize(new java.awt.Dimension(1280, 60));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptop(1).png"))); // NOI18N
        jLabel10.setText("RentHub");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        lbUsuarioLogado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbUsuarioLogado.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuarioLogado.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbUsuarioLogado.setToolTipText("");

        lbPerfil.setBackground(new java.awt.Color(255, 255, 255));
        lbPerfil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile-picture.png"))); // NOI18N
        lbPerfil.setPreferredSize(new java.awt.Dimension(48, 48));
        lbPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbPerfilMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnTopLayout = new javax.swing.GroupLayout(pnTop);
        pnTop.setLayout(pnTopLayout);
        pnTopLayout.setHorizontalGroup(
            pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTopLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 788, Short.MAX_VALUE)
                .addComponent(lbUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnTopLayout.setVerticalGroup(
            pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnTela.add(pnTop, java.awt.BorderLayout.PAGE_START);

        pnMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnMenu.setPreferredSize(new java.awt.Dimension(200, 620));

        btMenuContrato.setBackground(new java.awt.Color(240, 240, 240));
        btMenuContrato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btMenuContrato.setForeground(new java.awt.Color(0, 0, 0));
        btMenuContrato.setText("Contratos");
        btMenuContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btMenuContratoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btMenuContratoMouseExited(evt);
            }
        });
        btMenuContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuContratoActionPerformed(evt);
            }
        });

        btMenuEquipamento.setBackground(new java.awt.Color(240, 240, 240));
        btMenuEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btMenuEquipamento.setForeground(new java.awt.Color(0, 0, 0));
        btMenuEquipamento.setText("Equipamentos");
        btMenuEquipamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btMenuEquipamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btMenuEquipamentoMouseExited(evt);
            }
        });
        btMenuEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuEquipamentoActionPerformed(evt);
            }
        });

        btMenuCliente.setBackground(new java.awt.Color(240, 240, 240));
        btMenuCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btMenuCliente.setForeground(new java.awt.Color(0, 0, 0));
        btMenuCliente.setText("Clientes");
        btMenuCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btMenuClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btMenuClienteMouseExited(evt);
            }
        });
        btMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuClienteActionPerformed(evt);
            }
        });

        btMenuRelatorio.setBackground(new java.awt.Color(240, 240, 240));
        btMenuRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btMenuRelatorio.setForeground(new java.awt.Color(0, 0, 0));
        btMenuRelatorio.setText("Relatórios");
        btMenuRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btMenuRelatorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btMenuRelatorioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btMenuContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btMenuEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btMenuCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btMenuRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btMenuContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btMenuEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btMenuCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btMenuRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );

        pnTela.add(pnMenu, java.awt.BorderLayout.WEST);

        pnCdTelas.setBackground(new java.awt.Color(217, 217, 217));
        pnCdTelas.setLayout(new java.awt.CardLayout());

        pnTelaHome.setBackground(new java.awt.Color(217, 217, 217));

        lbLogoHm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo_RentHub2.png"))); // NOI18N

        javax.swing.GroupLayout pnTelaHomeLayout = new javax.swing.GroupLayout(pnTelaHome);
        pnTelaHome.setLayout(pnTelaHomeLayout);
        pnTelaHomeLayout.setHorizontalGroup(
            pnTelaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnTelaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnTelaHomeLayout.createSequentialGroup()
                    .addGap(284, 284, 284)
                    .addComponent(lbLogoHm)
                    .addContainerGap(284, Short.MAX_VALUE)))
        );
        pnTelaHomeLayout.setVerticalGroup(
            pnTelaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnTelaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnTelaHomeLayout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(lbLogoHm)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );

        pnCdTelas.add(pnTelaHome, "cdTelaHome");

        pnTelaCadastroCt.setBackground(new java.awt.Color(217, 217, 217));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CONTRATO");

        btEncerrarContrato.setBackground(new java.awt.Color(240, 240, 240));
        btEncerrarContrato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btEncerrarContrato.setForeground(new java.awt.Color(0, 0, 0));
        btEncerrarContrato.setText("Encerrar Contrato");
        btEncerrarContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btEncerrarContratoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btEncerrarContratoMouseExited(evt);
            }
        });
        btEncerrarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEncerrarContratoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("NOVO");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nome do Cliente");

        jTextField2.setBackground(new java.awt.Color(215, 215, 215));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("CPF/CNPJ");

        jFormattedTextField1.setBackground(new java.awt.Color(215, 215, 215));
        jFormattedTextField1.setToolTipText("");

        jFormattedTextField2.setBackground(new java.awt.Color(215, 215, 215));
        jFormattedTextField2.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Telefone");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("CEP");

        jFormattedTextField3.setBackground(new java.awt.Color(215, 215, 215));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Cidade");

        jTextField3.setBackground(new java.awt.Color(215, 215, 215));

        jTextField4.setBackground(new java.awt.Color(215, 215, 215));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Logradouro");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("UF");

        jComboBox1.setBackground(new java.awt.Color(215, 215, 215));
        jComboBox1.setFocusable(false);

        jTextField5.setBackground(new java.awt.Color(215, 215, 215));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Bairro");

        jTextField6.setBackground(new java.awt.Color(215, 215, 215));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Complemento");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Equipamentos");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Quantidade");

        btAdicionar.setBackground(new java.awt.Color(240, 240, 240));
        btAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        btAdicionar.setBorderPainted(false);
        btAdicionar.setFocusPainted(false);
        btAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAdicionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAdicionarMouseExited(evt);
            }
        });
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(215, 215, 215));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Equipamento", "Qtd."
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setBackground(new java.awt.Color(215, 215, 215));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Número");

        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Sem Número");
        jCheckBox1.setFocusPainted(false);

        lbCadastrarContratoDataFinal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCadastrarContratoDataFinal.setForeground(new java.awt.Color(0, 0, 0));
        lbCadastrarContratoDataFinal.setText("Data Final");

        dcCadastroContratoFinal.setBackground(new java.awt.Color(215, 215, 215));

        lbCadastrarContratoDataInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCadastrarContratoDataInicio.setForeground(new java.awt.Color(0, 0, 0));
        lbCadastrarContratoDataInicio.setText("Data Inicio");

        lbCadastrarContratoDataEntrega.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCadastrarContratoDataEntrega.setForeground(new java.awt.Color(0, 0, 0));
        lbCadastrarContratoDataEntrega.setText("Data de Entrega");
        lbCadastrarContratoDataEntrega.setVisible(false);

        dcCadastroContratoInicio.setBackground(new java.awt.Color(215, 215, 215));
        dcCadastroContratoInicio.setEnabled(false);

        dcCadastrarContratoEntrega.setBackground(new java.awt.Color(215, 215, 215));
        dcCadastrarContratoEntrega.setVisible(false);

        btTotalizacaoContrato.setBackground(new java.awt.Color(240, 240, 240));
        btTotalizacaoContrato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btTotalizacaoContrato.setForeground(new java.awt.Color(0, 0, 0));
        btTotalizacaoContrato.setText("Totalização");
        btTotalizacaoContrato.setVisible(false);
        btTotalizacaoContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btTotalizacaoContratoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btTotalizacaoContratoMouseExited(evt);
            }
        });
        btTotalizacaoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTotalizacaoContratoActionPerformed(evt);
            }
        });

        jTextField11.setBackground(new java.awt.Color(215, 215, 215));

        btContratoBuscarEquipamento.setBackground(new java.awt.Color(240, 240, 240));
        btContratoBuscarEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loupe.png"))); // NOI18N
        btContratoBuscarEquipamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btContratoBuscarEquipamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btContratoBuscarEquipamentoMouseExited(evt);
            }
        });
        btContratoBuscarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContratoBuscarEquipamentoActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Valor Parcial");

        jFormattedTextField11.setBackground(new java.awt.Color(215, 215, 215));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextField3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextField1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox1))
                                    .addComponent(jLabel1)
                                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField2))
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btContratoBuscarEquipamento)))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jsQtdEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dcCadastrarContratoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btTotalizacaoContrato))
                            .addComponent(lbCadastrarContratoDataEntrega)
                            .addComponent(lbCadastrarContratoDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcCadastroContratoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCadastrarContratoDataInicio)
                                    .addComponent(dcCadastroContratoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextField11))))
                        .addGap(105, 105, 105))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jsQtdEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btContratoBuscarEquipamento))
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCadastrarContratoDataInicio)
                            .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcCadastroContratoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbCadastrarContratoDataFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcCadastroContratoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCadastrarContratoDataEntrega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcCadastrarContratoEntrega, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btTotalizacaoContrato, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        btContratoRegistrar.setBackground(new java.awt.Color(240, 240, 240));
        btContratoRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btContratoRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btContratoRegistrar.setText("Registrar");
        btContratoRegistrar.setPreferredSize(new java.awt.Dimension(88, 35));
        btContratoRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btContratoRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btContratoRegistrarMouseExited(evt);
            }
        });

        btContratoCancelar.setBackground(new java.awt.Color(240, 240, 240));
        btContratoCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btContratoCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btContratoCancelar.setText("Cancelar");
        btContratoCancelar.setPreferredSize(new java.awt.Dimension(86, 35));
        btContratoCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btContratoCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btContratoCancelarMouseExited(evt);
            }
        });
        btContratoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContratoCancelarActionPerformed(evt);
            }
        });

        btContratoLimpar.setBackground(new java.awt.Color(240, 240, 240));
        btContratoLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btContratoLimpar.setForeground(new java.awt.Color(0, 0, 0));
        btContratoLimpar.setText("Limpar");
        btContratoLimpar.setPreferredSize(new java.awt.Dimension(86, 35));
        btContratoLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btContratoLimparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btContratoLimparMouseExited(evt);
            }
        });
        btContratoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContratoLimparActionPerformed(evt);
            }
        });

        btBuscarContrato.setBackground(new java.awt.Color(240, 240, 240));
        btBuscarContrato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btBuscarContrato.setForeground(new java.awt.Color(0, 0, 0));
        btBuscarContrato.setText("Buscar Contrato");
        btBuscarContrato.setBorderPainted(false);
        btBuscarContrato.setFocusPainted(false);
        btBuscarContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btBuscarContratoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btBuscarContratoMouseExited(evt);
            }
        });
        btBuscarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarContratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTelaCadastroCtLayout = new javax.swing.GroupLayout(pnTelaCadastroCt);
        pnTelaCadastroCt.setLayout(pnTelaCadastroCtLayout);
        pnTelaCadastroCtLayout.setHorizontalGroup(
            pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaCadastroCtLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnTelaCadastroCtLayout.createSequentialGroup()
                        .addComponent(btContratoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btContratoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btContratoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnTelaCadastroCtLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btBuscarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        pnTelaCadastroCtLayout.setVerticalGroup(
            pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaCadastroCtLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btBuscarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnTelaCadastroCtLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btContratoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btContratoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btContratoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pnCdTelas.add(pnTelaCadastroCt, "cdTelaCadastroContrato");

        pnTelaEncerrarCt.setBackground(new java.awt.Color(217, 217, 217));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Tipo de Contrato");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("ENCERRAMENTO");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Contrato");

        jTextField7.setBackground(new java.awt.Color(215, 215, 215));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("CPF/CNPJ");

        jFormattedTextField4.setBackground(new java.awt.Color(215, 215, 215));
        jFormattedTextField4.setToolTipText("");

        btBuscarContratoEncerrarContrato.setBackground(new java.awt.Color(240, 240, 240));
        btBuscarContratoEncerrarContrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loupe.png"))); // NOI18N
        btBuscarContratoEncerrarContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btBuscarContratoEncerrarContratoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btBuscarContratoEncerrarContratoMouseExited(evt);
            }
        });
        btBuscarContratoEncerrarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarContratoEncerrarContratoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cliente");

        tfClienteEncerrarContrato.setBackground(new java.awt.Color(215, 215, 215));

        jTextField8.setBackground(new java.awt.Color(215, 215, 215));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Data Inicial");

        jDateChooser1.setBackground(new java.awt.Color(215, 215, 215));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Data Final");

        jDateChooser2.setBackground(new java.awt.Color(215, 215, 215));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Data de Entrega");

        jDateChooser3.setBackground(new java.awt.Color(215, 215, 215));

        jTable3.setBackground(new java.awt.Color(215, 215, 215));
        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable3.setForeground(new java.awt.Color(0, 0, 0));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Equipamento", "Qtd."
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jComboBox3.setBackground(new java.awt.Color(215, 215, 215));
        jComboBox3.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Encerrar", "Cancelar" }));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Fechamento");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Valor");

        jFormattedTextField5.setBackground(new java.awt.Color(215, 215, 215));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Juros");

        jFormattedTextField6.setBackground(new java.awt.Color(215, 215, 215));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Multa");

        jFormattedTextField7.setBackground(new java.awt.Color(215, 215, 215));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Valor Total");

        jFormattedTextField8.setBackground(new java.awt.Color(215, 215, 215));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBuscarContratoEncerrarContrato))
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jTextField8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tfClienteEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jFormattedTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel23)
                                                    .addComponent(jLabel27))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(btBuscarContratoEncerrarContrato)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfClienteEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("CONTRATO");

        btCancelarEncerrarContrato.setBackground(new java.awt.Color(240, 240, 240));
        btCancelarEncerrarContrato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCancelarEncerrarContrato.setForeground(new java.awt.Color(0, 0, 0));
        btCancelarEncerrarContrato.setText("Cancelar");
        btCancelarEncerrarContrato.setPreferredSize(new java.awt.Dimension(86, 35));
        btCancelarEncerrarContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCancelarEncerrarContratoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCancelarEncerrarContratoMouseExited(evt);
            }
        });

        btLimparEncerrarContrato.setBackground(new java.awt.Color(240, 240, 240));
        btLimparEncerrarContrato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btLimparEncerrarContrato.setForeground(new java.awt.Color(0, 0, 0));
        btLimparEncerrarContrato.setText("Limpar");
        btLimparEncerrarContrato.setPreferredSize(new java.awt.Dimension(76, 35));
        btLimparEncerrarContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btLimparEncerrarContratoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btLimparEncerrarContratoMouseExited(evt);
            }
        });

        btRegistrarEncerrarContrato.setBackground(new java.awt.Color(240, 240, 240));
        btRegistrarEncerrarContrato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btRegistrarEncerrarContrato.setForeground(new java.awt.Color(0, 0, 0));
        btRegistrarEncerrarContrato.setText("Registrar");
        btRegistrarEncerrarContrato.setPreferredSize(new java.awt.Dimension(88, 35));
        btRegistrarEncerrarContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btRegistrarEncerrarContratoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btRegistrarEncerrarContratoMouseExited(evt);
            }
        });

        btNovoContrato.setBackground(new java.awt.Color(240, 240, 240));
        btNovoContrato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btNovoContrato.setForeground(new java.awt.Color(0, 0, 0));
        btNovoContrato.setText("Novo Contrato");
        btNovoContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btNovoContratoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btNovoContratoMouseExited(evt);
            }
        });
        btNovoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoContratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTelaEncerrarCtLayout = new javax.swing.GroupLayout(pnTelaEncerrarCt);
        pnTelaEncerrarCt.setLayout(pnTelaEncerrarCtLayout);
        pnTelaEncerrarCtLayout.setHorizontalGroup(
            pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaEncerrarCtLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnTelaEncerrarCtLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(659, 659, 659)
                        .addComponent(btNovoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnTelaEncerrarCtLayout.createSequentialGroup()
                            .addComponent(btRegistrarEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btLimparEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btCancelarEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47))
        );
        pnTelaEncerrarCtLayout.setVerticalGroup(
            pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaEncerrarCtLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNovoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelarEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimparEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRegistrarEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnCdTelas.add(pnTelaEncerrarCt, "cdTelaEncerrarContrato");

        pnTelaEquipamento.setBackground(new java.awt.Color(217, 217, 217));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Novo Equipamento");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Equipamento");

        jTextField9.setBackground(new java.awt.Color(215, 215, 215));

        btBuscarEquipamento.setBackground(new java.awt.Color(240, 240, 240));
        btBuscarEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loupe.png"))); // NOI18N
        btBuscarEquipamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btBuscarEquipamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btBuscarEquipamentoMouseExited(evt);
            }
        });
        btBuscarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarEquipamentoActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Quantidade de Estoque");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Valor Diário");

        jFormattedTextField9.setBackground(new java.awt.Color(215, 215, 215));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Valor Mensal");

        jFormattedTextField10.setBackground(new java.awt.Color(215, 215, 215));

        btAlterarEquipamento.setBackground(new java.awt.Color(240, 240, 240));
        btAlterarEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btAlterarEquipamento.setForeground(new java.awt.Color(0, 0, 0));
        btAlterarEquipamento.setText("Alterar");
        btAlterarEquipamento.setPreferredSize(new java.awt.Dimension(76, 35));
        btAlterarEquipamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAlterarEquipamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAlterarEquipamentoMouseExited(evt);
            }
        });

        btDeletarEquipamento.setBackground(new java.awt.Color(240, 240, 240));
        btDeletarEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btDeletarEquipamento.setForeground(new java.awt.Color(0, 0, 0));
        btDeletarEquipamento.setText("Deletar");
        btDeletarEquipamento.setPreferredSize(new java.awt.Dimension(76, 35));
        btDeletarEquipamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDeletarEquipamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDeletarEquipamentoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addComponent(jLabel47)
                    .addComponent(jLabel33)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel32)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jsQtdEstoqueEquipamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addComponent(jFormattedTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jFormattedTextField10, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAlterarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDeletarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsQtdEstoqueEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeletarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("EQUIPAMENTO");

        btLimparEquipamento.setBackground(new java.awt.Color(240, 240, 240));
        btLimparEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btLimparEquipamento.setForeground(new java.awt.Color(0, 0, 0));
        btLimparEquipamento.setText("Limpar");
        btLimparEquipamento.setPreferredSize(new java.awt.Dimension(86, 35));
        btLimparEquipamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btLimparEquipamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btLimparEquipamentoMouseExited(evt);
            }
        });

        btRegistrarEquipamento.setBackground(new java.awt.Color(240, 240, 240));
        btRegistrarEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btRegistrarEquipamento.setForeground(new java.awt.Color(0, 0, 0));
        btRegistrarEquipamento.setText("Registrar");
        btRegistrarEquipamento.setPreferredSize(new java.awt.Dimension(86, 35));
        btRegistrarEquipamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btRegistrarEquipamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btRegistrarEquipamentoMouseExited(evt);
            }
        });

        btCancelarEquipamento.setBackground(new java.awt.Color(240, 240, 240));
        btCancelarEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCancelarEquipamento.setForeground(new java.awt.Color(0, 0, 0));
        btCancelarEquipamento.setText("Cancelar");
        btCancelarEquipamento.setPreferredSize(new java.awt.Dimension(86, 35));
        btCancelarEquipamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCancelarEquipamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCancelarEquipamentoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnTelaEquipamentoLayout = new javax.swing.GroupLayout(pnTelaEquipamento);
        pnTelaEquipamento.setLayout(pnTelaEquipamentoLayout);
        pnTelaEquipamentoLayout.setHorizontalGroup(
            pnTelaEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaEquipamentoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnTelaEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTelaEquipamentoLayout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTelaEquipamentoLayout.createSequentialGroup()
                        .addGroup(pnTelaEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnTelaEquipamentoLayout.createSequentialGroup()
                                .addGap(0, 643, Short.MAX_VALUE)
                                .addComponent(btRegistrarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btLimparEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btCancelarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))))
        );
        pnTelaEquipamentoLayout.setVerticalGroup(
            pnTelaEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaEquipamentoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTelaEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimparEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRegistrarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pnCdTelas.add(pnTelaEquipamento, "cdTelaEquipamento");

        pnTelaCliente.setBackground(new java.awt.Color(215, 215, 215));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Cliente");

        btClienteAlterar.setBackground(new java.awt.Color(240, 240, 240));
        btClienteAlterar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btClienteAlterar.setForeground(new java.awt.Color(0, 0, 0));
        btClienteAlterar.setText("Alterar");
        btClienteAlterar.setPreferredSize(new java.awt.Dimension(76, 35));
        btClienteAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btClienteAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btClienteAlterarMouseExited(evt);
            }
        });

        btClienteDeletar.setBackground(new java.awt.Color(240, 240, 240));
        btClienteDeletar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btClienteDeletar.setForeground(new java.awt.Color(0, 0, 0));
        btClienteDeletar.setText("Deletar");
        btClienteDeletar.setPreferredSize(new java.awt.Dimension(76, 35));
        btClienteDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btClienteDeletarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btClienteDeletarMouseExited(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Nome do Cliente");

        jTextField12.setBackground(new java.awt.Color(215, 215, 215));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("CPF/CNPJ");

        jFormattedTextField13.setBackground(new java.awt.Color(215, 215, 215));
        jFormattedTextField13.setToolTipText("");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Telefone");

        jFormattedTextField14.setBackground(new java.awt.Color(215, 215, 215));
        jFormattedTextField14.setToolTipText("");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("CEP");

        jFormattedTextField15.setBackground(new java.awt.Color(215, 215, 215));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Número");

        jTextField13.setBackground(new java.awt.Color(215, 215, 215));

        jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setText("Sem Número");
        jCheckBox2.setFocusPainted(false);

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Logradouro");

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(215, 215, 215));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Bairro");

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(215, 215, 215));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Complemento");

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(215, 215, 215));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Cidade");

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(215, 215, 215));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("UF");

        jComboBox2.setBackground(new java.awt.Color(215, 215, 215));
        jComboBox2.setFocusable(false);

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("ID Cliente");

        jTextField10.setBackground(new java.awt.Color(215, 215, 215));
        jTextField10.setForeground(new java.awt.Color(0, 0, 0));

        btClienteBuscarCliente.setBackground(new java.awt.Color(240, 240, 240));
        btClienteBuscarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btClienteBuscarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btClienteBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loupe.png"))); // NOI18N
        btClienteBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btClienteAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btClienteDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btClienteBuscarCliente)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43)
                                    .addComponent(jFormattedTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44)
                                    .addComponent(jFormattedTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFormattedTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel45))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel50)
                                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel49)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox2))))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel51)
                                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel52))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel53)
                                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel54))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel50)
                                .addGap(32, 32, 32))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btClienteBuscarCliente)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel45)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jFormattedTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel49)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jCheckBox2))))
                                    .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addGap(11, 11, 11)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel54)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClienteAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClienteDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("CLIENTES");

        btClienteCancelar.setBackground(new java.awt.Color(240, 240, 240));
        btClienteCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btClienteCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btClienteCancelar.setText("Cancelar");
        btClienteCancelar.setPreferredSize(new java.awt.Dimension(87, 35));
        btClienteCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btClienteCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btClienteCancelarMouseExited(evt);
            }
        });

        btClienteSalvar.setBackground(new java.awt.Color(240, 240, 240));
        btClienteSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btClienteSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btClienteSalvar.setText("Salvar");
        btClienteSalvar.setPreferredSize(new java.awt.Dimension(76, 35));
        btClienteSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btClienteSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btClienteSalvarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnTelaClienteLayout = new javax.swing.GroupLayout(pnTelaCliente);
        pnTelaCliente.setLayout(pnTelaClienteLayout);
        pnTelaClienteLayout.setHorizontalGroup(
            pnTelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTelaClienteLayout.createSequentialGroup()
                .addContainerGap(794, Short.MAX_VALUE)
                .addComponent(btClienteSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btClienteCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(pnTelaClienteLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnTelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnTelaClienteLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE)))
        );
        pnTelaClienteLayout.setVerticalGroup(
            pnTelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaClienteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 558, Short.MAX_VALUE)
                .addGroup(pnTelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClienteCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClienteSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(pnTelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnTelaClienteLayout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );

        pnCdTelas.add(pnTelaCliente, "cdTelaCliente");

        pnRelatório.setBackground(new java.awt.Color(215, 215, 215));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1009, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel40.setText("RELATÓRIOS");

        javax.swing.GroupLayout pnRelatórioLayout = new javax.swing.GroupLayout(pnRelatório);
        pnRelatório.setLayout(pnRelatórioLayout);
        pnRelatórioLayout.setHorizontalGroup(
            pnRelatórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRelatórioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel40)
                .addContainerGap(838, Short.MAX_VALUE))
            .addGroup(pnRelatórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnRelatórioLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(36, 36, 36)))
        );
        pnRelatórioLayout.setVerticalGroup(
            pnRelatórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRelatórioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addContainerGap(606, Short.MAX_VALUE))
            .addGroup(pnRelatórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnRelatórioLayout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );

        pnCdTelas.add(pnRelatório, "cdTelaRelatorio");

        pnTela.add(pnCdTelas, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnTela, "cdTelaSistema");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistroActionPerformed
        estilo.restauraCor(btRegistro);
        tfUsuario.setText("");
        pfSenha.setText("");
        telaUsuario.setLocationRelativeTo(this);
        telaUsuario.setVisible(true);
    }//GEN-LAST:event_btRegistroActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        String nomeUsuario = tfUsuario.getText();
        char[] senhaUsuario = pfSenha.getPassword();
        if(!nomeUsuario.isEmpty() || senhaUsuario.length != 0){
            Usuario usuario = new Usuario(nomeUsuario, senhaUsuario);
            if(usuarioController.autenticar(usuario)){
                    cdl.show(getContentPane(), "cdTelaSistema");
                    lbUsuarioLogado.setText(nomeUsuario);
                    tfUsuario.setText("");
                    pfSenha.setText("");
                }else {
                    JOptionPane.showMessageDialog(rootPane, "Usuário ou Senha incorretos!", "Falha no Login", JOptionPane.ERROR_MESSAGE);
                }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Usuário ou Senha incorretos!", "Falha no Login", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btEntrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cdl.show(getContentPane(), "cdTelaLogin");
    }//GEN-LAST:event_formWindowOpened

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        cdlPn.show(pnCdTelas, "cdTelaHome");
        resetaEstadoComponentesCadastroContrato();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void btEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarMouseEntered
        estilo.aplicaHoverEntered(btEntrar);
    }//GEN-LAST:event_btEntrarMouseEntered

    private void btEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarMouseExited
        estilo.aplicaHoverExited(btEntrar);
    }//GEN-LAST:event_btEntrarMouseExited

    private void btRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegistroMouseEntered
        estilo.aplicaHoverEntered(btRegistro);
    }//GEN-LAST:event_btRegistroMouseEntered

    private void btRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegistroMouseExited
        estilo.aplicaHoverExited(btRegistro);
    }//GEN-LAST:event_btRegistroMouseExited

    private void btMenuContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuContratoActionPerformed
        cdlPn.show(pnCdTelas, "cdTelaCadastroContrato");
    }//GEN-LAST:event_btMenuContratoActionPerformed

    private void btMenuClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMenuClienteMouseEntered
        estilo.aplicaHoverEntered(btMenuCliente);
    }//GEN-LAST:event_btMenuClienteMouseEntered

    private void btMenuEquipamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMenuEquipamentoMouseEntered
        estilo.aplicaHoverEntered(btMenuEquipamento);
    }//GEN-LAST:event_btMenuEquipamentoMouseEntered

    private void btMenuContratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMenuContratoMouseEntered
        estilo.aplicaHoverEntered(btMenuContrato);
    }//GEN-LAST:event_btMenuContratoMouseEntered

    private void btMenuRelatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMenuRelatorioMouseEntered
        estilo.aplicaHoverEntered(btMenuRelatorio);
    }//GEN-LAST:event_btMenuRelatorioMouseEntered

    private void btMenuContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMenuContratoMouseExited
        estilo.aplicaHoverExited(btMenuContrato);
    }//GEN-LAST:event_btMenuContratoMouseExited

    private void btMenuEquipamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMenuEquipamentoMouseExited
        estilo.aplicaHoverExited(btMenuEquipamento);
    }//GEN-LAST:event_btMenuEquipamentoMouseExited

    private void btMenuClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMenuClienteMouseExited
        estilo.aplicaHoverExited(btMenuCliente);
    }//GEN-LAST:event_btMenuClienteMouseExited

    private void btMenuRelatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMenuRelatorioMouseExited
        estilo.aplicaHoverExited(btMenuRelatorio);
    }//GEN-LAST:event_btMenuRelatorioMouseExited

    private void btNovoContratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNovoContratoMouseEntered
        estilo.aplicaHoverEntered(btNovoContrato);
    }//GEN-LAST:event_btNovoContratoMouseEntered

    private void btNovoContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNovoContratoMouseExited
        estilo.aplicaHoverExited(btNovoContrato);
    }//GEN-LAST:event_btNovoContratoMouseExited

    private void btEncerrarContratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEncerrarContratoMouseEntered
        estilo.aplicaHoverEntered(btEncerrarContrato);
    }//GEN-LAST:event_btEncerrarContratoMouseEntered

    private void btEncerrarContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEncerrarContratoMouseExited
        estilo.aplicaHoverExited(btEncerrarContrato);
    }//GEN-LAST:event_btEncerrarContratoMouseExited

    private void btContratoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContratoCancelarActionPerformed
        cdlPn.show(pnCdTelas, "cdTelaHome");
        resetaEstadoComponentesCadastroContrato();
    }//GEN-LAST:event_btContratoCancelarActionPerformed

    private void btContratoRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoRegistrarMouseEntered
        estilo.aplicaHoverEntered(btContratoRegistrar);
    }//GEN-LAST:event_btContratoRegistrarMouseEntered

    private void btContratoRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoRegistrarMouseExited
        estilo.aplicaHoverExited(btContratoRegistrar);
    }//GEN-LAST:event_btContratoRegistrarMouseExited

    private void btContratoCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoCancelarMouseEntered
        estilo.aplicaHoverEntered(btContratoCancelar);
    }//GEN-LAST:event_btContratoCancelarMouseEntered

    private void btContratoCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoCancelarMouseExited
        estilo.aplicaHoverExited(btContratoCancelar);
    }//GEN-LAST:event_btContratoCancelarMouseExited

    private void btContratoLimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoLimparMouseEntered
        estilo.aplicaHoverEntered(btContratoLimpar);
    }//GEN-LAST:event_btContratoLimparMouseEntered

    private void btContratoLimparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoLimparMouseExited
        estilo.aplicaHoverExited(btContratoLimpar);
    }//GEN-LAST:event_btContratoLimparMouseExited

    private void lbPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPerfilMouseClicked
        String[] opcoes = {"Sim", "Não"};
        int opcao = JOptionPane.showOptionDialog(rootPane, "Desejar deslogar da sua conta?", "Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if(opcao == 0){
            cdl.show(getContentPane(), "cdTelaLogin");
        }
    }//GEN-LAST:event_lbPerfilMouseClicked

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        cdl.show(getContentPane(), "cdTelaLogin");
    }//GEN-LAST:event_menuSairActionPerformed

    private void lbPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPerfilMouseEntered
        lbPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
    }//GEN-LAST:event_lbPerfilMouseEntered

    private void lbPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPerfilMouseExited
        lbPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile-picture.png"))); // NOI18N
    }//GEN-LAST:event_lbPerfilMouseExited

    private void btMenuEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuEquipamentoActionPerformed
        cdlPn.show(pnCdTelas, "cdTelaEquipamento");
    }//GEN-LAST:event_btMenuEquipamentoActionPerformed

    private void btBuscarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarContratoActionPerformed
        buscarContrato.setLocationRelativeTo(this);
        buscarContrato.setVisible(true);
        lbCadastrarContratoDataEntrega.setVisible(true);
        dcCadastrarContratoEntrega.setVisible(true);
        btTotalizacaoContrato.setVisible(true);
    }//GEN-LAST:event_btBuscarContratoActionPerformed

    private void btContratoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContratoLimparActionPerformed
        resetaEstadoComponentesCadastroContrato();
    }//GEN-LAST:event_btContratoLimparActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btBuscarContratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarContratoMouseEntered
        estilo.aplicaHoverEntered(btBuscarContrato);
    }//GEN-LAST:event_btBuscarContratoMouseEntered

    private void btBuscarContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarContratoMouseExited
        estilo.aplicaHoverExited(btBuscarContrato);
    }//GEN-LAST:event_btBuscarContratoMouseExited

    private void btAdicionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAdicionarMouseEntered
        estilo.aplicaHoverEntered(btAdicionar);
    }//GEN-LAST:event_btAdicionarMouseEntered

    private void btAdicionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAdicionarMouseExited
        estilo.aplicaHoverExited(btAdicionar);
    }//GEN-LAST:event_btAdicionarMouseExited

    private void btBuscarContratoEncerrarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarContratoEncerrarContratoActionPerformed
        buscarContrato.setLocationRelativeTo(this);
        buscarContrato.setVisible(true);
    }//GEN-LAST:event_btBuscarContratoEncerrarContratoActionPerformed

    private void btRegistrarEncerrarContratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegistrarEncerrarContratoMouseEntered
        estilo.aplicaHoverEntered(btRegistrarEncerrarContrato);
    }//GEN-LAST:event_btRegistrarEncerrarContratoMouseEntered

    private void btRegistrarEncerrarContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegistrarEncerrarContratoMouseExited
        estilo.aplicaHoverExited(btRegistrarEncerrarContrato);
    }//GEN-LAST:event_btRegistrarEncerrarContratoMouseExited

    private void btLimparEncerrarContratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimparEncerrarContratoMouseEntered
        estilo.aplicaHoverEntered(btLimparEncerrarContrato);
    }//GEN-LAST:event_btLimparEncerrarContratoMouseEntered

    private void btLimparEncerrarContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimparEncerrarContratoMouseExited
        estilo.aplicaHoverExited(btLimparEncerrarContrato);
    }//GEN-LAST:event_btLimparEncerrarContratoMouseExited

    private void btCancelarEncerrarContratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarEncerrarContratoMouseEntered
        estilo.aplicaHoverEntered(btCancelarEncerrarContrato);
    }//GEN-LAST:event_btCancelarEncerrarContratoMouseEntered

    private void btCancelarEncerrarContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarEncerrarContratoMouseExited
        estilo.aplicaHoverExited(btCancelarEncerrarContrato);
    }//GEN-LAST:event_btCancelarEncerrarContratoMouseExited

    private void btBuscarContratoEncerrarContratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarContratoEncerrarContratoMouseEntered
        estilo.aplicaHoverEntered(btBuscarContratoEncerrarContrato);
    }//GEN-LAST:event_btBuscarContratoEncerrarContratoMouseEntered

    private void btBuscarContratoEncerrarContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarContratoEncerrarContratoMouseExited
        estilo.aplicaHoverExited(btBuscarContratoEncerrarContrato);
    }//GEN-LAST:event_btBuscarContratoEncerrarContratoMouseExited

    private void btEncerrarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncerrarContratoActionPerformed
        cdlPn.show(pnCdTelas, "cdTelaEncerrarContrato");
    }//GEN-LAST:event_btEncerrarContratoActionPerformed

    private void btNovoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoContratoActionPerformed
        cdlPn.show(pnCdTelas, "cdTelaCadastroContrato");
    }//GEN-LAST:event_btNovoContratoActionPerformed

    private void btTotalizacaoContratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTotalizacaoContratoMouseEntered
        estilo.aplicaHoverEntered(btTotalizacaoContrato);
    }//GEN-LAST:event_btTotalizacaoContratoMouseEntered

    private void btTotalizacaoContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTotalizacaoContratoMouseExited
        estilo.aplicaHoverExited(btTotalizacaoContrato);
    }//GEN-LAST:event_btTotalizacaoContratoMouseExited

    private void btTotalizacaoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTotalizacaoContratoActionPerformed
        verTotalizazao.setLocationRelativeTo(this);
        verTotalizazao.setVisible(true);
    }//GEN-LAST:event_btTotalizacaoContratoActionPerformed

    private void btRegistrarEquipamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegistrarEquipamentoMouseEntered
        estilo.aplicaHoverEntered(btRegistrarEquipamento);
    }//GEN-LAST:event_btRegistrarEquipamentoMouseEntered

    private void btRegistrarEquipamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegistrarEquipamentoMouseExited
        estilo.aplicaHoverExited(btRegistrarEquipamento);
    }//GEN-LAST:event_btRegistrarEquipamentoMouseExited

    private void btLimparEquipamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimparEquipamentoMouseEntered
        estilo.aplicaHoverEntered(btLimparEquipamento);
    }//GEN-LAST:event_btLimparEquipamentoMouseEntered

    private void btLimparEquipamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimparEquipamentoMouseExited
        estilo.aplicaHoverExited(btLimparEquipamento);
    }//GEN-LAST:event_btLimparEquipamentoMouseExited

    private void btCancelarEquipamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarEquipamentoMouseEntered
        estilo.aplicaHoverEntered(btCancelarEquipamento);
    }//GEN-LAST:event_btCancelarEquipamentoMouseEntered

    private void btCancelarEquipamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarEquipamentoMouseExited
        estilo.aplicaHoverExited(btCancelarEquipamento);
    }//GEN-LAST:event_btCancelarEquipamentoMouseExited

    private void btAlterarEquipamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarEquipamentoMouseEntered
        estilo.aplicaHoverEntered(btAlterarEquipamento);
    }//GEN-LAST:event_btAlterarEquipamentoMouseEntered

    private void btAlterarEquipamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarEquipamentoMouseExited
        estilo.aplicaHoverExited(btAlterarEquipamento);
    }//GEN-LAST:event_btAlterarEquipamentoMouseExited

    private void btDeletarEquipamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeletarEquipamentoMouseEntered
        estilo.aplicaHoverEntered(btDeletarEquipamento);
    }//GEN-LAST:event_btDeletarEquipamentoMouseEntered

    private void btDeletarEquipamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeletarEquipamentoMouseExited
        estilo.aplicaHoverExited(btDeletarEquipamento);
    }//GEN-LAST:event_btDeletarEquipamentoMouseExited

    private void btBuscarEquipamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarEquipamentoMouseEntered
        estilo.aplicaHoverEntered(btBuscarEquipamento);
    }//GEN-LAST:event_btBuscarEquipamentoMouseEntered

    private void btBuscarEquipamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarEquipamentoMouseExited
        estilo.aplicaHoverExited(btBuscarEquipamento);
    }//GEN-LAST:event_btBuscarEquipamentoMouseExited

    private void btBuscarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarEquipamentoActionPerformed
        buscarEquipamento.setLocationRelativeTo(this);
        buscarEquipamento.setVisible(true);
    }//GEN-LAST:event_btBuscarEquipamentoActionPerformed

    private void btClienteAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteAlterarMouseEntered
        estilo.aplicaHoverEntered(btClienteAlterar);
    }//GEN-LAST:event_btClienteAlterarMouseEntered

    private void btClienteAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteAlterarMouseExited
        estilo.aplicaHoverExited(btClienteAlterar);
    }//GEN-LAST:event_btClienteAlterarMouseExited

    private void btClienteDeletarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteDeletarMouseEntered
        estilo.aplicaHoverEntered(btClienteDeletar);
    }//GEN-LAST:event_btClienteDeletarMouseEntered

    private void btClienteDeletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteDeletarMouseExited
        estilo.aplicaHoverExited(btClienteDeletar);
    }//GEN-LAST:event_btClienteDeletarMouseExited

    private void btContratoBuscarEquipamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoBuscarEquipamentoMouseEntered
        estilo.aplicaHoverEntered(btContratoBuscarEquipamento);
    }//GEN-LAST:event_btContratoBuscarEquipamentoMouseEntered

    private void btContratoBuscarEquipamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoBuscarEquipamentoMouseExited
        estilo.aplicaHoverExited(btContratoBuscarEquipamento);
    }//GEN-LAST:event_btContratoBuscarEquipamentoMouseExited

    private void btContratoBuscarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContratoBuscarEquipamentoActionPerformed
        buscarEquipamento.setLocationRelativeTo(this);
        buscarEquipamento.setVisible(true);
    }//GEN-LAST:event_btContratoBuscarEquipamentoActionPerformed

    private void btClienteSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteSalvarMouseEntered
        estilo.aplicaHoverEntered(btClienteSalvar);
    }//GEN-LAST:event_btClienteSalvarMouseEntered

    private void btClienteSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteSalvarMouseExited
        estilo.aplicaHoverExited(btClienteSalvar);
    }//GEN-LAST:event_btClienteSalvarMouseExited

    private void btClienteCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteCancelarMouseEntered
        estilo.aplicaHoverEntered(btClienteCancelar);
    }//GEN-LAST:event_btClienteCancelarMouseEntered

    private void btClienteCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteCancelarMouseExited
        estilo.aplicaHoverExited(btClienteCancelar);
    }//GEN-LAST:event_btClienteCancelarMouseExited

    private void btClienteBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteBuscarClienteActionPerformed
        buscarCliente.setLocationRelativeTo(this);
        buscarCliente.setVisible(true);
    }//GEN-LAST:event_btClienteBuscarClienteActionPerformed

    private void btMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuClienteActionPerformed
        cdlPn.show(pnCdTelas, "cdTelaCliente");
    }//GEN-LAST:event_btMenuClienteActionPerformed
     
    public void resetaEstadoComponentesCadastroContrato(){
        lbCadastrarContratoDataEntrega.setVisible(false);
        dcCadastrarContratoEntrega.setVisible(false);
        btTotalizacaoContrato.setVisible(false);
    }
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btAlterarEquipamento;
    private javax.swing.JButton btBuscarContrato;
    private javax.swing.JButton btBuscarContratoEncerrarContrato;
    private javax.swing.JButton btBuscarEquipamento;
    private javax.swing.JButton btCancelarEncerrarContrato;
    private javax.swing.JButton btCancelarEquipamento;
    private javax.swing.JButton btClienteAlterar;
    private javax.swing.JButton btClienteBuscarCliente;
    private javax.swing.JButton btClienteCancelar;
    private javax.swing.JButton btClienteDeletar;
    private javax.swing.JButton btClienteSalvar;
    private javax.swing.JButton btContratoBuscarEquipamento;
    private javax.swing.JButton btContratoCancelar;
    private javax.swing.JButton btContratoLimpar;
    private javax.swing.JButton btContratoRegistrar;
    private javax.swing.JButton btDeletarEquipamento;
    private javax.swing.JButton btEncerrarContrato;
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btLimparEncerrarContrato;
    private javax.swing.JButton btLimparEquipamento;
    private javax.swing.JButton btMenuCliente;
    private javax.swing.JButton btMenuContrato;
    private javax.swing.JButton btMenuEquipamento;
    private javax.swing.JButton btMenuRelatorio;
    private javax.swing.JButton btNovoContrato;
    private javax.swing.JButton btRegistrarEncerrarContrato;
    private javax.swing.JButton btRegistrarEquipamento;
    private javax.swing.JButton btRegistro;
    private javax.swing.JButton btTotalizacaoContrato;
    private javax.swing.ButtonGroup btgTipo;
    private com.toedter.calendar.JDateChooser dcCadastrarContratoEntrega;
    private com.toedter.calendar.JDateChooser dcCadastroContratoFinal;
    private com.toedter.calendar.JDateChooser dcCadastroContratoInicio;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField10;
    private javax.swing.JFormattedTextField jFormattedTextField11;
    private javax.swing.JFormattedTextField jFormattedTextField13;
    private javax.swing.JFormattedTextField jFormattedTextField14;
    private javax.swing.JFormattedTextField jFormattedTextField15;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    private javax.swing.JFormattedTextField jFormattedTextField8;
    private javax.swing.JFormattedTextField jFormattedTextField9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JSpinner jsQtdEquipamento;
    private javax.swing.JSpinner jsQtdEstoqueEquipamento;
    private javax.swing.JLabel lbCadastrarContratoDataEntrega;
    private javax.swing.JLabel lbCadastrarContratoDataFinal;
    private javax.swing.JLabel lbCadastrarContratoDataInicio;
    private javax.swing.JLabel lbLogoHm;
    private javax.swing.JLabel lbLogoLg;
    private javax.swing.JLabel lbPerfil;
    private javax.swing.JLabel lbUsuarioLogado;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JPanel pnCdTelas;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPanel pnLogin1;
    private javax.swing.JPanel pnLogo;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnRelatório;
    private javax.swing.JPanel pnTela;
    private javax.swing.JPanel pnTelaCadastroCt;
    private javax.swing.JPanel pnTelaCliente;
    private javax.swing.JPanel pnTelaEncerrarCt;
    private javax.swing.JPanel pnTelaEquipamento;
    private javax.swing.JPanel pnTelaHome;
    private javax.swing.JPanel pnTop;
    private javax.swing.JPopupMenu popupPerfil;
    private javax.swing.JTextField tfClienteEncerrarContrato;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
