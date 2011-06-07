public class Assertions {
    public int y = 0;

    public void doSomething(int x) {
	//assert(x>0): "x: " + x;
	//System.out.println("Assertion passed!");
	assert incrementY();
	System.out.println("y: " + y);
    }

    public boolean incrementY() {
	y++;
	return true;
    }
   
    public static void main(String[] args) {
	int y = 5;
	int x = 10;
	new Assertions().doSomething(x);
    }
   
    static boolean doStuff() {return true;}
}