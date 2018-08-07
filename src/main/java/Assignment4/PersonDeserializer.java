package Assignment4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class PersonDeserializer {

    /** Method to deserialize an object of type Person from "PersonObject.ser" file and print it's variables*/
    public static Person deserializeObject() {

        Person obj = new Person();
        obj.setId(0);
        obj.setName("");

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("PersonObject.ser"))) {
            System.out.println("Deserialize Object!");
            obj = (Person) in.readObject();
            obj.printDetails();
        } catch (Exception e) {
            System.out.println("Could not deserialize object!");
            e.printStackTrace();
        }

        return obj;
    }
}

