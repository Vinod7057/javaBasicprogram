import java.util.Scanner;
class Constructor1  
{
int a=0,b=0;
ConstructorAdd(int x,int y)
{
a=x;
b=y;
}
void input()
{

Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
a=sc.nextInt();
System.out.println("enter Second number");
b=sc.nextInt();
}
 
void display()
{
System.out.println(a +b);
}

void output()
{
int c;
c=a+b;
System.out.println("addition"+c);
}
public static void main(String args[])
{
ConstructorAdd s=new ConstructorAdd();
s.input();
s.display();
s.output();
 }
}

