package oops.practice.exceptionHandlng;

public class NewThrow  {
    String name;
    int age;
    int [] arr;


    public NewThrow(String name, int age) {
        this.name = name;
        this.age= age;

    }

        public  NewThrow(NewThrow other ){
            this.name = other.name;
            this.age= other.age;
        }
}
