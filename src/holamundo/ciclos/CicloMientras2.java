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
public class CicloMientras2 {
    public static void main(String[] args) {
        int i = 2;
        int j = 25;
        while(i<j){
            System.out.println(i + " " + j);
            i = i * 2;
            j = j + 10; 
        }
    }
}
