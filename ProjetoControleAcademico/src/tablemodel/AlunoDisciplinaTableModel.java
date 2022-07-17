
package tablemodel;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.AlunoDisciplina;

/**
 *
 * @author Douglas
 */
public class AlunoDisciplinaTableModel extends AbstractTableModel{
    
    private List<AlunoDisciplina> listaAlunoDisciplinas;
    private String[] colunas = {"Aluno", "Disciplina", "Ano", "Semestre", "Nota 1", "Nota 2", "Media", "Faltas"};
    
    public AlunoDisciplinaTableModel() {
        listaAlunoDisciplinas = new ArrayList<>();
    }
    
    public AlunoDisciplinaTableModel(List<AlunoDisciplina> alunoDisciplina) {
        this();
        this.listaAlunoDisciplinas.addAll(alunoDisciplina);
    }
    
    @Override
    public int getRowCount() {
        return listaAlunoDisciplinas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        AlunoDisciplina alunoDisciplina = listaAlunoDisciplinas.get(linha);
        switch (coluna) {
            case 0: return alunoDisciplina.getAluno().getNome();
            case 1: return alunoDisciplina.getDisciplina().getNome();
            case 2: return alunoDisciplina.getAno();
            case 3: return alunoDisciplina.getSemestre();
            case 4: return alunoDisciplina.getNota1();
            case 5: return alunoDisciplina.getNota2();
            case 6: return ((alunoDisciplina.getNota1() + alunoDisciplina.getNota2()) /2);
            case 7: return alunoDisciplina.getFaltas();
            default: return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public AlunoDisciplina getAlunoDisciplina (int linha) {
        if (linha >= listaAlunoDisciplinas.size()) {
            return null;
        }
        return listaAlunoDisciplinas.get(linha);
    }
}
