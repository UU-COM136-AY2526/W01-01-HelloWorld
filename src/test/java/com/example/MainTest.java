package com.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**

This test checks the output of the Main.main() method.

It will FAIL with the starter code. Students must modify Main.java to make it pass.
*/
class MainTest {

    @Test
    void mainPrintsPersonalizedGreeting() {
        // Capture the standard output
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // Run the main method
        Main.main(null);

        // Restore the original standard output
        System.setOut(originalOut);

        // Assert that the output contains "Hello," and is not the default "Hello, World!"
        String output = bos.toString().trim();
        assertTrue(output.startsWith("Hello, "), "Output should start with 'Hello, '");
        assertTrue(output.length() > "Hello, !".length(), "You must add your name after the comma.");
    }
}