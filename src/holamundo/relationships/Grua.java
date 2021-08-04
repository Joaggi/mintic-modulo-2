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
public class Grua {
    int cargaMaximaCarros;
    
    Grua(int cargaMaximaCarros){
        this.cargaMaximaCarros = cargaMaximaCarros;
    }
    
    public void translada(Carro carro){
        System.out.println("Transladado el carro: " + carro);
    }
}
