/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Animal {
    String raca;
    
    public Animal(String raca){
        this.raca = raca;
    }
    
    public void Caminhar(){
        System.out.println("-------------------------");
        System.out.println("Um " + this.raca + " esta caminhando");
    }
    
}
