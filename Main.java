class Outer {
    void display() {
        System.out.println("Outer display() method");
    }

    class Inner {
        void display() {
            System.out.println("Inner display() method");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display(); // calling the outer class display() method

        Outer.Inner inner = outer.new Inner();
        inner.display(); // calling the inner class display() method
    }
}
        