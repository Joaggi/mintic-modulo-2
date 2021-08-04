/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.arreglos;

/**
 *
 * @author J_oa_
 */
public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        matriz[0][0] = 0;
        matriz[0][1] = 1;
        matriz[0][2] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[1][2] = 5;
        matriz[2][0] = 6;
        matriz[2][1] = 7;
        matriz[2][2] = 8;
        
        
        System.out.println(matriz.length);
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.println("fila:" + i + " columna:" +  j  + " valor: " + matriz[i][j]);
            }
        }
        
        for(int[] arreglo: matriz){
            for(int entero: arreglo){
                System.out.println(entero);
            }
        }
        

        
    }
}
