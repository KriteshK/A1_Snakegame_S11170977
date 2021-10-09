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
public class SquarePanelTest {
    
    private SquarePanel TestSquarePanel;
    
    @BeforeAll
    public static void setUpAll(){
        System.out.println("Starting the Test file for SquarePanel file.");
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("Initial setup for running the test.");
        TestSquarePanel = new SquarePanel(Color.red);
    }

    /**
     * Test of ChangeColor method, of class SquarePanel. This tests if the color has changed.
     */
    @Test
    public void testChangeColor() {
        TestSquarePanel.ChangeColor(Color.white);
        assertEquals(Color.WHITE, TestSquarePanel.getBackground());
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
        System.out.println("All Tests in the SquarePanelTest file is done.");
    }
    
}
