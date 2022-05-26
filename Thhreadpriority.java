class Thhreadpriority
{
   public static void main (String args)
{
   A a=new A();
   B b=new B();
   C c=new C();
   c.setPriority(Thread.MAX_PRIORITY);
   B.setPriority(a.getPriority()+1);
   a.setPriority(Thread.MIN_PRIORITY);
   System.out.println("Thread A Started.. ");
   a.Start();
   System.out.println("Thread B Started.. ");
   b.Start();
   System.out.println("Thread C Started.. ");
   c.Start();
   System.out.println("Main Thread Ended ");
 }
}
   class Aextends Thread 
{
  public void run()
{
   System.out.println("Thread A Started.. ");
   for (int i=1;i<=5;i++)
{
    System.out.println("From Thread A :i="+i);
 }
}
  class B extends Thread
{
   public void run()
{
   System.out.println("Thread B Started");
    for (int i=1;i<=5;i++)
{
   System.out.println("From Thread B :j="+j);
}
   System.out.println("Thread Bends here...");
}
}
 class C extends Thread
{
  Public void run()
{
    System.out.println("Thread C Started");
    for (int i=1;i<=5;i++)
{
   System.out.println("From Thread C :k="+k);
}
   System.out.println("Thread Bends here...");
}
}
