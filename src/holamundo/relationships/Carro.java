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
public class Carro {
    int pasajeros;
    Motor motor;
    
    
    //Composición
    Carro(int pasajeros, String nombreMotor, String tipoMotor){
        this.pasajeros = pasajeros;
        this.motor = new Motor(nombreMotor, tipoMotor);
    }
    
    //Agregación
    public Carro(int pasajeros, Motor motor){
        this.pasajeros = pasajeros;
        this.motor = motor;
    }
}
