package Java.others;

import java.util.Locale;
import java.util.Scanner;

public class NoteStringChar {

    public static Scanner in = new Scanner(System.in);

    public static void getInformation() {

        String s = "Hello World";
        String s2 = " Hello World ";

        //回傳字串中字元個數
        System.out.println(s.length());//11
        System.out.println(s2.length());//13

        //根據索引提取單一字元
        System.out.println(s.charAt(0));//H
        System.out.println(s.charAt(3));//l
        System.out.println(s.charAt(s.length() - 1));//d

        //搜尋字串第一次出現位置
        System.out.println(s.indexOf('e'));//1
        System.out.println(s.indexOf('l', 4));//9

        //搜尋字串最後一次出現位置
        System.out.println(s.lastIndexOf('l'));//9
        System.out.println(s.lastIndexOf("ld"));//9
    }


    public static void compareInformation() {


        String s = "Hello World";
        String s1 = "hello World";
        //比較字串內容是否完全相等(大小寫敏感)
        System.out.println(s.equals(s1));//false

        /*
        String input = in.nextLine();

        if ("admin".equals(input)){     //不會有null錯誤產生
                System.out.println("Hello admin");
        }
        if (input.equals("admin")){     //可能會有null錯誤產生
            System.out.println("Hello admin");
        }
        */

        //比較字串內容是否完全相等(忽略大小寫敏感)
        System.out.println(s.equalsIgnoreCase(s1));//true
        System.out.println("hello".equalsIgnoreCase("HELLo"));//true

        //比較第一個不同字元的Unicode差值(或長度差)。
        System.out.println(s.compareTo(s1));//32
    }

    public static void stringHelper() {

        //擷取部分字串
        String s = "Hello World";
        String s2 = " Hello World ";
        System.out.println(s.substring(2));
        System.out.println(s.substring(6, 11));//含頭不含尾
        System.out.println(s.substring(0, s.length()));//整個字串

        //轉換全大小寫
        System.out.println(s.toUpperCase());
        System.out.println(s.toUpperCase(Locale.ENGLISH));
        System.out.println(s.toLowerCase(Locale.ENGLISH));

        //去除首尾空白
        System.out.println(s.trim());

        //取代文字
        System.out.println("A B C".replace(" ","_"));//可空格、字元、字串
        System.out.println("aabbcc".replace("ab","xxx"));//可超過原本字數


    }


    public static void main(String[] args) {
        stringHelper();
    }
}
