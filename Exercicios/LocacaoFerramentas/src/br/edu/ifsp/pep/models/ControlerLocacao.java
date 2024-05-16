package br.edu.ifsp.pep.models;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class ControlerLocacao {
    private static ArrayList<ItensAlugados> item = new ArrayList<>();

    public static ArrayList<ItensAlugados> getItem() {
        return item;
    }

    public static void setItem(ArrayList<ItensAlugados> item) {
        ControlerLocacao.item = item;
    }
    
    public void cadastrar(ItensAlugados alugados){
        this.item.add(alugados);
    }
    
    public double calcularTotalCliente(String cpf){
        double total = 0;
        
        for (ItensAlugados itensAlugados : item) {
            if (cpf.equals(itensAlugados.getLocacao().getCliente().getCpf())) {
                total += ( calcularDiaria() * itensAlugados.getLocacao().getValorDiaria());
            }
        }
        return total;
    }
    
    public int calcularDiaria(){
        int diaria = 0;
        for (ItensAlugados itensAlugados : item) {
            Period periodo = Period.between(itensAlugados.getLocacao().getDataLocacao() ,itensAlugados.getLocacao().getDataDevolucao());
            diaria = periodo.getDays();
        }
        return diaria;
    }
    
    public int calcularTotalLocacaoFuncionario(String cpf){
        int total = 0;
        for (ItensAlugados itensAlugados : item) {
            if (cpf.equals(itensAlugados.getLocacao().getFuncionario().getCpf())) {
                total++;
            }
        }
        return total;
    }
}
