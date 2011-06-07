class Animal {
    void doSomething() throws Exception{
	System.out.println("A...");
    }
    int doAnimal(){return 0;}
}

public class Dog extends Animal {
    protected void doSomething() throws Exception{
	System.out.println("B...");
    }

    public int changeSize(int size, float pattern) {return 0; }

    public void changeSize(float pattern, String name) throws Exception { }

    public static void main(String[] args) {
	Animal a = new Dog();
	Dog d = new Dog();
	try {
            a.doSomething();
	    d.doSomething();
	} catch (Exception e) {

	}
	double s = a.doAnimal();
	AA aa = new AA();
	//BB b = (BB)aa;
	//BB b = new BB();
    }
}

class AA {
    private int x;
    protected AA() {
	this(getString());
	System.out.println("AA Constructor no args: " + x);
    }
    static String getString() {
	return "string";
    }
    AA(String s) {
	//this();
	System.out.println("AA Constructor parameter: " + s);
    }
}
class BB extends AA{
    /*BB() {
	//super("hey");
	test();
	System.out.println("BB Constructor no args");
    }*/
    BB(int x){super("You");}
    void test(){}
}