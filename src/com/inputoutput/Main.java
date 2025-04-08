// Java program to read and write text to a file
package com.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Main class
public class Main {
    // Main method to run java program
    public static void main(String[] args) throws IOException {

        // Creating objects for reading and writing to a file
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        // Block try-catch to check for exceptions
        try {

            // Initializing FileInputStream with a path
            sourceStream = new FileInputStream(
                    "J:/Users...MyInputOutput/src/com/inputoutput/source.txt");

            // Initializing FileOutputStream with a path
            targetStream = new FileOutputStream(
                    "J:/Users...MyInputOutput/src/com/inputoutput/target.txt");

            // Reading and writing text from one file to another

            int temporal;

            // If there is content inside the file than read it and write to another one
            while ((temporal = sourceStream.read()) != -1) {

                targetStream.write((byte) temporal);

            }

            // Show message for successful execution of program
            System.out.println("Program successfully executed");

        } catch (FileNotFoundException e) {

            System.out.println("FileNotFoundException appeared");
        } catch (IOException e) {

            System.out.println("IOException appeared");

        } finally {

            if (sourceStream != null)
                sourceStream.close();

            if (targetStream != null)
                targetStream.close();
        }

    }
}