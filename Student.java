//Static data members program

 class Student
{
 int rollno;
String name;
static String cname=("vivekanand college");

Student(int x ,String y)
{
rollno=x;
name=y;
}
   void display()
{
System.out.println("rollno="+rollno+"name="+name+"collegename"+cname);
}
}
 
class Demo
{
public static void main(String[] args){
Student a=new Student(101,"Aditya");
Student b=new Student(102,"ganesh");
a.display();
b.display();
}
}
 

