package oops.practice;

import java.util.Arrays;
public class ClassExample {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student student1 = new Student();
        student1.name = "a";
        student1.rollno = 21;
        Student student2 = new Student();

        System.out.println(Arrays.toString(students));
        System.out.println(student1.rollno);
        Student student3 = new Student(5, "c");
        System.out.println(student3.rollno + " " + student3.name);

        student3.changeName("aakash");
        System.out.println(student3.name);
        Student student4 = new Student();
        student4.rollno = 23;
        System.out.println(student4.rollno);


        Student one = new Student();
        Student two = one;

        one.name = "hi";
        System.out.println(two.name);

        two.name = "hello";
        System.out.println(two.name + "  " + one.name);
    }
}
    class Student{
        int rollno;
        String name;

        Student(int rollno, String name){
            this.rollno = rollno;
            this.name= name ;
        }
        Student(){
            this.rollno = rollno;
            this.name= name ;
        }
        void changeName( String name ){
            this.name = name;
        }
    }

