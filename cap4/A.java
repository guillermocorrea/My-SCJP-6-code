public class A {
   
    public static void main(String[] args) {
	int x = 10, y = 5, z = 2;
	System.out.println(y);
	x = (y++) + (++x)/z;
	System.out.println(y);
	System.out.println(x);
	
	B B = new B();
	A A = B;
	B = (B)A;
	//System.out.println((B instanceof String));
	String s = String.valueOf('a');
        System.out.println(s instanceof String);
	System.out.println(A == B);

	System.out.println("5.0 == 5L? " + ((byte)5.0 == (short)5L));

	String str1 = "A";
	String str2 = str1;
	System.out.println(str1 + " " + str2);
	System.out.println(str1 == str2);
	System.out.println(str1.equals(str2));
	str1 = "A updated!";
	str2 = "A updated!s";
	System.out.println(str1 + " " + str2);
	System.out.println(str1 == str2);
	System.out.println(str1.equals(str2));
	str2 = "A updated!";
	System.out.println(str1 + " " + str2);
	System.out.println(str1 == str2);
	System.out.println(str1.equals(str2));
    }
}

class B extends A {}