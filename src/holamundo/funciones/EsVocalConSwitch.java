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
public class EsVocalConSwitch {
    public static void main(String[] args){
        esVocal('R');
    }
    
    public static void esVocal(char caracter){
        switch(caracter){
            case 'A':
                System.out.println("Es vocal");
                break;
            case 'E':
                System.out.println("Es vocal");
                break;
            case 'I':
                System.out.println("Es vocal");
                break;
            case 'O':
                System.out.println("Es vocal");
                break;
            case 'U':
                System.out.println("Es vocal");
                break;
            default:
                System.out.println("No es vocal");
                break;
        }
    }
    
     public static String esVocalSinBreak(char caracter){
        switch(caracter){
            case 'A':
                return "Es vocal";
            case 'E':
                return "Es vocal";
            case 'I':
                return "Es vocal";
            case 'O':
                return "Es vocal";
            case 'U':
                return "Es vocal";
            default:
                return "No es vocal";
        }
    }
}
