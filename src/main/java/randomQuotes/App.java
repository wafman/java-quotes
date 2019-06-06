/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package randomQuotes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Random;


public class App {

    public static void main(String[] args) throws FileNotFoundException{

        System.out.println(randomQuote("src/main/resources/quoteData.txt"));

    }


    public static User randomQuote(String path)throws FileNotFoundException{
        Gson gson= new GsonBuilder().setPrettyPrinting().create();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        User[] users = gson.fromJson(bufferedReader, User[].class);

        return users[randomNumber(users)];
    }

    public static int randomNumber(User[] arr){
        Random rand = new Random();
        int i = rand.nextInt(arr.length);
        return i;
    }
}
