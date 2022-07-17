
package tablemodel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.bean.Disciplina;

/**
 *
 * @author Douglas
 */
public class DisciplinaTableModel extends AbstractTableModel{
    
    private ArrayList<Disciplina> listaDisciplinas;
    private String[] colunas = {"Nome", "Código", "Carga Horária"};

    public DisciplinaTableModel() {
        listaDisciplinas = new ArrayList<>();
    }

    public DisciplinaTableModel(ArrayList<Disciplina> disciplinas) {
        this();
        this.listaDisciplinas.addAll(disciplinas);
    }
    
    @Override
    public int getRowCount() {
        return listaDisciplinas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna) {
        
        Disciplina disciplina = listaDisciplinas.get(linha);
        switch (coluna) {
            case 0:
                return disciplina.getNome();
            case 1:
                return disciplina.getCodigo();
            case 2:
                return disciplina.getCargaHoraria();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public Disciplina getDisciplina (int linha) {
        if (linha >= listaDisciplinas.size()) {
            return null;
        }
        return listaDisciplinas.get(linha);
    }

    
}
