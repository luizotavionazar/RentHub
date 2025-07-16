package br.edu.iftm.renthub.dao;

import br.edu.iftm.renthub.view.RegistrosLog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnderecoDAO {
    private final Connection conexaoBanco;

    RegistrosLog log = new RegistrosLog();

    public EnderecoDAO(Connection conexao) {
        this.conexaoBanco = conexao;
    }

    public boolean cadastrar(String cep, String ibge, String logradouro, String bairro, Integer numero, String complemento) throws SQLException {
        log.registrarLog(1, "EnderecoDAO", "cadastrar", "endereco", "Cadastrando o endereco no banco de dados");
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO endereco (cep, id_ibge, logradouro, bairro, numero, complemento) ");
        query.append("VALUES (?, ?, ?, ?, ?, ?) ");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(query.toString())) {
            stmt.setString(1, cep);
            stmt.setString(2, ibge);
            stmt.setString(3, logradouro);
            stmt.setString(4, bairro);
            if (numero == null) {
                stmt.setNull(5, java.sql.Types.INTEGER);
            } else {
                stmt.setInt(5, numero);
            }
            stmt.setString(6, complemento);
            stmt.executeUpdate();
            log.registrarLog(2, "EnderecoDAO", "cadastrar", "endereco", "Endereço cadastrado no banco de dados");
            return true;
        } catch (SQLException e) {
            log.registrarLog(4, "EnderecoDAO", "cadastrar", "endereco", "Erro ao cadastrar o endereço no Banco de Dados: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
