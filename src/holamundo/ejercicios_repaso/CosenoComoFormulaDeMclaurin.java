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
public class CosenoComoFormulaDeMclaurin {
    public static double factorial(long n){
        int fact = 1;
        for(int i = 2; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
    
    public static double funcionInterna(double x, long i){
        return (Math.pow((-1), i) * Math.pow(x, 2*i)) / factorial(2*i);
    }
    
    public static double calcularCoseno(double x, long n){
        double sumatoria = 0;
        
        for(int i=0; i<=n; i++){
            sumatoria = sumatoria + funcionInterna(x, i);
        }
        return sumatoria;
    }
    
    public static void main(String[] args) {

        System.out.println(factorial(6));
        
        System.out.println(calcularCoseno(0.4, 12));
    }
}
