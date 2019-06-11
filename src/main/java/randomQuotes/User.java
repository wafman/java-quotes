package randomQuotes;


public class User {
    private String author;
    private String text;
    private String likes;
    private String quote;
    private String character;

    public User(String author, String likes, String text ){
        this.author = author;
        this.text = text;
        this.likes = likes;
    }

    public User(String quote, String character){
        this.quote = quote;
        this.character = character;
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
        return String.format("%s\n%s\n%s", this.author, this.likes, this.text);
    }


    public String toString_GoT(){
        return String.format("%s\n%s", this.quote, this.character);
    }

}
