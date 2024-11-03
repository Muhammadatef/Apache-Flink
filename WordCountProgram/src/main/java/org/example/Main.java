package org.example;

import p1.WordCount;  // Make sure this package is correct

public class Main {
    public static void main(String[] args) {
        // Pass command line arguments to WordCount
        try {
            WordCount.main(args);  // This will call the main method of WordCount
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace if there's an error
        }
    }
}
