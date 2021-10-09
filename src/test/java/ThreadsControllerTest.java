/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.KeyEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kritesh Kumar S11170977
 */   
public class ThreadsControllerTest {
    
    private Window TestWindow;
    private KeyboardListener TestKeyboardListener;
    static Tuple TestTuple = new Tuple(10, 10);
    ThreadsController TestThreadsController;

    
    @BeforeAll
    public static void setUpAll(){
        System.out.println("Starting the Test file for ThreadController file.");
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("Initial setup for running the test.");
        
        TestWindow = new Window();        
        TestKeyboardListener = new KeyboardListener();
        TestThreadsController = new ThreadsController(TestTuple);
    }
    
    
    /**
     * This is used to test the Right Key is entered.
     */
    @Test
    @Order(1)
    public void whenTheKeyPressedIsRight() {
    	
        TestThreadsController.start();
        
        KeyEvent key_right = new KeyEvent(TestWindow, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, 'R');

        TestKeyboardListener.keyPressed(key_right);
    }
    
    /**
     * This is used to test the Up Key is entered.
     */
    @Test
    @Order(2)
    public void whenTheKeyPressedIsUp() {
    	
        TestThreadsController.start();
        
        KeyEvent key_up = new KeyEvent(TestWindow, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_UP, 'U');

        TestKeyboardListener.keyPressed(key_up);
        TestThreadsController.headSnakePos.ChangeData(0, 0);

    }
    
    /**
     * This is used to test the Left Key is entered.
     */
    @Test
    @Order(3)
    public void whenTheKeyPressedIsLeft() {
    	
        TestThreadsController.start();
        
        KeyEvent key_left = new KeyEvent(TestWindow, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, 'L');
        KeyEvent key_down = new KeyEvent(TestWindow, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_DOWN, 'U');

        //Because initially the direction of the snake is right, we can not go left directly (because it is in opposite direction).
        // Hence, first we must go either up or down before moving left, hence why there is code for pressing down key.
        TestKeyboardListener.keyPressed(key_down); 
        
        TestKeyboardListener.keyPressed(key_left);
        TestThreadsController.headSnakePos.ChangeData(0, 0);
    }
    
    /**
     * This is used to test the Down Key is entered.
     */
    @Test
    @Order(4)
    public void whenTheKeyPressedIsDown() {
    	   	
        TestThreadsController.start();
        
        KeyEvent key_down = new KeyEvent(TestWindow, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_DOWN, 'D');
        
        TestKeyboardListener.keyPressed(key_down);
    }
    
    /**
     * This test is to test if the correct boolean value is presented when the snake bites it self. It will not
     * look at the "stopTheGame" functionality.
     */
    @Test
    @Order(5)
    public void whenTheSnakeIsBitingItself() {
    	
        TestThreadsController.start();
        
        Tuple posCritique = new Tuple(11, 10);
        boolean biteItself = posCritique.getX()==TestThreadsController.positions.get(0).getX() && posCritique.getY()==TestThreadsController.positions.get(0).getY();
		assertFalse(biteItself);
    }
    
    /**
     * This test is to test when the snake is to eat the food.
     */
    @Test
    @Order(6)
    public void whenTheSnakeIsEatingFood() {
    	
        TestThreadsController.start();
        TestThreadsController.foodPosition.ChangeData(10, 10);
        
        Tuple posCritique = new Tuple(10, 10);
        boolean eatingFood = posCritique.getX()==TestThreadsController.foodPosition.x && posCritique.getY()==TestThreadsController.foodPosition.y;
		assertTrue(eatingFood);
		
    }
    
    /**
     * This test is to test the interrupts should it happen.
     */
    @Test
    @Order(7)
    public void checkForInterrupts() {
    	
    	TestThreadsController.start();
    	
    	TestThreadsController.interrupt();
        
    }
    
    /**
     * This test is to check if the game will stop when the snake bites itself.
     */
    @Test
    @Order(8)
    public void whenTheSnakeIsEatingFood2() {
    	
        TestThreadsController.start();
        
        TestThreadsController.foodPosition.ChangeData(10, 10);
        
    	
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
        System.out.println("All Test in the ThreadController Test file is done.");
    }

    
}
