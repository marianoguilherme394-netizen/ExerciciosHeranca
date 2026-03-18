/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class Imovel {
    String imovel;
    double valImovelNv;
    double valImovelVl;
    
    public Imovel(String imovel, double valImovelNv, double valImovelVl){
        
        this.imovel = imovel;
        this.valImovelNv = valImovelNv;
        this.valImovelVl = valImovelVl;
    }
    
    public void ComprarImovel(){
        
        System.out.println("O imovel escolhido foi " + imovel + ", o valor do imovel e de R$" + valImovelNv );
        
    }
    
}
