package br.edu.ifsp.pep.model;

/**
 *
 * @author aluno
 */
public interface Repositorio {
    //até jdk 7
    //metodos devem ser abstratos
    //não possui instancia -> construtor
        
    
    public void gravar(String a);
    public String recuperar();
    
}
