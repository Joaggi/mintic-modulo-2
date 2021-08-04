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
public class HastaIngresoCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int dato = 9999;
        while(dato!=0){
            System.out.print("Ingrese un número entero");
            System.out.println("a sumar a 0 para salir");
            dato = sc.nextInt();
            suma += dato;
        }
        System.out.println(suma);
    }
    
    public static void conDoWhile(){
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int dato = 0;
        do{
            System.out.print("Ingrese un número entero");
            System.out.println("a sumar a 0 para salir");
            dato = sc.nextInt();
            suma += dato;
        } while (dato!=0);
        System.out.println(suma);
    }
    
    public static void conWhile(){
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        while (true) {
            System.out.print("Ingrese un número entero");
            System.out.println("a sumar a 0 para salir");
            int dato = sc.nextInt();
            if(dato == 0) 
                break;
            suma += dato;
        }
        System.out.println(suma);
    }
}
