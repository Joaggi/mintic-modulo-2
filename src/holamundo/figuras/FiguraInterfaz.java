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
public interface FiguraInterfaz {
    final int entero = 3;
    int entero2 = 4;
    public void contrato1();
    public void contrato2();
    default int contrato3(){
        return 3;
    }
}
