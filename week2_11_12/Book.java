// Define a class `Book` with the following attributes:
// - `title` (String)
// - `author` (String)
// - `price` (double)

// Create an object of the class in the `main` method and initialize it with sample data. Display the details of the book.


// public class ObjectAndClass1 {
     class Book{
        String title;
        String author;
        double price;
    
    public static void main(String[] args) {
        Book det = new Book();
        det.author="devid";
        det.title="FullStack";
        det.price=450;
        System.out.println("The Title of book is" +" "+ det.title +" " + "and Author is" +" "+ det.author +" " +"and the price of book is:" + det.price);
    }
    
}
