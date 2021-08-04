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
public class Tablero {
    Pacman pacman;
    int nivel;

    public Tablero(Pacman pacman) {
        this.pacman = pacman;
        this.nivel = 0;
    }
    
    public int comprobarNivelActual(){
        this.nivel = (int)(this.pacman.obtenerPuntuacion() / 25); // es como el // para obtener la parte entera
        return this.nivel;
    }
    
    public static void main(String[] args) {
        Pacman pacman = new Pacman("Rojo", 0, 5);
        Tablero tablero = new Tablero(pacman);
        
        pacman.sigueVivo();
        
        System.out.println(tablero.comprobarNivelActual());
        
        for(int i = 0; i< 26; i++)
            pacman.sumarPuntuacion();
        
        System.out.println(tablero.comprobarNivelActual());
        
        for(int i = 0; i< 26; i++)
            pacman.sumarPuntuacion();
        
        System.out.println(tablero.comprobarNivelActual());
    }
}
