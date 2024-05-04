package br.ifsp.edu.pep;

import br.ifsp.edu.pep.modelo.ContaCorrente;
import br.ifsp.edu.pep.controller.Controler;
import br.ifsp.edu.pep.modelo.ContaCorrenteEspecial;
import br.ifsp.edu.pep.modelo.ContaPoupanca;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Principal {
  
    
    private static Scanner leia = new Scanner(System.in);
    private static Controler controlador = new Controler();

    public static void main(String[] args) {

        int escolha;
        
        do {
            escolha = menu();
            switch (escolha) {
                case 1:
                    cadastro();
                    break;
                case 2:
                    depositarValor();
                    break;
                case 3:
                    sacarValor();
                    break;
                case 4:
                    transferencia();
                    break;
                case 5:
                    mostrarSaldo();
                    break;
                default:
                    System.out.println("\nDigite uma opção valida");
                    break;
            }
        } while (escolha != 0);
    }

    public static int menu() {
        int escolha;

        System.out.println("0 - Sair");
        System.out.println("1 - Cadastrar conta");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Transferência entre contas");
        System.out.println("5 - Mostrar saldo");
        System.out.print("Escolha: ");

        escolha = leia.nextInt();

        return escolha;
    }
    
    public static int menuConta(){
        int escolha;
        
        System.out.println("1 - Conta corrente");
        System.out.println("2 - Conta corrente especial");
        System.out.println("3 - Conta poupança");
        System.out.print("Escolha: ");
        do {            
            escolha = leia.nextInt();
        } while (escolha > 3 || escolha < 1);
        
        
        return escolha;
    }
    
    public static void cadastro(){
    String nome, email , telefone;
    int numeroAgencia, numeroConta, ano, mes, dia; 
        
        switch (menuConta()) {
            case 1:
                leia.nextLine();
                System.out.print("\nDigite o nome: ");
                nome = leia.nextLine();
                System.out.print("Digite o email: ");
                email = leia.nextLine();
                System.out.print("Digite o telefone: ");
                telefone = leia.nextLine();
                System.out.print("Digite o dia: ");
                dia = leia.nextInt();
                System.out.print("Digite o mes: ");
                mes = leia.nextInt();
                System.out.print("Digite o ano: ");
                ano = leia.nextInt();
                System.out.print("Digite o numero da agencia: ");
                numeroAgencia = leia.nextInt();
                System.out.print("Digite o numero da conta: ");
                numeroConta = leia.nextInt();
                if (controlador.validarConta(numeroAgencia, numeroConta) == 1) {
                    ContaCorrente contaComum = new ContaCorrente(nome, numeroAgencia, numeroConta, email, telefone, 0.0, dia, mes, ano);
                    controlador.addConta(contaComum);
                }
                else{
                System.out.println("Conta já existente!!!");
                }
                
                break;
            case 2:
                leia.nextLine();
                System.out.print("\nDigite o nome: ");
                nome = leia.nextLine();
                System.out.print("Digite o email: ");
                email = leia.nextLine();
                System.out.print("Digite o telefone: ");
                telefone = leia.nextLine();
                System.out.print("Digite o dia: ");
                dia = leia.nextInt();
                System.out.print("Digite o mes: ");
                mes = leia.nextInt();
                System.out.print("Digite o ano: ");
                ano = leia.nextInt();
                System.out.print("Digite o numero da agencia: ");
                numeroAgencia = leia.nextInt();
                System.out.print("Digite o numero da conta: ");
                numeroConta = leia.nextInt();
                if (controlador.validarConta(numeroAgencia, numeroConta) == 1) {
                     ContaCorrenteEspecial contaEspecial = new ContaCorrenteEspecial(nome, numeroAgencia, numeroConta, email, telefone, 0.0, dia, mes, ano);
                    controlador.addConta(contaEspecial);
                }
                else{
                System.out.println("Conta já existente!!!");
                }
                
                break;
            case 3:
                leia.nextLine();
                System.out.print("\nDigite o nome: ");
                nome = leia.nextLine();
                System.out.print("Digite o email: ");
                email = leia.nextLine();
                System.out.print("Digite o telefone: ");
                telefone = leia.nextLine();
                System.out.print("Digite o dia: ");
                dia = leia.nextInt();
                System.out.print("Digite o mes: ");
                mes = leia.nextInt();
                System.out.print("Digite o ano: ");
                ano = leia.nextInt();
                System.out.print("Digite o numero da agencia: ");
                numeroAgencia = leia.nextInt();
                System.out.print("Digite o numero da conta: ");
                numeroConta = leia.nextInt();
                if (controlador.validarConta(numeroAgencia, numeroConta) == 1) {
                    ContaPoupanca contaPoupança = new ContaPoupanca(nome, numeroAgencia, numeroConta, email, telefone, 0.0, dia, mes, ano);
                    controlador.addConta(contaPoupança);
                }
                else{
                System.out.println("Conta já existente!!!");
                }
                
                break;
            default:
                System.out.println("Erro Digite novamente!!");
                break;
        }
        
        
    }
    
public static void mostrarSaldo(){
    ContaCorrente conta = lerAgenciaConta();
    if (conta != null) {
        System.out.println("Saldo da conta : "+ conta.getSaldo());
    }
    else{
        System.out.println("Número de conta ou agência inválida!!!");
    }
    
}

public static void depositarValor(){
    ContaCorrente conta = lerAgenciaConta();
    if (conta != null) {
        System.out.print("Digite o valor: ");
        double valor;
        valor = leia.nextDouble();
        conta.depositar(valor);
    }
}

public static void sacarValor() {
    ContaCorrente conta = lerAgenciaConta();
    int valido = 0;
    if (conta == null) {
        return;
    }
    double valor;
    System.out.print("Digite o valor: ");
    valor = leia.nextDouble();
    if (conta instanceof ContaCorrenteEspecial contaCorrenteEspecial) {
        contaCorrenteEspecial.sacarEspecial(valor);
        valido = 1;
    } else if (conta instanceof ContaPoupanca contaPoupanca) {
        contaPoupanca.sacar(valor);
        valido = 1;
    } else {
        conta.sacar(valor);
        valido = 1;
    }
    
    if (valido == 1) {
        System.out.println("\nOperação realizado com sucesso!!!");
    }
    else{
        System.out.println("\nErro - operação não realizada!!!");
    }
}

public static ContaCorrente lerAgenciaConta(){
    int agencia, numeroConta;
    
    System.out.print("\nDigite o numero da agencia: ");
    agencia = leia.nextInt();
    System.out.print("Digite o numero da conta: ");
    numeroConta = leia.nextInt();
    
    ContaCorrente conta = controlador.pesquisar(agencia, numeroConta);
    if (conta != null) {
        return conta;
    }
    return null;
}

public static void transferencia(){
    double valorOrigem;
    int numeroOrigem, agenciaOrigem, numeroDestino, agenciaDestino;
    
    System.out.print("\nDigite a agencia da conta origem: ");
    agenciaOrigem = leia.nextInt();
    System.out.print("\nDigite o numero da conta origem: ");
    numeroOrigem = leia.nextInt();
    
    System.out.print("\nDigite a agencia da conta destino: ");
    agenciaDestino = leia.nextInt();
    System.out.print("\nDigite o numero da conta destino: ");
    numeroDestino = leia.nextInt();
    
    System.out.print("\nDigite o valor: ");
    valorOrigem = leia.nextDouble();
    
    double retorno;
    retorno = controlador.transferirValor(numeroOrigem, agenciaOrigem, valorOrigem, numeroDestino, agenciaDestino);
    if (retorno > 0) {
        System.out.println("\nSaldo transferido: "+retorno);
    }
    else{
        System.out.println("\nNão foi possivel realizar a operação!!");
    } 
}
    
}
