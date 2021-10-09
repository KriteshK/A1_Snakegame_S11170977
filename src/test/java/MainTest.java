
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kritesh Kumar S11170977
 */
public class MainTest {

    private Main TestMain;

    
    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
    	TestMain = new Main();
    	Main.main(null);
    	
        assertNotNull(TestMain);
        
        
        
    }
    
    
    
}
