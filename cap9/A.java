public class A {
   
    public static void main(String[] args) {
	System.out.println("Hey go to sleep...");
	try {
	    Thread.sleep(3*1000);
	} catch(InterruptedException e) {
	    
	}
	System.out.println("Hey wake up!!!");
    }
}