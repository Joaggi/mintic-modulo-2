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
public class XElevadoALaN {
    public static double xElevadoALaN(double x, double n){
        double elevado = x;
        for(int i = 2; i<=n; i++){
            elevado = elevado * x;
        }
        return elevado;
    }
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            System.out.println(xElevadoALaN(2, i));
        }
    }
}
