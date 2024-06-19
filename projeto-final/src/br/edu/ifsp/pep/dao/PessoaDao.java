package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Pessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PessoaDao implements DAO {

    private static int codigo = 0;
    //Armazenamento dos dados
    private List<Pessoa> pessoas = new ArrayList<>();

    @Override
    public void adicionar(Pessoa pessoa) {
        pessoa.setCodigo(++codigo);
        this.pessoas.add(pessoa);
    }

    @Override
    public List<Pessoa> getTodos() {
        return this.pessoas;
    }

    @Override
    public void remover(int codigo) throws Exception {
        Pessoa pessoa = getPessoa(codigo);
        this.pessoas.remove(pessoa);
    }

    @Override
    public void alterar(Pessoa pessoa) throws Exception {
        Pessoa p = getPessoa(pessoa.getCodigo());
        p = pessoa;
    }

    @Override
    public List<Pessoa> getPessoasOrdenadasPeloNome() {
        Collections.sort(pessoas);
        return pessoas;
    }

    @Override
    public Pessoa getPessoa(int codigo) throws Exception {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCodigo() == codigo) {
                return pessoa;
            }
        }
        throw new Exception("Pessoa não encontrada.");
    }

    @Override
    public List<Pessoa> consultarPeloNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pessoa validarAcesso(String login, String senha) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
