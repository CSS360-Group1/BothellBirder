/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bothellbirder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Val
 */
public class BirdTest {
    
//    public BirdTest() {
//    }
    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of getName method, of class Bird.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Bird instance = new Bird();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class Bird.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Specific Name of Bird";
        Bird instance = new Bird();
        instance.setName(name);
        assertEquals(instance.getName(),name);
    }

    /**
     * Test of getColor method, of class Bird.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Bird instance = new Bird();
        String expResult = null;
        String result = instance.getColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setColor method, of class Bird.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "blue";
        Bird instance = new Bird();
        instance.setColor(color);
        assertEquals(instance.getColor(), color);
    }
}
