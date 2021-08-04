/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.ciclos;

import java.util.ArrayList;

/**
 *
 * @author J_oa_
 */
public class NumeroMenorRepresentable {
    public static void main(String[] args) {
        System.out.println(minMaquinaDoWhile());
    }
    
    public static double minMaquina(){
        double Xo = 1.0;
        double Xi = Xo / 2.0;
        while(Xi > 0.0){
            Xo = Xi;
            Xi = Xo / 2.0;
        }
        return Xo;
    }
    
    public static double minMaquinaDoWhile(){
        double Xo = 1.0;
        double Xi = Xo / 2;
        do {
            Xo = Xi;
            Xi = Xo / 2.0;
        } while (Xi > 0.0);
        return Xo;
    }
    
    public static ArrayList<Double> minMaquinaDoWhileConArrayList(){
        ArrayList<Double> arreglo = new ArrayList<Double>();
        double Xo = 1.0;
        double Xi = Xo / 2;
        do {
            Xo = Xi;
            arreglo.add(Xo);
            Xi = Xo / 2.0;
        } while (Xi > 0.0);
        return arreglo;
    }
}
