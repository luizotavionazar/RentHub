package br.edu.iftm.renthub.view;

import br.edu.iftm.renthub.control.UsuarioController;
import br.edu.iftm.renthub.control.Endereco.ConsultaCep;
import br.edu.iftm.renthub.model.Usuario;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.SQLException;
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

    public TelaPrincipal(Connection conexao) throws SQLException {
        usuarioController = new UsuarioController(conexao);
        telaUsuario = new TelaRegistroUsuario(this, true, conexao);
        buscarContrato = new BuscarContrato(this, true, conexao);
        initComponents();
        cdl = (CardLayout) getContentPane().getLayout();
        cdlPn = (CardLayout) pnCdTelas.getLayout();
        estilo = new UtilsComponent();
        estilo.configJspinner(jsQtdEquipamento);
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
        btNovoContrato = new RoundedButton("");
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
        jComboBox2 = new javax.swing.JComboBox<>();
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
        btContratoRegistrar = new RoundedButton("");
        btContratoCancelar = new RoundedButton("");
        btContratoLimpar = new RoundedButton("");
        btBuscarContrato = new RoundedButton("");
        pnTelaEncerrarCt = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        btContratoRegistrar1 = new RoundedButton("");
        btContratoCancelar1 = new RoundedButton("");
        btContratoLimpar1 = new RoundedButton("");
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        btNovoContrato1 = new RoundedButton("");
        btEncerrarContrato1 = new RoundedButton("");
        pnTelaEquipamento = new javax.swing.JPanel();

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
                    .addComponent(lbPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(lbUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
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
                    .addComponent(btMenuRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jComboBox2.setBackground(new java.awt.Color(215, 215, 215));
        jComboBox2.setFocusable(false);

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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

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
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jsQtdEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(dcCadastrarContratoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCadastrarContratoDataEntrega)
                            .addComponent(lbCadastrarContratoDataInicio)
                            .addComponent(lbCadastrarContratoDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcCadastroContratoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcCadastroContratoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jsQtdEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCadastrarContratoDataInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcCadastroContratoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCadastrarContratoDataFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcCadastroContratoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCadastrarContratoDataEntrega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcCadastrarContratoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83))
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
                            .addComponent(btNovoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        pnTelaCadastroCtLayout.setVerticalGroup(
            pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaCadastroCtLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btNovoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btBuscarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnTelaCadastroCtLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btContratoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btContratoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btContratoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnCdTelas.add(pnTelaCadastroCt, "cdTelaCadastroContrato");

        pnTelaEncerrarCt.setBackground(new java.awt.Color(217, 217, 217));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Tipo de Contrato");

        jRadioButton3.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setText("Diário");
        jRadioButton3.setFocusPainted(false);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton4.setText("Mensal");
        jRadioButton4.setFocusPainted(false);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("ENCERRAMENTO");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Numero do Contrato");

        jTextField7.setBackground(new java.awt.Color(215, 215, 215));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("CPF/CNPJ");

        jFormattedTextField4.setBackground(new java.awt.Color(215, 215, 215));
        jFormattedTextField4.setToolTipText("");

        jFormattedTextField5.setBackground(new java.awt.Color(215, 215, 215));
        jFormattedTextField5.setToolTipText("");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Telefone");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Equipamentos");

        jComboBox4.setBackground(new java.awt.Color(215, 215, 215));
        jComboBox4.setFocusable(false);

        btContratoRegistrar1.setBackground(new java.awt.Color(240, 240, 240));
        btContratoRegistrar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btContratoRegistrar1.setForeground(new java.awt.Color(0, 0, 0));
        btContratoRegistrar1.setText("Registrar");
        btContratoRegistrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btContratoRegistrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btContratoRegistrar1MouseExited(evt);
            }
        });

        btContratoCancelar1.setBackground(new java.awt.Color(240, 240, 240));
        btContratoCancelar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btContratoCancelar1.setForeground(new java.awt.Color(0, 0, 0));
        btContratoCancelar1.setText("Cancelar");
        btContratoCancelar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btContratoCancelar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btContratoCancelar1MouseExited(evt);
            }
        });
        btContratoCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContratoCancelar1ActionPerformed(evt);
            }
        });

        btContratoLimpar1.setBackground(new java.awt.Color(240, 240, 240));
        btContratoLimpar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btContratoLimpar1.setForeground(new java.awt.Color(0, 0, 0));
        btContratoLimpar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trash-can.png"))); // NOI18N
        btContratoLimpar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btContratoLimpar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btContratoLimpar1MouseExited(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(240, 240, 240));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N

        jTable2.setBackground(new java.awt.Color(215, 215, 215));
        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Equipamento", "Qtd."
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        jButton4.setBackground(new java.awt.Color(240, 240, 240));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loupe.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btContratoLimpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btContratoRegistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btContratoCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextField4)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jFormattedTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(150, 150, 150)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton4))
                            .addComponent(jLabel11)
                            .addComponent(jLabel32)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(144, 144, 144))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton4))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(210, 210, 210))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btContratoLimpar1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btContratoRegistrar1)
                        .addComponent(btContratoCancelar1)))
                .addGap(37, 37, 37))
        );

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("CONTRATO");

        btNovoContrato1.setBackground(new java.awt.Color(240, 240, 240));
        btNovoContrato1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btNovoContrato1.setForeground(new java.awt.Color(0, 0, 0));
        btNovoContrato1.setText("Novo Contrato");
        btNovoContrato1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btNovoContrato1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btNovoContrato1MouseExited(evt);
            }
        });

        btEncerrarContrato1.setBackground(new java.awt.Color(240, 240, 240));
        btEncerrarContrato1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btEncerrarContrato1.setForeground(new java.awt.Color(0, 0, 0));
        btEncerrarContrato1.setText("Encerrar Contrato");
        btEncerrarContrato1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btEncerrarContrato1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btEncerrarContrato1MouseExited(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btNovoContrato1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btEncerrarContrato1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        pnTelaEncerrarCtLayout.setVerticalGroup(
            pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaEncerrarCtLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36)
                    .addGroup(pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btNovoContrato1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btEncerrarContrato1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pnCdTelas.add(pnTelaEncerrarCt, "cdTelaEncerrarContrato");

        pnTelaEquipamento.setBackground(new java.awt.Color(217, 217, 217));

        javax.swing.GroupLayout pnTelaEquipamentoLayout = new javax.swing.GroupLayout(pnTelaEquipamento);
        pnTelaEquipamento.setLayout(pnTelaEquipamentoLayout);
        pnTelaEquipamentoLayout.setHorizontalGroup(
            pnTelaEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        pnTelaEquipamentoLayout.setVerticalGroup(
            pnTelaEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        pnCdTelas.add(pnTelaEquipamento, "cdTelaEquipamento");

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
        cdl.show(getContentPane(), "cdTelaLogin");
        /*Point localNaTela = lbPerfil.getLocationOnScreen();
        
        popupPerfil.setLocation(localNaTela.x, localNaTela.y + lbPerfil.getHeight());
        popupPerfil.setInvoker(lbPerfil);
        popupPerfil.setVisible(true);*/
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

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void btContratoRegistrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoRegistrar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btContratoRegistrar1MouseEntered

    private void btContratoRegistrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoRegistrar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btContratoRegistrar1MouseExited

    private void btContratoCancelar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoCancelar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btContratoCancelar1MouseEntered

    private void btContratoCancelar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoCancelar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btContratoCancelar1MouseExited

    private void btContratoCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContratoCancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btContratoCancelar1ActionPerformed

    private void btContratoLimpar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoLimpar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btContratoLimpar1MouseEntered

    private void btContratoLimpar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoLimpar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btContratoLimpar1MouseExited

    private void btNovoContrato1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNovoContrato1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btNovoContrato1MouseEntered

    private void btNovoContrato1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNovoContrato1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btNovoContrato1MouseExited

    private void btEncerrarContrato1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEncerrarContrato1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btEncerrarContrato1MouseEntered

    private void btEncerrarContrato1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEncerrarContrato1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btEncerrarContrato1MouseExited

    private void btMenuEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuEquipamentoActionPerformed
        cdlPn.show(pnCdTelas, "cdTelaEquipamento");
    }//GEN-LAST:event_btMenuEquipamentoActionPerformed

    private void btBuscarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarContratoActionPerformed
        buscarContrato.setLocationRelativeTo(this);
        buscarContrato.setVisible(true);
        lbCadastrarContratoDataEntrega.setVisible(true);
        dcCadastrarContratoEntrega.setVisible(true);
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
        
    public void resetaEstadoComponentesCadastroContrato(){
        lbCadastrarContratoDataEntrega.setVisible(false);
        dcCadastrarContratoEntrega.setVisible(false);
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
    private javax.swing.JButton btBuscarContrato;
    private javax.swing.JButton btContratoCancelar;
    private javax.swing.JButton btContratoCancelar1;
    private javax.swing.JButton btContratoLimpar;
    private javax.swing.JButton btContratoLimpar1;
    private javax.swing.JButton btContratoRegistrar;
    private javax.swing.JButton btContratoRegistrar1;
    private javax.swing.JButton btEncerrarContrato;
    private javax.swing.JButton btEncerrarContrato1;
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btMenuCliente;
    private javax.swing.JButton btMenuContrato;
    private javax.swing.JButton btMenuEquipamento;
    private javax.swing.JButton btMenuRelatorio;
    private javax.swing.JButton btNovoContrato;
    private javax.swing.JButton btNovoContrato1;
    private javax.swing.JButton btRegistro;
    private javax.swing.ButtonGroup btgTipo;
    private com.toedter.calendar.JDateChooser dcCadastrarContratoEntrega;
    private com.toedter.calendar.JDateChooser dcCadastroContratoFinal;
    private com.toedter.calendar.JDateChooser dcCadastroContratoInicio;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JSpinner jsQtdEquipamento;
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
    private javax.swing.JPanel pnTela;
    private javax.swing.JPanel pnTelaCadastroCt;
    private javax.swing.JPanel pnTelaEncerrarCt;
    private javax.swing.JPanel pnTelaEquipamento;
    private javax.swing.JPanel pnTelaHome;
    private javax.swing.JPanel pnTop;
    private javax.swing.JPopupMenu popupPerfil;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
