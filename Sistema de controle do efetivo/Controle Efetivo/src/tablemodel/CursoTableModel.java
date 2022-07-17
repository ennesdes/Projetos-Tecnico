
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Curso;

/**
 *
 * @author Douglas
 */
public class CursoTableModel extends AbstractTableModel{
    
    private List<Curso> listaCurso;
    private String[] colunas = {"Nome", "Local", "Periodo", "Situação"};

    public CursoTableModel() {
        listaCurso = new ArrayList<>();
    }
    
    public CursoTableModel(List<Curso> listaCurso) {
        this();
        this.listaCurso.addAll(listaCurso);
    }

    @Override
    public int getRowCount() {
        return listaCurso.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Curso curso = listaCurso.get(linha);
        switch (coluna) {
            case 0: return curso.getNome();
            case 1: return curso.getLocal();
            case 2: return curso.getPeriodo();
            case 3: return curso.getSituacao();
            default: return "";
        }    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public Curso getCurso (int linha) {
        if (linha >= listaCurso.size()) {
            return null;
        }
        return listaCurso.get(linha);
    }
    
}
