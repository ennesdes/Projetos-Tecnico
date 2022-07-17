
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Funcionario;

/**
 *
 * @author Douglas
 */
public class FuncionarioTableModel extends AbstractTableModel {
    
    private List<Funcionario> listaFuncionarios;
    private String[] colunas = {"Nome", "CPF", "Celular", "E-mail", "Endereço", "Função"};

    public FuncionarioTableModel() {
        listaFuncionarios = new ArrayList<>();
    }

    public FuncionarioTableModel(List<Funcionario> listaFuncionarios) {
        this();
        this.listaFuncionarios = listaFuncionarios;
    }

    @Override
    public int getRowCount() {
        return listaFuncionarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Funcionario funcionario = listaFuncionarios.get(linha);
        switch (coluna) {
            case 0: return funcionario.getNome();
            case 1: return funcionario.getCpf();
            case 2: return funcionario.getCelular();
            case 3: return funcionario.getEmail();
            case 4: return funcionario.getEndereco();
            case 5: return funcionario.getFuncao();
            default: return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public Funcionario getFuncionario (int linha) {
        if (linha >= listaFuncionarios.size()) {
            return null;
        }
        return listaFuncionarios.get(linha);
    }

    
}
