package br.edu.ifsp.pep.models;

/**
 *
 * @author aluno
 */
public class FerramentaVenda extends Ferramenta{

    public FerramentaVenda(String nome, double valor) {
        super(nome, valor);
    }
    
    @Override
    public void setValor(double valor) {
        super.setValor(valor);
    }

    @Override
    public double getValor() {
        return super.getValor(); 
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setCodigo(int codigo) {
        super.setCodigo(codigo);
    }

    @Override
    public int getCodigo() {
        return super.getCodigo();
    }

    
}
