/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Funcionario extends Pessoa{
    
    String RGM;
    String Cargo;

    public Funcionario(String nome, String cpf, String DataNascimento, String RGM, String Cargo) {
        super(nome, cpf, DataNascimento);
        this.RGM = RGM;
        this.Cargo = Cargo;
    }
    
    public void info(){
        System.out.println("----- Cadastro estudante -----");
        System.out.println("Nome: " + this.nome);
        System.out.println("cpf: " + this.cpf);
        System.out.println("Data de nascimento: " + this.DataNascimento);
        System.out.println("RMG: " + this.RGM);
        System.out.println("Cargo: " + this.Cargo);
    
    }
    
    
}
