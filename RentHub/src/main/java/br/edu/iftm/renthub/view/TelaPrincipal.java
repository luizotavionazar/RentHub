package br.edu.iftm.renthub.view;

import br.edu.iftm.renthub.control.Endereco.ConsultaCep;
import br.edu.iftm.renthub.model.Usuario;
import java.awt.CardLayout;
import java.util.Arrays;
import javax.swing.JOptionPane;

// Criado por Jhonnie em 08/07/2023
public class TelaPrincipal extends javax.swing.JFrame {
    private static TelaRegistroUsuario telaUsuario;
    private CardLayout cdl;
    private CardLayout cdlPn;
    private UtilsComponent estilo;
    private ConsultaCep consulta;
    
    public TelaPrincipal() {
        telaUsuario = new TelaRegistroUsuario(this, true);
        initComponents();
        cdl = (CardLayout) getContentPane().getLayout();
        cdlPn = (CardLayout) pnCdTelas.getLayout();
        estilo = new UtilsComponent();
        estilo.configJspinner(jsQtdEquipamento, jsTempoAluguel);
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
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
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
        jsTempoAluguel = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        btContratoRegistrar = new RoundedButton("");
        btContratoCancelar = new RoundedButton("");
        btContratoLimpar = new RoundedButton("");
        pnTelaEncerrarCt = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tipo de Contrato");

        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText("Diário");
        jRadioButton1.setFocusPainted(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("Mensal");
        jRadioButton2.setFocusPainted(false);

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

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Tempo (Dias/Meses)");

        btContratoRegistrar.setBackground(new java.awt.Color(240, 240, 240));
        btContratoRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btContratoRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btContratoRegistrar.setText("Registrar");
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
        btContratoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trash-can.png"))); // NOI18N
        btContratoLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btContratoLimparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btContratoLimparMouseExited(evt);
            }
        });

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
                            .addComponent(jTextField2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel8))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))))
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2))
                            .addComponent(jLabel6)
                            .addComponent(jLabel19)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jsQtdEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jsTempoAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(244, 244, 244))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btContratoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btContratoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btContratoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jsQtdEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jsTempoAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btContratoLimpar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btContratoRegistrar)
                        .addComponent(btContratoCancelar)))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout pnTelaCadastroCtLayout = new javax.swing.GroupLayout(pnTelaCadastroCt);
        pnTelaCadastroCt.setLayout(pnTelaCadastroCtLayout);
        pnTelaCadastroCtLayout.setHorizontalGroup(
            pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaCadastroCtLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnTelaCadastroCtLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btNovoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        pnTelaCadastroCtLayout.setVerticalGroup(
            pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaCadastroCtLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btNovoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pnCdTelas.add(pnTelaCadastroCt, "cdTelaCadastroContrato");

        pnTelaEncerrarCt.setBackground(new java.awt.Color(217, 217, 217));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0000", "Computador Acer Fera demais", "100"}
            },
            new String [] {
                "Cód.", "Equipamento", "Qtd."
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        javax.swing.GroupLayout pnTelaEncerrarCtLayout = new javax.swing.GroupLayout(pnTelaEncerrarCt);
        pnTelaEncerrarCt.setLayout(pnTelaEncerrarCtLayout);
        pnTelaEncerrarCtLayout.setHorizontalGroup(
            pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaEncerrarCtLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        pnTelaEncerrarCtLayout.setVerticalGroup(
            pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaEncerrarCtLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(448, Short.MAX_VALUE))
        );

        pnCdTelas.add(pnTelaEncerrarCt, "cdTelaEncerrarContrato");

        pnTela.add(pnCdTelas, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnTela, "cdTelaSistema");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistroActionPerformed
        estilo.restauraCor(btRegistro);
        tfUsuario.setText("");
        pfSenha.setText("");
        telaUsuario.setLocationRelativeTo(this);
        telaUsuario.setVisible(true);
    }//GEN-LAST:event_btRegistroActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        String usuario = tfUsuario.getText();
        char[] senha = pfSenha.getPassword();
        if(!usuario.isEmpty() || senha.length != 0){
            Usuario user = telaUsuario.getUser();
            if(user != null){
                boolean validaUsuario = usuario.equals(user.getUsuario());
                boolean validaSenha = Arrays.equals(senha, user.getSenha());
                if(validaUsuario && validaSenha){
                    cdl.show(getContentPane(), "cdTelaSistema");
                    lbUsuarioLogado.setText(usuario);
                    tfUsuario.setText("");
                    pfSenha.setText("");
                }else {
                    JOptionPane.showMessageDialog(rootPane, "Usuário ou Senha incorretos!", "Falha no Login", JOptionPane.ERROR_MESSAGE);
                }
            }else{
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btContratoCancelar;
    private javax.swing.JButton btContratoLimpar;
    private javax.swing.JButton btContratoRegistrar;
    private javax.swing.JButton btEncerrarContrato;
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btMenuCliente;
    private javax.swing.JButton btMenuContrato;
    private javax.swing.JButton btMenuEquipamento;
    private javax.swing.JButton btMenuRelatorio;
    private javax.swing.JButton btNovoContrato;
    private javax.swing.JButton btRegistro;
    private javax.swing.ButtonGroup btgTipo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JSpinner jsQtdEquipamento;
    private javax.swing.JSpinner jsTempoAluguel;
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
    private javax.swing.JPanel pnTelaHome;
    private javax.swing.JPanel pnTop;
    private javax.swing.JPopupMenu popupPerfil;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
