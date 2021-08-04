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
public class Figura {
    int color = 3;
    
    final int CONSTATE = 44; //Es una variable que no se puede modificar
    
    public static int variableStatic = 3;
    
    private String atributoPrivado = "atributo_privado";
    
    private int forma;
    
    public float perimetro(){
        return 0;
    };
    
    public float area(){
        return 0;
    };
    
    public float pintar(int x, int y){
        return 0;
    };
    
    private void metodoPrivado(){
        System.out.println("Este método es privado");
    }
    
    public String obtenerAtributoPrivado(){ //get
        return atributoPrivado;
    }
    
    public static void metodoEstatico(){
        System.out.println("Dentro de método estatico");
    }
    
}
