/*
 Desenvolva um programa para uma empresa que vende e aluga ferramentas para construção civil. 
Em uma venda ou em um aluguel pode conter várias ferramentas. As ferramentas para venda contém um código, 
nome e valor. As ferramentas para aluguel contém código, nome, valor da diária do aluguel, número de patrimônio. 
Em uma locação (aluguel) deve ser guardado a data da locação, a data da devolução, valor da diária, o funcionário e o 
cliente que fez a locação. Uma ferramenta não pode ser alugada para duas ou mais pessoas ao mesmo tempo. Em uma venda 
deve ser guardada a data da venda, a quantidade de itens (ferramentas) vendidos e o cliente que comprou. O cliente possui 
cpf, nome, email, telefone e um limite. O funcionário possui cpf, nome, email, telefone, cargo e salário.

Crie métodos para resolver os seguintes problemas:

- Crie dois clientes e dois funcionários;

- Crie 3 ferramentas e 4 ferramentas de aluguel;

- Realizar 4 vendas de ferramentas e 4 aluguéis para ferramentas

- Apresentar as locações e compras de um cliente;

- Total gasto por um cliente (incluindo compra e locação);

- Quantidade vendida de uma ferramenta;

- Total recebido de locações por um funcionário. 
*/
package br.edu.ifsp.pep;

import br.edu.ifsp.pep.models.Cliente;
import br.edu.ifsp.pep.models.ControlerLocacao;
import br.edu.ifsp.pep.models.ControlerVenda;
import br.edu.ifsp.pep.models.FerramentaAluguel;
import br.edu.ifsp.pep.models.FerramentaVenda;
import br.edu.ifsp.pep.models.Funcionario;
import br.edu.ifsp.pep.models.ItensAlugados;
import br.edu.ifsp.pep.models.ItensVendidos;
import br.edu.ifsp.pep.models.Locacao;
import br.edu.ifsp.pep.models.Venda;
import java.time.LocalDate;

/**
 *
 * @author Vongui
 */
public class Main {
    
   
    private static ControlerLocacao controladorItensAlugados = new ControlerLocacao();
    private static ControlerVenda controladorItensVendidos = new ControlerVenda();
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("123", "joao", "joao@gmail.com", "(11) 123", 20);
         
        Funcionario f1 = new Funcionario("456", "tony@gmail.com", "tony", "(11) 456", "vendedor", 2100);
        
        FerramentaVenda fv1 = new FerramentaVenda("machado", 10);
        FerramentaVenda fv2 = new FerramentaVenda("martelo", 5);
        
        FerramentaAluguel fa1 = new FerramentaAluguel(21, "Marreta", 15);
        FerramentaAluguel fa2 = new FerramentaAluguel(20, "Chave Phillips", 12);
        
        Venda v1 = new Venda(LocalDate.now(), 2, c1);
        ItensVendidos iv1 = new ItensVendidos(v1, fv1);
        //v1.adicionar(iv1);
        
        Venda v2 = new Venda(LocalDate.now(), 3, c1);
        ItensVendidos iv2 = new ItensVendidos(v2, fv2);
        //v2.adicionar(iv2);
        
        Locacao l1 = new Locacao(LocalDate.now(), LocalDate.now().plusDays(4), 10, c1, f1);
        ItensAlugados ia1 = new ItensAlugados(l1, fa2);
        
        Locacao l2 = new Locacao(LocalDate.now(), LocalDate.now().plusDays(6), 8, c1, f1);
        ItensAlugados ia2 = new ItensAlugados(l2, fa1);
        
      
        
        controladorItensVendidos.cadastrar(iv1);
        controladorItensVendidos.cadastrar(iv2);
        controladorItensAlugados.cadastrar(ia1);
        controladorItensAlugados.cadastrar(ia2);
        apresentarCalculoTotal("123");
        apresentarVendasCliente("123", controladorItensVendidos);
        apresentarLocacoesCliente("123", controladorItensAlugados);
        apresentarQuantidadeVendida(1);
        apresentarTotalLocacaoFuncionario("456");
        
    }
    
    
    public static void apresentarVendasCliente(String cpf, ControlerVenda controladorV){
        System.out.println("==========Compras==========");
        for (ItensVendidos itensVendidos : controladorV.getItem()) {
            if (cpf.equals(itensVendidos.getVenda().getCliente().getCpf())) {
                System.out.println("Ferramenta: " + itensVendidos.getFerramentaVenda().getNome() + " Quantidade: " 
                        + itensVendidos.getVenda().getQuantidadeItens());
            }
        }
    }
    
    public static void apresentarLocacoesCliente(String cpf, ControlerLocacao controladorL){
        System.out.println("==========Locacoes==========");
        for (ItensAlugados itensAlugados : controladorL.getItem()) {
            if (cpf.equals(itensAlugados.getLocacao().getCliente().getCpf())) {
                System.out.println("Ferramenta: "+itensAlugados.getFerramenAluguel().getNome()+" Funcionario: "+
                        itensAlugados.getLocacao().getFuncionario().getNome()+" Data Locacao: "+itensAlugados.getLocacao().getDataLocacao()+
                        " Data Devolucao: "+itensAlugados.getLocacao().getDataDevolucao());
            }
        }
    }
    
    public static void apresentarCalculoTotal(String cpf){
        double total = 0;
        total += controladorItensVendidos.calcularTotalCliente("123");
        total += controladorItensAlugados.calcularTotalCliente("123");
        System.out.println("Total de compras: "+ controladorItensAlugados.calcularTotalCliente("123"));
    }
    
    public static void apresentarQuantidadeVendida(int codigo){
        System.out.println("Quantidade vendida : " + controladorItensVendidos.calcularQuantidadeFerramenta(codigo));
    }
    
    public static void apresentarTotalLocacaoFuncionario(String cpf){
        System.out.println("Total de locacao pelo funcionario: "+ controladorItensAlugados.calcularTotalLocacaoFuncionario(cpf));
    }
}
