package Sesi7.dua;

public class Outer {
    int number = 0;

    void outerMethod(){
        class Inner{
            public void print(){
                System.out.println("mengakses inner class yang ke-: " + (number++));
            }
        }
        Inner inner = new Inner(); 
        inner.print();
    }
}

class OuterAcces{
    public static void main(String[] args) {
        Outer outer = new Outer();

        outer.outerMethod();
        outer.outerMethod();
        outer.outerMethod();
    }
}