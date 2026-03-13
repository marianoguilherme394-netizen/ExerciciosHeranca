/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Teste {
    public static void main (String [] args){
        
        Aluno e1 = new Aluno("Isabella", "866.478.105-74", "18/09/2007", "25080", "Arquitetura e Urbanismo");
        
        e1.info();
        
        Funcionario f1 = new Funcionario("Jorge", "586.328.187-74", "20/05/2001", "28077", "Limpeza");
        f1.info();
        
        Professor PR1 = new Professor("Rebecca", "467.789.209-74", "24/02/1990", "46089", "Desenvolvimento de Sistemas");
        PR1.info();
    }
    
}
