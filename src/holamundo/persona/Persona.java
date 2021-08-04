/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.persona;

/**
 *
 * @author J_oa_
 */
public class Persona {
    String nombre;
    int edad;
    String genero;
    double peso;
    double altura;

    public Persona(String nombre, int edad, String genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }
    
    public double calcularIMC(){
        return this.peso / Math.pow(this.altura, 2);
    }
    
    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public static void main(String[] args) {
        Persona ricardo = new Persona("Ricardo", 35, "Masculino", 86, 1.76);
        System.out.println(ricardo.calcularIMC());
        System.out.println(ricardo.esMayorDeEdad());
        System.out.println(ricardo);
    }
    
    // 1. ¿Qué es una clase?
    // 2. ¿Qué es un objeto?
    // 3. ¿Qué es una instancia?
    // 4. ¿Qué es un atributo?
    // 5. ¿Qué es un método?
    // 6. ¿Qué es un nivel de acceso?
    // 7. ¿Qué hace la palabra reservada public?
    // 8. ¿Qué hace la palabra reservada private?
    // 9. ¿Qué hace la palabra reservada this?
    // 10. ¿Qué es el constructor de un objeto?
    // 11. ¿Puedo tener varios constructores?
    // 12. ¿Por qué se crea la programación orientada a objetos?
}
