import java.awt.event.KeyEvent;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Kritesh Kumar S11170977
 */
public class KeyboardListenerTest {
    
    private Window TestWindow;
    private KeyboardListener TestKeyboardListener;
    
    @BeforeAll
    public static void setUpAll(){
        System.out.println("Starting the Test file for Keyboard Listener file.");
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("Initial setup for running the test.");
        
        TestWindow = new Window();        
        TestKeyboardListener = new KeyboardListener();
    }
    
    @Test
    @DisplayName("Test when the up key is pressed")
    public void whenPressedUp() {
        KeyEvent key = new KeyEvent(TestWindow, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_UP, 'U');
        TestKeyboardListener.keyPressed(key);
        
    }
    
    @Test
    @DisplayName("Test when the down key is pressed")
    public void workWhenPressedDown() {
        KeyEvent key = new KeyEvent(TestWindow, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_DOWN, 'D');
        TestKeyboardListener.keyPressed(key);
    }
    
    @Test
    @DisplayName("Test when the right key is pressed")
    public void workWhenPressedRight() {
        KeyEvent key = new KeyEvent(TestWindow, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, 'R');
        TestKeyboardListener.keyPressed(key);
    }
    
    @Test
    @DisplayName("Test when the left key is pressed")
    public void workWhenPressedLeft() {
        KeyEvent key_down = new KeyEvent(TestWindow, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_DOWN, 'D');
        KeyEvent key_left = new KeyEvent(TestWindow, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, 'L');
        
        TestKeyboardListener.keyPressed(key_down);
        TestKeyboardListener.keyPressed(key_left);
    }
    
    @Test
    @DisplayName("Test when any other key is pressed")
    public void notWorkWhenAnythingPressed() {
        KeyEvent key = new KeyEvent(TestWindow, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_1, '1');
        TestKeyboardListener.keyPressed(key);
        
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
        System.out.println("All Test in the Keyboard Listner Test file is done.");
    }
}
