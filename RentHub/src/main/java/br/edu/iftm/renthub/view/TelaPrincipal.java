package br.edu.iftm.renthub.view;

import br.edu.iftm.renthub.control.ClienteController;
import br.edu.iftm.renthub.control.ContratoController;
import br.edu.iftm.renthub.control.UsuarioController;
import br.edu.iftm.renthub.control.Endereco.ConsultaCep;
import br.edu.iftm.renthub.control.EquipamentoController;
import br.edu.iftm.renthub.control.TotalizacaoController;
import br.edu.iftm.renthub.model.Cliente;
import br.edu.iftm.renthub.model.Contrato;
import br.edu.iftm.renthub.model.Endereco;
import br.edu.iftm.renthub.model.Equipamento;
import br.edu.iftm.renthub.model.Totalizacao;
import br.edu.iftm.renthub.model.Usuario;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends javax.swing.JFrame {
    private static TelaRegistroUsuario telaUsuario;
    private CardLayout cdl;
    private CardLayout cdlPn;
    private UtilsComponent estilo;
    private ConsultaCep consulta;
    private static UsuarioController usuarioController;
    private static ContratoController contratoController;
    private static TotalizacaoController totalizacaoController;
    private static EquipamentoController equipamentoController;
    private static ClienteController clienteController;
    private static BuscarContrato buscarContrato;
    private static VerTotalizazao verTotalizazao;
    private static BuscarEquipamento buscarEquipamento;
    private static BuscarCliente buscarCliente;
    private List<Equipamento> equipamentosContrato = new ArrayList<>();
    private DefaultTableModel modeloTabelaEquipCadastroContrato;
    private DefaultTableModel modeloTabelaEquipamentosContrato;
    private boolean validaCliente = true;
    private Totalizacao totalizacao;

    public TelaPrincipal(Connection conexao) throws SQLException {
        usuarioController = new UsuarioController(conexao);
        contratoController = new ContratoController(conexao);
        clienteController = new ClienteController(conexao);
        buscarCliente = new BuscarCliente(this, true, conexao, this);
        totalizacaoController = new TotalizacaoController(conexao);
        equipamentoController = new EquipamentoController(conexao);
        telaUsuario = new TelaRegistroUsuario(this, true, conexao);
        buscarContrato = new BuscarContrato(this, true, conexao, buscarCliente, this);
        verTotalizazao = new VerTotalizazao(this, true, conexao);
        buscarEquipamento = new BuscarEquipamento(this, true, conexao, this);
        initComponents();
        jsEquipamentoQtdDisponivel.setEnabled(false);
        btAlterarEquipamento.setVisible(false);
        btDeletarEquipamento.setVisible(false);
        cbContratoEncerrarTipo.setEnabled(false);
        modeloTabelaEquipamentosContrato = (DefaultTableModel) tbContratoEncerrarEquipamentos.getModel();
        cdl = (CardLayout) getContentPane().getLayout();
        cdlPn = (CardLayout) pnCdTelas.getLayout();
        estilo = new UtilsComponent();
        estilo.configJspinner(jsQtdEquipamento, jsEquipamentoQtdEstoque);
        consulta = new ConsultaCep();
        modeloTabelaEquipCadastroContrato = (DefaultTableModel) tbContratoCadastroEquipamento.getModel();
        lbClienteNum.setVisible(false);
        lbEquipamentoNum.setVisible(false);
        lbContratoNum.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupPerfil = new javax.swing.JPopupMenu();
        menuSair = new javax.swing.JMenuItem();
        pnTelaLogin = new javax.swing.JPanel();
        pnLogo = new javax.swing.JPanel();
        lbLogoLg = new javax.swing.JLabel();
        pnLogin = new javax.swing.JPanel();
        lbTituloLogin = new javax.swing.JLabel();
        lbTituloUsuario = new javax.swing.JLabel();
        lbTituloSenha = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        pfSenha = new javax.swing.JPasswordField();
        btEntrar = new RoundedButton("");
        btRegistro = new RoundedButton("");
        pnTela = new javax.swing.JPanel();
        pnTop = new javax.swing.JPanel();
        lbTituloRentHub = new javax.swing.JLabel();
        lbUsuarioLogado = new javax.swing.JLabel();
        lbPerfil = new javax.swing.JLabel();
        pnMenu = new javax.swing.JPanel();
        btMenuContrato = new RoundedButton("");
        btMenuEquipamento = new RoundedButton("");
        btMenuCliente = new RoundedButton("");
        pnCdTelas = new javax.swing.JPanel();
        pnTelaHome = new javax.swing.JPanel();
        lbLogoHm = new javax.swing.JLabel();
        pnTelaCadastroCt = new javax.swing.JPanel();
        lbTituloContratoCadastro = new javax.swing.JLabel();
        btEncerrarContrato = new RoundedButton("");
        pnContratoCadastro = new javax.swing.JPanel();
        lbTituloContratoCliente = new javax.swing.JLabel();
        tfContratoCadastroCliente = new javax.swing.JTextField();
        lbTituloContratoCpf = new javax.swing.JLabel();
        ffContratoCadastroCpf = new javax.swing.JFormattedTextField();
        ffContratoCadastroTelefone = new javax.swing.JFormattedTextField();
        lbTituloContratoTelefone = new javax.swing.JLabel();
        lbTituloContratoEquipamento = new javax.swing.JLabel();
        lbTituloContratoQuantidade = new javax.swing.JLabel();
        jsQtdEquipamento = new javax.swing.JSpinner();
        btContratoCadastroAdicionarEquipamento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbContratoCadastroEquipamento = new javax.swing.JTable();
        lbTituloContratoCadastroDataFinal = new javax.swing.JLabel();
        dcContratoCadastroDataFinal = new com.toedter.calendar.JDateChooser();
        lbTituloContratoCadastroDataInicio = new javax.swing.JLabel();
        lbTituloContratoCadastroDataEntrega = new javax.swing.JLabel();
        dcContratoCadastroDataInicio = new com.toedter.calendar.JDateChooser();
        dcContratoCadastroDataEntrega = new com.toedter.calendar.JDateChooser();
        btContratoCadastroTotalizacao = new RoundedButton("");
        tfContratoCadastroEquipamento = new javax.swing.JTextField();
        btContratoBuscarEquipamento = new RoundedButton("");
        btContratoBuscarCliente = new RoundedButton("");
        jPanel1 = new javax.swing.JPanel();
        cbContratoCadastroUf = new javax.swing.JComboBox<>();
        tfContratoCadastroCidade = new javax.swing.JTextField();
        lbTituloContratoUf = new javax.swing.JLabel();
        lbTituloContratoCidade = new javax.swing.JLabel();
        tfContratoCadastroBairro = new javax.swing.JTextField();
        tfContratoCadastroComplemento = new javax.swing.JTextField();
        lbTituloContratoComplemento = new javax.swing.JLabel();
        lbTituloContratoBairro = new javax.swing.JLabel();
        lbTituloContratoLogradouro = new javax.swing.JLabel();
        tfContratoCadastroLogradouro = new javax.swing.JTextField();
        ckbContratoCadastroSemNumero = new javax.swing.JCheckBox();
        tfContratoCadastroNumero = new javax.swing.JTextField();
        lbTituloContratoNumero = new javax.swing.JLabel();
        ffContratoCadastroCep = new javax.swing.JFormattedTextField();
        lbTituloContratoCep = new javax.swing.JLabel();
        lbContratoNum = new javax.swing.JLabel();
        btContratoRegistrar = new RoundedButton("");
        btContratoCancelar = new RoundedButton("");
        btContratoLimpar = new RoundedButton("");
        btBuscarContrato = new RoundedButton("");
        pnTelaEncerrarCt = new javax.swing.JPanel();
        pnContratoEncerrar = new javax.swing.JPanel();
        lbTituloContratoTipo = new javax.swing.JLabel();
        lbTituloContratoEncerramento = new javax.swing.JLabel();
        lbTituloContratoNumeroContrato = new javax.swing.JLabel();
        tfContratoEncerrarNumeroContrato = new javax.swing.JTextField();
        lbTituloContratoEncerrarCpf = new javax.swing.JLabel();
        ffContratoEncerrarCpf = new javax.swing.JFormattedTextField();
        btContratoEncerrarBuscarContrato = new javax.swing.JButton();
        lbTituloContratoNomeCliente = new javax.swing.JLabel();
        tfContratoEncerrarCliente = new javax.swing.JTextField();
        tfContratoEncerrarTipo = new javax.swing.JTextField();
        lbTituloContratoEncerrarDataInicio = new javax.swing.JLabel();
        dtContratoEncerrarDataInicio = new com.toedter.calendar.JDateChooser();
        lbTituloContratoEncerrarDataFinal = new javax.swing.JLabel();
        dtContratoEncerrarDataFinal = new com.toedter.calendar.JDateChooser();
        lbTituloContratoEncerrarDataEntrega = new javax.swing.JLabel();
        dtContratoEncerrarDataEntrega = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbContratoEncerrarEquipamentos = new javax.swing.JTable();
        cbContratoEncerrarTipo = new javax.swing.JComboBox<>();
        lbTituloContratoTipoEncerramento = new javax.swing.JLabel();
        lbTituloContratoEncerraValor = new javax.swing.JLabel();
        ffContratoEncerraValor = new javax.swing.JFormattedTextField();
        lbTituloContratoJuros = new javax.swing.JLabel();
        ffContratoEncerrarJuros = new javax.swing.JFormattedTextField();
        lbTituloContratoMulta = new javax.swing.JLabel();
        ffContratoEncerraMulta = new javax.swing.JFormattedTextField();
        lbTituloContratoValorTotal = new javax.swing.JLabel();
        ffContratoEncerraValorTotal = new javax.swing.JFormattedTextField();
        lbTituloContratoEncerrar = new javax.swing.JLabel();
        btSairEncerrarContrato = new RoundedButton("");
        btLimparEncerrarContrato = new RoundedButton("");
        btNovoContrato = new RoundedButton("");
        btRegistrarEncerrarContrato = new RoundedButton("");
        pnTelaEquipamento = new javax.swing.JPanel();
        pnEquipamento = new javax.swing.JPanel();
        lbEquipamentoNum = new javax.swing.JLabel();
        lbTituloEquipamentoNomeEquipamento = new javax.swing.JLabel();
        tfEquipamentoNomeEquipamento = new javax.swing.JTextField();
        btBuscarEquipamento = new javax.swing.JButton();
        lbTituloEquipamentoQtd = new javax.swing.JLabel();
        jsEquipamentoQtdEstoque = new javax.swing.JSpinner();
        lbTituloEquipamentoValorDiario = new javax.swing.JLabel();
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        ffEquipamentoValorDiario = new javax.swing.JFormattedTextField(nf);
        lbTituloEquipamentoValorMensal = new javax.swing.JLabel();
        NumberFormat nfM = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        ffEquipamentoValorMensal = new javax.swing.JFormattedTextField(nfM);
        lbTituloEquipamentoQtd1 = new javax.swing.JLabel();
        jsEquipamentoQtdDisponivel = new javax.swing.JSpinner();
        lbTituloEquipamento = new javax.swing.JLabel();
        btLimparEquipamento = new RoundedButton("");
        btRegistrarEquipamento = new RoundedButton("");
        btCancelarEquipamento = new RoundedButton("");
        btAlterarEquipamento = new RoundedButton("");
        btDeletarEquipamento = new RoundedButton("");
        pnTelaCliente = new javax.swing.JPanel();
        pnCliente = new javax.swing.JPanel();
        lbTituloClienteNomeCliente = new javax.swing.JLabel();
        tfClienteNomeCliente = new javax.swing.JTextField();
        lbTituloClienteCpf = new javax.swing.JLabel();
        ffClienteCpf = new javax.swing.JFormattedTextField();
        lbTituloClienteTelefone = new javax.swing.JLabel();
        ffClienteTelefone = new javax.swing.JFormattedTextField();
        btClienteBuscarCliente = new javax.swing.JButton();
        jpPanelEnderecoCadCliente = new javax.swing.JPanel();
        tfClienteComplemento = new javax.swing.JTextField();
        lbTituloClienteComplemento = new javax.swing.JLabel();
        tfClienteLogradouro = new javax.swing.JTextField();
        lbTituloClienteLogradouro = new javax.swing.JLabel();
        lbTituloClienteCep = new javax.swing.JLabel();
        ffClienteCep = new javax.swing.JFormattedTextField();
        lbTituloClienteBairro = new javax.swing.JLabel();
        tfClienteBairro = new javax.swing.JTextField();
        lbTituloClienteCidade = new javax.swing.JLabel();
        tfClienteCidade = new javax.swing.JTextField();
        tfClienteNumero = new javax.swing.JTextField();
        lbTituloClienteNumero = new javax.swing.JLabel();
        ckbClienteSemNumero = new javax.swing.JCheckBox();
        lbTituloClienteUf = new javax.swing.JLabel();
        cbClienteUf = new javax.swing.JComboBox<>();
        lbClienteNum = new javax.swing.JLabel();
        lbTituloClientes = new javax.swing.JLabel();
        btClienteCancelar = new RoundedButton("");
        btClienteSair = new RoundedButton("");

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

        pnTelaLogin.setBackground(new java.awt.Color(153, 153, 153));
        pnTelaLogin.setPreferredSize(new java.awt.Dimension(1280, 720));

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

        pnLogin.setBackground(new java.awt.Color(217, 217, 217));

        lbTituloLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbTituloLogin.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloLogin.setText("Login");

        lbTituloUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloUsuario.setText("Usuário:");

        lbTituloSenha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloSenha.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloSenha.setText("Senha:");

        tfUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        pfSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btEntrar.setBackground(new java.awt.Color(240, 240, 240));
        btEntrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
        btRegistro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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

        javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
        pnLogin.setLayout(pnLoginLayout);
        pnLoginLayout.setHorizontalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLoginLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbTituloSenha)
                            .addComponent(lbTituloUsuario)
                            .addComponent(pfSenha)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLoginLayout.createSequentialGroup()
                                .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfUsuario)))
                    .addComponent(lbTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnLoginLayout.setVerticalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(lbTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lbTituloUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbTituloSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEntrar)
                    .addComponent(btRegistro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnTelaLoginLayout = new javax.swing.GroupLayout(pnTelaLogin);
        pnTelaLogin.setLayout(pnTelaLoginLayout);
        pnTelaLoginLayout.setHorizontalGroup(
            pnTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTelaLoginLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(pnLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(125, 125, 125))
        );
        pnTelaLoginLayout.setVerticalGroup(
            pnTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaLoginLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(pnTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70))
        );

        getContentPane().add(pnTelaLogin, "cdTelaLogin");

        pnTela.setPreferredSize(new java.awt.Dimension(1280, 720));
        pnTela.setLayout(new java.awt.BorderLayout());

        pnTop.setBackground(new java.awt.Color(0, 0, 0));
        pnTop.setPreferredSize(new java.awt.Dimension(1280, 60));

        lbTituloRentHub.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbTituloRentHub.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloRentHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptop(1).png"))); // NOI18N
        lbTituloRentHub.setText("RentHub");
        lbTituloRentHub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTituloRentHubMouseClicked(evt);
            }
        });

        lbUsuarioLogado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
                .addComponent(lbTituloRentHub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 828, Short.MAX_VALUE)
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
                    .addComponent(lbTituloRentHub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnTela.add(pnTop, java.awt.BorderLayout.PAGE_START);

        pnMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnMenu.setPreferredSize(new java.awt.Dimension(200, 620));

        btMenuContrato.setBackground(new java.awt.Color(240, 240, 240));
        btMenuContrato.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
        btMenuEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
        btMenuCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btMenuContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btMenuEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(btMenuCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(468, Short.MAX_VALUE))
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
            .addGap(0, 1120, Short.MAX_VALUE)
            .addGroup(pnTelaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnTelaHomeLayout.createSequentialGroup()
                    .addGap(284, 284, 284)
                    .addComponent(lbLogoHm)
                    .addContainerGap(324, Short.MAX_VALUE)))
        );
        pnTelaHomeLayout.setVerticalGroup(
            pnTelaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(pnTelaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnTelaHomeLayout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(lbLogoHm)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );

        pnCdTelas.add(pnTelaHome, "cdTelaHome");

        pnTelaCadastroCt.setBackground(new java.awt.Color(217, 217, 217));

        lbTituloContratoCadastro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTituloContratoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoCadastro.setText("CONTRATO");

        btEncerrarContrato.setBackground(new java.awt.Color(240, 240, 240));
        btEncerrarContrato.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btEncerrarContrato.setForeground(new java.awt.Color(0, 0, 0));
        btEncerrarContrato.setText("Encerrar");
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

        pnContratoCadastro.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloContratoCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoCliente.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoCliente.setText("Cliente:");

        tfContratoCadastroCliente.setBackground(new java.awt.Color(215, 215, 215));
        tfContratoCadastroCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTituloContratoCpf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoCpf.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoCpf.setText("CPF/CNPJ:");

        ffContratoCadastroCpf.setBackground(new java.awt.Color(215, 215, 215));
        ffContratoCadastroCpf.setToolTipText("");
        ffContratoCadastroCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ffContratoCadastroTelefone.setBackground(new java.awt.Color(215, 215, 215));
        ffContratoCadastroTelefone.setToolTipText("");
        ffContratoCadastroTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTituloContratoTelefone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoTelefone.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoTelefone.setText("Telefone:");

        lbTituloContratoEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoEquipamento.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoEquipamento.setText("Equipamento:");

        lbTituloContratoQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoQuantidade.setText("Quantidade:");

        jsQtdEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jsQtdEquipamento.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        btContratoCadastroAdicionarEquipamento.setBackground(new java.awt.Color(240, 240, 240));
        btContratoCadastroAdicionarEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        btContratoCadastroAdicionarEquipamento.setBorderPainted(false);
        btContratoCadastroAdicionarEquipamento.setFocusPainted(false);
        btContratoCadastroAdicionarEquipamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btContratoCadastroAdicionarEquipamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btContratoCadastroAdicionarEquipamentoMouseExited(evt);
            }
        });
        btContratoCadastroAdicionarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContratoCadastroAdicionarEquipamentoActionPerformed(evt);
            }
        });

        tbContratoCadastroEquipamento.setBackground(new java.awt.Color(215, 215, 215));
        tbContratoCadastroEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbContratoCadastroEquipamento.setForeground(new java.awt.Color(0, 0, 0));
        tbContratoCadastroEquipamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Descrição", "Qtd."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbContratoCadastroEquipamento);
        if (tbContratoCadastroEquipamento.getColumnModel().getColumnCount() > 0) {
            tbContratoCadastroEquipamento.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbContratoCadastroEquipamento.getColumnModel().getColumn(1).setPreferredWidth(300);
            tbContratoCadastroEquipamento.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        lbTituloContratoCadastroDataFinal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoCadastroDataFinal.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoCadastroDataFinal.setText("Data Fim:");

        dcContratoCadastroDataFinal.setBackground(new java.awt.Color(215, 215, 215));
        dcContratoCadastroDataFinal.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        lbTituloContratoCadastroDataInicio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoCadastroDataInicio.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoCadastroDataInicio.setText("Data Inicio");

        lbTituloContratoCadastroDataEntrega.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoCadastroDataEntrega.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoCadastroDataEntrega.setText("Data da Entrega:");
        lbTituloContratoCadastroDataEntrega.setVisible(false);

        dcContratoCadastroDataInicio.setBackground(new java.awt.Color(215, 215, 215));
        dcContratoCadastroDataInicio.setEnabled(false);
        dcContratoCadastroDataInicio.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        dcContratoCadastroDataEntrega.setBackground(new java.awt.Color(215, 215, 215));
        dcContratoCadastroDataEntrega.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        dcContratoCadastroDataEntrega.setVisible(false);

        btContratoCadastroTotalizacao.setBackground(new java.awt.Color(240, 240, 240));
        btContratoCadastroTotalizacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btContratoCadastroTotalizacao.setForeground(new java.awt.Color(0, 0, 0));
        btContratoCadastroTotalizacao.setText("Totalização");
        btContratoCadastroTotalizacao.setVisible(false);
        btContratoCadastroTotalizacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btContratoCadastroTotalizacaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btContratoCadastroTotalizacaoMouseExited(evt);
            }
        });
        btContratoCadastroTotalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContratoCadastroTotalizacaoActionPerformed(evt);
            }
        });

        tfContratoCadastroEquipamento.setBackground(new java.awt.Color(215, 215, 215));
        tfContratoCadastroEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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

        btContratoBuscarCliente.setBackground(new java.awt.Color(240, 240, 240));
        btContratoBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loupe.png"))); // NOI18N
        btContratoBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btContratoBuscarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btContratoBuscarClienteMouseExited(evt);
            }
        });
        btContratoBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContratoBuscarClienteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 16), new java.awt.Color(0, 0, 0))); // NOI18N

        cbContratoCadastroUf.setBackground(new java.awt.Color(215, 215, 215));
        cbContratoCadastroUf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbContratoCadastroUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbContratoCadastroUf.setFocusable(false);
        cbContratoCadastroUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbContratoCadastroUfActionPerformed(evt);
            }
        });

        tfContratoCadastroCidade.setBackground(new java.awt.Color(215, 215, 215));
        tfContratoCadastroCidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTituloContratoUf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoUf.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoUf.setText("UF:");

        lbTituloContratoCidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoCidade.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoCidade.setText("Cidade:");

        tfContratoCadastroBairro.setBackground(new java.awt.Color(215, 215, 215));
        tfContratoCadastroBairro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfContratoCadastroComplemento.setBackground(new java.awt.Color(215, 215, 215));
        tfContratoCadastroComplemento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTituloContratoComplemento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoComplemento.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoComplemento.setText("Complemento:");

        lbTituloContratoBairro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoBairro.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoBairro.setText("Bairro:");

        lbTituloContratoLogradouro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoLogradouro.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoLogradouro.setText("Logradouro:");

        tfContratoCadastroLogradouro.setBackground(new java.awt.Color(215, 215, 215));
        tfContratoCadastroLogradouro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ckbContratoCadastroSemNumero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ckbContratoCadastroSemNumero.setForeground(new java.awt.Color(0, 0, 0));
        ckbContratoCadastroSemNumero.setText("Sem Número");
        ckbContratoCadastroSemNumero.setFocusPainted(false);
        ckbContratoCadastroSemNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbContratoCadastroSemNumeroActionPerformed(evt);
            }
        });

        tfContratoCadastroNumero.setBackground(new java.awt.Color(215, 215, 215));
        tfContratoCadastroNumero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTituloContratoNumero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoNumero.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoNumero.setText("Número:");

        ffContratoCadastroCep.setBackground(new java.awt.Color(215, 215, 215));
        try {
            ffContratoCadastroCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ffContratoCadastroCep.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ffContratoCadastroCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ffContratoCadastroCepFocusLost(evt);
            }
        });

        lbTituloContratoCep.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoCep.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoCep.setText("CEP:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTituloContratoLogradouro)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbTituloContratoCep)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(ffContratoCadastroCep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfContratoCadastroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbContratoCadastroSemNumero))
                            .addComponent(lbTituloContratoNumero)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfContratoCadastroLogradouro)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfContratoCadastroCidade)
                                    .addComponent(tfContratoCadastroBairro)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbTituloContratoBairro)
                                            .addComponent(lbTituloContratoCidade))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloContratoUf)
                                    .addComponent(lbTituloContratoComplemento)
                                    .addComponent(tfContratoCadastroComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbContratoCadastroUf, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTituloContratoCep)
                    .addComponent(lbTituloContratoNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ffContratoCadastroCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfContratoCadastroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbContratoCadastroSemNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTituloContratoLogradouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfContratoCadastroLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTituloContratoBairro)
                    .addComponent(lbTituloContratoComplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfContratoCadastroBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfContratoCadastroComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTituloContratoUf)
                    .addComponent(lbTituloContratoCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfContratoCadastroCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbContratoCadastroUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        lbContratoNum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbContratoNum.setForeground(new java.awt.Color(0, 0, 0));
        lbContratoNum.setText("Nº: ");

        javax.swing.GroupLayout pnContratoCadastroLayout = new javax.swing.GroupLayout(pnContratoCadastro);
        pnContratoCadastro.setLayout(pnContratoCadastroLayout);
        pnContratoCadastroLayout.setHorizontalGroup(
            pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                        .addComponent(lbContratoNum)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContratoCadastroLayout.createSequentialGroup()
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloContratoCpf)
                                    .addComponent(lbTituloContratoCliente)
                                    .addComponent(ffContratoCadastroCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                        .addComponent(lbTituloContratoTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(ffContratoCadastroTelefone)))
                            .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                .addComponent(tfContratoCadastroCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btContratoBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(89, 89, 89)
                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloContratoEquipamento)
                                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                        .addComponent(tfContratoCadastroEquipamento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btContratoBuscarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbTituloContratoQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jsQtdEquipamento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btContratoCadastroAdicionarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dcContratoCadastroDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTituloContratoCadastroDataInicio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbTituloContratoCadastroDataFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dcContratoCadastroDataFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btContratoCadastroTotalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dcContratoCadastroDataEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(lbTituloContratoCadastroDataEntrega)))))
                        .addGap(30, 30, 30))))
        );
        pnContratoCadastroLayout.setVerticalGroup(
            pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContratoCadastroLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbContratoNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContratoCadastroLayout.createSequentialGroup()
                                        .addComponent(lbTituloContratoEquipamento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfContratoCadastroEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContratoCadastroLayout.createSequentialGroup()
                                        .addComponent(lbTituloContratoQuantidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btContratoCadastroAdicionarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jsQtdEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btContratoBuscarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                        .addComponent(lbTituloContratoCadastroDataInicio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dcContratoCadastroDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                        .addComponent(lbTituloContratoCadastroDataFinal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dcContratoCadastroDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                .addComponent(lbTituloContratoCadastroDataEntrega)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dcContratoCadastroDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addComponent(btContratoCadastroTotalizacao)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                        .addComponent(lbTituloContratoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfContratoCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btContratoBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTituloContratoCpf)
                            .addComponent(lbTituloContratoTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ffContratoCadastroCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ffContratoCadastroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE))))
        );

        btContratoRegistrar.setBackground(new java.awt.Color(240, 240, 240));
        btContratoRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
        btContratoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContratoRegistrarActionPerformed(evt);
            }
        });

        btContratoCancelar.setBackground(new java.awt.Color(240, 240, 240));
        btContratoCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btContratoCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btContratoCancelar.setText("Sair");
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
        btContratoLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
        btBuscarContrato.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btBuscarContrato.setForeground(new java.awt.Color(0, 0, 0));
        btBuscarContrato.setText("Buscar");
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
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnTelaCadastroCtLayout.createSequentialGroup()
                        .addComponent(btContratoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btContratoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btContratoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(667, 667, 667))
                    .addGroup(pnTelaCadastroCtLayout.createSequentialGroup()
                        .addGroup(pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnContratoCadastro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnTelaCadastroCtLayout.createSequentialGroup()
                                .addComponent(lbTituloContratoCadastro)
                                .addGap(587, 587, 587)
                                .addComponent(btBuscarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))))
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
                        .addComponent(lbTituloContratoCadastro)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnContratoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btContratoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btContratoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btContratoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnCdTelas.add(pnTelaCadastroCt, "cdTelaCadastroContrato");

        pnTelaEncerrarCt.setBackground(new java.awt.Color(217, 217, 217));

        pnContratoEncerrar.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloContratoTipo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoTipo.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoTipo.setText("Tipo:");

        lbTituloContratoEncerramento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTituloContratoEncerramento.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoEncerramento.setText("ENCERRAMENTO");

        lbTituloContratoNumeroContrato.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoNumeroContrato.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoNumeroContrato.setText("Contrato:");

        tfContratoEncerrarNumeroContrato.setBackground(new java.awt.Color(215, 215, 215));
        tfContratoEncerrarNumeroContrato.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTituloContratoEncerrarCpf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoEncerrarCpf.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoEncerrarCpf.setText("CPF/CNPJ:");

        ffContratoEncerrarCpf.setBackground(new java.awt.Color(215, 215, 215));
        ffContratoEncerrarCpf.setToolTipText("");
        ffContratoEncerrarCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btContratoEncerrarBuscarContrato.setBackground(new java.awt.Color(240, 240, 240));
        btContratoEncerrarBuscarContrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loupe.png"))); // NOI18N
        btContratoEncerrarBuscarContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btContratoEncerrarBuscarContratoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btContratoEncerrarBuscarContratoMouseExited(evt);
            }
        });
        btContratoEncerrarBuscarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContratoEncerrarBuscarContratoActionPerformed(evt);
            }
        });

        lbTituloContratoNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoNomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoNomeCliente.setText("Cliente:");

        tfContratoEncerrarCliente.setBackground(new java.awt.Color(215, 215, 215));
        tfContratoEncerrarCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfContratoEncerrarTipo.setBackground(new java.awt.Color(215, 215, 215));
        tfContratoEncerrarTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTituloContratoEncerrarDataInicio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoEncerrarDataInicio.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoEncerrarDataInicio.setText("Data Início:");

        dtContratoEncerrarDataInicio.setBackground(new java.awt.Color(215, 215, 215));
        dtContratoEncerrarDataInicio.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        lbTituloContratoEncerrarDataFinal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoEncerrarDataFinal.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoEncerrarDataFinal.setText("Data Fim:");

        dtContratoEncerrarDataFinal.setBackground(new java.awt.Color(215, 215, 215));
        dtContratoEncerrarDataFinal.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        lbTituloContratoEncerrarDataEntrega.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoEncerrarDataEntrega.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoEncerrarDataEntrega.setText("Data de Entrega");

        dtContratoEncerrarDataEntrega.setBackground(new java.awt.Color(215, 215, 215));
        dtContratoEncerrarDataEntrega.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        tbContratoEncerrarEquipamentos.setBackground(new java.awt.Color(215, 215, 215));
        tbContratoEncerrarEquipamentos.setForeground(new java.awt.Color(0, 0, 0));
        tbContratoEncerrarEquipamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Equipamento", "Valor", "Qtd."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbContratoEncerrarEquipamentos);
        if (tbContratoEncerrarEquipamentos.getColumnModel().getColumnCount() > 0) {
            tbContratoEncerrarEquipamentos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbContratoEncerrarEquipamentos.getColumnModel().getColumn(1).setPreferredWidth(300);
            tbContratoEncerrarEquipamentos.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        cbContratoEncerrarTipo.setBackground(new java.awt.Color(215, 215, 215));
        cbContratoEncerrarTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbContratoEncerrarTipo.setForeground(new java.awt.Color(0, 0, 0));
        cbContratoEncerrarTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Finalizar", "Cancelar" }));

        lbTituloContratoTipoEncerramento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoTipoEncerramento.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoTipoEncerramento.setText("Fechamento:");

        lbTituloContratoEncerraValor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoEncerraValor.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoEncerraValor.setText("Valor:");

        ffContratoEncerraValor.setBackground(new java.awt.Color(215, 215, 215));
        ffContratoEncerraValor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lbTituloContratoJuros.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoJuros.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoJuros.setText("Juros:");

        ffContratoEncerrarJuros.setBackground(new java.awt.Color(215, 215, 215));
        ffContratoEncerrarJuros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lbTituloContratoMulta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoMulta.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoMulta.setText("Multa:");

        ffContratoEncerraMulta.setBackground(new java.awt.Color(215, 215, 215));
        ffContratoEncerraMulta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lbTituloContratoValorTotal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloContratoValorTotal.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoValorTotal.setText("Total:");

        ffContratoEncerraValorTotal.setBackground(new java.awt.Color(215, 215, 215));
        ffContratoEncerraValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout pnContratoEncerrarLayout = new javax.swing.GroupLayout(pnContratoEncerrar);
        pnContratoEncerrar.setLayout(pnContratoEncerrarLayout);
        pnContratoEncerrarLayout.setHorizontalGroup(
            pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTituloContratoEncerramento, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                            .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContratoEncerrarLayout.createSequentialGroup()
                                    .addComponent(lbTituloContratoNumeroContrato)
                                    .addGap(74, 74, 74))
                                .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                    .addComponent(tfContratoEncerrarNumeroContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btContratoEncerrarBuscarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTituloContratoTipo)
                                .addComponent(tfContratoEncerrarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbContratoEncerrarTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                    .addComponent(lbTituloContratoTipoEncerramento)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                            .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTituloContratoNomeCliente)
                                .addComponent(tfContratoEncerrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbTituloContratoEncerrarCpf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ffContratoEncerrarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 97, Short.MAX_VALUE)
                .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContratoEncerrarLayout.createSequentialGroup()
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloContratoEncerrarDataInicio)
                            .addComponent(dtContratoEncerrarDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                .addComponent(lbTituloContratoEncerrarDataFinal)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(dtContratoEncerrarDataFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                .addComponent(lbTituloContratoEncerrarDataEntrega)
                                .addGap(46, 46, 46))
                            .addComponent(dtContratoEncerrarDataEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContratoEncerrarLayout.createSequentialGroup()
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloContratoEncerraValor)
                            .addComponent(ffContratoEncerraValor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloContratoMulta)
                            .addComponent(ffContratoEncerraMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloContratoJuros)
                            .addComponent(ffContratoEncerrarJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloContratoValorTotal)
                            .addComponent(ffContratoEncerraValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        pnContratoEncerrarLayout.setVerticalGroup(
            pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbTituloContratoEncerramento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                            .addComponent(lbTituloContratoEncerrarDataEntrega)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dtContratoEncerrarDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                            .addComponent(lbTituloContratoEncerrarDataFinal)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dtContratoEncerrarDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                        .addComponent(lbTituloContratoEncerrarDataInicio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dtContratoEncerrarDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContratoEncerrarLayout.createSequentialGroup()
                                .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btContratoEncerrarBuscarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                        .addComponent(lbTituloContratoNumeroContrato)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfContratoEncerrarNumeroContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                        .addComponent(lbTituloContratoTipo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfContratoEncerrarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                        .addComponent(lbTituloContratoTipoEncerramento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbContratoEncerrarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16)))
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                .addComponent(lbTituloContratoNomeCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfContratoEncerrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                    .addComponent(lbTituloContratoEncerraValor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ffContratoEncerraValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                    .addComponent(lbTituloContratoMulta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ffContratoEncerraMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                    .addComponent(lbTituloContratoJuros)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ffContratoEncerrarJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                    .addComponent(lbTituloContratoValorTotal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ffContratoEncerraValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                        .addComponent(lbTituloContratoEncerrarCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ffContratoEncerrarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        lbTituloContratoEncerrar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTituloContratoEncerrar.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoEncerrar.setText("CONTRATO");

        btSairEncerrarContrato.setBackground(new java.awt.Color(240, 240, 240));
        btSairEncerrarContrato.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSairEncerrarContrato.setForeground(new java.awt.Color(0, 0, 0));
        btSairEncerrarContrato.setText("Sair");
        btSairEncerrarContrato.setPreferredSize(new java.awt.Dimension(86, 35));
        btSairEncerrarContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSairEncerrarContratoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSairEncerrarContratoMouseExited(evt);
            }
        });
        btSairEncerrarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairEncerrarContratoActionPerformed(evt);
            }
        });

        btLimparEncerrarContrato.setBackground(new java.awt.Color(240, 240, 240));
        btLimparEncerrarContrato.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
        btLimparEncerrarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparEncerrarContratoActionPerformed(evt);
            }
        });

        btNovoContrato.setBackground(new java.awt.Color(240, 240, 240));
        btNovoContrato.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btNovoContrato.setForeground(new java.awt.Color(0, 0, 0));
        btNovoContrato.setText("Novo");
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

        btRegistrarEncerrarContrato.setBackground(new java.awt.Color(240, 240, 240));
        btRegistrarEncerrarContrato.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btRegistrarEncerrarContrato.setForeground(new java.awt.Color(0, 0, 0));
        btRegistrarEncerrarContrato.setText("Encerrar");
        btRegistrarEncerrarContrato.setPreferredSize(new java.awt.Dimension(88, 35));
        btRegistrarEncerrarContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btRegistrarEncerrarContratoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btRegistrarEncerrarContratoMouseExited(evt);
            }
        });
        btRegistrarEncerrarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarEncerrarContratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTelaEncerrarCtLayout = new javax.swing.GroupLayout(pnTelaEncerrarCt);
        pnTelaEncerrarCt.setLayout(pnTelaEncerrarCtLayout);
        pnTelaEncerrarCtLayout.setHorizontalGroup(
            pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaEncerrarCtLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTelaEncerrarCtLayout.createSequentialGroup()
                        .addComponent(btRegistrarEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimparEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSairEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnTelaEncerrarCtLayout.createSequentialGroup()
                            .addComponent(lbTituloContratoEncerrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btNovoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pnContratoEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnTelaEncerrarCtLayout.setVerticalGroup(
            pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaEncerrarCtLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btNovoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTituloContratoEncerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnContratoEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSairEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimparEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRegistrarEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pnCdTelas.add(pnTelaEncerrarCt, "cdTelaEncerrarContrato");

        pnTelaEquipamento.setBackground(new java.awt.Color(217, 217, 217));

        pnEquipamento.setBackground(new java.awt.Color(255, 255, 255));

        lbEquipamentoNum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEquipamentoNum.setForeground(new java.awt.Color(0, 0, 0));
        lbEquipamentoNum.setText("Nº: ");

        lbTituloEquipamentoNomeEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloEquipamentoNomeEquipamento.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloEquipamentoNomeEquipamento.setText("Equipamento");

        tfEquipamentoNomeEquipamento.setBackground(new java.awt.Color(215, 215, 215));
        tfEquipamentoNomeEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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

        lbTituloEquipamentoQtd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloEquipamentoQtd.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloEquipamentoQtd.setText("Quantidade Total:");

        jsEquipamentoQtdEstoque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jsEquipamentoQtdEstoque.setModel(new javax.swing.SpinnerNumberModel());

        lbTituloEquipamentoValorDiario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloEquipamentoValorDiario.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloEquipamentoValorDiario.setText("Valor Diária:");

        ffEquipamentoValorDiario.setColumns(10);
        ffEquipamentoValorDiario.setValue(0.00);
        ffEquipamentoValorDiario.setBackground(new java.awt.Color(215, 215, 215));
        ffEquipamentoValorDiario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0.00"))));
        ffEquipamentoValorDiario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTituloEquipamentoValorMensal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloEquipamentoValorMensal.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloEquipamentoValorMensal.setText("Valor Mensalidade:");

        ffEquipamentoValorMensal.setColumns(10);
        ffEquipamentoValorMensal.setValue(0.00);
        ffEquipamentoValorMensal.setBackground(new java.awt.Color(215, 215, 215));
        ffEquipamentoValorMensal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0.00"))));
        ffEquipamentoValorMensal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTituloEquipamentoQtd1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloEquipamentoQtd1.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloEquipamentoQtd1.setText("Quantidade Disponível:");

        jsEquipamentoQtdDisponivel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jsEquipamentoQtdDisponivel.setModel(new javax.swing.SpinnerNumberModel());

        javax.swing.GroupLayout pnEquipamentoLayout = new javax.swing.GroupLayout(pnEquipamento);
        pnEquipamento.setLayout(pnEquipamentoLayout);
        pnEquipamentoLayout.setHorizontalGroup(
            pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEquipamentoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEquipamentoLayout.createSequentialGroup()
                        .addComponent(lbTituloEquipamentoNomeEquipamento)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnEquipamentoLayout.createSequentialGroup()
                        .addComponent(lbEquipamentoNum)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnEquipamentoLayout.createSequentialGroup()
                        .addGroup(pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfEquipamentoNomeEquipamento)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnEquipamentoLayout.createSequentialGroup()
                                .addGroup(pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloEquipamentoValorDiario)
                                    .addComponent(lbTituloEquipamentoQtd)
                                    .addComponent(jsEquipamentoQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloEquipamentoValorMensal)
                                    .addComponent(lbTituloEquipamentoQtd1)
                                    .addComponent(jsEquipamentoQtdDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnEquipamentoLayout.createSequentialGroup()
                                .addComponent(ffEquipamentoValorDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ffEquipamentoValorMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(593, 593, 593))))
        );
        pnEquipamentoLayout.setVerticalGroup(
            pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEquipamentoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbEquipamentoNum)
                .addGap(18, 18, 18)
                .addComponent(lbTituloEquipamentoNomeEquipamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEquipamentoNomeEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTituloEquipamentoQtd)
                    .addComponent(lbTituloEquipamentoQtd1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsEquipamentoQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsEquipamentoQtdDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTituloEquipamentoValorDiario)
                    .addComponent(lbTituloEquipamentoValorMensal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ffEquipamentoValorDiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ffEquipamentoValorMensal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        lbTituloEquipamento.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTituloEquipamento.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloEquipamento.setText("EQUIPAMENTO");

        btLimparEquipamento.setBackground(new java.awt.Color(240, 240, 240));
        btLimparEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
        btLimparEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparEquipamentoActionPerformed(evt);
            }
        });

        btRegistrarEquipamento.setBackground(new java.awt.Color(240, 240, 240));
        btRegistrarEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
        btRegistrarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarEquipamentoActionPerformed(evt);
            }
        });

        btCancelarEquipamento.setBackground(new java.awt.Color(240, 240, 240));
        btCancelarEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btCancelarEquipamento.setForeground(new java.awt.Color(0, 0, 0));
        btCancelarEquipamento.setText("Sair");
        btCancelarEquipamento.setPreferredSize(new java.awt.Dimension(86, 35));
        btCancelarEquipamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCancelarEquipamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCancelarEquipamentoMouseExited(evt);
            }
        });
        btCancelarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarEquipamentoActionPerformed(evt);
            }
        });

        btAlterarEquipamento.setBackground(new java.awt.Color(240, 240, 240));
        btAlterarEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
        btAlterarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarEquipamentoActionPerformed(evt);
            }
        });

        btDeletarEquipamento.setBackground(new java.awt.Color(240, 240, 240));
        btDeletarEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
        btDeletarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarEquipamentoActionPerformed(evt);
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
                        .addComponent(btRegistrarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btAlterarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btDeletarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimparEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnTelaEquipamentoLayout.createSequentialGroup()
                        .addComponent(lbTituloEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTelaEquipamentoLayout.createSequentialGroup()
                        .addComponent(pnEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(47, 47, 47))))
        );
        pnTelaEquipamentoLayout.setVerticalGroup(
            pnTelaEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaEquipamentoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbTituloEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(pnTelaEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRegistrarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimparEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeletarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pnCdTelas.add(pnTelaEquipamento, "cdTelaEquipamento");

        pnTelaCliente.setBackground(new java.awt.Color(215, 215, 215));

        pnCliente.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloClienteNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloClienteNomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteNomeCliente.setText("Nome:");

        tfClienteNomeCliente.setEditable(false);
        tfClienteNomeCliente.setBackground(new java.awt.Color(215, 215, 215));
        tfClienteNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTituloClienteCpf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloClienteCpf.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteCpf.setText("CPF/CNPJ:");

        ffClienteCpf.setEditable(false);
        ffClienteCpf.setBackground(new java.awt.Color(215, 215, 215));
        ffClienteCpf.setToolTipText("");
        ffClienteCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTituloClienteTelefone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloClienteTelefone.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteTelefone.setText("Telefone:");

        ffClienteTelefone.setEditable(false);
        ffClienteTelefone.setBackground(new java.awt.Color(215, 215, 215));
        ffClienteTelefone.setToolTipText("");
        ffClienteTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btClienteBuscarCliente.setBackground(new java.awt.Color(240, 240, 240));
        btClienteBuscarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btClienteBuscarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btClienteBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loupe.png"))); // NOI18N
        btClienteBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteBuscarClienteActionPerformed(evt);
            }
        });

        jpPanelEnderecoCadCliente.setBackground(new java.awt.Color(255, 255, 255));
        jpPanelEnderecoCadCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 16), new java.awt.Color(0, 0, 0))); // NOI18N

        tfClienteComplemento.setEditable(false);
        tfClienteComplemento.setBackground(new java.awt.Color(215, 215, 215));
        tfClienteComplemento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTituloClienteComplemento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloClienteComplemento.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteComplemento.setText("Complemento:");

        tfClienteLogradouro.setEditable(false);
        tfClienteLogradouro.setBackground(new java.awt.Color(215, 215, 215));
        tfClienteLogradouro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTituloClienteLogradouro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloClienteLogradouro.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteLogradouro.setText("Logradouro:");

        lbTituloClienteCep.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloClienteCep.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteCep.setText("CEP:");

        ffClienteCep.setEditable(false);
        ffClienteCep.setBackground(new java.awt.Color(215, 215, 215));
        ffClienteCep.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTituloClienteBairro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloClienteBairro.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteBairro.setText("Bairro:");

        tfClienteBairro.setEditable(false);
        tfClienteBairro.setBackground(new java.awt.Color(215, 215, 215));
        tfClienteBairro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTituloClienteCidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloClienteCidade.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteCidade.setText("Cidade:");

        tfClienteCidade.setEditable(false);
        tfClienteCidade.setBackground(new java.awt.Color(215, 215, 215));
        tfClienteCidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfClienteNumero.setEditable(false);
        tfClienteNumero.setBackground(new java.awt.Color(215, 215, 215));
        tfClienteNumero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbTituloClienteNumero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloClienteNumero.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteNumero.setText("Número:");

        ckbClienteSemNumero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ckbClienteSemNumero.setForeground(new java.awt.Color(0, 0, 0));
        ckbClienteSemNumero.setText("Sem Número");
        ckbClienteSemNumero.setEnabled(false);
        ckbClienteSemNumero.setFocusPainted(false);

        lbTituloClienteUf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTituloClienteUf.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteUf.setText("UF:");

        cbClienteUf.setBackground(new java.awt.Color(215, 215, 215));
        cbClienteUf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbClienteUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbClienteUf.setEnabled(false);
        cbClienteUf.setFocusable(false);

        javax.swing.GroupLayout jpPanelEnderecoCadClienteLayout = new javax.swing.GroupLayout(jpPanelEnderecoCadCliente);
        jpPanelEnderecoCadCliente.setLayout(jpPanelEnderecoCadClienteLayout);
        jpPanelEnderecoCadClienteLayout.setHorizontalGroup(
            jpPanelEnderecoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelEnderecoCadClienteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpPanelEnderecoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTituloClienteBairro)
                    .addComponent(tfClienteBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(lbTituloClienteCep)
                    .addComponent(ffClienteCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPanelEnderecoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpPanelEnderecoCadClienteLayout.createSequentialGroup()
                        .addGroup(jpPanelEnderecoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloClienteComplemento)
                            .addComponent(tfClienteComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpPanelEnderecoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloClienteCidade)
                            .addComponent(tfClienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbTituloClienteLogradouro)
                    .addComponent(tfClienteLogradouro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPanelEnderecoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPanelEnderecoCadClienteLayout.createSequentialGroup()
                        .addComponent(lbTituloClienteUf)
                        .addGap(0, 186, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPanelEnderecoCadClienteLayout.createSequentialGroup()
                        .addGroup(jpPanelEnderecoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbClienteUf, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPanelEnderecoCadClienteLayout.createSequentialGroup()
                                .addComponent(lbTituloClienteNumero)
                                .addGap(0, 25, Short.MAX_VALUE))
                            .addComponent(tfClienteNumero, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbClienteSemNumero)))
                .addContainerGap())
        );
        jpPanelEnderecoCadClienteLayout.setVerticalGroup(
            jpPanelEnderecoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelEnderecoCadClienteLayout.createSequentialGroup()
                .addGroup(jpPanelEnderecoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPanelEnderecoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpPanelEnderecoCadClienteLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jpPanelEnderecoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTituloClienteCep)
                                .addComponent(lbTituloClienteLogradouro)
                                .addGroup(jpPanelEnderecoCadClienteLayout.createSequentialGroup()
                                    .addComponent(lbTituloClienteNumero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jpPanelEnderecoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfClienteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ckbClienteSemNumero)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPanelEnderecoCadClienteLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(ffClienteCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tfClienteLogradouro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpPanelEnderecoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPanelEnderecoCadClienteLayout.createSequentialGroup()
                        .addComponent(lbTituloClienteComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfClienteComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPanelEnderecoCadClienteLayout.createSequentialGroup()
                        .addComponent(lbTituloClienteBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfClienteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPanelEnderecoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpPanelEnderecoCadClienteLayout.createSequentialGroup()
                            .addComponent(lbTituloClienteCidade)
                            .addGap(37, 37, 37))
                        .addComponent(tfClienteCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPanelEnderecoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPanelEnderecoCadClienteLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(cbClienteUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpPanelEnderecoCadClienteLayout.createSequentialGroup()
                            .addComponent(lbTituloClienteUf)
                            .addGap(37, 37, 37))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        lbClienteNum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbClienteNum.setForeground(new java.awt.Color(0, 0, 0));
        lbClienteNum.setText("Nº: ");

        javax.swing.GroupLayout pnClienteLayout = new javax.swing.GroupLayout(pnCliente);
        pnCliente.setLayout(pnClienteLayout);
        pnClienteLayout.setHorizontalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addComponent(lbClienteNum)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnClienteLayout.createSequentialGroup()
                                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnClienteLayout.createSequentialGroup()
                                        .addComponent(tfClienteNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btClienteBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbTituloClienteNomeCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloClienteCpf)
                                    .addComponent(ffClienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloClienteTelefone)
                                    .addComponent(ffClienteTelefone)))
                            .addComponent(jpPanelEnderecoCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35))))
        );
        pnClienteLayout.setVerticalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClienteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbClienteNum)
                .addGap(18, 18, 18)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addComponent(lbTituloClienteNomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfClienteNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addComponent(lbTituloClienteTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ffClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addComponent(lbTituloClienteCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ffClienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btClienteBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jpPanelEnderecoCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        lbTituloClientes.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTituloClientes.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClientes.setText("CLIENTE");

        btClienteCancelar.setBackground(new java.awt.Color(240, 240, 240));
        btClienteCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btClienteCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btClienteCancelar.setText("Limpar");
        btClienteCancelar.setPreferredSize(new java.awt.Dimension(87, 35));
        btClienteCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btClienteCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btClienteCancelarMouseExited(evt);
            }
        });
        btClienteCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteCancelarActionPerformed(evt);
            }
        });

        btClienteSair.setBackground(new java.awt.Color(240, 240, 240));
        btClienteSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btClienteSair.setForeground(new java.awt.Color(0, 0, 0));
        btClienteSair.setText("Sair");
        btClienteSair.setPreferredSize(new java.awt.Dimension(87, 35));
        btClienteSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btClienteSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btClienteSairMouseExited(evt);
            }
        });
        btClienteSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTelaClienteLayout = new javax.swing.GroupLayout(pnTelaCliente);
        pnTelaCliente.setLayout(pnTelaClienteLayout);
        pnTelaClienteLayout.setHorizontalGroup(
            pnTelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaClienteLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnTelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTelaClienteLayout.createSequentialGroup()
                        .addComponent(btClienteCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btClienteSair, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbTituloClientes))
                .addContainerGap(855, Short.MAX_VALUE))
            .addGroup(pnTelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnTelaClienteLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(pnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(102, Short.MAX_VALUE)))
        );
        pnTelaClienteLayout.setVerticalGroup(
            pnTelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaClienteLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbTituloClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 546, Short.MAX_VALUE)
                .addGroup(pnTelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClienteCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClienteSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(pnTelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnTelaClienteLayout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(pnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(66, Short.MAX_VALUE)))
        );

        pnCdTelas.add(pnTelaCliente, "cdTelaCliente");

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
                    LocalDate dataAgora = LocalDate.now();
                    Date date = Date.from(dataAgora.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    dcContratoCadastroDataInicio.setDate(date);
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

    private void lbTituloRentHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTituloRentHubMouseClicked
        cdlPn.show(pnCdTelas, "cdTelaHome");
        resetaEstadoComponentesCadastroContrato();
        limpaTelaContratoCadastro();
        limparTelaEncerramento();
    }//GEN-LAST:event_lbTituloRentHubMouseClicked

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
        LocalDate dataAgora = LocalDate.now();
        Date date = Date.from(dataAgora.atStartOfDay(ZoneId.systemDefault()).toInstant());
        dcContratoCadastroDataInicio.setDate(date);
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

    private void btMenuContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMenuContratoMouseExited
        estilo.aplicaHoverExited(btMenuContrato);
    }//GEN-LAST:event_btMenuContratoMouseExited

    private void btMenuEquipamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMenuEquipamentoMouseExited
        estilo.aplicaHoverExited(btMenuEquipamento);
    }//GEN-LAST:event_btMenuEquipamentoMouseExited

    private void btMenuClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMenuClienteMouseExited
        estilo.aplicaHoverExited(btMenuCliente);
    }//GEN-LAST:event_btMenuClienteMouseExited

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
        limpaTelaContratoCadastro();
        limparTelaEncerramento();
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
            limpaTelaContratoCadastro();
            limparTelaEncerramento();
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
        limpaTelaContratoCadastro();
        limparTelaEncerramento();
    }//GEN-LAST:event_btMenuEquipamentoActionPerformed

    private void btBuscarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarContratoActionPerformed
        buscarContrato.identificarTela(1);
        buscarContrato.setLocationRelativeTo(this);
        buscarContrato.setVisible(true);
        if(lbContratoNum.isVisible()){
            lbTituloContratoCadastroDataEntrega.setVisible(true);
            dcContratoCadastroDataEntrega.setVisible(true);
            btContratoCadastroTotalizacao.setVisible(true);
        }
        
    }//GEN-LAST:event_btBuscarContratoActionPerformed

    private void btContratoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContratoLimparActionPerformed
        resetaEstadoComponentesCadastroContrato();
        limpaTelaContratoCadastro();
        validaCliente = true;
    }//GEN-LAST:event_btContratoLimparActionPerformed

    private void btContratoCadastroAdicionarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContratoCadastroAdicionarEquipamentoActionPerformed
        DefaultTableModel modeloTabelaEquipamento = (DefaultTableModel) tbContratoCadastroEquipamento.getModel();
        Equipamento equipamento = buscarEquipamento.getEquipamento();
        Object[] linha = {equipamento.getId(), equipamento.getDescricao(), jsQtdEquipamento.getValue()};
        Integer qtd = (Integer)jsQtdEquipamento.getValue();
        equipamento.setQtdContrato(qtd);

        if ((int)jsQtdEquipamento.getValue() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Informe a quantidade do equipamento!", "Inclusão de Equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!equipamentoController.buscarInclusaoTabela(modeloTabelaEquipamento, equipamento)) {
            JOptionPane.showMessageDialog(rootPane, "Equipamento já incluído no contrato!", "Inclusão de Equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (equipamentoController.verificarSaldo((int)linha[0], (int)linha[2])) {
            equipamentosContrato.add(equipamento);
            modeloTabelaEquipamento.addRow(linha);
            tfContratoCadastroEquipamento.setText("");
            jsQtdEquipamento.setValue(0);
        } else {
            int saldoTotal = equipamento.getQtdDisponivel()-(int)jsQtdEquipamento.getValue();
            JOptionPane.showMessageDialog(rootPane, linha[1]+" não possui saldo suficiente no Estoque!\nEm estoque: "+ equipamento.getQtdDisponivel() +
                                                                                                     "\nSolicitado: "+ linha[2] +
                                                                                                     "\nTotal: "+ saldoTotal, "Inclusão de Equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btContratoCadastroAdicionarEquipamentoActionPerformed

    private void btBuscarContratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarContratoMouseEntered
        estilo.aplicaHoverEntered(btBuscarContrato);
    }//GEN-LAST:event_btBuscarContratoMouseEntered

    private void btBuscarContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarContratoMouseExited
        estilo.aplicaHoverExited(btBuscarContrato);
    }//GEN-LAST:event_btBuscarContratoMouseExited

    private void btContratoCadastroAdicionarEquipamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoCadastroAdicionarEquipamentoMouseEntered
        estilo.aplicaHoverEntered(btContratoCadastroAdicionarEquipamento);
    }//GEN-LAST:event_btContratoCadastroAdicionarEquipamentoMouseEntered

    private void btContratoCadastroAdicionarEquipamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoCadastroAdicionarEquipamentoMouseExited
        estilo.aplicaHoverExited(btContratoCadastroAdicionarEquipamento);
    }//GEN-LAST:event_btContratoCadastroAdicionarEquipamentoMouseExited

    private void btContratoEncerrarBuscarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContratoEncerrarBuscarContratoActionPerformed
        buscarContrato.identificarTela(2);
        buscarContrato.setLocationRelativeTo(this);
        buscarContrato.setVisible(true);
    }//GEN-LAST:event_btContratoEncerrarBuscarContratoActionPerformed

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

    private void btSairEncerrarContratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairEncerrarContratoMouseEntered
        estilo.aplicaHoverEntered(btSairEncerrarContrato);
    }//GEN-LAST:event_btSairEncerrarContratoMouseEntered

    private void btSairEncerrarContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairEncerrarContratoMouseExited
        estilo.aplicaHoverExited(btSairEncerrarContrato);
    }//GEN-LAST:event_btSairEncerrarContratoMouseExited

    private void btContratoEncerrarBuscarContratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoEncerrarBuscarContratoMouseEntered
        estilo.aplicaHoverEntered(btContratoEncerrarBuscarContrato);
    }//GEN-LAST:event_btContratoEncerrarBuscarContratoMouseEntered

    private void btContratoEncerrarBuscarContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoEncerrarBuscarContratoMouseExited
        estilo.aplicaHoverExited(btContratoEncerrarBuscarContrato);
    }//GEN-LAST:event_btContratoEncerrarBuscarContratoMouseExited

    private void btEncerrarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncerrarContratoActionPerformed
        cdlPn.show(pnCdTelas, "cdTelaEncerrarContrato");
        limpaTelaContratoCadastro();
    }//GEN-LAST:event_btEncerrarContratoActionPerformed

    private void btNovoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoContratoActionPerformed
        cdlPn.show(pnCdTelas, "cdTelaCadastroContrato");
    }//GEN-LAST:event_btNovoContratoActionPerformed

    private void btContratoCadastroTotalizacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoCadastroTotalizacaoMouseEntered
        estilo.aplicaHoverEntered(btContratoCadastroTotalizacao);
    }//GEN-LAST:event_btContratoCadastroTotalizacaoMouseEntered

    private void btContratoCadastroTotalizacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoCadastroTotalizacaoMouseExited
        estilo.aplicaHoverExited(btContratoCadastroTotalizacao);
    }//GEN-LAST:event_btContratoCadastroTotalizacaoMouseExited

    private void btContratoCadastroTotalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContratoCadastroTotalizacaoActionPerformed
        verTotalizazao.setLocationRelativeTo(this);
        verTotalizazao.preencheCampos(totalizacao);
        verTotalizazao.setVisible(true);
    }//GEN-LAST:event_btContratoCadastroTotalizacaoActionPerformed

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
        buscarEquipamento.indentificaTela(2);
        buscarEquipamento.setLocationRelativeTo(this);
        buscarEquipamento.setVisible(true);
    }//GEN-LAST:event_btBuscarEquipamentoActionPerformed

    private void btContratoBuscarEquipamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoBuscarEquipamentoMouseEntered
        estilo.aplicaHoverEntered(btContratoBuscarEquipamento);
    }//GEN-LAST:event_btContratoBuscarEquipamentoMouseEntered

    private void btContratoBuscarEquipamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoBuscarEquipamentoMouseExited
        estilo.aplicaHoverExited(btContratoBuscarEquipamento);
    }//GEN-LAST:event_btContratoBuscarEquipamentoMouseExited

    private void btContratoBuscarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContratoBuscarEquipamentoActionPerformed
        buscarEquipamento.indentificaTela(1);
        buscarEquipamento.setLocationRelativeTo(this);
        buscarEquipamento.setVisible(true);
    }//GEN-LAST:event_btContratoBuscarEquipamentoActionPerformed

    private void btClienteCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteCancelarMouseEntered
        estilo.aplicaHoverEntered(btClienteCancelar);
    }//GEN-LAST:event_btClienteCancelarMouseEntered

    private void btClienteCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteCancelarMouseExited
        estilo.aplicaHoverExited(btClienteCancelar);
    }//GEN-LAST:event_btClienteCancelarMouseExited

    private void btClienteBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteBuscarClienteActionPerformed
        buscarCliente.identificarTela(3);
        buscarCliente.setLocationRelativeTo(this);
        buscarCliente.setVisible(true);
    }//GEN-LAST:event_btClienteBuscarClienteActionPerformed

    private void btMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuClienteActionPerformed
        cdlPn.show(pnCdTelas, "cdTelaCliente");
        limpaTelaContratoCadastro();
        limparTelaEncerramento();
    }//GEN-LAST:event_btMenuClienteActionPerformed

    private void btContratoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContratoRegistrarActionPerformed
        String nomeCliente = tfContratoCadastroCliente.getText();
        String identificacao = ffContratoCadastroCpf.getText();
        String telefone = ffContratoCadastroTelefone.getText();
        String cep = ffContratoCadastroCep.getText().replace("-", "");
        Endereco endereco = ConsultaCep.buscarCep(cep);
        if (endereco.getLogradouro().equals("")) {
            endereco.setLogradouro(tfContratoCadastroLogradouro.getText());
        }
        if (endereco.getBairro().equals("")) {
            endereco.setBairro(tfContratoCadastroBairro.getText());
        }
        if(!ckbContratoCadastroSemNumero.isSelected()){
            String numero = tfContratoCadastroNumero.getText();
            endereco.setNumero(Integer.parseInt(numero));
        }
        if(!tfContratoCadastroComplemento.getText().isEmpty()||!tfContratoCadastroComplemento.getText().equals("")){
            endereco.setComplemento(tfContratoCadastroComplemento.getText());
        }
        Date dateInicio = dcContratoCadastroDataInicio.getDate();
        Date dateFim = dcContratoCadastroDataFinal.getDate();
        LocalDate dataInicio = dateInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate dataFim = dateFim.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        Cliente cliente = new Cliente(nomeCliente, identificacao, telefone, endereco);
        
        Cliente clienteSelecionado = buscarCliente.selecionarCliente();
        if (validaCliente) {
            cliente.setId(clienteController.cadastrar(cliente));
        } else {
            cliente.setId(clienteSelecionado.getId());
            clienteSelecionado = null;
        }
        if(contratoController.cadastrar(new Contrato(cliente, equipamentosContrato, dataInicio, dataFim))){
            JOptionPane.showMessageDialog(rootPane, "Contrato cadastrado com Sucesso!", "Cadastro de Contrato", JOptionPane.INFORMATION_MESSAGE);
            equipamentosContrato.removeAll(equipamentosContrato);
            limpaTelaContratoCadastro();
        }
    }//GEN-LAST:event_btContratoRegistrarActionPerformed

    private void ffContratoCadastroCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ffContratoCadastroCepFocusLost
        String cep = ffContratoCadastroCep.getText().replaceAll("[-]", "");
        if (cep.equals("") || cep.trim().length() < 8) {
            JOptionPane.showMessageDialog(rootPane, "Preencha o CEP por completo!", "Cadastro de Endereço", JOptionPane.WARNING_MESSAGE);
            ffContratoCadastroCep.requestFocus();
        } else {
            Endereco endereco = ConsultaCep.buscarCep(cep);
            if (endereco != null) {
                tfContratoCadastroBairro.setText(endereco.getBairro());
                tfContratoCadastroCidade.setText(endereco.getCidade().getNome());
                tfContratoCadastroLogradouro.setText(endereco.getLogradouro());
                cbContratoCadastroUf.setSelectedItem(endereco.getCidade().getUf()); 
            }
        }
    }//GEN-LAST:event_ffContratoCadastroCepFocusLost

    public void validarCamposObrigatoriosCadastroContrato() {
        //CHAMAR ESSE METODO NO BOTAO DE REGISTRAR CONTRATO
        //Luiz: Jhonnie, implementa pra nos aquela mesma validação utilizada no cadastro de usuario, para mudar a cor dos campos obrigatorios para vermelho, assim evitar ficar aparecendo dialog na tela de aviso
        //Luiz: Jhonnie, acredito que os campos que deva validar sejam: Nome do Cliente, CPF, Telefone, CEP, Numero, Logradouro, Bairro, Tabela de Equipamento, Data Final
        //Luiz: Jhonnie, para validar o Numero, considere o preenchimento do checkbox 'Sem Número' (se marcado o checkbox e campo vazio, permitir cadastrar)
        //Luiz: Jhonnie, na Data Final, valide também se foi informada uma data anterior a Data Inicio
    }

    private void btRegistrarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarEquipamentoActionPerformed
        Equipamento equipamento = new Equipamento();

        if (tfEquipamentoNomeEquipamento.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Informe o nome do Equipamento!", "Cadastro de Equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            equipamento.setDescricao(tfEquipamentoNomeEquipamento.getText());
        }
        if ((Integer)jsEquipamentoQtdEstoque.getValue() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Informe a quantidade do Equipamento!", "Cadastro de Equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            equipamento.setQtdTotal((Integer)jsEquipamentoQtdEstoque.getValue());
        }

        if (ffEquipamentoValorDiario.getValue() == null || ffEquipamentoValorDiario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Informe o valor diário do Equipamento!", "Cadastro de Equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            equipamento.setVlrDiaria(((Number) ffEquipamentoValorDiario.getValue()).doubleValue());
        }
        if (ffEquipamentoValorMensal.getValue() == null || ffEquipamentoValorMensal.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Informe o valor mensal do Equipamento!", "Cadastro de Equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            equipamento.setVlrMensal(((Number) ffEquipamentoValorMensal.getValue()).doubleValue());
        }
        if(equipamentoController.cadastrar(equipamento)){
            JOptionPane.showMessageDialog(rootPane, "Equipamento Cadastrado!", "Cadastro de Equipamento", JOptionPane.INFORMATION_MESSAGE);
            limpaTelaEquipamento();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar o Equipamento!", "Cadastro de Equipamento", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btRegistrarEquipamentoActionPerformed

    private void limparTelaEncerramento(){
        tfContratoEncerrarNumeroContrato.setText("");
        tfContratoEncerrarTipo.setText("");
        tfContratoEncerrarCliente.setText("");
        ffContratoEncerrarCpf.setText("");
        dtContratoEncerrarDataInicio.setDate(null);
        dtContratoEncerrarDataFinal.setDate(null);
        dtContratoEncerrarDataEntrega.setDate(null);
        ffContratoEncerraValor.setText("");
        ffContratoEncerrarJuros.setText("");
        ffContratoEncerraMulta.setText("");
        ffContratoEncerraValorTotal.setText("");
        modeloTabelaEquipamentosContrato.setRowCount(0);
        cbContratoEncerrarTipo.setSelectedIndex(0);
    }
    
    public void preencheTelaEquipamento(Equipamento equipamento){
        btAlterarEquipamento.setVisible(true);
        btDeletarEquipamento.setVisible(true);
        btRegistrarEquipamento.setVisible(false);
        lbEquipamentoNum.setVisible(true);
        lbEquipamentoNum.setText("Nº "+equipamento.getId());
        tfEquipamentoNomeEquipamento.setText(equipamento.getDescricao());
        jsEquipamentoQtdEstoque.setValue(equipamento.getQtdTotal());
        jsEquipamentoQtdDisponivel.setValue(equipamento.getQtdDisponivel());
        ffEquipamentoValorDiario.setValue(equipamento.getVlrDiaria());
        ffEquipamentoValorMensal.setValue(equipamento.getVlrMensal());
    }
    private void ffEquipamentoValorDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ffEquipamentoValorDiarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ffEquipamentoValorDiarioActionPerformed

    private void btLimparEncerrarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparEncerrarContratoActionPerformed
        limparTelaEncerramento();
    }//GEN-LAST:event_btLimparEncerrarContratoActionPerformed

    private void btContratoBuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoBuscarClienteMouseEntered
        estilo.aplicaHoverEntered(btContratoBuscarCliente);
    }//GEN-LAST:event_btContratoBuscarClienteMouseEntered

    private void btContratoBuscarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoBuscarClienteMouseExited
        estilo.aplicaHoverExited(btContratoBuscarCliente);
    }//GEN-LAST:event_btContratoBuscarClienteMouseExited

    private void btContratoBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContratoBuscarClienteActionPerformed
        buscarCliente.identificarTela(1);
        buscarCliente.setLocationRelativeTo(this);
        buscarCliente.setVisible(true);
    }//GEN-LAST:event_btContratoBuscarClienteActionPerformed

    private void cbContratoCadastroUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbContratoCadastroUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbContratoCadastroUfActionPerformed

    private void ckbContratoCadastroSemNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbContratoCadastroSemNumeroActionPerformed
        if (ckbContratoCadastroSemNumero.isSelected()){
            tfContratoCadastroNumero.setEditable(false);
            tfContratoCadastroNumero.setText("");
        } else {
            tfContratoCadastroNumero.setEditable(true);
        }
    }//GEN-LAST:event_ckbContratoCadastroSemNumeroActionPerformed

    private void btLimparEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparEquipamentoActionPerformed
        limpaTelaEquipamento();
    }//GEN-LAST:event_btLimparEquipamentoActionPerformed

    private void btCancelarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarEquipamentoActionPerformed
        limpaTelaEquipamento();
        cdlPn.show(pnCdTelas, "cdTelaHome");
    }//GEN-LAST:event_btCancelarEquipamentoActionPerformed

    private void btAlterarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarEquipamentoActionPerformed
        Equipamento equipamento = new Equipamento();

        if (tfEquipamentoNomeEquipamento.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um Equipamento!", "Alteração de Equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            equipamento.setDescricao(tfEquipamentoNomeEquipamento.getText());
        }
        if ((Integer)jsEquipamentoQtdEstoque.getValue() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Informe a quantidade do Equipamento!", "Alteração de Equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            equipamento.setQtdTotal((Integer)jsEquipamentoQtdEstoque.getValue());
        }

        if (ffEquipamentoValorDiario.getValue() == null || ffEquipamentoValorDiario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Informe o valor diário do Equipamento!", "Alteração de Equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            equipamento.setVlrDiaria(((Number) ffEquipamentoValorDiario.getValue()).doubleValue());
        }
        if (ffEquipamentoValorMensal.getValue() == null || ffEquipamentoValorMensal.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Informe o valor mensal do Equipamento!", "Alteração de Equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            equipamento.setVlrMensal(((Number) ffEquipamentoValorMensal.getValue()).doubleValue());
        }
        if(equipamentoController.alterar(buscarEquipamento.getEquipamento().getId(), equipamento)){
            JOptionPane.showMessageDialog(rootPane, "Equipamento Alterado!", "Alteração de Equipamento", JOptionPane.INFORMATION_MESSAGE);
            limpaTelaEquipamento();
            btRegistrarEquipamento.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Erro ao alterar o Equipamento!", "Alteração de Equipamento", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAlterarEquipamentoActionPerformed

    private void btDeletarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarEquipamentoActionPerformed
        if (tfEquipamentoNomeEquipamento.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um Equipamento!", "Deletar Equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
            Equipamento equipamento = buscarEquipamento.getEquipamento();
            String[] opcoes = {"Sim", "Não"};
            int opcao = JOptionPane.showOptionDialog(rootPane, "Deseja realmente deletar o equipamento: " + equipamento.getDescricao() + "?", "Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            if(opcao == 0){
                if(equipamentoController.deletar(equipamento.getId())){
                    JOptionPane.showMessageDialog(rootPane, "Equipamento Deletado!", "Deletar Equipamento", JOptionPane.INFORMATION_MESSAGE);
                    limpaTelaEquipamento();
                    btRegistrarEquipamento.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Erro ao deletar o Equipamento!", "Deletar Equipamento", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btDeletarEquipamentoActionPerformed
    
    public void resetaEstadoComponentesCadastroContrato(){
        lbTituloContratoCadastroDataEntrega.setVisible(false);
        dcContratoCadastroDataEntrega.setVisible(false);
        btContratoCadastroTotalizacao.setVisible(false);
    }
    
    public void preencheCliente(int idCliente) {
        validaCliente = false;
        Cliente cliente = new Cliente();
        cliente = clienteController.buscarPorId(idCliente);
        tfContratoCadastroCliente.setText(cliente.getNome());
        ffContratoCadastroCpf.setText(cliente.getDocumento());
        ffContratoCadastroTelefone.setText(cliente.getTelefone());
        ffContratoCadastroCep.setText(cliente.getEndereco().getCep());
        tfContratoCadastroNumero.setText((cliente.getEndereco().getNumero()).toString());
        tfContratoCadastroBairro.setText(cliente.getEndereco().getBairro());
        tfContratoCadastroLogradouro.setText(cliente.getEndereco().getLogradouro());
        tfContratoCadastroComplemento.setText(cliente.getEndereco().getComplemento());
        tfContratoCadastroCidade.setText(cliente.getEndereco().getCidade().getNome());
        cbContratoCadastroUf.setSelectedItem(cliente.getEndereco().getCidade().getUf());
        
        tfContratoCadastroCliente.setEditable(false);
        ffContratoCadastroCpf.setEditable(false);
        ffContratoCadastroTelefone.setEditable(false);
        ffContratoCadastroCep.setEditable(false);
        tfContratoCadastroNumero.setEditable(false);
        tfContratoCadastroBairro.setEditable(false);
        tfContratoCadastroLogradouro.setEditable(false);
        tfContratoCadastroComplemento.setEditable(false);
        tfContratoCadastroCidade.setEditable(false);
        cbContratoCadastroUf.setEditable(false);
        
    }
    
    public void preencheTelaCadastroCliente(Integer idCliente) {
        Cliente cliente = clienteController.buscarPorId(idCliente);
        lbClienteNum.setVisible(true);
        lbClienteNum.setText("Nº "+cliente.getId());
        tfClienteNomeCliente.setText(cliente.getNome());
        ffClienteCpf.setValue(cliente.getDocumento());
        ffClienteTelefone.setValue(cliente.getTelefone());
        ffClienteCep.setValue(cliente.getEndereco().getCep());
        tfClienteLogradouro.setText(cliente.getEndereco().getLogradouro());
        tfClienteNumero.setText(cliente.getEndereco().getNumero()+"");
        tfClienteBairro.setText(cliente.getEndereco().getBairro());
        tfClienteComplemento.setText(cliente.getEndereco().getComplemento());
        tfClienteCidade.setText(cliente.getEndereco().getCidade().getNome());
        cbClienteUf.setSelectedItem(cliente.getEndereco().getCidade().getUf());
    }
    
    public void preencheTelaContrato(Contrato contrato){
        lbContratoNum.setVisible(true);
        lbContratoNum.setText("Nº "+contrato.getId());
        tfContratoCadastroCliente.setText(contrato.getCliente().getNome());
        ffContratoCadastroCpf.setText(contrato.getCliente().getDocumento());
        ffContratoCadastroTelefone.setText(contrato.getCliente().getTelefone());
        ffContratoCadastroCep.setText(contrato.getCliente().getEndereco().getCep());
        tfContratoCadastroNumero.setText((contrato.getCliente().getEndereco().getNumero()).toString());
        tfContratoCadastroBairro.setText(contrato.getCliente().getEndereco().getBairro());
        tfContratoCadastroLogradouro.setText(contrato.getCliente().getEndereco().getLogradouro());
        tfContratoCadastroComplemento.setText(contrato.getCliente().getEndereco().getComplemento());
        tfContratoCadastroCidade.setText(contrato.getCliente().getEndereco().getCidade().getNome());
        cbContratoCadastroUf.setSelectedItem(contrato.getCliente().getEndereco().getCidade().getUf());
        modeloTabelaEquipCadastroContrato.setRowCount(0);
        for(Equipamento equipamento : contrato.getEquipamentos()){
            Object[] linha = {equipamento.getId(), equipamento.getDescricao(), equipamento.getQtdContrato()};
            modeloTabelaEquipCadastroContrato.addRow(linha);
        }
        dcContratoCadastroDataInicio.setDate(Date.from(contrato.getDataInicio().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        dcContratoCadastroDataFinal.setDate(Date.from(contrato.getDataFim().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        if(contrato.getDataEntrega()!= null){
            dcContratoCadastroDataEntrega.setDate(Date.from(contrato.getDataEntrega().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        }else{
            dcContratoCadastroDataEntrega.setDate(null);
        }
        
        totalizacao = totalizacaoController.buscarTotalizacao(contrato.getId());
        if (totalizacao != null) {
            totalizacao.setTotal(totalizacaoController.calcularValorBase(contrato));
        }
   }
    
    
    public void preencheTelaEncerrarContrato(Contrato contrato){
        idContrato = contrato.getId();
        String idContratoCampo = String.valueOf(contrato.getId());
        tfContratoEncerrarNumeroContrato.setText(idContratoCampo);
        tfContratoEncerrarTipo.setText(contrato.getTipo().name());
        tfContratoEncerrarCliente.setText(contrato.getCliente().getNome());
        ffContratoEncerrarCpf.setText(contrato.getCliente().getDocumento());
        dtContratoEncerrarDataInicio.setDate(Date.from(contrato.getDataInicio().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        dtContratoEncerrarDataFinal.setDate(Date.from(contrato.getDataFim().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        LocalDate dataAgora = LocalDate.now();

        long diasAtrasados = ChronoUnit.DAYS.between(contrato.getDataFim(), dataAgora);
        if (diasAtrasados < 0) {
            cbContratoEncerrarTipo.setSelectedIndex(1);
        } else {
            cbContratoEncerrarTipo.setSelectedIndex(0);
        }

        Date agora = Date.from(dataAgora.atStartOfDay(ZoneId.systemDefault()).toInstant());
        dtContratoEncerrarDataEntrega.setDate(agora);
        preencheValoresEncerramento(contrato);
        modeloTabelaEquipamentosContrato.setRowCount(0);
        for (Equipamento equipamento : contrato.getEquipamentos()) {
            double valorEquipamento = 0;
            if (contrato.getTipo().name().equals("DIARIO")) {
                long diasContratados = ChronoUnit.DAYS.between(contrato.getDataInicio(), contrato.getDataFim());
                valorEquipamento = (equipamento.getVlrDiaria()*diasContratados)*equipamento.getQtdContrato();
            } else {
                long mesesContratados = ChronoUnit.MONTHS.between(contrato.getDataInicio(), contrato.getDataFim());
                valorEquipamento = (equipamento.getVlrMensal()*mesesContratados)*equipamento.getQtdContrato();
            }
            Object[] linha = {equipamento.getId(), equipamento.getDescricao(), "R$ "+valorEquipamento, equipamento.getQtdContrato()};
            modeloTabelaEquipamentosContrato.addRow(linha);
        }
        
        tfContratoEncerrarNumeroContrato.setEditable(false);
        tfContratoEncerrarTipo.setEditable(false);
        tfContratoEncerrarCliente.setEditable(false);
        ffContratoEncerrarCpf.setEditable(false);
        dtContratoEncerrarDataInicio.setEnabled(false);
        dtContratoEncerrarDataFinal.setEnabled(false);
        dtContratoEncerrarDataEntrega.setEnabled(false);
        ffContratoEncerraValor.setEditable(false);
        ffContratoEncerrarJuros.setEditable(false);
        ffContratoEncerraMulta.setEditable(false);
        ffContratoEncerraValorTotal.setEditable(false);
    }

    Integer idContrato;
    String status;
    Double valor;
    Double juros;
    Double multa;

    public void preencheValoresEncerramento(Contrato contrato) {
        LocalDate dataAgora = LocalDate.now();
        Double jurosCampo = 0.00, multaCampo = 0.00;
        Double valorCampo = 0.00, totalCampo = 0.00;

        if (cbContratoEncerrarTipo.getSelectedIndex() == 0) { //ENCERRAMENTO
            valorCampo = totalizacaoController.calcularValorBase(contrato);
            long diasAtrasados = ChronoUnit.DAYS.between(contrato.getDataFim(), dataAgora);
            if (diasAtrasados > 0) {
               jurosCampo = totalizacaoController.calcularJuros(contrato.getTipo().name(), valorCampo, diasAtrasados);
               multaCampo = totalizacaoController.calcularMulta(cbContratoEncerrarTipo.getSelectedIndex(), contrato.getTipo().name(), valorCampo);
            }
            totalCampo = totalizacaoController.calcularTotal(valorCampo, multaCampo, jurosCampo);
            status = "FINALIZADO";
        } else if (cbContratoEncerrarTipo.getSelectedIndex() == 1) { //CANCELAMENTO
            valorCampo = totalizacaoController.calcularValorBase(contrato);
            multaCampo = totalizacaoController.calcularMulta(cbContratoEncerrarTipo.getSelectedIndex(), contrato.getTipo().name(), valorCampo);
            totalCampo = totalizacaoController.calcularTotal(valorCampo, multaCampo, jurosCampo);
            status = "CANCELADO";
        }
        
        ffContratoEncerraValor.setText("R$ "+valorCampo);
        ffContratoEncerrarJuros.setValue("R$ "+jurosCampo);
        ffContratoEncerraMulta.setValue("R$ "+multaCampo);
        ffContratoEncerraValorTotal.setValue("R$ "+totalCampo);

        valor = valorCampo;
        juros = jurosCampo;
        multa = multaCampo;
    }

    private void btRegistrarEncerrarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarEncerrarContratoActionPerformed
        if (totalizacaoController.totalizar(idContrato, valor, juros, multa)) {
            if (contratoController.encerrarContrato(idContrato, status)) {
                JOptionPane.showMessageDialog(rootPane, "Contrato Encerrado com Sucesso!", "Encerramento", JOptionPane.INFORMATION_MESSAGE);
                limparTelaEncerramento();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro ao encerrar o contrato!", "Encerramento", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btRegistrarEncerrarContratoActionPerformed

    private void btSairEncerrarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairEncerrarContratoActionPerformed
        limparTelaEncerramento();
        //cdlPn.show(pnTela, "cdTelaEncerrarContrato");
    }//GEN-LAST:event_btSairEncerrarContratoActionPerformed

    private void btClienteSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteSairMouseEntered
        estilo.aplicaHoverEntered(btClienteSair);
    }//GEN-LAST:event_btClienteSairMouseEntered

    private void btClienteSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteSairMouseExited
        estilo.aplicaHoverExited(btClienteSair);
    }//GEN-LAST:event_btClienteSairMouseExited

    private void btClienteCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteCancelarActionPerformed
        limparTelaCadCliente();
    }//GEN-LAST:event_btClienteCancelarActionPerformed

    private void btClienteSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteSairActionPerformed
        limparTelaCadCliente();
        //VOLTAR PARA A TELA HOME
    }//GEN-LAST:event_btClienteSairActionPerformed
    
    public void limparTelaCadCliente() {
        tfClienteNomeCliente.setText("");
        ffClienteCpf.setText("");
        ffClienteTelefone.setText("");
        ffClienteCep.setText("");
        tfClienteLogradouro.setText("");
        tfClienteBairro.setText("");
        tfClienteNumero.setText("");
        tfClienteComplemento.setText("");
        tfClienteCidade.setText("");
        cbClienteUf.setSelectedIndex(0);
        lbClienteNum.setVisible(false);
    }
    
    public void preencheEquipamento(Equipamento equipamento){
        tfContratoCadastroEquipamento.setText(equipamento.getDescricao());
    }
    public void bloqueiaComponenteTelaCadastroContrato(){
        lbContratoNum.setVisible(false);
        tfContratoCadastroCliente.setEnabled(false);
        ffContratoCadastroCpf.setEnabled(false);
        ffContratoCadastroTelefone.setEnabled(false);
        ffContratoCadastroCep.setEnabled(false);
        tfContratoCadastroNumero.setEnabled(false);
        tfContratoCadastroBairro.setEnabled(false);
        tfContratoCadastroLogradouro.setEnabled(false);
        tfContratoCadastroComplemento.setEnabled(false);
        tfContratoCadastroCidade.setEnabled(false);
        cbContratoCadastroUf.setEnabled(false);
        dcContratoCadastroDataInicio.setEnabled(false);
        dcContratoCadastroDataFinal.setEnabled(false);
        dcContratoCadastroDataEntrega.setEnabled(false);
        tfContratoCadastroEquipamento.setEnabled(false);
        jsQtdEquipamento.setEnabled(false);
        btContratoBuscarEquipamento.setEnabled(false);
        btContratoCadastroAdicionarEquipamento.setEnabled(false);
        btContratoRegistrar.setEnabled(false);
    }
    
    public void desbloqueiaComponenteTelaCadastroContrato(){
        lbContratoNum.setVisible(true);
        tfContratoCadastroCliente.setEnabled(true);
        ffContratoCadastroCpf.setEnabled(true);
        ffContratoCadastroTelefone.setEnabled(true);
        ffContratoCadastroCep.setEnabled(true);
        tfContratoCadastroNumero.setEnabled(true);
        tfContratoCadastroBairro.setEnabled(true);
        tfContratoCadastroLogradouro.setEnabled(true);
        tfContratoCadastroComplemento.setEnabled(true);
        tfContratoCadastroCidade.setEnabled(true);
        cbContratoCadastroUf.setEnabled(true);
        dcContratoCadastroDataInicio.setEnabled(true);
        dcContratoCadastroDataFinal.setEnabled(true);
        dcContratoCadastroDataEntrega.setEnabled(true);
        tfContratoCadastroEquipamento.setEnabled(true);
        jsQtdEquipamento.setEnabled(true);
        btContratoBuscarEquipamento.setEnabled(true);
        btContratoCadastroAdicionarEquipamento.setEnabled(true);
        btContratoRegistrar.setEnabled(true);
    }
    // metodos para limpeza dos componentes das telas
    public void limpaTelaContratoCadastro(){
        lbContratoNum.setVisible(false);
        tfContratoCadastroCliente.setText("");
        ffContratoCadastroCpf.setText("");
        ffContratoCadastroTelefone.setText("");
        ffContratoCadastroCep.setText("");
        tfContratoCadastroNumero.setText("");
        tfContratoCadastroBairro.setText("");
        tfContratoCadastroLogradouro.setText("");
        tfContratoCadastroComplemento.setText("");
        tfContratoCadastroCidade.setText("");
        cbContratoCadastroUf.setSelectedIndex(0);
        LocalDate dataAgora = LocalDate.now();
        Date agora = Date.from(dataAgora.atStartOfDay(ZoneId.systemDefault()).toInstant());
        dcContratoCadastroDataInicio.setDate(agora);
        dcContratoCadastroDataFinal.setDate(null);
        dcContratoCadastroDataEntrega.setDate(null);
        tfContratoCadastroEquipamento.setText("");
        jsQtdEquipamento.setValue(0);
        if(ckbClienteSemNumero.isSelected()){
            ckbClienteSemNumero.setSelected(false);
            tfContratoCadastroNumero.setEnabled(true);
        }
        modeloTabelaEquipCadastroContrato.setRowCount(0);
        
        tfContratoCadastroCliente.setEnabled(true);
        ffContratoCadastroCpf.setEnabled(true);
        ffContratoCadastroTelefone.setEnabled(true);
        ffContratoCadastroCep.setEnabled(true);
        tfContratoCadastroNumero.setEnabled(true);
        tfContratoCadastroBairro.setEnabled(true);
        tfContratoCadastroLogradouro.setEnabled(true);
        tfContratoCadastroComplemento.setEnabled(true);
        tfContratoCadastroCidade.setEnabled(true);
        cbContratoCadastroUf.setEnabled(true);
    }
    
    public void limpaTelaEquipamento(){
        lbEquipamentoNum.setVisible(false);
        tfEquipamentoNomeEquipamento.setText("");
        jsEquipamentoQtdEstoque.setValue(0);
        jsEquipamentoQtdDisponivel.setValue(0);
        ffEquipamentoValorDiario.setValue(0.00);
        ffEquipamentoValorMensal.setValue(0.00);
        btRegistrarEquipamento.setVisible(true);
        btAlterarEquipamento.setVisible(false);
        btDeletarEquipamento.setVisible(false);
    }
    
    public void limpaTelaCliente(){
        
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
    private javax.swing.JButton btAlterarEquipamento;
    private javax.swing.JButton btBuscarContrato;
    private javax.swing.JButton btBuscarEquipamento;
    private javax.swing.JButton btCancelarEquipamento;
    private javax.swing.JButton btClienteBuscarCliente;
    private javax.swing.JButton btClienteCancelar;
    private javax.swing.JButton btClienteSair;
    private javax.swing.JButton btContratoBuscarCliente;
    private javax.swing.JButton btContratoBuscarEquipamento;
    private javax.swing.JButton btContratoCadastroAdicionarEquipamento;
    private javax.swing.JButton btContratoCadastroTotalizacao;
    private javax.swing.JButton btContratoCancelar;
    private javax.swing.JButton btContratoEncerrarBuscarContrato;
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
    private javax.swing.JButton btNovoContrato;
    private javax.swing.JButton btRegistrarEncerrarContrato;
    private javax.swing.JButton btRegistrarEquipamento;
    private javax.swing.JButton btRegistro;
    private javax.swing.JButton btSairEncerrarContrato;
    private javax.swing.JComboBox<String> cbClienteUf;
    private javax.swing.JComboBox<String> cbContratoCadastroUf;
    private javax.swing.JComboBox<String> cbContratoEncerrarTipo;
    private javax.swing.JCheckBox ckbClienteSemNumero;
    private javax.swing.JCheckBox ckbContratoCadastroSemNumero;
    private com.toedter.calendar.JDateChooser dcContratoCadastroDataEntrega;
    private com.toedter.calendar.JDateChooser dcContratoCadastroDataFinal;
    private com.toedter.calendar.JDateChooser dcContratoCadastroDataInicio;
    private com.toedter.calendar.JDateChooser dtContratoEncerrarDataEntrega;
    private com.toedter.calendar.JDateChooser dtContratoEncerrarDataFinal;
    private com.toedter.calendar.JDateChooser dtContratoEncerrarDataInicio;
    private javax.swing.JFormattedTextField ffClienteCep;
    private javax.swing.JFormattedTextField ffClienteCpf;
    private javax.swing.JFormattedTextField ffClienteTelefone;
    private javax.swing.JFormattedTextField ffContratoCadastroCep;
    private javax.swing.JFormattedTextField ffContratoCadastroCpf;
    private javax.swing.JFormattedTextField ffContratoCadastroTelefone;
    private javax.swing.JFormattedTextField ffContratoEncerraMulta;
    private javax.swing.JFormattedTextField ffContratoEncerraValor;
    private javax.swing.JFormattedTextField ffContratoEncerraValorTotal;
    private javax.swing.JFormattedTextField ffContratoEncerrarCpf;
    private javax.swing.JFormattedTextField ffContratoEncerrarJuros;
    private javax.swing.JFormattedTextField ffEquipamentoValorDiario;
    private javax.swing.JFormattedTextField ffEquipamentoValorMensal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpPanelEnderecoCadCliente;
    private javax.swing.JSpinner jsEquipamentoQtdDisponivel;
    private javax.swing.JSpinner jsEquipamentoQtdEstoque;
    private javax.swing.JSpinner jsQtdEquipamento;
    private javax.swing.JLabel lbClienteNum;
    private javax.swing.JLabel lbContratoNum;
    private javax.swing.JLabel lbEquipamentoNum;
    private javax.swing.JLabel lbLogoHm;
    private javax.swing.JLabel lbLogoLg;
    private javax.swing.JLabel lbPerfil;
    private javax.swing.JLabel lbTituloClienteBairro;
    private javax.swing.JLabel lbTituloClienteCep;
    private javax.swing.JLabel lbTituloClienteCidade;
    private javax.swing.JLabel lbTituloClienteComplemento;
    private javax.swing.JLabel lbTituloClienteCpf;
    private javax.swing.JLabel lbTituloClienteLogradouro;
    private javax.swing.JLabel lbTituloClienteNomeCliente;
    private javax.swing.JLabel lbTituloClienteNumero;
    private javax.swing.JLabel lbTituloClienteTelefone;
    private javax.swing.JLabel lbTituloClienteUf;
    private javax.swing.JLabel lbTituloClientes;
    private javax.swing.JLabel lbTituloContratoBairro;
    private javax.swing.JLabel lbTituloContratoCadastro;
    private javax.swing.JLabel lbTituloContratoCadastroDataEntrega;
    private javax.swing.JLabel lbTituloContratoCadastroDataFinal;
    private javax.swing.JLabel lbTituloContratoCadastroDataInicio;
    private javax.swing.JLabel lbTituloContratoCep;
    private javax.swing.JLabel lbTituloContratoCidade;
    private javax.swing.JLabel lbTituloContratoCliente;
    private javax.swing.JLabel lbTituloContratoComplemento;
    private javax.swing.JLabel lbTituloContratoCpf;
    private javax.swing.JLabel lbTituloContratoEncerraValor;
    private javax.swing.JLabel lbTituloContratoEncerramento;
    private javax.swing.JLabel lbTituloContratoEncerrar;
    private javax.swing.JLabel lbTituloContratoEncerrarCpf;
    private javax.swing.JLabel lbTituloContratoEncerrarDataEntrega;
    private javax.swing.JLabel lbTituloContratoEncerrarDataFinal;
    private javax.swing.JLabel lbTituloContratoEncerrarDataInicio;
    private javax.swing.JLabel lbTituloContratoEquipamento;
    private javax.swing.JLabel lbTituloContratoJuros;
    private javax.swing.JLabel lbTituloContratoLogradouro;
    private javax.swing.JLabel lbTituloContratoMulta;
    private javax.swing.JLabel lbTituloContratoNomeCliente;
    private javax.swing.JLabel lbTituloContratoNumero;
    private javax.swing.JLabel lbTituloContratoNumeroContrato;
    private javax.swing.JLabel lbTituloContratoQuantidade;
    private javax.swing.JLabel lbTituloContratoTelefone;
    private javax.swing.JLabel lbTituloContratoTipo;
    private javax.swing.JLabel lbTituloContratoTipoEncerramento;
    private javax.swing.JLabel lbTituloContratoUf;
    private javax.swing.JLabel lbTituloContratoValorTotal;
    private javax.swing.JLabel lbTituloEquipamento;
    private javax.swing.JLabel lbTituloEquipamentoNomeEquipamento;
    private javax.swing.JLabel lbTituloEquipamentoQtd;
    private javax.swing.JLabel lbTituloEquipamentoQtd1;
    private javax.swing.JLabel lbTituloEquipamentoValorDiario;
    private javax.swing.JLabel lbTituloEquipamentoValorMensal;
    private javax.swing.JLabel lbTituloLogin;
    private javax.swing.JLabel lbTituloRentHub;
    private javax.swing.JLabel lbTituloSenha;
    private javax.swing.JLabel lbTituloUsuario;
    private javax.swing.JLabel lbUsuarioLogado;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JPanel pnCdTelas;
    private javax.swing.JPanel pnCliente;
    private javax.swing.JPanel pnContratoCadastro;
    private javax.swing.JPanel pnContratoEncerrar;
    private javax.swing.JPanel pnEquipamento;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPanel pnLogo;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnTela;
    private javax.swing.JPanel pnTelaCadastroCt;
    private javax.swing.JPanel pnTelaCliente;
    private javax.swing.JPanel pnTelaEncerrarCt;
    private javax.swing.JPanel pnTelaEquipamento;
    private javax.swing.JPanel pnTelaHome;
    private javax.swing.JPanel pnTelaLogin;
    private javax.swing.JPanel pnTop;
    private javax.swing.JPopupMenu popupPerfil;
    private javax.swing.JTable tbContratoCadastroEquipamento;
    private javax.swing.JTable tbContratoEncerrarEquipamentos;
    private javax.swing.JTextField tfClienteBairro;
    private javax.swing.JTextField tfClienteCidade;
    private javax.swing.JTextField tfClienteComplemento;
    private javax.swing.JTextField tfClienteLogradouro;
    private javax.swing.JTextField tfClienteNomeCliente;
    private javax.swing.JTextField tfClienteNumero;
    private javax.swing.JTextField tfContratoCadastroBairro;
    private javax.swing.JTextField tfContratoCadastroCidade;
    private javax.swing.JTextField tfContratoCadastroCliente;
    private javax.swing.JTextField tfContratoCadastroComplemento;
    private javax.swing.JTextField tfContratoCadastroEquipamento;
    private javax.swing.JTextField tfContratoCadastroLogradouro;
    private javax.swing.JTextField tfContratoCadastroNumero;
    private javax.swing.JTextField tfContratoEncerrarCliente;
    private javax.swing.JTextField tfContratoEncerrarNumeroContrato;
    private javax.swing.JTextField tfContratoEncerrarTipo;
    private javax.swing.JTextField tfEquipamentoNomeEquipamento;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
