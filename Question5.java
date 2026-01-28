 class Book {

    int bookId;
    String title;
    double price;


    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        
    }
}

public class Question5 {
    public static void main(String[] args) {

        
        Book[] books = new Book[5];

        
        books[0] = new Book(101, "Java Programming", 650);
        books[1] = new Book(102, "Data Structures", 480);
        books[2] = new Book(103, "OOP Concepts", 720);
        books[3] = new Book(104, "Database Systems", 550);
        books[4] = new Book(105, "Computer Networks", 400);

        double totalPrice = 0;

        System.out.println("Books with price greater than 500:");
        
        for (int i = 0; i < books.length; i++) {

            totalPrice += books[i].price;

            
            if (books[i].price > 500) {
                books[i].display();
            }
        }

    
        double averagePrice = totalPrice / books.length;

        System.out.println("Average price of all books: " + averagePrice);
    }
}

