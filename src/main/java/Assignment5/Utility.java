package Assignment5;

import java.io.File;

public class Utility {

    /**method recursively printing subdirectories of a directory*/
    public static void printFullHierarchy(final File directory) {
        for (final File fileEntry : directory.listFiles()) {
            if (fileEntry.isDirectory()) {
                System.out.println( "Folder:  " + fileEntry.getPath());
                printFullHierarchy(fileEntry);
            } else {
                System.out.println("File:  " + fileEntry.getName());
            }
            System.out.println();
        }
    }
}
