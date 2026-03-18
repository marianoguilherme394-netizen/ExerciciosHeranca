/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class Desconto extends Produto{
    
    public Desconto(String nome, double val) {
        super(nome, val);
    }
    
    @Override
    public void Comprar(){
        double desconto = val-(val*30)/100;
        
        System.out.println("------- Produto com desconto -------");
        System.out.println("O produto " + nome + " com desconto de 30% ficou R$" + desconto);
    }
    
}
