package homework.week02;

import java.util.Scanner;

public class MainLibrary {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        LibraryBook book1 = new LibraryBook("MicroEconomic", "001");
        LibraryBook book2 = new LibraryBook("MacroEconomic", "002");

        int chose;
        do {
            System.out.println("""
                please select an operation:
                1.borrowbook
                2.returnbook
                3.query total number of books
                4.exit
                """);
            chose = in.nextInt();
            int type;
            switch (chose) {
                case 1:
                    System.out.println("borrow which book?" +
                            "1.MicroEconomic" +
                            "2.MacroEconomic");

                    do {
                        type = in.nextInt();
                        if (type == 1) {
                            book1.borrowBook();
                        } else if (type == 2) {
                            book2.borrowBook();
                        } else {
                            System.out.println("Invalid input, please enter again:");
                        }
                    } while (type != 1 && type != 2);break;

                case 2:
                    System.out.println("return which book?" +
                            "1.MicroEconomic" +
                            "2.MacroEconomic");

                    do {
                        type = in.nextInt();
                        if (type == 1) {
                            book1.returnBook();
                        } else if (type == 2) {
                            book2.returnBook();
                        } else {
                            System.out.println("Invalid input, please enter again:");
                        }
                    } while (type != 1 && type != 2);
                    break;
                case 3:
                    System.out.println("Total books :" + LibraryBook.getTotalBooks());
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid input, please enter again:");
            }
        } while (chose != 4);
    }

}
