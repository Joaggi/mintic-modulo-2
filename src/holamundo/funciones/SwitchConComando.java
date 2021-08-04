/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.funciones;

/**
 *
 * @author J_oa_
 */
public class SwitchConComando {
    // Crear, Actualizar, Borrar, Consultar
    public static void main(String[] args){
        ejecutarComando("Crear");
    }
    
    public static void ejecutarComando(String comando){
        
        // Principios SOLID (2 años) -> clean code
        switch(comando){
            case "crear":
                crear();
                break;
            case "eliminar":
                eliminar();
                break;
            case "editar":
                editar();
                break;
            case "consultar":
                consultar();
                break;
        }
    }

    private static void crear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
