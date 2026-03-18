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
        
        Animal a1 = new Animal("Animal");
        a1.Caminhar();
        
        Cachorro c1 = new Cachorro("Pug");
        c1.Caminhar();
        c1.Latir();
        
        Gato g1 = new Gato("Persa");
        g1.Caminhar();
        g1.Miar();
    }
    
}
