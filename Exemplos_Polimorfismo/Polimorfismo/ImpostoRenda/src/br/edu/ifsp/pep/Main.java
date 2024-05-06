/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep;

import br.edu.ifsp.pep.models.Pessoa;
import br.edu.ifsp.pep.models.PessoaFisica;
import br.edu.ifsp.pep.models.PessoaJuridica;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {
    
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();
    private static Scanner leia = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        
        adicionarPj();
        
        //adicionarPf();
        
        apresentarRendaLiquida();
    }
    
    public static void adicionarPj(){
        double renda, gastoEqui, gastoPag;
        
        PessoaJuridica pj = new PessoaJuridica();
        System.out.print("Digite a renda bruta: ");
        renda = leia.nextDouble();
        System.out.print("Digite o gasto com equipamentos: ");
        gastoEqui = leia.nextDouble();
        System.out.print("Digite o gasco com Pagamento de pessoal: ");
        gastoPag = leia.nextDouble();
        pj.setRendaBruta(renda);
        pj.setGastoEquipamento(gastoEqui);
        pj.setGastoPagamento(gastoPag);
        pessoas.add(pj);
    }
    
//    private static void adicionarPf() {
//        double renda;
//    }
        
    public static void apresentarRendaLiquida(){
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof PessoaJuridica pj) {
                System.out.println("Imposto de renda: " + "R$ "+pj.calcularImposto());
            }
            if (pessoa instanceof PessoaFisica pf) {
                System.out.println("Imposto de renda: " +"R$ ");
            }
        }
    }

}
