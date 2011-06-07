public class A {
   
    public static void main(String[] args) {
	int y = 5;
	int x = 2;
	if ((x > 3) || (y < 2) | doStuff() && false) {
	    System.out.println("true");
	} else {System.out.println("false");}
int temp = 90;
switch(temp) {
case 80 : System.out.println("80");
case 82 : System.out.println("80"); // won't compile!
case 90 : System.out.println("90");
default : System.out.println("default");
}
    }
   
    static boolean doStuff() {return true;}
}