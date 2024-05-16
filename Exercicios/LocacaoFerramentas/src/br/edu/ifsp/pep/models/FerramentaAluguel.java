package br.edu.ifsp.pep.models;

/**
 *
 * @author aluno
 */
public class FerramentaAluguel extends Ferramenta {
    private int numeroPatrimonio;

    public FerramentaAluguel(int numeroPatrimonio, String nome, double valor) {
        super(nome, valor);
        this.numeroPatrimonio = numeroPatrimonio;
    }

    public int getNumeroPatrimonio() {
        return numeroPatrimonio;
    }

    public void setNumeroPatrimonio(int numeroPatrimonio) {
        this.numeroPatrimonio = numeroPatrimonio;
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
