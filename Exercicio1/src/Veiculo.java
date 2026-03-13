/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Veiculo {
    
    String marca;
    String modelo;
    String ano;
    
    public Veiculo(String marca, String modelo, String ano){
        
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void info(){
        System.out.println("----- Informações -----");
        System.out.println("marca: " + this.marca);
        System.out.println("modelo: " + this.modelo);
        System.out.println("ano: " + this.ano);
    }
    
}
