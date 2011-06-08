import java.io.*;

public class WithThread {
    static PrintWriter out = new PrintWriter(System.out, true);

    public static void main (String args[]) {
		// first task: some pseudo-I/O operation
		ThreadedPseudoIO pseudo = new ThreadedPseudoIO();
		pseudo.start();
		// second task: some random task
		showElapsedTime("Another task starts");
    }

    static long baseTime = System.currentTimeMillis();
    // show the time elapsed since the program started

    static void showElapsedTime(String message) {
		long elapsedTime = System.currentTimeMillis() -baseTime;
		out.println(message + " at " + (elapsedTime/1000.0) + " seconds");
    }
}

// pseudo I/O operation run in a separate thread
class ThreadedPseudoIO extends Thread {
    int data = -1;
    ThreadedPseudoIO() {  // constructor
		WithThread.showElapsedTime("ThreadedPseudoIO created");
    }
    
    public void run () {
		WithThread.showElapsedTime("ThreadedPseudoIO starts");
		try {
			Thread.sleep(10000);  // 10 seconds
			data = 999;		// data ready
			WithThread.showElapsedTime("ThreadedPseudoIO finishes");
		} catch (InterruptedException e) {}
    }
}
