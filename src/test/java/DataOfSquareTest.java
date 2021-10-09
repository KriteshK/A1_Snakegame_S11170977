/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kritesh Kumar S11170977
 */
public class DataOfSquareTest {
    
    private DataOfSquare TestDataOfSquare;
    
    @BeforeAll
    public static void setUpAll(){
        System.out.println("Starting the Test file for DataOfSquare file.");
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("Initial setup for running the test.");
        TestDataOfSquare = new DataOfSquare(0);
    }
    

    /**
     * Test of lightMeUp method, of class DataOfSquare. This test if the Light me up method works.
     */
    @Test
    public void testLightMeUp() {
        TestDataOfSquare.lightMeUp(1);
        assertEquals(Color.BLUE, TestDataOfSquare.square.getBackground());
        
    }
    
    /*
    * This is executed after each test has been executed.
    */
    @AfterEach
    public void endOfEachTest(){
        System.out.println("Completed a Test.");
    }

    /**
     * This is executed after all the tests have been conducted.
     */
    @AfterAll
    public static void endOfAllTest(){
        System.out.println("All Tests in the DataOfSquareTest file is done.");
    }
    
}
