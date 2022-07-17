
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Matricula;

/**
 *
 * @author Douglas
 */
public class MatriculaTableModel extends AbstractTableModel {
    
    private List<Matricula> listaMatriculas;
    private String[] colunas = {"Curso", "Funcionário", "Matricula"};

    public MatriculaTableModel() {
        listaMatriculas = new ArrayList<>();
    }
    
    public MatriculaTableModel(List<Matricula> listaMatriculas) {
        this();
        this.listaMatriculas.addAll(listaMatriculas);
    }
    
    

   @Override
    public int getRowCount() {
        return listaMatriculas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        Matricula mat = listaMatriculas.get(linha);
        switch (coluna) {
            case 0: return mat.getCurso().getNome();
            case 1: return mat.getFuncionario().getNome();
            case 2: return mat.getMatricula();
            default: return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public Matricula getMatricula (int linha) {
        if (linha >= listaMatriculas.size()) {
            return null;
        }
        return listaMatriculas.get(linha);
    }
    
}
