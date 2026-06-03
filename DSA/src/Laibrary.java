import java.util.TreeSet;

public class Laibrary {
   private TreeSet<String>books;
   public Laibrary(){
       books=new TreeSet<>();
   }  public void addBook(String title) {
        if (books.add(title)) {
            System.out.println(title + " added successfully.");
        } else {
            System.out.println( title + "already exists.");
        }
    }public boolean RemoveBooks(String title) {
        if (books.remove(title)) {
            System.out.println(title + "book removed");
        } else {
            System.out.println("book not found");
        }
        return false;
    }public boolean isBookAvailable(String title) {
        if (books.contains(title)) {
            return books.contains(title);
        }
        return false;

    }public void displayAllBooks() {
        System.out.println("list of all books");
        for(String s:books){
            System.out.println(s);



    }}

    public static void main(String[] args) {
      Laibrary l1=new Laibrary();
      l1.addBook("Java Fundamentals");
      l1.addBook("DataBase");
      l1.addBook("Python Basics");
      l1.RemoveBooks("Java Fundamentals");
      l1.isBookAvailable("DataBase");
      l1.displayAllBooks();
    }
}

