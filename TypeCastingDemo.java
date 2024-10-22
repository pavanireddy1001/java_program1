public class TypeCastingDemo {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening Conversion)
        int intValue = 10;
        long longValue = intValue; // int to long
        float floatValue = longValue; // long to float
        double doubleValue = floatValue; // float to double
        
        System.out.println("Implicit Type Casting:");
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
        
        // Explicit Type Casting (Narrowing Conversion)
        double doubleNum = 10.5;
        float floatNum = (float) doubleNum; // double to float
        long longNum = (long) floatNum; // float to long
        int intNum = (int) longNum; // long to int
        
        System.out.println("\nExplicit Type Casting:");
        System.out.println("double value: " + doubleNum);
        System.out.println("float value: " + floatNum);
        System.out.println("long value: " + longNum);
        System.out.println("int value: " + intNum);
    }
}

