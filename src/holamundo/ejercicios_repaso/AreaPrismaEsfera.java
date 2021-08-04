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
public class AreaPrismaEsfera {
    public static double calcularVolumen(double radioEsfera, double radioPrisma, double alturaPrisma){
        return (4.0 / 3.0) * Math.pow(radioEsfera, 3) * Math.PI;
    }
    
    public static void main(String[] args) {
        System.out.println(calcularVolumen(3, 2, 2));
    }
}
