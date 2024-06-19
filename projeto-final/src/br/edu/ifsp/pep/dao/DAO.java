package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Pessoa;
import java.util.List;

/**
 *
 * @author aluno
 */
public interface DAO {
    
    public void adicionar(Pessoa pessoa);
    
    public List<Pessoa> getTodos();
    
    public void remover(int codigo) throws Exception;
    
    public void alterar(Pessoa pessoa) throws Exception;
    
    public List<Pessoa> getPessoasOrdenadasPeloNome();
    
    public List<Pessoa> consultarPeloNome(String nome);
    
    public Pessoa getPessoa(int codigo) throws Exception;
    
    public Pessoa validarAcesso(String login, String senha) throws Exception;
    
}
