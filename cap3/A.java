public class A {

	static void go(int x) { System.out.print("int "); }
	static void go(long x) { System.out.print("long "); }
	static void go(double x) { System.out.print("double "); }
   
    public static void main(String[] args) {
	//long l = 0xaea;
	int i = 0xaea;
	//System.out.println((short)l);
	System.out.println((double)i);
	int[] a = new int[4];
	Double d1 = new Double(2.56);
	Double d2 = new Double(2.56);
	if (d1 == d2) {
	    System.out.println("==");
	}
	if (d1 != d2) {
	    System.out.println("!=");
	}

	Double d3 = 2.56;
	Double d4 = 2.56;
	if (d3 == d4) {
	    System.out.println("==");
	}
	if (d3 != d4) {
	    System.out.println("!=");
	}    
	Integer i1 = 1000;
	Integer i2 = 1000;
	if(i1 == i2) System.out.println("same objects");
	if(i1 != i2) System.out.println("different objects" + (++i1));
	if(i1.equals(i2)) System.out.println("meaningfully equal");

	Integer i3 = 10;
	Integer i4 = 10;
	if(i3 == i4) System.out.println("same object");
	if(i3 != i4) System.out.println("diferent object");
	if(i3.equals(i4)) System.out.println("meaningfully equal");
	
	d3 = new Double(i1.toString());

	byte b = 5;
	short s = 5;
	long l = 5;
	float f = 5.0f;
	go(b);
	go(s);
	go(l);
	go(f);
	/*int number;
	System.out.println(number);*/
	go(new int[][]{{1,2},{3,4}});
	
    }

    public static void go(int[]... x) {
	for(int[] item : x) {
	    System.out.println("go...");
	}
    }
}