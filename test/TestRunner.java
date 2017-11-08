import java.util.ArrayList;

import org.junit.runner.*;
import org.junit.runner.notification.*;

public class TestRunner{
    public static void main(String[] args){
        ArrayList<Class> classes_to_test = new ArrayList<Class>();
        boolean any_failures = false;
        classes_to_test.add(Element.class);
        for(Class c: classes_to_test){
            Result r = JUnitCore.runClasses(c);

            for(Failure f : r.getFailures()){
                System.out.println(f.toString());
            }

            if(!r.wasSuccessful()){
                any_failures = true;
            }
        }

        if(any_failures){
            System.out.println("\n!!! - at least one failure, see above.");
        } else {
            System.out.println("\nALL TESTS PASSED");
        }
    }
    
}
