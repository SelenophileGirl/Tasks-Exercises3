import Assignment2.NLettersWords;
import Assignment2.Utility;
import org.junit.Test;

import javax.rmi.CORBA.Util;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class Assignment2TestSuite {

    Map<Integer, Integer> map;
    String[] words = {"hello" , "hi" , "hey" , "bye"};


    @Test
    public void TestAText(){

        map = Utility.findOccurrences(words , 5);
        assertTrue(map.get(1) == 0);
        assertTrue(map.get(2) == 1);
        assertTrue(map.get(3) == 2);
        assertTrue(map.get(4) == 0);
        assertTrue(map.get(5) == 1);

    }

    @Test
    public void TestEmptyText(){

        String[] words = {""};

        map = Utility.findOccurrences(words , 5);
        for(int i = 1 ; i <= 5; i++){
            assertTrue(map.get(i) == 0);
        }
    }

}
