/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.patrones;

/**
 *
 * @author J_oa_
 */
public class MainPareja {
    public static void main(String[] args) {
        Pareja<Integer, String> pareja = new Pareja<>(20, "Pedro Páramo");
        System.out.println(pareja);
        Integer c = pareja.clave() + 10;
        System.out.println(c);
        System.out.println(pareja.valor().charAt(2));
    }
}
