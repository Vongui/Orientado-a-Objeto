/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.model;

/**
 *
 * @author aluno
 */
public class RepositorioBD implements Repositorio{

    @Override
    public void gravar(String a) {
        System.out.println("Gravou no Banco de Dados");
    }

    @Override
    public String recuperar() {
         return "Dados no Banco de dados";
    }
    
    
}
