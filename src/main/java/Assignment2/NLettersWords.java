package Assignment2;

import java.util.Map;
import java.util.Scanner;

/**Program that print number of n letters words in a text*/

public class NLettersWords {

    public static void main(String[] args) {

        System.out.println("Enter your text here ..");
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        String[] words = sentence.split(" ");

        // Finding the longest word in the text
        int maxLength = Utility.maxWordLength(words);

        Map<Integer , Integer> counter = Utility.findOccurrences(words , maxLength);

        // printing the table of occurrences!
        Utility.printMap(counter);
        System.out.println(words.length);

    }


}
