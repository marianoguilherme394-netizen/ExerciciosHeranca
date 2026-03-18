/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class Teste {
    public static void main (String [] args){
        Produto p1 = new Produto("Bola de volei", 150.00);
        p1.Comprar();
        
        Desconto d1 = new Desconto("Bola de volei", 150.00);
        d1.Comprar();
    }
    
}
