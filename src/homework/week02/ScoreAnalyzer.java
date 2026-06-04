package homework.week02;

import java.util.Scanner;

//氣泡升序再反轉版本(待補無反轉反著輸出版本、氣泡降序版本
public class ScoreAnalyzer {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] scores = new int[5];
        String[] subjects = {"Chinese", "English", "Mathematics", "Natural", "Society"};

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("please enter your %s score:", subjects[i]);
            scores[i] = in.nextInt();
        }
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;

                    String temp2 = subjects[j];
                    subjects[j] = subjects[j + 1];
                    subjects[j + 1] = temp2;
                }
            }
        }

        for (int i = 0, j = scores.length - 1; i < j; i++, j--) {
            int temp = scores[j];
            scores[j] = scores[i];
            scores[i] = temp;

            String temp2 = subjects[j];
            subjects[j] = subjects[i];
            subjects[i] = temp2;
        }

        int ave = 0;
        for (int j = 0; j < scores.length; j++) {
            System.out.printf("your %s scores is %d.%n", subjects[j], scores[j]);
            ave += scores[j];
        }
        System.out.printf("your average score is %d.%n", ave / scores.length);
        System.out.printf("your max score is %s: %d points.%n" +
                        "your min score is %s: %d points.%n", subjects[0], scores[0],
                subjects[subjects.length - 1], scores[scores.length - 1]);
    }
}
