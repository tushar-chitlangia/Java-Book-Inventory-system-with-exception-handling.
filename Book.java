public class Book {
    public String title;
    public double price;
    public String ISBN;
    public String genre;
    public String author; 

    public Book(){
        title= "Some Title";
        price= 0.00;
        ISBN= "abcd12345";
        genre= "Crime/Thriller";
        author="Tushar";
        
    }
    public Book(String t, double p, String i, String g, String a) throws InvalidPriceException , InvalidTitleException
    {
        // Check for empty or blank title
        if (t == null || t.trim().isEmpty()) {
            throw new InvalidTitleException("Title cannot be empty or blank.");
        }
         // Check for price
        title= t;
        if (p<0)
            throw new InvalidPriceException("Price cannot be negative");
        price= p;
        ISBN= i;
        genre= g;
        author= a;
        
    }

    public Book(Book b){
        title= b.title;
        price= b.price;
        ISBN= b.genre;
        genre= b.genre;
        author= b.author;
        
    }

}