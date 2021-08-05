/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.pruebas;

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
public class CuadradoTest {
    
    public CuadradoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cuadrado method, of class Cuadrado.
     */
    @Test
    public void testCuadrado() {
        System.out.println("cuadrado");
        double x = 0.0;
        double expResult = 0.0;
        double result = Cuadrado.cuadrado(x);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testNull(){
        System.out.println("testNull");
        try{
            double result = Cuadrado.cuadrado(null);
        }
        catch(Exception e){
            fail("No tiene manejo de nulos");
        }
    }
    
    @Test
    public void testCuadradoNormal(){
        System.out.println("testNull");
        double result = Cuadrado.cuadrado(3.0);
        assertEquals(9, result, 0);
        
        result = Cuadrado.cuadrado(4.0);
        assertEquals(16, result, 0);
    }
    
}
