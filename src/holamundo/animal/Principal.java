/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.animal;

/**
 *
 * @author J_oa_
 */
public class Principal {
    public static void main(String[] args) {
        Perro bruno = new Perro("Bruno");
        bruno.ladrar();
        //bruno.name = "nombre 2";
        bruno.modificarNombre("nombre 2");
        // bruno.ladrarPrivate();
        
        System.out.println(bruno.getName());
        
        Perro nulo = new Perro();
        nulo.ladrar();
        
        Perro toby = new Perro("Toby");
        toby.ladrarConNombre();
        
        toby.modificarRaza("Snauser");
        
        Perro akira = new Perro("Akira", "French Poodle");
        
    }
}
