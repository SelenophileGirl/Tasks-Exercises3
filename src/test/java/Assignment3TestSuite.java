import Assignment3.RegexInText;
import Assignment3.Utility;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Assignment3TestSuite {

    String line = "not all words are beautiful";
    String regex = "\\bwords\\b";
    ArrayList<String> array;


    @Test
    public void testAText(){

        array = Utility.findOccurrences(regex , line);
        assertEquals(array.size() , 1);
        assertTrue(array.get(0).equals("words"));
    }

    @Test
    public void testEmptyText(){

        line = "";
        array = Utility.findOccurrences(regex , line);
        assertEquals(array.size() , 0);
    }

}
