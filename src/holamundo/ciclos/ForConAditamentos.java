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
public class ForConAditamentos {
    public static void main(String[] args) {
        // i++ quiere decir i = i + 1 y j-- quiere decir j = j - 1 es igual a i+=1 y j-=1
        int suma = 0;
        int multiplicacion = 1;
        for(int i=0, j=10; i<=j; i++, j--){
            System.out.println(i + " " + j);
            suma = suma + i + j;
            multiplicacion = multiplicacion * i * j;
        }
        System.out.println(suma);
        System.out.println(multiplicacion);
    }
}
