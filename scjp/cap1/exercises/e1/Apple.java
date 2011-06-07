import food.Fruit;

class Apple{

    int x;

    enum size {SHORT, MEDIUM, LARGE};

    static int y;

    public void print(String... msg) {
	System.out.println("..............print().................");
	for (String item: msg) {
	    System.out.println(item);
	    System.out.println(y);
	}
    }

    public static void main(String[] args) {


        System.out.println(OtherApple.a);
	OtherApple o = new OtherApple();
	o.doSomething(8);

	final Apple a = new Apple();
	System.out.println(a.x);
	a.x = 15;
	System.out.println(a.x);

	System.out.println("..............ENUM.................");
	System.out.println(size.SHORT);

	a.print("Hello", "What the fuck", "Are u doin?");
	//o.x = 5; error
        //System.out.println(o.x); error
    }

}

class OtherApple extends Fruit{

    public void doSomething(final int entero) {
	//entero = 5; error
        System.out.println(a + x + Apple.y + entero);
	
    }

    // public abstract void some(); error
}