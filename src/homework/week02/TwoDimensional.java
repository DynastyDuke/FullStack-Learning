package homework.week02;

public class TwoDimensional {
    public static void p1() {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int[] row : arr) {
            for (int num : row) {
                sum += num;
            }
        }
        System.out.printf("sum: %d", sum);
    }

    public static void p2() {
        int[][] arr = {{3, 7, 2}, {9, 1, 5}, {4, 8, 6}, {2, 10, 3}};

        int max = 0;
        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        System.out.printf("max: %d", max);
    }

    public static void p3() {
        int[][] scores = {{85, 90, 78, 92}, {88, 76, 95, 82}, {92, 88, 85, 90}};

        int i = 0;
        for (int[] row : scores) {
            i += 1;
            int sum = 0;
            for (int score : row) {
                sum += score;
            }

            double ave = sum / (double) row.length;
            System.out.printf("Class %d average is: %.2f%n", i, ave);
        }
    }

    public static void p4() {

        int[][] ori = {{1, 2}, {3, 4}, {5, 6}};
        int[][] arr = new int[2][3];

        for (int i = 0; i < ori.length; i++) {
            for (int j = 0; j < ori[i].length; j++) {
                arr[j][i] = ori[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public static void p5() {

        int[][] scores = {{55, 72, 68}, {48, 65, 78}, {92, 58, 71}, {60, 85, 45}};

        int pass = 0;
        int fail = 0;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] >= 60) {
                    pass += 1;
                } else {
                    fail += 1;
                }
            }
        }
        System.out.printf("pass: %d%n", pass);
        System.out.printf("fail: %d%n", fail);
        System.out.printf("pass rate is: %.2f%n", (double) pass / (pass+fail));
    }


    public static void main(String[] args) {
        p5();
    }
}
