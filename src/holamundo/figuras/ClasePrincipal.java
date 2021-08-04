/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.figuras;

import holamundo.figura_protected.FiguraProtected;


// 1. ¿Qué es una clase?
// 2. ¿Qué es un atributo?
// 3. ¿Qué es un método?
// 4. ¿Qué es un constructor?
// 5. ¿Qué es un modificador de acceso?
// 6. ¿Qué es un atributo de sellamiento? final
// 7. ¿Qué es polimorfismo?
// 8. ¿Qué es una interfaz?
// 9. ¿Qué es una clase abstracta?
// 10. ¿Qué es un método abstracto?
// 11. ¿Qué hace la palabra default?

/**
 *
 * @author J_oa_
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        
        System.out.println(circulo.perimetro());
        //System.out.println(circulo.atributoPrivado);
        
        System.out.println(circulo.obtenerAtributoPrivado());
        
        // FiguraAbstract figura = new FiguraAbstract();
        
        
        
        FiguraProtected figuraProtected = new FiguraProtected();
        // System.out.println(figuraProtected.area()); //No se puede acceder porque el método es protegido
    
        System.out.println(Figura.variableStatic);
        
        Figura.metodoEstatico();
        
        Circulo circulo2 = new Circulo();
        Circulo circulo3 = new Circulo(3);
        Circulo circulo4 = new Circulo(3, "circulo");
        Circulo circulo5 = new Circulo("circulo");
        
        circulo2.area();
    }
}
