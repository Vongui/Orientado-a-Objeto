/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.model;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class RepositorioMemoria implements Repositorio, Consulta{

    
    @Override
    public void gravar(String a) {
        System.out.println("Gravou em memoria");
    }

    @Override
    public String recuperar() {
        return "Dados em memoria";
    }
    
    @Override
    public ArrayList buscarTodos(){
        System.out.println("Retornando dados em memoria");
        return  new ArrayList();
    }
    
}
