package Java.OOP;

public class StudentClassTest0603 {
    public static void main(String[] args){

        Student0603 s = new Student0603();

        s.name = "bitch";
        s.age = 25;
        s.studentId = "10412177";
        s.score = 99;
        s.hobby = "be a joker";


        System.out.println(
                "name" + s.name + "\n" +
                "age" + s.age + "\n" +
                "student ID" + s.studentId + "\n" +
                "score" + s.score + "\n" +
                "hobby" + s.hobby
        );
    }
}
