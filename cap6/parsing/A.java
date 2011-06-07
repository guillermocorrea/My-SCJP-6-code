public class A {
   
    public static void main(String[] args) {
	String s = "abcd";
	String s2 = s;
	System.out.println(s == s2);
	s = "abcde";
	System.out.println(s == s2);
	s2 = s2.concat("e");
	System.out.println(s == s2);
	System.out.println(s + " s2: " + s2);

	String s3 = new String("123");
	s2 = s3;
	System.out.println(s3 == s2);
	s3 = "111";
	s2 = new String("111");
	System.out.println(s3 == s2);
	s2 = "111";
	System.out.println(s3 == s2);

	String x = "big surprise";
	System.out.println( x.toString() );
    }
}