package br.edu.ifsp.pep.models;

import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class ControlerVenda {
    private static ArrayList<ItensVendidos> item = new ArrayList<>();

    public static ArrayList<ItensVendidos> getItem() {
        return item;
    }

    public static void setItem(ArrayList<ItensVendidos> item) {
        ControlerVenda.item = item;
    }
    
    public void cadastrar(ItensVendidos vendidos){
        this.item.add(vendidos);
    }
    
    public double calcularTotalCliente(String cpf){
        double total = 0;
       
            for (ItensVendidos itensVendidos : item) {
                if (cpf.equals(itensVendidos.getVenda().getCliente().getCpf()) ) {
                    total += (itensVendidos.getFerramentaVenda().getValor() * itensVendidos.getVenda().getQuantidadeItens() );
                }
            }
        
       return total;
    }
    
    public int calcularQuantidadeFerramenta(int codigo){
        int total = 0;
        
        for (ItensVendidos itensVendidos : item) {
            if (codigo == itensVendidos.getFerramentaVenda().getCodigo()) {
                total += itensVendidos.getVenda().getQuantidadeItens();
            }    
        }
        return total;
    }
}
