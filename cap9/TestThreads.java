class FooRunnable implements Runnable {

    public void run() {
	for(int x = 1; x < 100; x++) {
	    System.out.println("Runnable running. By: " + Thread.currentThread().getName() + " " + x);
        }
    }
}

public class TestThreads {
    public static void main (String [] args) throws InterruptedException {
	FooRunnable r = new FooRunnable();
	Thread t = new Thread(r);
	t.start();

	Thread t2 = new Thread(r);
	t2.start();

	for(int x = 10; x > 0; x--) {
	    System.out.println("Running back: " + Thread.currentThread().getName() + " " + x);
        }

	t.join();
	t2.join();

	System.out.println("t isAlive()?: " + t.isAlive());
	System.out.println("Main done!!!");
	
	/*for(int x = 1; x < 100; x++) {
	    System.out.println("Runnable running. By: " + Thread.currentThread().getName()  + " " + x);
        }*/



	/*Thread t2 = new Thread(r);
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
        }*/
    }
}