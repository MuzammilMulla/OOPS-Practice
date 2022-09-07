package oops.practice.inheritance;

public class BoxPrint extends Box{
    int weight;

    public BoxPrint(int l, int w, int h, int weight) {
        super(l, w, h);
        this.weight = weight;
    }

    public BoxPrint(Box old, int weight) {
        super(old);
        this.weight = weight;
    }

    public void sub() {
        int sub= this.l- this.weight;
        System.out.println(sub);
    }
}

