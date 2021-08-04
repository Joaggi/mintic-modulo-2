/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.funciones;

/**
 *
 * @author J_oa_
 */
public class NumeroConSigno {
    public static void main(String[] args){
        signo(-3);
    }
    
    public static void signo(double x){
        if(x > 0){
            System.out.print("+");
        }
        System.out.println(x);
    }
}
