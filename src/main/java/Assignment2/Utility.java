package Assignment2;

import java.util.HashMap;
import java.util.Map;

public abstract class Utility {

    /** Method to find the return the length of the longest word in an array*/
    public static int maxWordLength(String[] words){

        int maxLength = words[0].length();
        for(int i = 0 ; i < words.length ; i++){
            if(maxLength < words[i].length()){
                maxLength = words[i].length();
            }
        }

        return maxLength;
    }

    /** Method finds count of occurrences of n letters words in text*/
    public static Map<Integer, Integer> findOccurrences(String[] words, int maxLength) {

        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        if (words.length >= 1) {
            // Initialization of HashMap with Length of words as keys
            for (int j = 1; j <= maxLength; j++) {
                occurrences.put(j, 0);
            }

            // Populate HashMap with number of occurrences of each n letters words
            for (int i = 0; i < words.length; i++) {
                int wordLength = words[ i ].length();
                if (occurrences.containsKey(wordLength)) {
                    occurrences.put(wordLength, occurrences.get(wordLength) + 1);
                }
            }
        }

        return occurrences;
    }

    public static void printMap(Map<Integer, Integer> counter) {

        System.out.println(" Occurrence |       word");
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getKey() == 1) {
                System.out.println( "      " +
                                    entry.getValue() +
                                    "     | " + " \'" + Number.getNumberAsWord(entry.getKey()) +
                                    " letter word\'");
            } else {
                System.out.println( "      " +
                                    entry.getValue() +
                                    "     | " + " \'" +
                                    Number.getNumberAsWord(entry.getKey()) +
                                    " letters word\'");
            }
            System.out.println("---------------------------------");
        }

    }
}
