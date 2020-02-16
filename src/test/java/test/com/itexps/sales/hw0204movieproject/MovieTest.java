/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps.sales.hw0204movieproject;

import com.itexps.sales.hw0204movieproject.Movie;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author polar
 */
public class MovieTest {
    
    Movie movie;
 
    public MovieTest() {
    }
    @BeforeClass
    public static void setUpClass() {
    }
    @AfterClass
    public static void tearDownClass() {
    }
    @Before
    public void setUp() {
        movie = new Movie();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMovie() {
        
        movie.setId(1939);
        movie.setName("Wizard of Oz");
        
        assertEquals(1939, movie.getId());
        assertEquals("Wizard of Oz", movie.getName());
        
     }
    
}
