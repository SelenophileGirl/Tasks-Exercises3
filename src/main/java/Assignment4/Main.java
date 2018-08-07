package Assignment4;

public class Main {

    public static void main(String[] args) {

        Person me = new Person();
        me.setName("Emmy");
        me.setId(14340);


        PersonSerializer.serializeObject(me);
        System.out.println();

        Person deserializedObject = PersonDeserializer.deserializeObject();

    }
}
