
package model.bean;

// @author Douglas

public class Funcao {
    
    private int idFuncao;
    private String descricao;

    public Funcao() {
    }

    public Funcao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdFuncao() {
        return idFuncao;
    }

    public void setIdFuncao(int idfuncao) {
        this.idFuncao = idfuncao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.getDescricao();
    }
}
