public class VariableExample {
    // Global variable
    static int globalVar = 10;

    public void method() {
        // Local variable
        int localVar = 20;

        // Accessing local variable
        System.out.println("Value of localVar: " + localVar);
        
        // Accessing global variable
        System.out.println("Value of globalVar: " + globalVar);
    }

    public static void main(String[] args) {
        VariableExample obj = new VariableExample();
        obj.method();
        
        // Attempting to access the local variable 'localVar' here will result in a compilation error
        // System.out.println("Value of localVar outside method: " + localVar);
        
        // Accessing global variable outside the class
        System.out.println("Value of globalVar outside class: " + globalVar);
    }
}