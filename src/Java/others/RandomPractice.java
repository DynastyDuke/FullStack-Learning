package Java.others;

import java.util.Scanner;

public class RandomPractice {

    public static void guessNumber() {
        Scanner in = new Scanner(System.in);
        int ans = (int) (Math.random() * 100 + 1);
        int guess;

        do {
            System.out.println("Enter the number you guessed:");
            guess = in.nextInt();

            if (ans > guess) {
                System.out.println("Too small.");
            } else if (ans < guess) {
                System.out.println("Too big.");
            } else {
                System.out.println("Guessed right!");
            }

        } while (ans != guess);
    }

    public static void dropRate() {
        System.out.println("Defeat the monster.");
        double rate = Math.random();
        if (rate <= 0.2) {
            System.out.println("treasure chest");
        } else {
            System.out.println("nothing happen");
        }
    }

    public static void gachaSimulator() {
        double drop;
        System.out.println("10-pull start!");

        for (int i = 1; i <= 10; i++) {
            drop = Math.random();
            if (drop <= 0.01) {
                System.out.println("5*");
            } else if (drop <= 0.1) {
                System.out.println("4*");
            } else {
                System.out.println("3*");
            }
        }
    }

    public static void passwordGenerator(){
        char[] upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] lower = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] digit = "0123456789".toCharArray();
        char[][] pool = { upper, lower, digit };

        String pwd= "";
        for(int x=1;x<=8;x++) {
            int i = (int) (Math.random() * 3);
            int j = (int) (Math.random() * pool[i].length);
            pwd += pool[i][j];
        }
        System.out.println("Password is :"+pwd);
    }

    public static void diceStas() {

        int[] count = new int[6];
        for (int i = 1; i <= 6000; i++) {
            int dice = (int) (Math.random() * 6 + 1);
            count[(dice - 1)]++;
        }
        for (int i = 1; i <= 6; i++) {
            System.out.printf("%d appears %d,probability is %.2f%%.%n", i, count[i - 1], (double) (count[i - 1]) / 60);
        }
    }

    public static void main(String[] args) {

        passwordGenerator();
    }
}
