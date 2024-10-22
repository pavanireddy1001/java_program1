class Student{
int addmission;
String name;
int mobilenumber;
float fee;
}
class BCA{
public static void main(String[]args){
Student s1= new Student();
Student s2= new Student();
Student s3= new Student();
s1.addmission=06;
s1.name="pavani";
s1.mobilenumber=72074;
s1.fee=40000;
s2.addmission=90;
s2.name="sreeja";
s2.mobilenumber=1234;
s2.fee=50000;
s3.addmission=80;
s3.name="bindu";
s3.mobilenumber=98798;
s3.fee=50000;
System.out.println(s1.addmission+" "+s1.name+" "+s1.mobilenumber+" "+s1.fee);
System.out.println(s2.addmission+" "+s2.name+" "+s2.mobilenumber+" "+s2.fee);
System.out.println(s3.addmission+" "+s3.name+" "+s3.mobilenumber+" "+s3.fee);
}
}