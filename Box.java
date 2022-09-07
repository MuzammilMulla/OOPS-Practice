package oops.practice.inheritance;

public class Box {
    int l;
    int w;
    int h;

    public Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box (Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void sum(){
        int sum = this.l+this.h+ this .w;
        System.out.println(sum);
    }

}
