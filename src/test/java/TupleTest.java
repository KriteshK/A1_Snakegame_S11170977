/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Kritesh Kumar S11170977
 */
public class TupleTest {
    
    private Tuple TestTuple;
    
    @BeforeAll
    public static void setUpAll(){
        System.out.println("Starting the Test file for Tuple file.");
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("Initial setup for running the test.");
        TestTuple = new Tuple(2, 2);
    }
    
    /**
     * The Value of x is already set as 2, because of the "setUp" at the @BeforeEach
     */
    @Test
    @DisplayName("Used to test the get method for X")
    public void GetX() {
        assertEquals(2, TestTuple.getX());
    }
    
    /**
     * The Value of y is already set as 2, because of the "setUp" at the @BeforeEach
     */
    @Test
    @DisplayName("Used to test the get method for Y")
    public void GetY() {
        assertEquals(2, TestTuple.getY());
    }
    
    /**
     * This test checks if the data is changed. This is when the ChangeData.
     */
    @Test
    @DisplayName("Used to test if the values of X and Y has changed or not.")
    public void changeXandY() {
        TestTuple.ChangeData(4, 4);
        assertEquals(4, TestTuple.getX());
        assertEquals(4, TestTuple.getY());
    }
    
    /**
     * THis is used to test if the "getXf" and "getYf" is working.
     */
    @Test
    @DisplayName("Used to test if the values of X and Y has changed or not.")
    public void testXfAndYf() {
        TestTuple.xf = 8;
        TestTuple.yf = 7;
        
        assertEquals(8, TestTuple.getXf());
        assertEquals(7, TestTuple.getYf());
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
        System.out.println("All Tests in the TupleTest file is done.");
    }
}
