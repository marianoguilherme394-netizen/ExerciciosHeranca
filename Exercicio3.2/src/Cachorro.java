/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Cachorro extends Animal{
    
    public Cachorro(String raca) {
        super(raca);
    }
    
    @Override
    public void Caminhar(){
        System.out.println("-------------------------");
        System.out.println("Um " + this.raca + " esta caminhando");
    }
    
    public void Latir(){
        System.out.println("Um " + this.raca + " esta latindo");
    }
    
}
