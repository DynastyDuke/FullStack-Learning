package Java.OOP;

public class Student0603 {

    String name;
    int age;
    String studentId;
    double score;
    String hobby;

    void study(){
        System.out.println(name+"study diligently");
    }

    String rest(){
        return name + "afterschool, ready to rest.";
    }

    String eat(String food){
        return name + "eating" + food;
    }

    void play(Boolean outdoors) {
        if (outdoors) {
            System.out.println(name + "playing outdoors.");
        } else {
            System.out.println(name + "playing indoors");
        }


    }
    void exam() {
        System.out.println("Exams are coming soon,so");
        study();
    }


}
