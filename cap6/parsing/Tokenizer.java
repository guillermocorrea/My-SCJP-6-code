public class Tokenizer {
   
    public static void main(String[] args) {
	String s = "123,456,78,91011,123.98,\",adf";
	String[] tokens = s.split("");

	for(String token : tokens) {
	    System.out.println(token);
	}
	
    }
}