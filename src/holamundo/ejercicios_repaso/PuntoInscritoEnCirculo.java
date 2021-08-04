/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.ejercicios_repaso;

/**
 *
 * @author J_oa_
 */
public class PuntoInscritoEnCirculo {
    public static void puntoInscrito(double centroEnX, double centroEnY, double radio, double x, double y){
        boolean estaAdentro = Math.pow((x - centroEnX), 2) + Math.pow((y - centroEnY), 2) < radio;
        if (estaAdentro){
            System.out.println("El punto esta adentro");
        }
        else{
            System.out.println("El punto no esta adentro");
        }
    }
    
    public static void main(String[] args) {
        puntoInscrito(0,0, 1, 0, 0);
        puntoInscrito(0,0, 1, 0, 1.5);
        
        puntoInscrito(0, 0, 1, 0.3, 0.3);
        
        puntoInscrito(2, 2, 1, 0.3, 0.3);
    }
}
