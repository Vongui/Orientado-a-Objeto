package br.edu.ifsp.pep;

import br.edu.ifsp.pep.controller.PessoaController;
import br.edu.ifsp.pep.modelo.Aluno;
import br.edu.ifsp.pep.modelo.Pessoa;
import br.edu.ifsp.pep.modelo.Professor;
import br.edu.ifsp.pep.modelo.TecnicoAdministrativo;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Principal {

    private static Scanner ler = new Scanner(System.in);
    private static PessoaController pessoaController = new PessoaController();

    public static void main(String[] args) {
        int opcao;
        do {
            opcao = apresentarMenu();
            switch (opcao) {
                case 1:
                    int opcaoCadastro = apresentarMenuPessoa();
                    switch (opcaoCadastro) {
                        case 1:
                            cadastrarAluno();
                            break;
                        case 2:
                            cadastrarProfessor();
                            break;
                        case 3:
                            cadastrarTecnicoAdministrativo();
                            break;
                        default:
                            System.out.println("Tipo de cadastro inválido.");
                    }
                    break;
                case 2:
                    listarPessoas();
                    break;
                case 3:
                    listarProfessores();
                    break;
                case 4:
                    listarAlunos();
                    break;
                case 5:
                    listarTecnicosAdministrativos();
                    break;
                case 6:
                    apresentarQuantidadesPessoas();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static int apresentarMenu() {

        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar todos");
        System.out.println("3 - Listar Professores");
        System.out.println("4 - Listar Alunos");
        System.out.println("5 - Listar Técnicos Administrativos");
        System.out.println("6 - Listar Quantidades de pessoas");
        System.out.println("0 - Sair");
        System.out.println("\nEscolha uma opção: ");
        return ler.nextInt();

    }

    private static int apresentarMenuPessoa() {
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Cadastrar Professor");
        System.out.println("3 - Cadastrar Técnico Administrativo.");
        System.out.println("\nEscolha uma opção: ");
        return ler.nextInt();
    }

    private static void cadastrarAluno() {
        Aluno aluno = new Aluno();

        System.out.println("Informe o Prontuário: ");
        aluno.setProntuario(ler.nextLine());

        System.out.println("Informe o Nome: ");
        aluno.setNome(ler.nextLine());

        System.out.println("Informe o Telefone: ");
        aluno.setTelefone(ler.nextLine());

        System.out.println("Informe o Curso: ");
        aluno.setCurso(ler.nextLine());

        System.out.println("Informe o Semestre: ");
        aluno.setSemestre(ler.nextInt());

        pessoaController.cadastrar(aluno);
    }

    private static void cadastrarProfessor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void cadastrarTecnicoAdministrativo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void listarPessoas() {
        for (Pessoa pessoa : pessoaController.getPessoas()) {
            System.out.println("Prontuário: " + pessoa.getProntuario());
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Telefone: " + pessoa.getTelefone());
        }
    }

    private static void listarProfessores() {
        for (Professor professor : pessoaController.getProfessores()) {
            System.out.println("Prontuário: " + professor.getProntuario());
            System.out.println("Nome: " + professor.getNome());
            System.out.println("Telefone: " + professor.getTelefone());
            System.out.println("Área: " + professor.getArea());
            System.out.println("Tipo contrato: " + professor.getTipoContrato());
        }
    }

    private static void listarAlunos() {
        for (Aluno aluno : pessoaController.getAlunos()) {
            System.out.println("Prontuário: " + aluno.getProntuario());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Telefone: " + aluno.getTelefone());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Semestre: " + aluno.getSemestre());
        }
    }

    private static void listarTecnicosAdministrativos() {
        for (TecnicoAdministrativo tecnicoAdministrativo : pessoaController.getTecnicosAdministrativos()) {
            System.out.println("Prontuário: " + tecnicoAdministrativo.getProntuario());
            System.out.println("Nome: " + tecnicoAdministrativo.getNome());
            System.out.println("Telefone: " + tecnicoAdministrativo.getTelefone());
            System.out.println("Setor: " + tecnicoAdministrativo.getSetor());
            System.out.println("Cargo: " + tecnicoAdministrativo.getCargo());
        }
    }

    private static void apresentarQuantidadesPessoas() {
        System.out.println("**** Quantidades por Tipo de Pessoas ****");
        System.out.println("Alunos: " + pessoaController
                .getQuantidadeAlunos());
        
        System.out.println("Professores: " + pessoaController
                .getQuantidadeProfessores());
        
        System.out.println("Técnicos Administrativos: " + pessoaController
                .getQuantidadeTecnicosAdministrativos());
    }

}
