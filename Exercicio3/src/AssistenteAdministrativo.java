/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class AssistenteAdministrativo extends Funcionario{
    
    public AssistenteAdministrativo(String nome, String numeroMatricula) {
        super(nome, numeroMatricula);
    }
    
    @Override
    public void info(){
        System.out.println("----- Assistente Administrativo -----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Numero de Matricula: " + this.numeroMatricula);
    }
    
}
