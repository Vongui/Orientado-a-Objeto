package br.edu.ifsp.pep;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vongui
 */
public class Main {
    
    private static Scanner leia = new Scanner(System.in);
    
    public static void main(String[] args) {

        boolean loop = false;

        do {
            System.out.println("Informe o numerador: ");
            try {
                loop = false;
                
                int numerador = leia.nextInt();
                
                System.out.println("Informe o denominador: ");
                int denominador = leia.nextInt();

                int resultado = dividir(numerador, denominador);
                System.out.println("Resultado: " + resultado);
            } catch (InputMismatchException ime) { //se utiliza as iniciais da exceção
                System.out.println("Bloco InputMismatchException");
                //ime.printStackTrace(); mostra a pilha de erros
                //System.out.println(ime.getMessage());  informa uma menssagem
                System.out.println("Informe um numero inteiro");
                loop = true;
                leia.nextLine(); //necessário limpar o buffer
            } catch (ArithmeticException ae) {
                System.out.println("Bloco ArithmeticException");
                System.out.println("Não é possivel realizar divisão por 0");
                //System.out.println(ae.getMessage());
                loop = true;
                leia.nextLine();
            } catch (Exception e) { // trata qualquer exceção, mais informar menssagens genéricas
                System.out.println("Bloco Exception");
                System.out.println("Ocorreu um erro");
                //e.printStackTrace();
                loop = true;
                leia.nextLine();
            } finally {
                //Só pode ter um, e ter que estar localizado ao final de todos os catchs
                //independente se alguma exceção for executada, ele será executado
                System.out.println("Bloco Finally");
            }
        } while (loop);

    }

    private static int dividir(int numerador, int denominador){
        return numerador/denominador;
    }
}
