package oops.practice.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1= new Box(2,4,6);
        BoxPrint box2 = new BoxPrint(2,4,6, 3);
        System.out.println(box2.weight); //3

        BoxPrint box3= new BoxPrint(box1, 10);
        System.out.println(box3.l + " " + box3.weight);  //2 10

        Box box4 = new BoxPrint(3,5,7,9);
        box4.sum(); //15
        //  --> box4.sub();  // error
        Box box5 = new BoxPrint(3,5,7,9);
        box4.sum(); //15







    }

}
