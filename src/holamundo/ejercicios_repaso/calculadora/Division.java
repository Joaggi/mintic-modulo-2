/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.ejercicios_repaso.calculadora;

/**
 *
 * @author J_oa_
 */
public class Division implements InterfazOperacion, Constantes{

    @Override
    public double operacion(double x, double y) {
        return x / y;
    }
    
    public double calcularArea(double radio){
        return radio * radio * Constantes.PI;
    }
}
