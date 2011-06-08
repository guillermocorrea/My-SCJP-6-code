public class Excercise92 extends Thread{

    private StringBuffer letter;

    public StringBuffer getLetter() {
	return letter;
    }

    public Excercise92(StringBuffer letter) {
	this.letter = letter;
    }

    public void run() {
	synchronized(this.letter) {
	    System.out.println("Run... " + Thread.currentThread().getName());
	    for (int i = 0; i<=100; i++) {
		System.out.print(letter+" ");
	    }
	    char c = this.letter.charAt(0);  
	    this.letter.setCharAt(0, ++c);
	}
    }
   
    public static void main(String[] args) {
	StringBuffer a = new StringBuffer("A");
	Excercise92 r = new Excercise92(a);
	r.setName("Uno");
	r.start();

	Excercise92 t = new Excercise92(a);
	t.setName("Dos");
	t.start();

	Excercise92 c = new Excercise92(a);
	c.setName("Tres");
	c.start();

    }
}
