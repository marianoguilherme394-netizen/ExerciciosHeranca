/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Aluno extends Pessoa{
    
    String RM;
    String curso;

    public Aluno(String nome, String cpf, String DataNascimento, String RM, String curso) {
        super(nome, cpf, DataNascimento);
        this.RM = RM;
        this.curso = curso;
    }
    
    @Override
    public void info(){
        System.out.println("----- Cadastro estudante -----");
        System.out.println("Nome: " + this.nome);
        System.out.println("cpf: " + this.cpf);
        System.out.println("Data de nascimento: " + this.DataNascimento);
        System.out.println("RM: " + this.RM);
        System.out.println("Curso: " + this.curso);
    }
    
    
}
