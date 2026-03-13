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
        
        Veiculo v1 = new Veiculo("Honda", "HR-V", "2015");
        v1.info();
        
        Carro c1 = new Carro("Chevrolet", "Onix", "2013", "Flex(Gasolina ou Etanol)");
        c1.info();
        
        CarroEletrico ce1 = new CarroEletrico("BYD", "Dolphin Mini", "2024", "Não utiliza combustivel", 38.8);
        ce1.info();
        
    }
    
}
