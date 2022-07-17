
package tablemodel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.bean.Aluno;

/**
 *
 * @author Douglas
 */
public class AlunoTableModel extends AbstractTableModel{
    
    private ArrayList<Aluno> listaAlunos;
    private String[] colunas = {"Nome", "Endereço", "Fone", "E-mail", "Matricula", "Curso"};

    public AlunoTableModel() {        
        listaAlunos = new ArrayList<>();        
    }
    
    public AlunoTableModel(ArrayList<Aluno> alunos) {
        this();
        this.listaAlunos.addAll(alunos);
    }

    @Override
    public int getRowCount() {
        return listaAlunos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        Aluno aluno = listaAlunos.get(linha);
        switch (coluna) {
            case 0:
                return aluno.getNome();
            case 1:
                return aluno.getEndereco();
            case 2:
                return aluno.getFone();
            case 3:
                return aluno.getEmail();
            case 4:
                return aluno.getMatricula();
            case 5:
                return aluno.getCurso();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public Aluno getAluno (int linha) {
        if (linha >= listaAlunos.size()) {
            return null;
        }
        return listaAlunos.get(linha);
    }
    
}
