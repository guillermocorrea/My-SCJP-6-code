import java.io.*;
import java.util.*;

public class SerTest {
   
    public static void main(String[] args) {
	Ser2[] col = {new Ser2(), new Ser2(), new Ser2()};
	Ser2 ser = new Ser2("Ser2", 10, col);
	System.out.println("before...");
	ser.printHelper();
	try {
	    FileOutputStream fo = new FileOutputStream("SerTest.txt");
	    ObjectOutputStream os = new ObjectOutputStream(fo);
	    os.writeObject(ser);
	    os.close();
	} catch(Exception e) {System.out.println("IOException");}
	Ser2.age2 = 10;
	try {
	    FileInputStream fi = new FileInputStream("SerTest.txt");
	    ObjectInputStream oi = new ObjectInputStream(fi);
     	    Ser2 obj = (Ser2) oi.readObject();
	    oi.close();
	    System.out.println("after...");
	    obj.printHelper();	    
	} catch(Exception e) {System.out.println("IOException");}

    }
}

class Ser2 extends Ser1 implements Serializable {
    private String name;
    static int age2 = 2;
    ArrayList<Ser2> collections;
    public String getName() {
	return name;
    }
    Ser2() {
	System.out.println("B()");
    }
    Ser2(String name, int age, Ser2... collections) {
	this.name = name;
	this.age = age;
	this.collections = new ArrayList<Ser2>();
	for(Ser2 item : collections) {
	    this.collections.add(item);
	}
    }
    public void printHelper() {
	System.out.println(this);
	System.out.println("name: " +this.name);
	System.out.println("age: " +this.age);
	System.out.println("age2: " +this.age2 +"");
	System.out.println(this.collections);
	for (Ser2 item : this.collections) {
	    System.out.println(" - " +item);
	}
    }
}

class Ser1{
    int age;
    Ser1() {
	//age = age + 2;
	System.out.println("C() age: " + age);
    }
}