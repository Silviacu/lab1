/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1test.edu.temple.cis.c3238.hello;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tuf46167
 */
public class HelloTest {
    
    public HelloTest() {
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
     * Test of main method, of class Hello.
     */
    @Test
    public void testMain() {
        //System.out.println("main");
        //String[] args = null;
       // Hello.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     
    @Test
    public void testSpeak(){
        System.out.println("speak");
        Hello instance = new Hello();
        String expResult = "hello";
        String result = instance.speak();
        assertEquals(expResult, result);
        
       // fail("The test case id a prototype.");
    }
    }

