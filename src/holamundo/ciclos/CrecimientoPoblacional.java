/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.ciclos;

/**
 *
 * @author J_oa_
 */
public class CrecimientoPoblacional {
    public static void main(String[] args) {
        double paisA = 25000000;
        double paisB = 18500000;
        int i = 2022;
        while(paisB < paisA){
            i = i+1;
            paisB = paisB * (1+0.03);
            paisA = paisA * (1+0.02);
        }
        System.out.println(i);
    }
}
