/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.prueba_password;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author J_oa_
 */
public class ValidadorDeContrasenaTest {
    
    @Test
    public void validarContrasenaValida() {
        ValidadorDeContrasena validadorDeContrasena = new ValidadorDeContrasena();
        assertEquals(true, validadorDeContrasena.esValido("Abc123"));
    }
    
    @Test
    public void validarContrasenaGrande() {
        ValidadorDeContrasena validadorDeContrasena = new ValidadorDeContrasena();
        assertEquals(false, validadorDeContrasena.esValido("ABCDEFGHIJK123456"));
    }
    
    
}
