interface Test {
    int square(int num);
}
class Arithmetic implements Test {
    @Override
    public int square(int num) {
        return num * num;
    }
}
public class ToTestInt {
    public static void main(String[] args) {
        // Create an object of Arithmetic class
        Arithmetic arithmetic = new Arithmetic();

        // Use the object of Arithmetic class to call the square method
        int result = arithmetic.square(5);
        System.out.println("Square of 5 is: " + result);
    }
}