package Assignment4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersonSerializer {

    /** Method to serialize an object of type Person into "PersonObject.ser" file*/
    public static void serializeObject(Person p) {

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("PersonObject.ser"))){
            out.writeObject(p);
            System.out.println("Object Serialized!");
        }catch(Exception e) {
            System.out.println("Object didn't Serialize!!");
            e.printStackTrace();
        }

    }
}
