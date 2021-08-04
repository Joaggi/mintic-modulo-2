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
public class FuncionConDosParametrosDeEntrada {
    public static void main(String[] args){
        int suma = sum(2, 6);
        System.out.println(suma);
    }
    
    public static int sum(int x, int y){
        return x + y;
    }
}
