import java.util.*;
import java.io.*;
import java.lang.*;
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
            System.out.println("Error: File not found");
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
        Scanner s = null;
        try{
            s = new Scanner(new File(filename));
        }catch(FileNotFoundException e){
            System.out.print("Error: File " + filename + " not found");
            System.exit(1);
        }
        while(s.hasNext()){
            String name = s.nextLine();
            ArrayList<String> symbols = new ArrayList<String>();
            String symbol= "";
            boolean clear = false;
                try{
                    for ( int i = 0; i < name.length(); i++){
                        if(elements.containsKey(name.charAt(i))){
                            symbol = "" + name.charAt(i);
                            symbols.add(symbol.toUpperCase());
                        }
                        else if(elements.containsKey(name.substring(i,i+2))){
                            symbol = name.substring(i, i+2);
                            
                            symbols.add(symbol);
                            i++;                        
                            }    
                        else if(name.charAt(i) == ' '){
                            continue;
                        }
                        else {
                            System.out.println("Could not create name, " + name + ", out of elements" + "\n" );
                            clear = true;
                            break;
                        }                
                    }  

                    if(clear == false){
                        for(int x = 0; x <  symbols.size(); x++){
                            String sym = symbols.get(x); 
                            if(sym.length() == 2 ){
                                System.out.print(sym.substring(0,1).toUpperCase() + sym.substring(1));
                            }
                            else{
                                System.out.print(sym);
                            }
                            if(x != symbols.size() -1 ){
                                System.out.print(" - ");
                            }
                        }

                        System.out.println("\n");

                        for(int x = 0; x <  symbols.size(); x++){ 
                            String sym = symbols.get(x);
                            System.out.print(elements.get(sym));
                            if(x != symbols.size() -1 ){
                                System.out.print(" - ");
                            }
                        }
                        System.out.println("\n");

                    }
                    else{
                        symbols.clear();
                    }
                } catch(Exception e){
                }
            }
        }
}