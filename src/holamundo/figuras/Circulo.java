/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.figuras;

/**
 *
 * @author J_oa_
 */
public class Circulo extends Figura{
    int radio;
    String nombre;
    
    Circulo(){
    }
    
    Circulo(int radio){
        this.radio = radio;
        this.nombre = "Circulo generico";
    }
    
    Circulo(int radio, String nombre){
        this.radio = radio;
        this.nombre = nombre;
    }
    
    Circulo(String nombre){
        this.radio = 3;
        this.nombre = nombre;
    }
    
    @Override
    public float area(){
        return (float)(radio * radio * Math.PI);
    };
    
    public double retornarVolumen(int profundidad){
        profundidad = 3;
        return radio * radio * Math.PI;
    }
    
    public double retornarVolumen(double profundidad){
        float profundidad2 = 2;
        profundidad = 3;
        return radio * radio * Math.PI;
    }
    
    public double retornarVolumen(int profundidad, float profundidad2){
        profundidad = 3;
        return radio * radio * Math.PI;
    }
    
    
    public double retornarVolumen2(final int profundidad){
        //profundidad = 3;
        return radio * radio * Math.PI;
    }
}
