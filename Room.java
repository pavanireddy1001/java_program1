public class Room {
    private int number;
    private int area;
    private String acMachine;
    public Room(int number, int area, String acMachine) {
        this.number = number;
        this.area = area;
        this.acMachine = acMachine;
    }
    public void setNumber(int num) {
        number = num;
    }
    public void setArea(int a) {
        area = a;
    }
    public void setACMachine(String s) {
        acMachine = s;
    } 
    public void displayData() {
        System.out.println("Room Number: " + number);
        System.out.println("Area: " + area + " sq. ft.");
        System.out.println("AC Machine: " + acMachine);
    }
    public static void main(String[] args) {
        Room room1 = new Room(101, 200, "Carrier");
        room1.displayData();
    }
}
