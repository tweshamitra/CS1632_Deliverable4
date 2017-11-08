import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ElementTest{
    Element test = new Element();
   
   @Test 
   public void testNotNull(){
       assertNotNull(test);
   }

}