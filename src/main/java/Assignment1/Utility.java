package Assignment1;

import static Assignment2.Number.*;
import java.util.HashMap;
import java.util.Map;

public abstract class Utility {

    /** Method finds count of occurrences of alphabet letters in text*/
    public static Map<Character , Integer> findOccurrences(String sentence){
        // Initialization of HashMap with all lowercase english letters as keys
        Map<Character, Integer> occurrences = new HashMap<Character, Integer>();
        for (int c = 'a'; c <= 'z'; c++) {
            occurrences.put((char) c , 0);
        }

        // Populate HashMap with number of occurrences of each letter
        for (int i = 0; i < sentence.length(); i++) {
            char lowercaseChar = Character.toLowerCase(sentence.charAt(i));
            if (occurrences.containsKey(lowercaseChar))
                occurrences.put(lowercaseChar, occurrences.get(lowercaseChar) + 1);
        }

        return occurrences;
    }

    public static void printOccurrences(Map<Character , Integer> occurrences){

        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            if(entry.getValue() == 1 || entry.getValue() == 0){
                System.out.println(getNumberAsWord(entry.getValue()) + "  " + entry.getKey());
            }else{
                System.out.println(getNumberAsWord(entry.getValue()) + "  " + entry.getKey() + "'s" );
            }

            System.out.println("-------------------");
        }

    }

}
