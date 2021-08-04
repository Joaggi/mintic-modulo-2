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
public class ForString {
    public static void main(String[] args) {
        String cadena = "Hola Mision Tic 2022";
        char[] chars = cadena.toCharArray();
        for(char c : chars){
            System.out.println(c);
        }
    }
    
    public static void iterarPorPosicion(){
        String cadena = "Hola Mision Tic 2022";
        for(int i=0; i<cadena.length(); i++){
            System.out.println(cadena.charAt(i));
        }
    }
}
