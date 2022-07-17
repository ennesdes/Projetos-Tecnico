
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Funcao;

/**
 *
 * @author Douglas
 */
public class FuncaoTableModel extends AbstractTableModel{
    
    private List<Funcao> listaFuncao;
    private String[] colunas = {"ID", "Função"};

    public FuncaoTableModel() {
        listaFuncao = new ArrayList<>();
    }
    
    public FuncaoTableModel(List<Funcao> listaFuncao) {
        this();
        this.listaFuncao = listaFuncao;
    }

    @Override
    public int getRowCount() {
        return listaFuncao.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
         Funcao funcao = listaFuncao.get(linha);
        switch (coluna) {
            case 0: return funcao.getIdFuncao();
            case 1: return funcao.getDescricao();
            default: return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public Funcao getFuncao (int linha) {
        if (linha >= listaFuncao.size()) {
            return null;
        }
        return listaFuncao.get(linha);
    }
    
    
    
}
