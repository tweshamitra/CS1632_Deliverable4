import java.util.*;
import java.io.*;
public class Element{

    public static void main(String[] args) throws IOException{ 
        HashMap <String, String> elements = new HashMap<>();
        String filename = args[0];
        readInputFile(filename);
        createHashmap(elements);        
    }

    public static void createHashmap(HashMap elements) throws IOException {        
        Scanner s = new Scanner(new File("elements.txt")).useDelimiter("\\s*,\\s*");
        while(s.hasNext()){            
            String line = s.next();
            String[] parts = line.split(":");
            elements.put(parts[0], parts[1]);
        }
    }

    public static void readInputFile(String filename) throws IOException{
        Scanner s = new Scanner(new File(filename));
        while(s.hasNext()){
            String name = s.nextLine();
        }
    }
}