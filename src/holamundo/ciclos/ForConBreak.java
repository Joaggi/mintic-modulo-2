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
public class ForConBreak {
    public static void main(String[] args) {
        int j = 0;
        int i = 0;
        for(i++; i<10; i++){
            if (i==2) break;
            System.out.println(i);
        }
    }
}
