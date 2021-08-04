/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.funciones;

import static holamundo.funciones.FuncionCuadrado.funcionCuadrado;
import java.util.Scanner;

/**
 *
 * @author J_oa_
 */
public class FuncionDos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String entradaPorTeclado = sc.nextLine();
        try{
            Integer.parseInt(entradaPorTeclado);
        }
        catch(Exception e){
            try{
                Double.parseDouble(entradaPorTeclado);
            }
            catch(Exception e1){
                System.out.println(entradaPorTeclado);
            }
        }
    }
}
