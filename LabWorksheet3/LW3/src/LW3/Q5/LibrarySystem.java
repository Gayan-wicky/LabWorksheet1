package LW3.Q5;

public class LibrarySystem {
    public static void main(String[] args) {


        Book book1 = new Book("Madol duwa", "Martin Wickramasinghe", "9789553023975");
        Book book2 = new Book("sherlock holmes", "chandana mendis", "9789553548721");
        Book book3 = new Book("fifty", "justin", "9781616953623");


        Library library = new Library();

        library.addLibraryItem(book1);
        library.addLibraryItem(book2);
        library.addLibraryItem(book3);

        library.displayLibraryInfo();

        library.listAvailableItems();

        library.checkoutItem("Island of a Thousand Mirrors");

        library.listAvailableItems();
    }
}