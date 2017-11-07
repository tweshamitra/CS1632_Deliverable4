import java.util.*;
import java.io.*;
public class Element{

    public static void main(String[] args) throws IOException{ 
        HashMap <String, String> elements = new HashMapCaseInsensitive();
        if(args.length > 1 || args == null){
            System.out.println("Enter one file name");
            System.exit(1);
        }
        String filename = null;
        try{
            filename = args[0];
        } catch(Exception e){
            System.out.println("Usage: <filename>");
            System.exit(1);
        }
        createHashmap(elements);  
        readInputFile(filename, elements);      
    }

    public static void createHashmap(HashMap elements) throws IOException {        
        Scanner s = new Scanner(new File("elements.txt")).useDelimiter("\\s*,\\s*");
        while(s.hasNext()){            
            String line = s.next();
            String[] parts = line.split(":");
            elements.put(parts[0], parts[1]);
        }
    }

    public static void readInputFile(String filename, HashMap elements) throws IOException{
        Scanner s = new Scanner(new File(filename));
        while(s.hasNext()){
            String name = s.nextLine();
            System.out.println(name);
            for (int i = 0; i < name.length(); i++){
                try{
                    if(elements.containsKey(name.charAt(i))){
                        System.out.print(name.charAt(i));
                        System.out.print("-");
                        System.out.println(elements.get(name.charAt(i)));
                    }
                    else if(elements.containsKey(name.substring(i,i+2))){
                            System.out.print(name.substring(i,i+2));
                            System.out.print("-");
                            System.out.println(elements.get(name.substring(i,i+2)));
                            i = i + 2;                        
                        }    
                    else {
                        break;
                    }                
                    
                } catch(Exception e){

                }
                
            }
            System.out.println(" ");
       }
    }
  
}