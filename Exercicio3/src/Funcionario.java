/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Funcionario {
    String nome;
    String numeroMatricula;
    
    public Funcionario(String nome, String numeroMatricula){
        
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }
    
    public void info(){
        System.out.println("----- Funcionario -----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Numero de Matricula: " + this.numeroMatricula);
    }
    
}
