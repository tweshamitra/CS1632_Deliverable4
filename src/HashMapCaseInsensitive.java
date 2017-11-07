import java.util.HashMap;
public class HashMapCaseInsensitive extends HashMap<String, String>{
    public HashMapCaseInsensitive(){
        super();
    }
    @Override
    public String put(String key, String value){
        return super.put(key.toLowerCase(), value);
    }
    @Override
    public boolean containsKey(Object key){
        return super.containsKey(key.toString().toLowerCase());
    }
    @Override
    public String get(Object key){
        return super.get(key.toString().toLowerCase());
    }
}