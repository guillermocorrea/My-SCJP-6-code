package book;
import cert.*;
public class B extends A{

    final int x = 10;
   
    public void doSomething() {
	System.out.println("A says: " + x + " " + saySomething());
    }

    public static void main(String[] args) {
	B b = new B();
	b.doSomething();
    }
}