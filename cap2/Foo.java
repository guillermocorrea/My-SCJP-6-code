class Bar extends Bar2{
    Bar() {
	System.out.println("Bar");
    }
    Bar(int x) {
	System.out.println("Bar: " +x);
    }
    static void print(){System.out.println("Print Bar...");}
}
abstract class Bar2 {
    private int x;
    public int getX(){
	return x;
    }
    static void printBar2() {
	//System.out.println("x: " + getX());
    }
    protected Bar2(){System.out.println("Bar2");}
}
public class Foo extends Bar{
    static public void print(){System.out.println("Print Foo...");}
    Foo() {
//	this(5);
	super(5);
	System.out.println("Foo");
    }
    Foo(int x) {
	System.out.println("Foo: " + x);
    }
   
    public static void main(String[] args) {
	Foo f = new Foo();
	Bar b = f;
	f.print();
	b.print();
    }
}

interface Drunkable {
    static int x = 6;
}