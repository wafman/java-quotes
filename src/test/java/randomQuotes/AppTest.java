/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package randomQuotes;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class AppTest {
    @Test (expected = FileNotFoundException.class)
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("should return random user quote", classUnderTest.randomQuote("src/main/resources/quoteData.txt"));
    }
}
