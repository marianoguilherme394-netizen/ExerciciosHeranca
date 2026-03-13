/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class CarroEletrico extends Carro{
    
    double capacidadeBateria;

    public CarroEletrico(String marca, String modelo, String ano, String tipoDeCombustivel, double capacidadeBateria) {
        super(marca, modelo, ano, tipoDeCombustivel);
        
        this.capacidadeBateria = capacidadeBateria;
    }
    
    @Override
    public void info(){
        System.out.println("----- Informações -----");
        System.out.println("marca: " + this.marca);
        System.out.println("modelo: " + this.modelo);
        System.out.println("ano: " + this.ano);
        System.out.println("Tipo de Combustivel: " + this.tipoDeCombustivel);
        System.out.println("Capacidade da Bateria: " + this.capacidadeBateria + " kWH");
        
    }
    
}
