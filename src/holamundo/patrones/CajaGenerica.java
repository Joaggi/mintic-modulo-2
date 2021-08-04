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
public class CajaGenerica<T> {
//    protected double obj;
//    protected String obj;
//    protected int obj;
//    protected Object obj;
    protected T obj; //Esta T representa cualquier clase posible
    // T siempre va tener que ser una clase, no puede ser un primitivo
    
    public CajaGenerica(T obj){
        this.obj = obj;
    }
    
    public T obtener(){
        return obj;
    }
    
    public String decorar(){
        String s = obj.toString();
        String linea = "*";
        for(int i = 0; i < s.length(); i++){
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }
    
    
    public static void main(String[] args) {
        CajaGenerica cajaGenerica = new CajaGenerica(10);
        System.out.println(cajaGenerica.obtener().getClass());
        cajaGenerica.obj = "Cadena";
        System.out.println(cajaGenerica.obtener().getClass());
        
        CajaGenerica<Integer> cajaGenericaEntera = new CajaGenerica<>(10);
        System.out.println(cajaGenericaEntera.obtener().getClass());
        // cajaGenericaEntera.obj = "Cadena"; //Esta linea saca error en tiempo de 
        // compilación ya que el compilador de java se encarga de verificar que 
        // la clase solo puede aceptar enteros
        
        CajaGenerica<Double> cajaGenericaDouble = new CajaGenerica<>(10.4);
        
    }
}
