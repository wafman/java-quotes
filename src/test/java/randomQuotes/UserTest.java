package randomQuotes;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void testConstructor(){
        User u = new User("William", "180 likes", "this is a test");
        assertEquals("should return user name", "William", u.getAuthor());
    }

    @Test
    public void testToString(){
        User u = new User("William", "180 likes", "this is a test");
        String expectedOutput = "William\n" +
                "180 likes\n" +
                "this is a test";
        assertEquals("should return user name, likes and quote", expectedOutput, u.toString());
    }

}