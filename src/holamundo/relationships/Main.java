/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.relationships;

/**
 *
 * @author J_oa_
 */
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(4, "Mitsubichi", "Motor en V - 8");
        Grua grua = new Grua(2);
        
        carro = null; // Perdemos la referencia al carro.
        
        grua.translada(carro);
        
        Motor motor = new Motor("General Motors", "Combustion Gasolina 2000cc");
        Carro carro2 = new Carro(4, motor);
        
        carro2 = null; //Perdemos la referencia al carro2, noten que el motor sigue existiendo
    }
}
