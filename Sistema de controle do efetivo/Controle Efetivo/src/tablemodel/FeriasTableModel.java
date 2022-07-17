
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Ferias;

/**
 *
 * @author Douglas
 */
public class FeriasTableModel extends AbstractTableModel{
    
    private List<Ferias> listaFerias;
    private String[] colunas = {"Funcionário", "Tipo", "P. Aquisitivo", "Período", "Situação"};

    public FeriasTableModel() {
        listaFerias = new ArrayList<>();
    }

    public FeriasTableModel(List<Ferias> listaFerias) {
        this();
        this.listaFerias = listaFerias;
    }
    
    @Override
    public int getRowCount() {
        return listaFerias.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        Ferias ferias = listaFerias.get(linha);
        switch (coluna) {
            case 0: return ferias.getFuncionario();
            case 1: return ferias.getTipo();
            case 2: return ferias.getAquisitivo();
            case 3: return ferias.getPeriodo();
            case 4: return ferias.getSituacao();
            default: return "";
        }    
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public Ferias getFerias (int linha) {
        if (linha >= listaFerias.size()) {
            return null;
        }
        return listaFerias.get(linha);
    }
    
}
