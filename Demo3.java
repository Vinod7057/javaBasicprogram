//Hirachical inheritance 

import java.util.Scanner;
class Ab
{
void input()
{
Scanner sc =new Scanner (System.in);
System.out.println("Enter numbers");
a=sc.nextInt();
}
}

class BextendsA
{
void add()
{
System.out.println("add"+(a+b));
}
}

class C extends A
{
void substract()
{
System.out.println("Substract"+(a-b));
}
}

class Demo3
{
public static void main (String args[]){

C a=new C();
a.input();
a.getdata();
a.add();
}
}

