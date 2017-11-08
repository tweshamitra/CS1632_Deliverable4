import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.*;
import java.io.*;

public class ElementTest{
    Element test = new Element();
  
   /**
        This tests that a new Element class is instantiated so that the main method can run.
    */
   @Test 
   public void testNotNull(){
       assertNotNull(test);
   }
    /**
        This test that when readInputFile is called in the class,
        it returns a scanner which is not null
     */
    @Test 
    public void testReadInputFile() throws IOException{
        String filename ="elements.txt";
        Scanner s = null;
        assertNotNull(test.readInputFile(filename, s));
    }

    /**
        This test verifies that the put method from the hashmap class is called
        in my createHashmap method.
     */
    @Test
    public void testCreateHashmap() throws IOException{
        HashMap testHashmap = mock(HashMap.class);
        Scanner s = null;
        String filename = "elements.txt";
        test.createHashmap(testHashmap, s);
        verify(testHashmap).put("O", "Oxygen");
    }

}