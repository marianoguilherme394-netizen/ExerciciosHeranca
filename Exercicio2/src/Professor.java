/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Professor extends Pessoa{
    String RF;
    String Diciplina;

    public Professor(String nome, String cpf, String DataNascimento, String RF, String Diciplina) {
        super(nome, cpf, DataNascimento);
        
        this.RF = RF;
        this.Diciplina = Diciplina;
    }
    
    @Override
    public void info(){
        System.out.println("----- Cadastro estudante -----");
        System.out.println("Nome: " + this.nome);
        System.out.println("cpf: " + this.cpf);
        System.out.println("Data de nascimento: " + this.DataNascimento);
        System.out.println("RF: " + this.RF);
        System.out.println("Curso: " + this.Diciplina);
    
    }
    
}
