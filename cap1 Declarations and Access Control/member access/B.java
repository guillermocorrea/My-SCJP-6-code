public class B {
   
    public void doSomething() {
	A a = new A();
	System.out.println("A says: " + a.saySomething() + " ... " + A.saySomething());
    }

    public static void main(String[] args) {
	B b = new B();
	b.doSomething();
    }
}