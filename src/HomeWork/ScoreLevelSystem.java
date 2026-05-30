package HomeWork;

import java.util.Scanner;

public class ScoreLevelSystem {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("please enter your score:");
        int sco = in.nextInt();

        if (sco > 100) {
            System.out.println("score entered incorrectly.");
        } else if (sco > 90) {
            System.out.println("your grade is A.");
        } else if (sco > 80) {
            System.out.println("your grade is B.");
        } else if (sco > 70) {
            System.out.println("your grade is C.");
        } else if (sco > 60) {
            System.out.println("your grade is D.");
        } else if (sco > 0) {
            System.out.println("your grade is F.");
        } else{System.out.println("score entered incorrectly");}
        in.close();

    }
}
