/*
 * JUnit test for the Triangle class
 * This class works inside Netbeans -- See JUnit documentation for more info
 * http://www.junit.org/
 */
package br.com.fean.teste.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dfleck
 */
public class TriangleTest {
    // Create a new Triangle
    public TriangleTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("\nSETUP CLASS RUNNING");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("\nTEARDOWN CLASS RUNNING");
    }

    @Before
    public void setUp() {
        System.out.println("\nTEST SETUP IS RUNNING");
    }

    @After
    public void tearDown() {
        System.out.println("TEST TEARDOWN IS RUNNING");
    }

    @Test
    public void testScalene() {
        System.out.println("testEscaleno");

        Triangle instance = new Triangle("30", "40", "50");
        String expResult = "Escaleno";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquilateral() {
        System.out.println("testEquilatero");
        Triangle instance = new Triangle("1", "1", "1");
        String expResult = "Equilatero";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsoceles() {
        System.out.println("testIsoceles");
        Triangle instance = new Triangle("30", "40", "30");
        String expResult = "Isósceles";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

}
