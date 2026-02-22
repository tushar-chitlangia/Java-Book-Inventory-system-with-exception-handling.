import java.util.ArrayList;

public class ArrayListOfBook {
    public static void main(String[] args) {
        ArrayList<Book> bList = new ArrayList<>();

        try {
            Book b1 = new Book();
            Book b2 = new Book("Never Lie", 200.05, "ABHHG1234", "Psychological Thriller", "Freida McFadden");
            
            Book b3 = new Book(b2);
            b3.title = "Three Thousand Stitches";
            b3.ISBN = "JBSD12343";
            b3.price = 980.6;
            b3.author = "Sudha Murty";
            b3.genre = "Non fiction";

            Book b4 = b1;
            b4.title = "Ward D";
            b4.price = 250.00;
            b4.genre = "Psychological Thriller";
            b4.ISBN = "JADK7346";
            b4.author = "Freida McFadden";

            bList.add(b1);
            bList.add(b2);
            bList.add(b3);
            bList.add(b4);
        } catch (Exception e) {
            System.err.println("Unexpected Error: " + e.getMessage());
        }

        // 2. Triggering InvalidTitleException
        try {
            System.out.println("--- Testing Title Exception ---");
            // This will throw InvalidTitleException because of the blank spaces
            Book b5 = new Book("   ", 15.00, "X123", "Fiction", "Author");
            bList.add(b5);
        } catch (InvalidTitleException e) {
            System.err.println("Title Validation Error: " + e.getMessage());
        } catch (InvalidPriceException ip) {
            System.err.println(ip.getMessage());
        }

        // 3. Triggering InvalidPriceException
        try {
            System.out.println("\n--- Testing Price Exception ---");
            // Added Batman as a valid book first
            Book b7 = new Book("Batman", 350.00, "YTGT6543", "Children's", "JSdhbfb");
            bList.add(b7); 

            // This will throw InvalidPriceException because of -350.00
            Book b6 = new Book("Geronimo Stilton", -350.00, "YTGT6543", "Children's", "JSdhbfb");
            bList.add(b6);
            
        } 
        catch (InvalidPriceException ip) {
            System.err.println("Price Validation Error: " + ip.getMessage());
        } 
        catch (InvalidTitleException e) {
            System.err.println(e.getMessage());
        }

        // --- DISPLAY SECTION ---
        System.out.println("\nBooks successfully added: " + bList.size());
        System.out.println("------------------------------");

        double totalPrice = 0;
        for (Book b : bList) {
            System.out.println("Title : " + b.title);
            System.out.println("Author : " + b.author);
            System.out.println("ISBN : " + b.ISBN);
            System.out.println("Price : " + b.price);
            System.out.println("Genre : " + b.genre);
            System.out.println();
            totalPrice += b.price;
        }

        if (!bList.isEmpty()) {
            double averagePrice = totalPrice / bList.size();
            System.out.println("------------------------------");
            System.out.println("Total Books in System: " + bList.size());
            System.out.println("Total Inventory Value: " + totalPrice);
            System.out.println("Average Price: " + averagePrice);
        } else {
            System.out.println("No books were added to the inventory.");
        }
    }
}



// import java.util.ArrayList;

// public class ArrayListOfBook
// {
//     public static void main(String[] args)
//     {
//          // Fix: Declare bList outside try block so it is visible to the loops
//         ArrayList<Book> bList = new ArrayList<>();
//     try{
//         Book b1 = new Book();

//         Book b2 = new Book("Never Lie", 200.05, "ABHHG1234","Psychological Thriller", "Freida McFadden" );
        
//         Book b3 = new Book(b2);
//         b3.title = "Three Thousand Stitches";
//         b3.ISBN = "JBSD12343";
//         b3.price = 980.6;
//         b3.author= "Sudha Murty";
//         b3.genre = "Non fiction";

        
//         Book b4 = b1;
//         b4.title = "Ward D";
//         b4.price = 250.00;
//         b4.genre = "Psychological Thriller";
//         b4.ISBN = "JADK7346";
//         b4.author = "Freida McFadden";

//         Book b = new Book("   ", 15.00, "X123", "Fiction", "Author");

//         bList.add(b1);
//         bList.add(b2);
//         bList.add(b3);
//         bList.add(b4);
//         bList.add(b6);
//         Book b5 = new Book("Geronimo Stilton", -350.00, "YTGT6543", "Children's" , "JSdhbfb");
//         // ArrayList <Book> bList = new ArrayList<Book>();
        
//         bList.add(b5);
//         }

//         catch(InvalidPriceException ip){
//             System.err.println(ip.getMessage());
//         }

//         catch ( InvalidTitleException e) {
//             System.err.println("Validation Error: " + e.getMessage());
//         }

//          System.out.println("Books successfully added: " + bList.size());

//         for(Book b: bList)
//         {
//             System.out.println("Title : " + b.title);
//             System.out.println("Author : " + b.author);
//             System.out.println("ISBN : " + b.ISBN);
//             System.out.println("Price : " + b.price);
//             System.out.println("Genre : " + b.genre);
//             System.out.println();
//         }
//         // ... existing additions to bList ...

// double totalPrice = 0;
// for(Book b : bList) {
//     // Printing logic
//     System.out.println("Title : " + b.title + " | Price : " + b.price);
    
//     // Accumulate total
//     totalPrice += b.price;
// }

// double averagePrice = totalPrice / bList.size();
// System.out.println("------------------------------");
// System.out.println("Total Books: " + bList.size());
// System.out.println("Average Price: " + averagePrice);



//     }
    
// }

