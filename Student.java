package OPPS;

public class Student {
    public Student(){
        System.out.println("Non-Parameterized Constructor");
    }

    public Student(int i){
        System.out.println("Parameterized Constructor"+ "  "+i);
    }

    public Student(int i, String n){
        System.out.println("My id is "+i);
        System.out.println("My Name is "+n);
    }
}
