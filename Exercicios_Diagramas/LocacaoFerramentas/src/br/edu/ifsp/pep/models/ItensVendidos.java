package br.edu.ifsp.pep.models;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ItensVendidos {
    
    private Venda venda;
    private FerramentaVenda ferramentaVenda;
    
    public ItensVendidos(Venda venda, FerramentaVenda ferramentaVenda) {
        this.venda = venda;
        this.ferramentaVenda = ferramentaVenda;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public FerramentaVenda getFerramentaVenda() {
        return ferramentaVenda;
    }

    public void setFerramentaVenda(FerramentaVenda ferramentaVenda) {
        this.ferramentaVenda = ferramentaVenda;
    }
    
}
