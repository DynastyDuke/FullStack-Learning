package Java.OOP;

public class Student {

    private String name;
    private int age;
    private int score;
    private String school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Student(String name, int age, int score, String school) {

        this.name = (name != null) ? name : "未命名";
        this.age = (age >= 0) ? age : 0;
        this.score = (score>=0&&score<100)?score:0;
        this.school = (school != null) ? school : "unknown";
    }
}
