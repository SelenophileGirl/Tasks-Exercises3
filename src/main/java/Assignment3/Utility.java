package Assignment3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Utility {

    /** Method finds count of occurrences of regex in text and returns the matches*/
    public static ArrayList<String> findOccurrences(String regex, String line) {

        ArrayList<String> matches = new ArrayList<String>();

        Pattern p = Pattern.compile(regex);   // the pattern to search for
        Matcher m = p.matcher(line); // search for pattern in text

        // now try to find at least one match
        int NumberOfOccurrences = 0;
        while (m.find()) {
            NumberOfOccurrences++;
            matches.add(m.group().trim());
        }
        System.out.println("Number of Occurreces: " + NumberOfOccurrences);

        return matches;
    }

}
