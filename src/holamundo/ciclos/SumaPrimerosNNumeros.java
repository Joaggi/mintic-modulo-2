/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.ciclos;

import java.util.Scanner;

/**
 *
 * @author J_oa_
 */
public class SumaPrimerosNNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        sumaFor(n);
    }
    public static void suma(int n){
        int i = 0;
        int s = 0;
        while(i <= n){
            s += i;
            i += 1;
        }
        System.out.println(s);
    }
    public static void sumaFor(int n){
        int s = 0;
        for(int i = 0; i <= n; i += 1){
            s += i;
        }
        System.out.println(s);
    }
}
