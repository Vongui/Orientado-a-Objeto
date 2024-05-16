package br.edu.ifsp.pep.models;

/**
 *
 * @author aluno
 */
public class Ferramenta {
    private int codigo;
    private String nome;
    private double valor;
    
    private static int incremento = 1;

    public Ferramenta(String nome, double valor) {
        this.codigo = incremento++;
        this.nome = nome;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
