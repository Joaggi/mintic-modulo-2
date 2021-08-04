/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.funciones;

import java.util.Scanner;

/**
 *
 * @author J_oa_
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");  // print("Hola Mundo")
        
        int variableNoAsignada;
        
        int dia = 3;
        int Dia = 4;
        int DIA = 5;
        
        byte datoByte = 126;
        
        short datoShort = 32000;
        
        short datoShort2 = -32000;
        
        
        //short datoShort2 = 48000;  Esta linea genera error
        
        long datoLong = 999334878772662l;
        
        long datoLong2;
        
        //System.out.println(datoLong2); //Error en tiempo de compilación
        
        double numeroDoble = 32432.34;
        
        float numeroFlotante = 32432.34F;
        
        boolean booleanVerdadero = true;
        
        boolean booleanFalso = false;
        
        char letra = '3';
        
        char letra2 = 'á';
        
        String cadena = "Cadena de letras";
        
        System.out.println("\" \' \n \t");
        
        Scanner scanner = new Scanner(System.in);
        
        String dato = scanner.nextLine();
        
        System.out.println(dato);
        
        while(true){
            try{
                int entero = Integer.parseInt(scanner.nextLine());
                break;
            }
            catch(Exception e){
                    
            }
        }
        
    }
    
}
