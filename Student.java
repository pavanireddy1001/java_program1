class Student{
	public void show(){
	System.out.println("Student details.");
}
}
	public class CollegeStudent extends Student{
public void show(){
	System.out.println("CollegeStudent details.");
}
	public static void main(String args[]){
//super class can contain subclass object
Student obj=new College Student();
//method call resolved at runtime
	obj.show();
}
}