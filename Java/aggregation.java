public class aggregation {
    public static void main(String[] args) {
        Book_aggregation book1 = new Book_aggregation("The Great Gatsby", 180);
        Book_aggregation book2 = new Book_aggregation("To Kill a Mockingbird", 336);
        Book_aggregation book3 = new Book_aggregation("Pride and Prejudice", 432);

        Book_aggregation[] books = {book1, book2, book3}; //aggregation

        for (Book_aggregation book : books) {
            System.out.println(book.displayInfo());
        }

        Library_aggregation library = new Library_aggregation(
            "My Library", 2023, books
        );

        library.displayInfo();

    }
}
class Book_aggregation{
    String title;
    int pages;

    Book_aggregation(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    String displayInfo(){
        return "Title: " + this.title + "\nPages: " + this.pages;
    }

}

class Library_aggregation{
    String name;
    int year;
    Book_aggregation[] books;

    Library_aggregation(String name, int year, Book_aggregation[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("Library Name: " + this.name);
        System.out.println("Library Year: " + this.year);
        for (Book_aggregation book : this.books) {
            System.out.println(book.displayInfo());
        }
    }
}