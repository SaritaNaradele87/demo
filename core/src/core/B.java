package core;

public class B {
     public void m2()
     {
    	 System.out.println("m2==B");
     }
     public static void main(String args[]) 
     {
    	A a=new A();
    	a.m1();
    	B b= new B();
    	b.m2();
     }
}
