/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesemana6;

import entidades.Estudiante;
import entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laboratorio
 */
public class ClaseSemana6Test {
    
    public ClaseSemana6Test() {
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
     * Test of main method, of class ClaseSemana6.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ClaseSemana6.main(null);
    }

    /**
     * Test of printPersonas method, of class ClaseSemana6.
     */
    @Test(expected = ClaseSemana6
            .NoRException.class)
    public void testPrintPersonas() throws Exception {
        System.out.println("printPersonas");
        List<Persona> personas = 
                new ArrayList<Persona>();
        personas.add(new Estudiante("Roberto"));
        ClaseSemana6.printPersonas(personas);
    }
    
}
