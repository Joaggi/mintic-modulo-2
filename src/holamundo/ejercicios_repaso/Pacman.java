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
public class Pacman {
    
    String color;
    int puntuacion;
    int vidasRestantes;

    public Pacman() {
        color = "Amarillo";
        puntuacion = 0;
        vidasRestantes = 3;
    }
    
    public Pacman(String color, int puntuacion, int vidasRestantes) {
        this.color = color;
        this.puntuacion = puntuacion;
        this.vidasRestantes = vidasRestantes;
    }
    
   
    public void sumarPuntuacion(){
        puntuacion++;
    }
    
    public int obtenerPuntuacion(){
        return puntuacion;
    }
    
    public void restarVida(){
        vidasRestantes--;
    }
    
    public boolean sigueVivo(){
        return vidasRestantes > 0;
    }
}
