package br.edu.iftm.renthub.control;

import java.sql.Connection;

import br.edu.iftm.renthub.dao.UsuarioDAO;
import br.edu.iftm.renthub.model.Usuario;
import br.edu.iftm.renthub.view.RegistrosLog;

import org.mindrot.jbcrypt.BCrypt;

public class UsuarioController {
    private UsuarioDAO usuarioDAO;
    
    public UsuarioController(Connection conexao) {
        this.usuarioDAO = new UsuarioDAO(conexao);
    }

    RegistrosLog log = new RegistrosLog();

    public boolean cadastrar(Usuario usuario) {
        log.registrarLog(1, "UsuarioController", "cadastrar", "usuario", "Cadastrando o usuário: " + usuario.getNome());
        String senhaCripto = BCrypt.hashpw(new String(usuario.getSenha()), BCrypt.gensalt());
        try {
            if (usuarioDAO.cadastrar(usuario.getNome(), senhaCripto)) {
                log.registrarLog(2, "UsuarioController", "cadastrar", "usuario", "Usuário: "+ usuario.getNome() +" cadastrado com sucesso");
                return true;
            } else {
                log.registrarLog(3, "UsuarioController", "cadastrar", "usuario", "Não foi possivel cadastrar o usuário: " + usuario.getNome());
                return false;
            }
        } catch (Exception e) {
            log.registrarLog(4, "UsuarioController", "cadastrar", "usuario", "Erro ao tentar cadastrar o usuário: " + e.getMessage());
            e.printStackTrace();
            return false;
        }   
    }

    public boolean buscar(Usuario usuario) {
        log.registrarLog(1, "UsuarioController", "buscar", "usuario", "Buscando o usuario: " + usuario.getNome());
        try {
            if (usuarioDAO.buscarNome(usuario.getNome()) != null) {
                log.registrarLog(2, "UsuarioController", "buscar", "usuario", "Usuario: "+ usuario.getNome() +" localizado com sucesso");
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            log.registrarLog(4, "UsuarioController", "buscar", "usuario", "Erro ao tentar buscar o usuário: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean autenticar(Usuario usuario) {
        log.registrarLog(1, "UsuarioController", "autenticar", "usuario", "Autenticando o usuário "+ usuario.getNome());
        try {
            String senhaUsuarioBd = usuarioDAO.buscarSenha(usuario.getNome());
            if (senhaUsuarioBd != null) {
                String senhaCripto = new String(usuario.getSenha());
                if (BCrypt.checkpw(senhaCripto, new String(senhaUsuarioBd))) {
                    log.registrarLog(2, "UsuarioController", "autenticar", "usuario", "Usuário: "+ usuario.getNome() +" autenticado com sucesso");
                    return true;
                } else {
                    log.registrarLog(3, "UsuarioController", "autenticar", "usuario", "Usuário: "+ usuario.getNome() +" não autenticado");
                    return false;
                }
            } else {
                log.registrarLog(3, "UsuarioController", "autenticar", "usuario", "Usuário: "+ usuario.getNome() +" não encontrado");
                return false;
            }
        } catch (Exception e) {
            log.registrarLog(4, "UsuarioController", "autenticar", "usuario", "Erro ao tentar autenticar o usuário: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
