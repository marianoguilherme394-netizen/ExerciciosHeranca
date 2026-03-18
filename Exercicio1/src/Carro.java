/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Carro extends Veiculo{
    
    String tipoDeCombustivel;
    
    
    public Carro(String marca, String modelo, String ano, String tipoDeCombustivel) {
        super(marca, modelo, ano);
        
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
    
    @Override
    public void info(){
        System.out.println("----- Informações -----");
        System.out.println("marca: " + this.marca);
        System.out.println("modelo: " + this.modelo);
        System.out.println("ano: " + this.ano);
        System.out.println("Tipo de Combustivel: " + this.tipoDeCombustivel);
    }
    
}
