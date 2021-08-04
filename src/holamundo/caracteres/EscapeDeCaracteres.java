/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.caracteres;

/**
 * 
 * @author J_oa_
 */
public class EscapeDeCaracteres {
    public static void main(String[] args) {
        System.out.println("Hola\nMintic\t2022 ó");
        
        System.out.println("\\");
        
        String cadena = "Cadena";
        
        System.out.println(cadena);
        
        
        System.out.println("Cadena" + "3" + "sf");
        
        /* Esta prohibido en java, ya que cada vez que hacemos la asignacion
           java crea un nuevo ojeto */
        cadena = cadena + "algo";
        cadena = cadena + "322";
        cadena = cadena + "433";
        cadena = cadena + "335";
        
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("334");
        stringBuilder.append("66djk");
        stringBuilder.append("4345");
        
        System.out.println(stringBuilder.toString());
        
            
        
        StringBuffer stringBuffer = new StringBuffer();
        

        System.out.println("诶 	😀");
        
    }
    
    
    
}
