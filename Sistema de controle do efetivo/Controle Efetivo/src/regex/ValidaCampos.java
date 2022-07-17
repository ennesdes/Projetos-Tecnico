
package regex;

/**
 *
 * @author Douglas
 */
public class ValidaCampos {
    
    public static boolean validaNome (String nome){
        return nome.matches("\\p{Upper}[\\p{IsLatin}[ ]]+"); //Upper para iniciar com letra maiúscula, IsLatin para ser do alfabeto latino e podendo repetir infinitamente
    }
    
    public static boolean validaEndereco (String endereco){
        return endereco.matches("\\p{Upper}[\\p{IsLatin}\\p{Alnum}[ ][,-]]+"); //Alnum para aceitar alfanuméricos
    }
    
    public static boolean validaEmail (String email){
        return email.matches("([\\p{Alnum}\\._-])+@([\\p{Alnum}])+(\\.([\\p{Alnum}])+)*");
    }
    
    public static boolean validaFone (String fone){
        return fone.matches("\\(\\p{Digit}{2}\\)\\s\\p{Digit}{4,5}-\\p{Digit}{4}");
    }
    
    public static boolean validaCPF (String cpf){
        return cpf.matches("\\p{Digit}{3}.\\p{Digit}{3}.\\p{Digit}{3}-\\p{Digit}{2}");
    }
    
    public static boolean validaTipo (String tipo){
        return tipo.matches("\\p{Upper}[\\p{IsLatin}\\p{Alnum}[ ][,-]]+");
    }
    
    public static boolean validaPeriodo (String periodo){
        return periodo.matches("\\p{Digit}{2}/\\p{Digit}{2}/\\p{Digit}{4}\\sa\\s\\p{Digit}{2}/\\p{Digit}{2}/\\p{Digit}{4}");
    }
    
    public static boolean validaSituacao (String situacao){
        return situacao.matches("\\p{Upper}[\\p{IsLatin}[ ]]+");
    }
}
