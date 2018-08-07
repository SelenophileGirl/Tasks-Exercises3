package Assignment5;

import java.io.File;
import java.util.Scanner;

/** Program to print full hierarchy of subdirectories and files under the entered directory*/

public class DirectoryPrinter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final File directory = new File(in.nextLine());
        Utility.printFullHierarchy(directory);


    }



}
