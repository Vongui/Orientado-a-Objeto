package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.modelo.Aluno;
import br.edu.ifsp.pep.modelo.Pessoa;
import br.edu.ifsp.pep.modelo.Professor;
import br.edu.ifsp.pep.modelo.TecnicoAdministrativo;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class PessoaController {

    private ArrayList<Pessoa> lista = new ArrayList<>();

//    public PessoaController() {
//        this.lista = new ArrayList<>();
//    }
    public ArrayList<Pessoa> getPessoas() {
        return lista;
    }

    public ArrayList<Aluno> getAlunos() {

        ArrayList<Aluno> alunos = new ArrayList<>();
        for (Pessoa pessoa : lista) {
//            if (pessoa instanceof Aluno) {
//                alunos.add((Aluno) pessoa);
//            }
            if (pessoa instanceof Aluno aluno) {
                alunos.add(aluno);
            }
        }
        return alunos;
    }

    public ArrayList<Professor> getProfessores() {
        ArrayList<Professor> professores = new ArrayList<>();
        for (Pessoa pessoa : lista) {
            if (pessoa instanceof Professor professor) {
                professores.add(professor);
            }
        }
        return professores;
    }

    public ArrayList<TecnicoAdministrativo> getTecnicosAdministrativos() {
        ArrayList<TecnicoAdministrativo> tecnicoAdministrativos = new ArrayList<>();
        for (Pessoa pessoa : lista) {
            if (pessoa instanceof TecnicoAdministrativo tecnicoAdministrativo) {
                tecnicoAdministrativos.add(tecnicoAdministrativo);
            }
        }
        return tecnicoAdministrativos;
    }

    public int getQuantidadeAlunos() {
//        int contador = 0;
//        for (Pessoa pessoa : lista) {
//            if (pessoa instanceof Aluno)
//                contador++;
//        }
//        return contador;
        return getAlunos().size();
    }

    public int getQuantidadeProfessores() {
        return getProfessores().size();
    }

    public int getQuantidadeTecnicosAdministrativos() {
        return getTecnicosAdministrativos().size();
    }

    public void cadastrar(Pessoa pessoa) {
        this.lista.add(pessoa);
    }

}
