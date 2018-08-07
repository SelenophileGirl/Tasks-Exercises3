package Assignment1;

import java.util.Map;
import java.util.Scanner;

/**Program to find the number of occurrences of each letter of the alphabet in a text*/

public class AlphabetLettersOccurrence {

    public static void main(String[] args) {

        System.out.println("Enter your text here ..");
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        Map<Character , Integer> counter = Utility.findOccurrences(sentence);

        // printing the table of occurrences!
        Utility.printOccurrences(counter);

    }



}

