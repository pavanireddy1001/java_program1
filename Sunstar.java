abstract class Sunstar
{
  abstract void printlnfo();
}
class Employee extends Sunstar
{
  void printinfo()
  {
    String name = "avinash";
    int age=21;
    float salary = 222.2F;
    System.out.println(name+" "+age+" "+salary);
  }
}
class Base
{
  public static void main(String[]args)
  {
    Sunstar s = new Employee();
    s.printinfo();
  }
}