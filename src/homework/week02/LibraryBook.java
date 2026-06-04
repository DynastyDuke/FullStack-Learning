package homework.week02;

public class LibraryBook {

    private String title;
    private final String bookID;
    private boolean borrowed;
    private static int totalBooks;

    public LibraryBook(String title, String bookID) {
        this.title = title;
        this.bookID = bookID;
        this.borrowed = false;
        totalBooks++;
    }

    public void borrowBook() {

        if (!borrowed) {
            borrowed = true;
            System.out.println("Book borrowing successful.");
        } else {
            System.out.println("Book has been checked out.");
        }
    }

    public void returnBook() {

        if (borrowed) {
            borrowed = false;
            System.out.println("Book returning successful.");
        } else {
            System.out.println("Book hasn't been checked out.");
        }
    }

    public static int getTotalBooks(){
        return totalBooks;
    }


}
