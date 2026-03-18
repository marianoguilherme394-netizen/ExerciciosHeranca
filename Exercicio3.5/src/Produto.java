/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class Produto {
    
    String nome;
    double val;
    
    public Produto(String nome, double val){
        
        this.nome = nome;
        this.val = val;
    }
    
    public void Comprar(){
        System.out.println("------- Produto sem desconto -------");
        System.out.println("O produto " + nome + " ficou R$" + val);
    }
    
}
