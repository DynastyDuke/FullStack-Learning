package practice;
import java.util.Scanner;
public class WhileSyntax {

    public  String name;

    public static void p1() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void p2() {
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    public static void p3() {
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.printf("sum is: %d%n", sum);
    }

    public static void p4() {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }

    static Scanner in = new Scanner(System.in);
    public static void p5(){

        int inputnum =1;
        while(inputnum!=0){
            System.out.println("input number:");
            inputnum = in.nextInt();
        }System.out.println("end");
    }

    public static void p06(){

        System.out.println("input a number:");
        int n = in.nextInt();
        int i = 1;
        int sum =0;
        while(sum<n){
            sum+=i;
            i++;
        }System.out.printf("sum: %d, last number is %d%n",sum,i-1);

    }

    public static void p07(){

        int num=51;
        while(num!=50){
            System.out.println("input num:");
            num = in.nextInt();
        }System.out.println("answer is 50!");
    }

    public static void p08(){

        int input = 1;
        int frequency = 0;
        int sum = 0;
        while(input!=0){
            System.out.println("input a number");
            input = in.nextInt();
            frequency +=1;
            sum+=input;

        }System.out.printf("sum is: %d, input %d numbers, " +
                "average is %d.%n",sum,frequency,sum/frequency);
    }

    public static void main(String[] args) {
        p08();
    }

}
