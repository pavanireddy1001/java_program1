class Vechile
{
void run()
{
System.out.println("vechile is running");
}
}
class Bike2 extends Vechile
{
void run(){
System.out.println("bike is running safely");
}
}
public static void main(String args[])
{
	Bike2 obj=new Bike2();
	obj.run();
}
}