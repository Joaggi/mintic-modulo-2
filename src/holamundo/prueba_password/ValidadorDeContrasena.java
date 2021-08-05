/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.prueba_password;

/**
 *
 * @author J_oa_
 */
public class ValidadorDeContrasena {

    Object esValido(String cadena) {
       if(cadena.length()>=5 && cadena.length()<=10){
           return true;
       }
       else{
           return false;
       }
    }
    
}
