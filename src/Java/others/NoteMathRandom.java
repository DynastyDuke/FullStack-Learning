package Java.others;

import java.util.Random;

public class NoteMathRandom {

    public static void mathBasic() {
        //Math.abs
        System.out.println(Math.abs(-5));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(5 - 7));

        //Math.max/min
        int[] arr = {5, 1, 8, 6, 7, 3};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println("max: " + max + ", min: " + min);

        int maxValue = Math.max(10, 20);
        int minValue = Math.min(10, 20);
        System.out.println("max: " + maxValue + ", min: " + minValue);

        //Math.sqr
        System.out.println(Math.sqrt(2));
        System.out.println(Math.sqrt(-2));//NaN

        //Math.pow
        System.out.println(Math.pow(7, 0));
        System.out.println(Math.pow(4, 0.5));

        //向上取整
        System.out.println(Math.ceil(7.7));
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.ceil(-2.8));

        //向下取整
        System.out.println(Math.floor(7.7));
        System.out.println(Math.floor(5.1));
        System.out.println(Math.floor(-2.8));

        //Math.round
        System.out.println(Math.round(3.2));
        System.out.println(Math.round(3.5));
        System.out.println(Math.round(-2.2));
        System.out.println(Math.round(-2.6));

        //constant
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }

    public static void mathRandom() {

        //(Math.random()*((max-min+1))+min
        //dice
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println(dice);

        //Random Class
        Random rand = new Random();
        int num = rand.nextInt(10);
        double d = rand.nextDouble();
        boolean b = rand.nextBoolean();
        System.out.println("int: " + num + "\ndouble: " + d + "\nboolean: " + b);

        //random(seed)
        Random rand2 = new Random();
        int dice2 = rand2.nextInt(6) + 1;
        System.out.println(dice2);

        Random rand3 = new Random();
        int dice3 = rand2.nextInt(6) + 1;
        System.out.println(dice3);
    }

    public static void main(String[] args) {
        mathRandom();
    }
}
