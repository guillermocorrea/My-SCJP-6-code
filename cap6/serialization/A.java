import java.io.*;

public class A {
   
    public static void main(String[] args) {
	B b = new B("A name", 10);
	System.out.println(b.getName() + " age:" + b.age + " age2:" + b.age2);
	try {
	    FileOutputStream fos = new FileOutputStream("A.ser");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(b);
	    oos.close();
	} catch(IOException e) {e.printStackTrace();}
	try {
	    FileInputStream fis = new FileInputStream("A.ser");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    B b2 = (B)ois.readObject();
	    ois.close();
	    System.out.println(b2.getName() + " age:" + b2.age + " age2:" + b2.age2);
	} catch(Exception e) {e.printStackTrace();}
    }
}

class B extends C implements Serializable {
    private String name;
    static int age2 = 2;
    public String getName() {
	return name;
    }
    B() {
	System.out.println("B()");
    }
    B(String name, int age) {
	this.name = name;
	this.age = age;
    }
}

class C implements Serializable{
    static int age = 45;
    C() {
	age = age + 2;
	System.out.println("C() age: " + age);
    }
}