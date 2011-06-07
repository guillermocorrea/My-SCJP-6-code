public class TestPoli {
   
    public static void main(String[] args) {
	Horse h = new Horse();
	Animal a = h;
	h.eat();
	a.eat();
	Runnable r = h;
	r.run();
	Runnable2 r2 = h;
	r2.run();
	r2.run("down hill");
	
	System.out.println("**************************************************************************");
	Beemer b = new Beemer();
	Car c = b;
	c.start();
	c.run();
	r = b;
	
	r.run();
	System.out.println("**************************************************************************");

	B ob = new B();
	A oa = ob;
	ob.doSomething();
	oa.doSomething();
    }
}

class Animal implements Runnable{
    public void eat() {System.out.println("Animal eating...");}

    public void run() {
	System.out.println("Animal running...");
    }
}

class Horse extends Animal implements Runnable, Runnable2{
    public void eat() {System.out.println("Horse eating...");}

    public void run() {
	System.out.println("Horse running...");
    }

    public void run(String x) {
	System.out.println("Horse running... " + x);
    }

}

interface Runnable {
    void run();
}

interface Runnable2 extends Runnable{
    void run(String msg); 
//    void run();
}

abstract class Car {
    abstract void start();
    void print() {
	System.out.println("Printing car...");
    }
    protected void run() {
	System.out.println("Car running...");
    }
}

class Beemer extends Car implements Runnable{
    /*public void run() {
	System.out.println("Beemer running...");
    }*/

    public void run(){
	super.run();
	super.print();
	System.out.println("Beemer running...");
	super.run();
	print();
    }

    public void start() {
	System.out.println("Beemer starting...");
    }
}

class A {
   C doSomething(){System.out.println("A...");return null;}
}

class B extends A {
   protected D doSomething() {System.out.println("B...");return null;}
}

class C {}
class D extends C {}