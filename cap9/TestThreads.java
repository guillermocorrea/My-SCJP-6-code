class FooRunnable implements Runnable {

    public void run() {
	for(int x = 1; x < 6; x++) {
	    System.out.println("Runnable running. By: " + Thread.currentThread().getName());
        }
    }
}

public class TestThreads {
    public static void main (String [] args) {
	FooRunnable r = new FooRunnable();
	Thread t = new Thread(r);
	Thread t2 = new Thread(r);
	Thread t3 = new Thread(r);
	Thread t4 = new Thread(r);
	Thread t5 = new Thread(r);
	t.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	for(int x = 1; x < 6; x++) {
	    System.out.println("Runnable running. By: main()");
        }	
    }
}