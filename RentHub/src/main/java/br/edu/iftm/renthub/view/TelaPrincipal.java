package br.edu.iftm.renthub.view;

import br.edu.iftm.renthub.control.ClienteController;
import br.edu.iftm.renthub.control.ContratoController;
import br.edu.iftm.renthub.control.UsuarioController;
import br.edu.iftm.renthub.control.Endereco.ConsultaCep;
import br.edu.iftm.renthub.model.Cliente;
import br.edu.iftm.renthub.model.Contrato;
import br.edu.iftm.renthub.model.Endereco;
import br.edu.iftm.renthub.model.Equipamento;
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
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

// Criado por Jhonnie em 08/07/2023
public class TelaPrincipal extends javax.swing.JFrame {
    private static TelaRegistroUsuario telaUsuario;
    private CardLayout cdl;
    private CardLayout cdlPn;
    private UtilsComponent estilo;
    private ConsultaCep consulta;
    private static UsuarioController usuarioController;
    private static ContratoController contratoController;
    private static ClienteController clienteController;
    private static BuscarContrato buscarContrato;
    private static VerTotalizazao verTotalizazao;
    private static BuscarEquipamento buscarEquipamento;
    private static BuscarCliente buscarCliente;
    private List<Equipamento> equipamentosContrato;

    public TelaPrincipal(Connection conexao) throws SQLException {
        usuarioController = new UsuarioController(conexao);
        contratoController = new ContratoController(conexao);
        clienteController = new ClienteController(conexao);
        telaUsuario = new TelaRegistroUsuario(this, true, conexao);
        buscarContrato = new BuscarContrato(this, true, conexao);
        verTotalizazao = new VerTotalizazao(this, true, conexao);
        buscarEquipamento = new BuscarEquipamento(this, true, conexao, this);
        buscarCliente = new BuscarCliente(this, true, conexao);
        initComponents();
        cdl = (CardLayout) getContentPane().getLayout();
        cdlPn = (CardLayout) pnCdTelas.getLayout();
        estilo = new UtilsComponent();
        estilo.configJspinner(jsQtdEquipamento, jsEquipamentoQtdEstoque);
        consulta = new ConsultaCep();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgTipo = new javax.swing.ButtonGroup();
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
        lbTituloContratoNovo = new javax.swing.JLabel();
        lbTituloContratoCliente = new javax.swing.JLabel();
        tfContratoCadastroCliente = new javax.swing.JTextField();
        lbTituloContratoCpf = new javax.swing.JLabel();
        ffContratoCadastroCpf = new javax.swing.JFormattedTextField();
        ffContratoCadastroTelefone = new javax.swing.JFormattedTextField();
        lbTituloContratoTelefone = new javax.swing.JLabel();
        lbTituloContratoCep = new javax.swing.JLabel();
        ffContratoCadastroCep = new javax.swing.JFormattedTextField();
        lbTituloContratoCidade = new javax.swing.JLabel();
        tfContratoCadastroCidade = new javax.swing.JTextField();
        tfContratoCadastroLogradouro = new javax.swing.JTextField();
        lbTituloContratoLogradouro = new javax.swing.JLabel();
        lbTituloContratoUf = new javax.swing.JLabel();
        cbContratoCadastroUf = new javax.swing.JComboBox<>();
        tfContratoCadastroBairro = new javax.swing.JTextField();
        lbTituloContratoBairro = new javax.swing.JLabel();
        tfContratoCadastroComplemento = new javax.swing.JTextField();
        lbTituloContratoComplemento = new javax.swing.JLabel();
        lbTituloContratoEquipamento = new javax.swing.JLabel();
        lbTituloContratoQuantidade = new javax.swing.JLabel();
        jsQtdEquipamento = new javax.swing.JSpinner();
        btContratoCadastroAdicionarEquipamento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbContratoCadastroEquipamento = new javax.swing.JTable();
        tfContratoCadastroNumero = new javax.swing.JTextField();
        lbTituloContratoNumero = new javax.swing.JLabel();
        ckbContratoCadastroSemNumero = new javax.swing.JCheckBox();
        lbTituloContratoCadastroDataFinal = new javax.swing.JLabel();
        dcContratoCadastroDataFinal = new com.toedter.calendar.JDateChooser();
        lbTituloContratoCadastroDataInicio = new javax.swing.JLabel();
        lbTituloContratoCadastroDataEntrega = new javax.swing.JLabel();
        dcContratoCadastroDataInicio = new com.toedter.calendar.JDateChooser();
        dcContratoCadastroDataEntrega = new com.toedter.calendar.JDateChooser();
        btContratoCadastroTotalizacao = new RoundedButton("");
        tfContratoCadastroEquipamento = new javax.swing.JTextField();
        btContratoBuscarEquipamento = new RoundedButton("");
        lbTituloContratoValor = new javax.swing.JLabel();
        ffContratoCadastroValor = new javax.swing.JFormattedTextField();
        tfNumeroDoContrato = new javax.swing.JTextField();
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
        btCancelarEncerrarContrato = new RoundedButton("");
        btLimparEncerrarContrato = new RoundedButton("");
        btRegistrarEncerrarContrato = new RoundedButton("");
        btNovoContrato = new RoundedButton("");
        pnTelaEquipamento = new javax.swing.JPanel();
        pnEquipamento = new javax.swing.JPanel();
        lbTituloEquipamentoNovo = new javax.swing.JLabel();
        lbTituloEquipamentoNomeEquipamento = new javax.swing.JLabel();
        tfEquipamentoNomeEquipamento = new javax.swing.JTextField();
        btBuscarEquipamento = new javax.swing.JButton();
        lbTituloEquipamentoQtd = new javax.swing.JLabel();
        jsEquipamentoQtdEstoque = new javax.swing.JSpinner();
        lbTituloEquipamentoValorDiario = new javax.swing.JLabel();
        ffEquipamentoValorDiario = new javax.swing.JFormattedTextField();
        lbTituloEquipamentoValorMensal = new javax.swing.JLabel();
        ffEquipamentoValorMensal = new javax.swing.JFormattedTextField();
        btAlterarEquipamento = new RoundedButton("");
        btDeletarEquipamento = new RoundedButton("");
        lbTituloEquipamento = new javax.swing.JLabel();
        btLimparEquipamento = new RoundedButton("");
        btRegistrarEquipamento = new RoundedButton("");
        btCancelarEquipamento = new RoundedButton("");
        pnTelaCliente = new javax.swing.JPanel();
        pnCliente = new javax.swing.JPanel();
        lbTituloCliente = new javax.swing.JLabel();
        btClienteAlterar = new RoundedButton("");
        btClienteDeletar = new RoundedButton("");
        lbTituloClienteNomeCliente = new javax.swing.JLabel();
        tfClienteNomeCliente = new javax.swing.JTextField();
        lbTituloClienteCpf = new javax.swing.JLabel();
        ffClienteCpf = new javax.swing.JFormattedTextField();
        lbTituloClienteTelefone = new javax.swing.JLabel();
        ffClienteTelefone = new javax.swing.JFormattedTextField();
        lbTituloClienteCep = new javax.swing.JLabel();
        ffClienteCep = new javax.swing.JFormattedTextField();
        lbTituloClienteNumero = new javax.swing.JLabel();
        tfClienteNumero = new javax.swing.JTextField();
        ckbClienteSemNumero = new javax.swing.JCheckBox();
        lbTituloClienteLogradouro = new javax.swing.JLabel();
        tfClienteLogradouro = new javax.swing.JTextField();
        lbTituloClienteBairro = new javax.swing.JLabel();
        tfClienteBairro = new javax.swing.JTextField();
        lbTituloClienteComplemento = new javax.swing.JLabel();
        tfClienteComplemento = new javax.swing.JTextField();
        lbTituloClienteCidade = new javax.swing.JLabel();
        tfClienteCidade = new javax.swing.JTextField();
        lbTituloClienteUf = new javax.swing.JLabel();
        cbClienteUf = new javax.swing.JComboBox<>();
        lbTituloClienteIdCliente = new javax.swing.JLabel();
        tfClienteIdCliente = new javax.swing.JTextField();
        btClienteBuscarCliente = new javax.swing.JButton();
        lbTituloClientes = new javax.swing.JLabel();
        btClienteCancelar = new RoundedButton("");
        btClienteSalvar = new RoundedButton("");

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

        lbTituloUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloUsuario.setText("Usuário:");

        lbTituloSenha.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloSenha.setText("Senha:");

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

        javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
        pnLogin.setLayout(pnLoginLayout);
        pnLoginLayout.setHorizontalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTituloLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTituloSenha)
                    .addComponent(lbTituloUsuario)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnLoginLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        pnLoginLayout.setVerticalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lbTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
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
                .addComponent(lbTituloRentHub)
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
                    .addComponent(lbTituloRentHub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        lbTituloContratoCadastro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTituloContratoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoCadastro.setText("CONTRATO");

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

        pnContratoCadastro.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloContratoNovo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTituloContratoNovo.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoNovo.setText("NOVO");

        lbTituloContratoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoCliente.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoCliente.setText("Nome do Cliente");

        tfContratoCadastroCliente.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloContratoCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoCpf.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoCpf.setText("CPF/CNPJ");

        ffContratoCadastroCpf.setBackground(new java.awt.Color(215, 215, 215));
        ffContratoCadastroCpf.setToolTipText("");

        ffContratoCadastroTelefone.setBackground(new java.awt.Color(215, 215, 215));
        ffContratoCadastroTelefone.setToolTipText("");

        lbTituloContratoTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoTelefone.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoTelefone.setText("Telefone");

        lbTituloContratoCep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoCep.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoCep.setText("CEP");

        ffContratoCadastroCep.setBackground(new java.awt.Color(215, 215, 215));
        ffContratoCadastroCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ffContratoCadastroCepFocusLost(evt);
            }
        });

        lbTituloContratoCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoCidade.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoCidade.setText("Cidade");

        tfContratoCadastroCidade.setBackground(new java.awt.Color(215, 215, 215));

        tfContratoCadastroLogradouro.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloContratoLogradouro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoLogradouro.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoLogradouro.setText("Logradouro");

        lbTituloContratoUf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoUf.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoUf.setText("UF");

        cbContratoCadastroUf.setBackground(new java.awt.Color(215, 215, 215));
        cbContratoCadastroUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbContratoCadastroUf.setFocusable(false);

        tfContratoCadastroBairro.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloContratoBairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoBairro.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoBairro.setText("Bairro");

        tfContratoCadastroComplemento.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloContratoComplemento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoComplemento.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoComplemento.setText("Complemento");

        lbTituloContratoEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoEquipamento.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoEquipamento.setText("Equipamentos");

        lbTituloContratoQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoQuantidade.setText("Quantidade");

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
                "Cód.", "Equipamento", "Qtd."
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

        tfContratoCadastroNumero.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloContratoNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoNumero.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoNumero.setText("Número");

        ckbContratoCadastroSemNumero.setForeground(new java.awt.Color(0, 0, 0));
        ckbContratoCadastroSemNumero.setText("Sem Número");
        ckbContratoCadastroSemNumero.setFocusPainted(false);

        lbTituloContratoCadastroDataFinal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoCadastroDataFinal.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoCadastroDataFinal.setText("Data Final");

        dcContratoCadastroDataFinal.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloContratoCadastroDataInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoCadastroDataInicio.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoCadastroDataInicio.setText("Data Inicio");

        lbTituloContratoCadastroDataEntrega.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoCadastroDataEntrega.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoCadastroDataEntrega.setText("Data de Entrega");
        lbTituloContratoCadastroDataEntrega.setVisible(false);

        dcContratoCadastroDataInicio.setBackground(new java.awt.Color(215, 215, 215));
        dcContratoCadastroDataInicio.setEnabled(false);

        dcContratoCadastroDataEntrega.setBackground(new java.awt.Color(215, 215, 215));
        dcContratoCadastroDataEntrega.setVisible(false);

        btContratoCadastroTotalizacao.setBackground(new java.awt.Color(240, 240, 240));
        btContratoCadastroTotalizacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        lbTituloContratoValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoValor.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoValor.setText("Valor Parcial");

        ffContratoCadastroValor.setBackground(new java.awt.Color(215, 215, 215));

        tfNumeroDoContrato.setBackground(new java.awt.Color(255, 255, 255));
        tfNumeroDoContrato.setForeground(new java.awt.Color(0, 0, 0));
        tfNumeroDoContrato.setBorder(null);

        javax.swing.GroupLayout pnContratoCadastroLayout = new javax.swing.GroupLayout(pnContratoCadastro);
        pnContratoCadastro.setLayout(pnContratoCadastroLayout);
        pnContratoCadastroLayout.setHorizontalGroup(
            pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                        .addComponent(lbTituloContratoCidade)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tfContratoCadastroCidade))
                                .addGap(18, 18, 18)
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloContratoUf)
                                    .addComponent(cbContratoCadastroUf, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfContratoCadastroLogradouro)
                            .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloContratoBairro)
                                    .addComponent(tfContratoCadastroBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloContratoComplemento)
                                    .addComponent(tfContratoCadastroComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContratoCadastroLayout.createSequentialGroup()
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ffContratoCadastroCpf)
                                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbTituloContratoCpf, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ffContratoCadastroCep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbTituloContratoCep)
                                            .addComponent(lbTituloContratoLogradouro)
                                            .addComponent(lbTituloContratoCliente))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(lbTituloContratoTelefone))
                                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                        .addComponent(tfContratoCadastroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ckbContratoCadastroSemNumero))
                                    .addComponent(lbTituloContratoNumero)
                                    .addComponent(ffContratoCadastroTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfContratoCadastroCliente))
                        .addGap(149, 149, 149)
                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloContratoEquipamento)
                                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                        .addComponent(tfContratoCadastroEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btContratoBuscarEquipamento)))
                                .addGap(17, 17, 17)
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloContratoQuantidade)
                                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                        .addComponent(jsQtdEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btContratoCadastroAdicionarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloContratoCadastroDataInicio)
                                    .addComponent(dcContratoCadastroDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbTituloContratoValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ffContratoCadastroValor)))
                            .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloContratoCadastroDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dcContratoCadastroDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dcContratoCadastroDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTituloContratoCadastroDataEntrega))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btContratoCadastroTotalizacao)))
                        .addGap(105, 105, 105))
                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                        .addComponent(lbTituloContratoNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfNumeroDoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        pnContratoCadastroLayout.setVerticalGroup(
            pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContratoCadastroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTituloContratoNovo)
                    .addComponent(tfNumeroDoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                        .addComponent(lbTituloContratoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfContratoCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                .addComponent(lbTituloContratoCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ffContratoCadastroCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                .addComponent(lbTituloContratoTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ffContratoCadastroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTituloContratoCep)
                            .addComponent(lbTituloContratoNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ffContratoCadastroCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfContratoCadastroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckbContratoCadastroSemNumero))
                        .addGap(18, 18, 18)
                        .addComponent(lbTituloContratoLogradouro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfContratoCadastroLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTituloContratoBairro)
                            .addComponent(lbTituloContratoComplemento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfContratoCadastroBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfContratoCadastroComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTituloContratoCidade)
                            .addComponent(lbTituloContratoUf))
                        .addGap(11, 11, 11)
                        .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfContratoCadastroCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbContratoCadastroUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                            .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                    .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                            .addComponent(lbTituloContratoEquipamento)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfContratoCadastroEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btContratoCadastroAdicionarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(19, 19, 19))
                                .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                    .addComponent(lbTituloContratoQuantidade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jsQtdEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btContratoBuscarEquipamento))
                                    .addGap(18, 18, 18)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                                    .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbTituloContratoCadastroDataInicio)
                                        .addComponent(lbTituloContratoValor))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnContratoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dcContratoCadastroDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ffContratoCadastroValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(lbTituloContratoCadastroDataFinal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dcContratoCadastroDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btContratoCadastroTotalizacao, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(pnContratoCadastroLayout.createSequentialGroup()
                            .addComponent(lbTituloContratoCadastroDataEntrega)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dcContratoCadastroDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
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
        btContratoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContratoRegistrarActionPerformed(evt);
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
                            .addComponent(lbTituloContratoCadastro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btBuscarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pnContratoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(lbTituloContratoCadastro)
                        .addGap(2, 2, 2)))
                .addComponent(pnContratoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTelaCadastroCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btContratoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btContratoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btContratoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pnCdTelas.add(pnTelaCadastroCt, "cdTelaCadastroContrato");

        pnTelaEncerrarCt.setBackground(new java.awt.Color(217, 217, 217));

        pnContratoEncerrar.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloContratoTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoTipo.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoTipo.setText("Tipo de Contrato");

        lbTituloContratoEncerramento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTituloContratoEncerramento.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoEncerramento.setText("ENCERRAMENTO");

        lbTituloContratoNumeroContrato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoNumeroContrato.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoNumeroContrato.setText("Contrato");

        tfContratoEncerrarNumeroContrato.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloContratoEncerrarCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoEncerrarCpf.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoEncerrarCpf.setText("CPF/CNPJ");

        ffContratoEncerrarCpf.setBackground(new java.awt.Color(215, 215, 215));
        ffContratoEncerrarCpf.setToolTipText("");

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

        lbTituloContratoNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoNomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoNomeCliente.setText("Cliente");

        tfContratoEncerrarCliente.setBackground(new java.awt.Color(215, 215, 215));

        tfContratoEncerrarTipo.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloContratoEncerrarDataInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoEncerrarDataInicio.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoEncerrarDataInicio.setText("Data Inicial");

        dtContratoEncerrarDataInicio.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloContratoEncerrarDataFinal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoEncerrarDataFinal.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoEncerrarDataFinal.setText("Data Final");

        dtContratoEncerrarDataFinal.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloContratoEncerrarDataEntrega.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoEncerrarDataEntrega.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoEncerrarDataEntrega.setText("Data de Entrega");

        dtContratoEncerrarDataEntrega.setBackground(new java.awt.Color(215, 215, 215));

        tbContratoEncerrarEquipamentos.setBackground(new java.awt.Color(215, 215, 215));
        tbContratoEncerrarEquipamentos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbContratoEncerrarEquipamentos.setForeground(new java.awt.Color(0, 0, 0));
        tbContratoEncerrarEquipamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Equipamento", "Qtd."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        cbContratoEncerrarTipo.setForeground(new java.awt.Color(0, 0, 0));
        cbContratoEncerrarTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Encerrar", "Cancelar" }));

        lbTituloContratoTipoEncerramento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoTipoEncerramento.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoTipoEncerramento.setText("Fechamento");

        lbTituloContratoEncerraValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoEncerraValor.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoEncerraValor.setText("Valor");

        ffContratoEncerraValor.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloContratoJuros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoJuros.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoJuros.setText("Juros");

        ffContratoEncerrarJuros.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloContratoMulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoMulta.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoMulta.setText("Multa");

        ffContratoEncerraMulta.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloContratoValorTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloContratoValorTotal.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoValorTotal.setText("Valor Total");

        ffContratoEncerraValorTotal.setBackground(new java.awt.Color(215, 215, 215));

        javax.swing.GroupLayout pnContratoEncerrarLayout = new javax.swing.GroupLayout(pnContratoEncerrar);
        pnContratoEncerrar.setLayout(pnContratoEncerrarLayout);
        pnContratoEncerrarLayout.setHorizontalGroup(
            pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTituloContratoEncerramento, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                .addComponent(tfContratoEncerrarNumeroContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btContratoEncerrarBuscarContrato))
                            .addComponent(lbTituloContratoNumeroContrato))
                        .addGap(18, 18, 18)
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloContratoTipoEncerramento)
                            .addComponent(cbContratoEncerrarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloContratoTipo)
                            .addComponent(tfContratoEncerrarTipo)))
                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloContratoNomeCliente)
                            .addComponent(tfContratoEncerrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloContratoEncerrarCpf)
                            .addComponent(ffContratoEncerrarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloContratoEncerraValor)
                            .addComponent(ffContratoEncerraValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloContratoJuros)
                            .addComponent(ffContratoEncerrarJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloContratoMulta)
                            .addComponent(ffContratoEncerraMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloContratoValorTotal)
                            .addComponent(ffContratoEncerraValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloContratoEncerrarDataInicio)
                            .addComponent(dtContratoEncerrarDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloContratoEncerrarDataFinal)
                            .addComponent(dtContratoEncerrarDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloContratoEncerrarDataEntrega)
                            .addComponent(dtContratoEncerrarDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnContratoEncerrarLayout.setVerticalGroup(
            pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContratoEncerrarLayout.createSequentialGroup()
                .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbTituloContratoEncerramento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tfContratoEncerrarNumeroContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                                .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(lbTituloContratoTipo)
                                                    .addComponent(lbTituloContratoNumeroContrato)
                                                    .addComponent(lbTituloContratoTipoEncerramento))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(tfContratoEncerrarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbContratoEncerrarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(btContratoEncerrarBuscarContrato)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContratoEncerrarLayout.createSequentialGroup()
                                        .addComponent(lbTituloContratoEncerrarDataEntrega)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dtContratoEncerrarDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                        .addComponent(lbTituloContratoEncerrarDataFinal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dtContratoEncerrarDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                        .addComponent(lbTituloContratoNomeCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfContratoEncerrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                        .addComponent(lbTituloContratoEncerrarCpf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ffContratoEncerrarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                .addComponent(lbTituloContratoEncerrarDataInicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtContratoEncerrarDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnContratoEncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                        .addComponent(lbTituloContratoJuros)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ffContratoEncerrarJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                        .addComponent(lbTituloContratoEncerraValor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ffContratoEncerraValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                                    .addComponent(lbTituloContratoMulta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ffContratoEncerraMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnContratoEncerrarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTituloContratoValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ffContratoEncerraValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );

        lbTituloContratoEncerrar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTituloContratoEncerrar.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloContratoEncerrar.setText("CONTRATO");

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
                        .addComponent(lbTituloContratoEncerrar)
                        .addGap(659, 659, 659)
                        .addComponent(btNovoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pnContratoEncerrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(lbTituloContratoEncerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnContratoEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTelaEncerrarCtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelarEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimparEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRegistrarEncerrarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnCdTelas.add(pnTelaEncerrarCt, "cdTelaEncerrarContrato");

        pnTelaEquipamento.setBackground(new java.awt.Color(217, 217, 217));

        pnEquipamento.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloEquipamentoNovo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTituloEquipamentoNovo.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloEquipamentoNovo.setText("NOVO EQUIPAMENTO");

        lbTituloEquipamentoNomeEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloEquipamentoNomeEquipamento.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloEquipamentoNomeEquipamento.setText("Equipamento");

        tfEquipamentoNomeEquipamento.setBackground(new java.awt.Color(215, 215, 215));

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

        lbTituloEquipamentoQtd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloEquipamentoQtd.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloEquipamentoQtd.setText("Quantidade de Estoque");

        jsEquipamentoQtdEstoque.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        lbTituloEquipamentoValorDiario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloEquipamentoValorDiario.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloEquipamentoValorDiario.setText("Valor Diário");

        ffEquipamentoValorDiario.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloEquipamentoValorMensal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloEquipamentoValorMensal.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloEquipamentoValorMensal.setText("Valor Mensal");

        ffEquipamentoValorMensal.setBackground(new java.awt.Color(215, 215, 215));

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

        javax.swing.GroupLayout pnEquipamentoLayout = new javax.swing.GroupLayout(pnEquipamento);
        pnEquipamento.setLayout(pnEquipamentoLayout);
        pnEquipamentoLayout.setHorizontalGroup(
            pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEquipamentoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTituloEquipamentoValorMensal)
                    .addComponent(lbTituloEquipamentoValorDiario)
                    .addComponent(lbTituloEquipamentoNomeEquipamento)
                    .addComponent(lbTituloEquipamentoNovo)
                    .addGroup(pnEquipamentoLayout.createSequentialGroup()
                        .addComponent(tfEquipamentoNomeEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbTituloEquipamentoQtd)
                    .addGroup(pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jsEquipamentoQtdEstoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addComponent(ffEquipamentoValorDiario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ffEquipamentoValorMensal, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEquipamentoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAlterarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDeletarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnEquipamentoLayout.setVerticalGroup(
            pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEquipamentoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbTituloEquipamentoNovo)
                .addGap(18, 18, 18)
                .addComponent(lbTituloEquipamentoNomeEquipamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEquipamentoNomeEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbTituloEquipamentoQtd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsEquipamentoQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbTituloEquipamentoValorDiario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ffEquipamentoValorDiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbTituloEquipamentoValorMensal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ffEquipamentoValorMensal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(pnEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeletarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        lbTituloEquipamento.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTituloEquipamento.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloEquipamento.setText("EQUIPAMENTO");

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
        btRegistrarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarEquipamentoActionPerformed(evt);
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
                        .addComponent(lbTituloEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTelaEquipamentoLayout.createSequentialGroup()
                        .addGroup(pnTelaEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(lbTituloEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTelaEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimparEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRegistrarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pnCdTelas.add(pnTelaEquipamento, "cdTelaEquipamento");

        pnTelaCliente.setBackground(new java.awt.Color(215, 215, 215));

        pnCliente.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTituloCliente.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloCliente.setText("CLIENTE");

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

        lbTituloClienteNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloClienteNomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteNomeCliente.setText("Nome do Cliente");

        tfClienteNomeCliente.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloClienteCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloClienteCpf.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteCpf.setText("CPF/CNPJ");

        ffClienteCpf.setBackground(new java.awt.Color(215, 215, 215));
        ffClienteCpf.setToolTipText("");

        lbTituloClienteTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloClienteTelefone.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteTelefone.setText("Telefone");

        ffClienteTelefone.setBackground(new java.awt.Color(215, 215, 215));
        ffClienteTelefone.setToolTipText("");

        lbTituloClienteCep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloClienteCep.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteCep.setText("CEP");

        ffClienteCep.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloClienteNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloClienteNumero.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteNumero.setText("Número");

        tfClienteNumero.setBackground(new java.awt.Color(215, 215, 215));

        ckbClienteSemNumero.setForeground(new java.awt.Color(0, 0, 0));
        ckbClienteSemNumero.setText("Sem Número");
        ckbClienteSemNumero.setFocusPainted(false);

        lbTituloClienteLogradouro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloClienteLogradouro.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteLogradouro.setText("Logradouro");

        tfClienteLogradouro.setEditable(false);
        tfClienteLogradouro.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloClienteBairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloClienteBairro.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteBairro.setText("Bairro");

        tfClienteBairro.setEditable(false);
        tfClienteBairro.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloClienteComplemento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloClienteComplemento.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteComplemento.setText("Complemento");

        tfClienteComplemento.setEditable(false);
        tfClienteComplemento.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloClienteCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloClienteCidade.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteCidade.setText("Cidade");

        tfClienteCidade.setEditable(false);
        tfClienteCidade.setBackground(new java.awt.Color(215, 215, 215));

        lbTituloClienteUf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloClienteUf.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteUf.setText("UF");

        cbClienteUf.setBackground(new java.awt.Color(215, 215, 215));
        cbClienteUf.setFocusable(false);

        lbTituloClienteIdCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloClienteIdCliente.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClienteIdCliente.setText("ID Cliente");

        tfClienteIdCliente.setBackground(new java.awt.Color(215, 215, 215));
        tfClienteIdCliente.setForeground(new java.awt.Color(0, 0, 0));

        btClienteBuscarCliente.setBackground(new java.awt.Color(240, 240, 240));
        btClienteBuscarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btClienteBuscarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btClienteBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loupe.png"))); // NOI18N
        btClienteBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnClienteLayout = new javax.swing.GroupLayout(pnCliente);
        pnCliente.setLayout(pnClienteLayout);
        pnClienteLayout.setHorizontalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClienteLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btClienteAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btClienteDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnClienteLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloClienteIdCliente)
                                    .addGroup(pnClienteLayout.createSequentialGroup()
                                        .addComponent(tfClienteIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btClienteBuscarCliente)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloClienteNomeCliente)
                                    .addComponent(tfClienteNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloClienteCpf)
                                    .addComponent(ffClienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloClienteTelefone)
                                    .addComponent(ffClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83))
                            .addGroup(pnClienteLayout.createSequentialGroup()
                                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTituloCliente)
                                    .addGroup(pnClienteLayout.createSequentialGroup()
                                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ffClienteCep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbTituloClienteCep))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbTituloClienteLogradouro)
                                            .addComponent(tfClienteLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbTituloClienteNumero)
                                            .addGroup(pnClienteLayout.createSequentialGroup()
                                                .addComponent(tfClienteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ckbClienteSemNumero))))
                                    .addGroup(pnClienteLayout.createSequentialGroup()
                                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbTituloClienteBairro)
                                            .addComponent(tfClienteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfClienteComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbTituloClienteComplemento))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbTituloClienteCidade)
                                            .addComponent(tfClienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbClienteUf, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbTituloClienteUf))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnClienteLayout.setVerticalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbTituloCliente)
                .addGap(18, 18, 18)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnClienteLayout.createSequentialGroup()
                                .addComponent(lbTituloClienteNomeCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfClienteNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbTituloClienteLogradouro)
                                .addGap(32, 32, 32))
                            .addGroup(pnClienteLayout.createSequentialGroup()
                                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnClienteLayout.createSequentialGroup()
                                        .addComponent(lbTituloClienteIdCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfClienteIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btClienteBuscarCliente)))
                                    .addGroup(pnClienteLayout.createSequentialGroup()
                                        .addComponent(lbTituloClienteCpf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ffClienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClienteLayout.createSequentialGroup()
                                        .addComponent(lbTituloClienteTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ffClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnClienteLayout.createSequentialGroup()
                                            .addComponent(lbTituloClienteCep)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ffClienteCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClienteLayout.createSequentialGroup()
                                            .addComponent(lbTituloClienteNumero)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(tfClienteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ckbClienteSemNumero))))
                                    .addComponent(tfClienteLogradouro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnClienteLayout.createSequentialGroup()
                                .addComponent(lbTituloClienteComplemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfClienteComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnClienteLayout.createSequentialGroup()
                                .addComponent(lbTituloClienteBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfClienteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addComponent(lbTituloClienteCidade)
                        .addGap(11, 11, 11)
                        .addComponent(tfClienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbTituloClienteUf)
                        .addGroup(pnClienteLayout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(cbClienteUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClienteAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClienteDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        lbTituloClientes.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTituloClientes.setForeground(new java.awt.Color(0, 0, 0));
        lbTituloClientes.setText("CLIENTES");

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
                .addComponent(lbTituloClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnTelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnTelaClienteLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(pnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE)))
        );
        pnTelaClienteLayout.setVerticalGroup(
            pnTelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaClienteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbTituloClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 558, Short.MAX_VALUE)
                .addGroup(pnTelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClienteCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClienteSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(pnTelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnTelaClienteLayout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(pnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
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
        if(!tfNumeroDoContrato.getText().isEmpty() || !tfNumeroDoContrato.getText().equals("")){
            lbTituloContratoCadastroDataEntrega.setVisible(true);
            dcContratoCadastroDataEntrega.setVisible(true);
            btContratoCadastroTotalizacao.setVisible(true);
        }
    }//GEN-LAST:event_btBuscarContratoActionPerformed

    private void btContratoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContratoLimparActionPerformed
        resetaEstadoComponentesCadastroContrato();
    }//GEN-LAST:event_btContratoLimparActionPerformed

    private void btContratoCadastroAdicionarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContratoCadastroAdicionarEquipamentoActionPerformed
        DefaultTableModel modeloTabelaEquipamento = (DefaultTableModel) tbContratoCadastroEquipamento.getModel();
        Equipamento equipamento = buscarEquipamento.getEquipamento();
        Object[] linha = {equipamento.getId(), equipamento.getDescricao(), jsQtdEquipamento.getValue()};
        modeloTabelaEquipamento.addRow(linha);
        equipamento.setQtdContrato((int)jsQtdEquipamento.getValue());
        equipamentosContrato.add(equipamento);
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

    private void btCancelarEncerrarContratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarEncerrarContratoMouseEntered
        estilo.aplicaHoverEntered(btCancelarEncerrarContrato);
    }//GEN-LAST:event_btCancelarEncerrarContratoMouseEntered

    private void btCancelarEncerrarContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarEncerrarContratoMouseExited
        estilo.aplicaHoverExited(btCancelarEncerrarContrato);
    }//GEN-LAST:event_btCancelarEncerrarContratoMouseExited

    private void btContratoEncerrarBuscarContratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoEncerrarBuscarContratoMouseEntered
        estilo.aplicaHoverEntered(btContratoEncerrarBuscarContrato);
    }//GEN-LAST:event_btContratoEncerrarBuscarContratoMouseEntered

    private void btContratoEncerrarBuscarContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratoEncerrarBuscarContratoMouseExited
        estilo.aplicaHoverExited(btContratoEncerrarBuscarContrato);
    }//GEN-LAST:event_btContratoEncerrarBuscarContratoMouseExited

    private void btEncerrarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncerrarContratoActionPerformed
        cdlPn.show(pnCdTelas, "cdTelaEncerrarContrato");
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

    private void btContratoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContratoRegistrarActionPerformed
        String nomeCliente = tfContratoCadastroCliente.getText();
        String identificacao = ffContratoCadastroCpf.getText();
        String telefone = ffContratoCadastroTelefone.getText();
        String cep = ffContratoCadastroCep.getText();
        Endereco endereco = ConsultaCep.buscarCep(cep);
        if(!ckbClienteSemNumero.isSelected()){
            String numero = tfContratoCadastroNumero.getText();
            endereco.setNumero(Integer.parseInt(numero));
        }
        if(!tfContratoCadastroComplemento.getText().isEmpty()||!tfContratoCadastroComplemento.getText().equals("")){
            endereco.setComplemento(tfContratoCadastroComplemento.getText());
        }
        Cliente cliente = new Cliente(nomeCliente, identificacao, telefone, endereco);
        cliente.setId(clienteController.cadastrar(cliente));
        Contrato contrato = new Contrato();
        Date dateInicio = dcContratoCadastroDataInicio.getDate();
        Date dateFim = dcContratoCadastroDataFinal.getDate();
        LocalDate dataInicio = dateInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate dataFim = dateFim.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        contratoController.cadastrar(new Contrato(cliente, equipamentosContrato, dataInicio, dataFim));
    }//GEN-LAST:event_btContratoRegistrarActionPerformed

    private void ffContratoCadastroCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ffContratoCadastroCepFocusLost
        String cep = ffContratoCadastroCep.getText();
        Endereco endereco = ConsultaCep.buscarCep(cep);
        tfContratoCadastroBairro.setText(endereco.getBairro());
        tfContratoCadastroCidade.setText(endereco.getCidade().getNome());
        tfContratoCadastroLogradouro.setText(endereco.getLogradouro());
        cbContratoCadastroUf.setSelectedItem(endereco.getCidade().getUf());
    }//GEN-LAST:event_ffContratoCadastroCepFocusLost

    private void btRegistrarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarEquipamentoActionPerformed
        Equipamento equipamento = new Equipamento();

        if (tfEquipamentoNomeEquipamento.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Informe o nome do Equipamento!", "Cadastro de Equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            equipamento.setDescricao(tfEquipamentoNomeEquipamento.getText());
            System.out.println("TESTE nome: "+equipamento.getDescricao());
        }
        if ((Integer)jsEquipamentoQtdEstoque.getValue() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Informe a quantidade do Equipamento!", "Cadastro de Equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            equipamento.setQtdTotal((Integer)jsEquipamentoQtdEstoque.getValue());
            System.out.println("TESTE qtdtotal: "+equipamento.getQtdTotal());
        }

        if (ffEquipamentoValorDiario.getValue() == null || ffEquipamentoValorDiario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Informe o valor diário do Equipamento!", "Cadastro de Equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            equipamento.setVlrDiaria(((Number) ffEquipamentoValorDiario.getValue()).doubleValue());
            System.out.println("TESTE vlrdiaria: "+equipamento.getVlrDiaria());
        }
        if (ffEquipamentoValorMensal.getValue() == null || ffEquipamentoValorMensal.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Informe o valor mensal do Equipamento!", "Cadastro de Equipamento", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            equipamento.setVlrMensal(((Number) ffEquipamentoValorMensal.getValue()).doubleValue());
            System.out.println("TESTE vlrmensal: "+equipamento.getVlrMensal());
        }
    }//GEN-LAST:event_btRegistrarEquipamentoActionPerformed
     
    public void resetaEstadoComponentesCadastroContrato(){
        lbTituloContratoCadastroDataEntrega.setVisible(false);
        dcContratoCadastroDataEntrega.setVisible(false);
        btContratoCadastroTotalizacao.setVisible(false);
    }
    
    public void preencheTelaContrato(Contrato contrato){
    
    }
    
    public void preencheEquipamento(Equipamento equipamento){
        tfContratoCadastroEquipamento.setText(equipamento.getDescricao());
        equipamentosContrato.add(equipamento);
    }
    
    // metodos para limpeza dos componentes das telas
    public void limpaTelaContratoCadastro(){
        
    }
    
    public void limpaTelaContratoEncerrar(){
        
    }
    
    public void limpaTelaEquipamento(){
        
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
    private javax.swing.JButton btCancelarEncerrarContrato;
    private javax.swing.JButton btCancelarEquipamento;
    private javax.swing.JButton btClienteAlterar;
    private javax.swing.JButton btClienteBuscarCliente;
    private javax.swing.JButton btClienteCancelar;
    private javax.swing.JButton btClienteDeletar;
    private javax.swing.JButton btClienteSalvar;
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
    private javax.swing.ButtonGroup btgTipo;
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
    private javax.swing.JFormattedTextField ffContratoCadastroValor;
    private javax.swing.JFormattedTextField ffContratoEncerraMulta;
    private javax.swing.JFormattedTextField ffContratoEncerraValor;
    private javax.swing.JFormattedTextField ffContratoEncerraValorTotal;
    private javax.swing.JFormattedTextField ffContratoEncerrarCpf;
    private javax.swing.JFormattedTextField ffContratoEncerrarJuros;
    private javax.swing.JFormattedTextField ffEquipamentoValorDiario;
    private javax.swing.JFormattedTextField ffEquipamentoValorMensal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jsEquipamentoQtdEstoque;
    private javax.swing.JSpinner jsQtdEquipamento;
    private javax.swing.JLabel lbLogoHm;
    private javax.swing.JLabel lbLogoLg;
    private javax.swing.JLabel lbPerfil;
    private javax.swing.JLabel lbTituloCliente;
    private javax.swing.JLabel lbTituloClienteBairro;
    private javax.swing.JLabel lbTituloClienteCep;
    private javax.swing.JLabel lbTituloClienteCidade;
    private javax.swing.JLabel lbTituloClienteComplemento;
    private javax.swing.JLabel lbTituloClienteCpf;
    private javax.swing.JLabel lbTituloClienteIdCliente;
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
    private javax.swing.JLabel lbTituloContratoNovo;
    private javax.swing.JLabel lbTituloContratoNumero;
    private javax.swing.JLabel lbTituloContratoNumeroContrato;
    private javax.swing.JLabel lbTituloContratoQuantidade;
    private javax.swing.JLabel lbTituloContratoTelefone;
    private javax.swing.JLabel lbTituloContratoTipo;
    private javax.swing.JLabel lbTituloContratoTipoEncerramento;
    private javax.swing.JLabel lbTituloContratoUf;
    private javax.swing.JLabel lbTituloContratoValor;
    private javax.swing.JLabel lbTituloContratoValorTotal;
    private javax.swing.JLabel lbTituloEquipamento;
    private javax.swing.JLabel lbTituloEquipamentoNomeEquipamento;
    private javax.swing.JLabel lbTituloEquipamentoNovo;
    private javax.swing.JLabel lbTituloEquipamentoQtd;
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
    private javax.swing.JTextField tfClienteIdCliente;
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
    private javax.swing.JTextField tfNumeroDoContrato;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
