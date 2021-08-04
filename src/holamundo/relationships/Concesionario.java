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
public class Concesionario {
    
    public Carro crearCarro(int pasajeros,  String nombreMotor, String tipoMotor){
        return new Carro(pasajeros, nombreMotor, tipoMotor);
    }
}
