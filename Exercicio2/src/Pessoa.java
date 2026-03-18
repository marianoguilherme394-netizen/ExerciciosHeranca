/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Pessoa {
    
    String nome;
    String cpf;
    String DataNascimento;
    
    public Pessoa(String nome,String cpf, String DataNascimento){
       this.nome = nome;
       this.cpf = cpf;
       this.DataNascimento = DataNascimento;
    }
    
    public void info(){
        System.out.println("----- Cadastro estudante -----");
        System.out.println("Nome: " + this.nome);
        System.out.println("cpf: " + this.cpf);
        System.out.println("Data de nascimento: " + this.DataNascimento);
    }
    
}
