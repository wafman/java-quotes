package randomQuotes;

import java.util.ArrayList;

public class User {
    private String author;
    private String likes;
    private String text;
    private ArrayList<String> tags;

    public User(String author, String likes, String text){
        this.tags = new ArrayList<>();
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public String toString(){
        return String.format("%s\n%s\n%s", this.author, this.likes, this.text);
    }

}
