import java.io.*;

public class WithoutThread {
    static PrintWriter out = new PrintWriter(System.out, true);
    
    public static void main (String args[]) {
		// first task: some pseudo-I/O operation
		NoThreadPseudoIO pseudo = new NoThreadPseudoIO();
		pseudo.start();
		// second task: some random task
		showElapsedTime("Another task starts");
    }
    
    static long baseTime = System.currentTimeMillis();
    // show the time elapsed since the program starte
    
    static void showElapsedTime(String message) {
		long elapsedTime = System.currentTimeMillis() -baseTime;
		out.println(message + " at " + (elapsedTime/1000.0) + " seconds");
    }
}

// pseudo I/O operation run in caller's thread
class NoThreadPseudoIO {
  int data = -1;
  NoThreadPseudoIO() {  // constructor
    WithoutThread.showElapsedTime("NoThreadPseudoIO created");
  }
  public void run() {
    WithoutThread.showElapsedTime("NoThreadPseudoIO starts");
    try {
	    Thread.sleep(10000);  // 10 second
	    data = 999;		// data ready
	    WithoutThread.showElapsedTime("NoThreadPseudoIO finishes");
    } catch (InterruptedException e) {}
  }
  public void start() 
    {
      run();
    }
}
