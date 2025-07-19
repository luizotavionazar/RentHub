package br.edu.iftm.renthub.control;

import java.sql.Connection;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import br.edu.iftm.renthub.dao.EquipamentoDAO;
import br.edu.iftm.renthub.model.Equipamento;
import br.edu.iftm.renthub.view.RegistrosLog;
import java.util.ArrayList;

public class EquipamentoController {
    private EquipamentoDAO equipamentoDAO;

    public EquipamentoController(Connection conexao) {
        this.equipamentoDAO = new EquipamentoDAO(conexao);
    }

    RegistrosLog log = new RegistrosLog();

    public boolean cadastrar(Equipamento equipamento) {
        log.registrarLog(1, "EquipamentoController", "cadastrar", "equipamento", "Cadastrando o equipamento: " + equipamento.getDescricao());
        try {
            if (equipamentoDAO.cadastrar(equipamento.getDescricao(), equipamento.getQtdTotal(),
                    equipamento.getVlrDiaria(), equipamento.getVlrMensal())) {
                log.registrarLog(2, "EquipamentoController", "cadastrar", "equipamento", "Equipamento: "+ equipamento.getDescricao() + " cadastrado com sucesso");
                return true;
            } else {
                log.registrarLog(3, "EquipamentoController", "cadastrar", "equipamento", "Não foi possivel cadastrar o equipamento: "+ equipamento.getDescricao());
                return false;
            }
        } catch (Exception e) {
            log.registrarLog(4, "EquipamentoController", "cadastrar", "equipamento", "Erro ao tentar cadastrar o equipamento: "+ e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean alterar(int id, Equipamento equipamentoAlterado) {
        log.registrarLog(1, "EquipamentoController", "alterar", "equipamento", "Alterando o equipamento: "+ id +" "+ equipamentoAlterado.getDescricao());
        try {
            if (equipamentoDAO.alterar(id, equipamentoAlterado.getDescricao(), equipamentoAlterado.getQtdTotal(),
                    equipamentoAlterado.getVlrDiaria(), equipamentoAlterado.getVlrMensal())) {
                log.registrarLog(2, "EquipamentoController", "alterar", "equipamento", "Equipamento: "+ id +" "+ equipamentoAlterado.getDescricao() + " alterado com sucesso");
                return true;
            } else {
                log.registrarLog(3, "EquipamentoController", "alterar", "equipamento", "Falha ao alterar o equipamento: "+ id +" "+ equipamentoAlterado.getDescricao());
                return false;
            }
        } catch (Exception e) {
            log.registrarLog(4, "EquipamentoController", "alterar", "equipamento", "Erro ao tentar alterar o equipamento: "+ e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean deletar(int id) {
        log.registrarLog(1, "EquipamentoController", "deletar", "equipamento", "Deletando o equipamento: "+ id);
        try {
            if (equipamentoDAO.deletar(id)) {
                log.registrarLog(2, "EquipamentoController", "deletar", "equipamento", "Equipamento: "+ id +" deletado com sucesso");
                return true;
            } else {
                log.registrarLog(3, "EquipamentoController", "deletar", "equipamento", "Falha ao deletar o equipamento: "+ id);
                return false;
            }
        } catch (Exception e) {
            log.registrarLog(4, "EquipamentoController", "deletar", "equipamento", "Erro ao tentar deletar o equipamento: "+ e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public Equipamento buscarPorId(int id) {
        log.registrarLog(1, "EquipamentoController", "buscarPorId", "equipamento", "Buscando o equipamento: " + id);
        try {
            Equipamento equipamento = equipamentoDAO.buscarPorId(id);
            if (equipamento != null) {
                log.registrarLog(2, "EquipamentoController", "buscarPorId", "equipamento", "Equipamento encontrado: " + equipamento.getDescricao());
            } else {
                log.registrarLog(3, "EquipamentoController", "buscarPorId", "equipamento", "Equipamento não encontrado");
            }
            return equipamento;
        } catch (Exception e) {
            log.registrarLog(4, "EquipamentoController", "buscarPorId", "equipamento", "Erro ao buscar o equipamento: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public List<Equipamento> listar(String descricao) {
        log.registrarLog(1, "EquipamentoController", "listar", "equipamento", "Listando os equipamentos");
        StringBuilder sqlFiltro = new StringBuilder();
        List<Object> filtros = new ArrayList<>();
        if (!descricao.isEmpty() || !descricao.equals("")) {
            sqlFiltro.append("AND descricao LIKE ? ");
            filtros.add("%"+ descricao +"%");
        }
        try {
            return equipamentoDAO.listar(sqlFiltro.toString(), filtros);
        } catch (Exception e) {
            log.registrarLog(4, "EquipamentoController", "listar", "equipamento", "Erro ao listar os equipamentos: "+ e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public boolean verificarSaldo(int id, int qtdContrato) {
        //log.registrarLog(1, "EquipamentoController", "buscarPorId", "equipamento", "Buscando o equipamento: " + id);
        try {
            Integer qtdDisponivel = equipamentoDAO.buscarQtdDisponivel(id);
            if (qtdDisponivel != null) {
                //log.registrarLog(2, "EquipamentoController", "buscarPorId", "equipamento", "Equipamento encontrado: " + equipamento.getDescricao());
                if (qtdDisponivel >= qtdContrato) {
                    return true;
                } else {
                    return false;
                }
            } else {
                //log.registrarLog(3, "EquipamentoController", "buscarPorId", "equipamento", "Equipamento não encontrado");
                return false;
            }
        } catch (Exception e) {
            //log.registrarLog(4, "EquipamentoController", "buscarPorId", "equipamento", "Erro ao buscar o equipamento: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean buscarInclusaoTabela(DefaultTableModel modeloTabelaEquipamento, Equipamento equipamentoInclusao) {
        //log.registrarLog(1, "EquipamentoController", "buscarPorId", "equipamento", "Buscando o equipamento: " + id);
        for (int i = 0; i < modeloTabelaEquipamento.getRowCount(); i++) {
            Object coluna = modeloTabelaEquipamento.getValueAt(i, 0);
            if (coluna != null && coluna instanceof Integer) {
                if ((int)coluna == equipamentoInclusao.getId()) {
                    return false;
                }
            }
        }
        return true;
    }
}
