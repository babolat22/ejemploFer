/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanj
 */
public class EmpleadoTest {
    
    public EmpleadoTest() {
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
     * Test of getTrabaja method, of class Empleado.
     */
    @Test
    public void testGetTrabaja() {
        System.out.println("getTrabaja");
        Empleado instance = null;
        Empresa expResult = null;
        Empresa result = instance.getTrabaja();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrabaja method, of class Empleado.
     */
    @Test
    public void testSetTrabaja() {
        System.out.println("setTrabaja");
        Empresa trabaja = null;
        Empleado instance = null;
        instance.setTrabaja(trabaja);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocumento method, of class Empleado.
     */
    @Test
    public void testGetDocumento() {
        System.out.println("getDocumento");
        Empleado instance = null;
        int expResult = 0;
        int result = instance.getDocumento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDocumento method, of class Empleado.
     */
    @Test
    public void testSetDocumento() {
        System.out.println("setDocumento");
        int documento = 0;
        Empleado instance = null;
        instance.setDocumento(documento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Empleado.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Empleado instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Empleado.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Empleado instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido method, of class Empleado.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Empleado instance = null;
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido method, of class Empleado.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Empleado instance = null;
        instance.setApellido(apellido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoria method, of class Empleado.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        Empleado instance = null;
        String expResult = "";
        String result = instance.getCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoria method, of class Empleado.
     */
    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        String categoria = "";
        Empleado instance = null;
        instance.setCategoria(categoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSueldo method, of class Empleado.
     */
    @Test
    public void testGetSueldo() {
        System.out.println("getSueldo");
        Empleado instance = null;
        double expResult = 0.0;
        double result = instance.getSueldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSueldo method, of class Empleado.
     */
    @Test
    public void testSetSueldo() {
        System.out.println("setSueldo");
        double sueldo = 0.0;
        Empleado instance = null;
        instance.setSueldo(sueldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
