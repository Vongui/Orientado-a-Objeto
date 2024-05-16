package br.edu.ifsp.pep.models;

/**
 *
 * @author aluno
 */
public class ItensAlugados {
    private Locacao locacao;
    private FerramentaAluguel ferramenAluguel;

    public ItensAlugados(Locacao locacao, FerramentaAluguel ferramenAluguel) {
        this.locacao = locacao;
        this.ferramenAluguel = ferramenAluguel;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public FerramentaAluguel getFerramenAluguel() {
        return ferramenAluguel;
    }

    public void setFerramenAluguel(FerramentaAluguel ferramenAluguel) {
        this.ferramenAluguel = ferramenAluguel;
    }
    
}
