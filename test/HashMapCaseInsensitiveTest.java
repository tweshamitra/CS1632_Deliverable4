import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.*;
public class HashMapCaseInsensitiveTest {
    HashMap<String, String> testHashmap;
    @Before
    public void setup(){
        testHashmap = new HashMapCaseInsensitive();
    }
    /**
        This test makes sure that the constructor of the HashMap is called.
        The object should not be null if the constructor works properly
    */
    @Test 
    public void testNotNullHashmap(){
        assertNotNull(testHashmap);
    }

    /**
        This tests the put method for my hash map class. If the put method 
        works correctly, the key should have been made lower case when put into the hashmap.
     */
    @Test 
    public void testPut(){
        testHashmap.put("ASDF", "1");
        String answer = "";
        for(String key : testHashmap.keySet()){
            answer = testHashmap.keySet().toString();
        }
        assertEquals("[asdf]", answer);
    }

    
    @Test
    public void testContainsKey(){
        testHashmap.put("O", "Oxygen");
        assertTrue(testHashmap.containsKey("O"));
    }

    @Test
    public void testGetKey(){
        testHashmap.put("O", "Oxygen");
        assertEquals("Oxygen", testHashmap.get("O"));
    }
}