package br.edu.ifsp.pep.models;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Venda {
    private LocalDate datavenda;
    private int quantidadeItens;
    private Cliente cliente;
    
    //private ArrayList<ItensVendidos> itens;

    public Venda(LocalDate datavenda, int quantidadeItens, Cliente cliente) {
        this.datavenda = datavenda;
        this.quantidadeItens = quantidadeItens;
        this.cliente = cliente;
        //this.itens = new ArrayList<>();
    }

    public LocalDate getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(LocalDate datavenda) {
        this.datavenda = datavenda;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /*
    public ArrayList<ItensVendidos> getItens() {;
        return itens;
    }
    
    public void adicionar(ItensVendidos item){
        this.itens.add(item);
    }

    public void setItens(ArrayList<ItensVendidos> itens) {
        this.itens = itens;
    }
    */
    
}
