package book;
public class C extends B{
   
    public static void main(String[] args) {
	B b = new B();
	b.doSomething();
	C c = new C();
	c.saySomething();
    }
}