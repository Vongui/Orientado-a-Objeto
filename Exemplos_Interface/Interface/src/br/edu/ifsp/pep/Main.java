package br.edu.ifsp.pep;

import br.edu.ifsp.pep.model.Consulta;
import br.edu.ifsp.pep.model.Repositorio;
import br.edu.ifsp.pep.model.RepositorioBD;
import br.edu.ifsp.pep.model.RepositorioMemoria;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        
        Repositorio repositorio = new RepositorioBD();
        
        repositorio.gravar("xxx");
        System.out.println(repositorio.recuperar());
        
        Consulta consulta = new RepositorioMemoria();
        consulta.buscarTodos();
        
    }
}
