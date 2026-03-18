/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Ingresso {
    
    String ingresso;
    String ingressoVip;
    
    public Ingresso(String ingresso, String ingressoVip){
        this.ingresso = ingresso;
        this.ingressoVip = ingressoVip;
    }
    
    public void DeterminarIngresso(){
        System.out.println("Seu ingresso e: " + this.ingresso);
        System.out.println("Seu ingresso vip libera o " + this.ingressoVip);
    }
    
}
