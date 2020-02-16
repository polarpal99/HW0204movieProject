/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps.sales;

import com.itexps.sales.Movie;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author polar
 */
public class MovieTest {
    
    /**
     *
     */
    public MovieTest() {
            Movie movie;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testMovie() {
        
        Movie flick = new Movie();
        flick.setId(1939);
        flick.setName("Wizard of Oz");

        assertEquals(1939, flick.getId());
        assertEquals("Wizard of Oz", flick.getName());
        
    } 

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
