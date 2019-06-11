package randomQuotes;

import java.util.ArrayList;

public class User {
    private String author;
    private String text;
    private String likes;
    private String quote;
    private String character;

    public User(String author, String text, String likes){
        this.author = author;
        this.text = text;
        this.likes = likes;
    }

    public User(String quote, String character){
        this.quote = quote;
        this.character = character;
        this.text = this.quote;
        this.author = this.character;
    }

    //getters

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    public String getCharacter() {
        return character;
    }

    public String toString(){
        return String.format("%s\n%s", this.author, this.text);
    }


    public String toString_GoT(){
        return String.format("%s\n%s", this.quote, this.character);
    }

}
