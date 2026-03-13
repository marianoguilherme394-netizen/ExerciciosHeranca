/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Tecnico extends Funcionario{
    
    public Tecnico(String nome, String numeroMatricula) {
        super(nome, numeroMatricula);
    }
    
    public void info(){
        System.out.println("----- Tecnico -----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Numero de Matricula: " + this.numeroMatricula);
    }
    
}
