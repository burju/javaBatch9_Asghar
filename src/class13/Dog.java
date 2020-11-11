package class13;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.operations.Bool;

public class Dog {

    String type;
    int age;
    Boolean isFriendly;
    String name;
    char gender;
    boolean isHealthy;



    void shouldIAdopt(Boolean isFriendly, Boolean isHealthy){
        if( isFriendly && isHealthy){
            System.out.println("you should adopt the dog");
        }
        else{
            System.out.println("you should take it to a vet");
        }
    }
}
