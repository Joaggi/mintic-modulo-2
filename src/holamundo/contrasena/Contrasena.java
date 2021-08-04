/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.contrasena;

import java.nio.charset.Charset;
import java.util.Random;

/**
 *
 * @author J_oa_
 */
public class Contrasena {
    String contrasena;
    
    Contrasena(int longitud){
        this.contrasena = generateNewPassword(longitud);
    }
    
    public boolean esFuerte(){
        int mayuscula = 0;
        int minuscula = 0;
        int numeros = 0;
        
        for(int c: contrasena.toCharArray()){
            if(c>=65 && c<=90){
                mayuscula++;
            }
            if(c>=48 && c<=57){
                numeros++;
            }
            if(c>=97 && c<=122){
                minuscula++;
            }
        }
        
        return mayuscula >0 && minuscula > 0 && numeros > 5;
    }
    
    public void cambiarContrasena(String nuevaContrasena){
        this.contrasena = nuevaContrasena;
    }

    @Override
    public String toString() {
        return "Contrasena{" + " contrasena=" + contrasena + '}';
    }
    
    
    
    static String generateNewPassword(int n){
        String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
        
        StringBuilder sb = new StringBuilder(n);
        for(int i=0; i < n; i++){
            int index = (int) (ALPHA_NUMERIC_STRING.length() * Math.random());
            sb.append(ALPHA_NUMERIC_STRING.charAt(index));
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Contrasena contrasena = new Contrasena(10);
        System.out.println(contrasena.contrasena);
        System.out.println(contrasena.esFuerte());
        
        contrasena.cambiarContrasena("Ab123456");
        System.out.println(contrasena.contrasena);
        System.out.println(contrasena.esFuerte());
    }
}
