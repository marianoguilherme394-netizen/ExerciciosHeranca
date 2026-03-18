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
        
        Funcionario f1 = new Funcionario("Guilherme", "25757");
        f1.info();
        
        Tecnico t1 = new Tecnico("Lucas", "67828");
        t1.info();
        
        AssistenteAdministrativo a1 = new AssistenteAdministrativo("Isabella", "29034");
        a1.info();
    }
    
}
