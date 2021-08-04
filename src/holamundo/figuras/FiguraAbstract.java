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
public abstract class FiguraAbstract extends FiguraSuperAbstract{
    int color = 3;
    
    private String atributoPrivado = "atributo_privado";
    
    private int forma;
    
    public abstract float perimetro();
    
    public abstract float area();
    
    public float pintar(int x, int y){
        return 0;
    };
    
    private void metodoPrivado(){
        System.out.println("Este método es privado");
    }
    
    public String obtenerAtributoPrivado(){ //get
        return atributoPrivado;
    }
}
