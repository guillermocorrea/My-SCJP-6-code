public class FormatTest {
   
    public static void main(String[] args) {
	double d = 156d;
	
	System.out.printf(">%1.20f<\n", d);

	int i1 = -123;
	int i2 = 12345;
	System.out.printf(">%07d< \n", i1);

	System.out.printf(">%1$7d< \n", i1);
	System.out.printf(">%0,7d< \n", i2);
	System.out.format(">%+-7d< \n", i2);
	System.out.printf(">%2$b + %1$-5d< \n", i1, false);
	
	System.out.printf(">%2$b + %1$-5d< \n", i1, false);
    }
}