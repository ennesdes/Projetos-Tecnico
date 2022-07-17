
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
        return fone.matches("\\(\\p{Digit}{2}\\)\\s\\p{Digit}{4,5}-\\p{Digit}{4}");// \\s é um espaço
    }
    
    public static boolean validaMatricula (String matricula){
        return matricula.matches("\\p{Alnum}+");
    }
    
    public static boolean validaCurso (String curso){
        return curso.matches("\\p{Upper}[\\p{IsLatin}[ ]]+");
    }
    
}
