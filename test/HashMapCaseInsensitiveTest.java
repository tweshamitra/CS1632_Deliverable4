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

    
    /**
        This tests that my containsKey method works. If I put a key-value pair into the hashmap,
        the method should return true when I call containsKey on a specific.
     */
    
    @Test
    public void testContainsKey(){
        testHashmap.put("O", "Oxygen");
        assertTrue(testHashmap.containsKey("O"));
    }

    /**
         This tests that my containsKey method works. If the hashmap is empty, 
         the method should return false when I call containsKey on that specific key. 
     */
    @Test 
    public void testNotContainsKey(){
        assertFalse(testHashmap.containsKey("O"));
    }

    /**
        This tests getKey on an emtpy hashmap. The value returned should be null because
        there is no key-value pair in the hashmap.
     */
    @Test
     public void testGetKeyEmpty(){
       assertNull(testHashmap.get("O"));  
     }

    /**
        This tests getKey for a hashmap with a key value pair. 
        The value returned should be the value put in as the value for the key.
    */
    @Test
    public void testGetKey(){
        testHashmap.put("O", "Oxygen");
        assertEquals("Oxygen", testHashmap.get("O"));
    }
}