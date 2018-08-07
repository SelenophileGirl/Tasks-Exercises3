import Assignment4.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Assignment4TestSuite {

    Person p = new Person();

    @Before
    public void init(){

        p.setName("Eman");
        p.setId(14340);
    }


    @Test
    public void testSettersAndGetters(){

        assertEquals(p.getName() , ("Eman"));
        assertEquals(p.getId() , 14340);

    }

    @Test
    public void testEquals(){


        Person p2 = new Person();
        p2.setName("Eman");
        p2.setId(1204);

        assertFalse(p.equals(p2));

        p2.setId(14340);

        assertTrue(p.equals(p2));

    }

    @Test
    public void testClone(){

        try {
            Person p2 = (Person)p.clone();
            assertTrue(p.getName().equals(p2.getName()));
            assertTrue(p.getId() == p2.getId());
            assertTrue(p.equals(p2));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Test
    public void testHashCode(){

        int x = p.getId();  int z = 8;
        assertEquals(p.hashCode() , 114848);
    }

    @Test
    public void testToString(){
        assertEquals(p.toString() , "Person{name='Eman', id=14340}");
    }


}
