//Static memberfunctions

class Student1
{
int roll;
String name;
static String cname="vivekanand";
Student1(int x,String y)
{
roll=x;
name=y;
}

void display()
{
System.out.println("roll="+roll+"name="+name+"college name="+cname);
}

 static void change()
{
cname="Abc";
}
 

class demo
{
public static void main(String args[])
{
Student a=new Student(111,"Aditya");
Student b=new Student(222,"kunal");
a.display();
b.display();
Student.change();
a.display();
b.display();
}
}
}
