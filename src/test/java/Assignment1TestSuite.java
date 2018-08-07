import Assignment1.AlphabetLettersOccurrence;
import Assignment1.Utility;
import org.junit.Test;
import java.util.Map;
import static org.junit.Assert.*;

public class Assignment1TestSuite {

    Map<Character, Integer> map;


    @Test
    public void TestAText(){

        map = Utility.findOccurrences("a bb ddd");
        assertTrue(map.get('a') == 1);
        assertTrue(map.get('b') == 2);
        assertTrue(map.get('d') == 3);

    }

    @Test
    public void TestEmptyText(){

        map = Utility.findOccurrences("");
        for(char i = 'a' ; i <= 'z' ; i++){
            assertTrue(map.get(i) == 0);
        }
    }

}
