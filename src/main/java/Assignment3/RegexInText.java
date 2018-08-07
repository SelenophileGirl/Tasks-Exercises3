package Assignment3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/** Program that find, count and  prints the occurrences of a user input regex in a text*/

public class RegexInText {

    public static void main(String[] args) {

        System.out.println("Enter the prefered Regex");
        Scanner in = new Scanner(System.in);
        String regex = in.nextLine();


        String text = "";
        try { // try reading text from file
            BufferedInputStream fileToReadFrom = new BufferedInputStream(new FileInputStream("text.txt"));
            int b;
            while ((b = fileToReadFrom.read()) != -1) {
                text += (char) b;
            }

            System.out.println("your text: ");
            System.out.println(text);
            System.out.println("\n");

            ArrayList<String> matches = Utility.findOccurrences(regex, text);

            System.out.println("\n");
            System.out.println("Occurrences of \"" + regex + "\": ");
            int i = 1;
            for (String s : matches) {
                System.out.println("match " + i + " : " + s);
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            in.close();
        }

    }


}
