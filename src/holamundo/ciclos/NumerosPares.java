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
public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(n = n - n%2;n>=2;n-=2){
            System.out.println(n);
        }
    }
}
