public class A {
   
    public static void main(String[] args) {
	/*String s = "abcd";
	String s2 = s;
	System.out.println(s == s2);
	s = "abcde";
	System.out.println(s == s2);
	s2 = s2.concat("e");
	System.out.println(s == s2);
	System.out.println(s + " s2: " + s2);

	s2 = "123";
	//s = new String("123");
	s = "123";
	System.out.println(s == s2);


	String s3 = new String("123");
	s2 = s3;
	System.out.println(s3 == s2);
	s3 = "111";
	s2 = new String("111");
	System.out.println(s3 == s2);
	s2 = "111";
	System.out.println(s3 == s2);

	String x = "big surprise";
	System.out.println( x.toString() );*/
	
	String s1 = "spring ";
	String s2 = s1 + "summer ";
	s1.concat("fall ");
	s2.concat(s1);
	s1 += "winter ";
	System.out.println(s1 + " " + s2);
    }
}