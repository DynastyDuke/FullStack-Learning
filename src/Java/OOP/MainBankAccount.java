package Java.OOP;

import java.util.Scanner;

public class MainBankAccount {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        BankAccount a = new BankAccount("1234", "2345",
                "puppy", 1000000);

        int input;
        do {
            System.out.println("""
                    Please enter your operation:
                    1.deposit
                    2.withdraw
                    3.check balance
                    4.exit""");

            input = in.nextInt();

            if (input == 1) {
                int amount = inputAmount();
                a.deposit(amount);
            } else if (input == 2) {
                int amount = inputAmount();
                a.withdraw(amount);
            } else if (input == 3) {
                a.checkBalance();
            } else if (input == 4) {
                System.out.println("Thank you!");
            } else {
                System.out.println("Invalid enter,please re-enter.");
            }
        } while (input != 1 && input != 2 && input != 3 && input != 4);
    }

    public static int inputAmount() {
        System.out.println("please enter the amount:");
        return in.nextInt();
    }
}
