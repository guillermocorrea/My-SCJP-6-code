public class Excercise91 {
   
    public static void main(String[] args) {
	CounterRunnable r = new CounterRunnable();
	Thread t = new Thread(r);
	t.setPriority(1);
	t.setName("Uno");
	t.start();

	try {
	    t.join();
	    //t.join();
	} catch(InterruptedException e) {}	

	Thread t2 = new Thread(r);
	t2.setPriority(5);
	t2.setName("Dos");
	t2.start();	

	Thread t3 = new Thread(r);
	t3.setPriority(10);
	t3.setName("Tres");
	t3.start();

	try {
	    t3.join();
	    //t.join();
	} catch(InterruptedException e) {}	


    }
}

class CounterRunnable implements Runnable {

    public void run() {
	for (int counter=1; counter<=15; counter++) {
	    System.out.println(counter + " " + Thread.currentThread().getName());
	    try {
	        Thread.sleep(1000/2);
	    } catch(InterruptedException e) {
	    
	    }
	    if (counter%10 == 0) {
	        System.out.println("a" + " " + Thread.currentThread().getName());
	    //Thread.yield();
	    }	
	}
    }
}