//multiple Inheritance

import java.util.Scanner;
class A
{
  int a;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter numbers");
a=sc.nextInt();
class B extends A
{
  int b;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
b=sc.nextInt();
}

class C extends B
{
void add()
{
System.out.println("Addition"+(a+b));
}
}

class Demo2
{
public static void main(String args)
{
c a=new e();
a.Input();
a.getdata();
a.add();
}
}
}

}

