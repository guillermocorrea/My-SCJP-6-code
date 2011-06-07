//package serialization;

import java.io.*;

class Cat implements Serializable {
    private String name;
    private int age;
    
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    protected Cat(String name, int age) {
	this.name = name;
	this.age = age;
    }

} // 1
public class SerializeCat {

    public static void main(String[] args) {
        Cat c = new Cat("Foo", 5); // 2
	
        try {
            FileOutputStream fs = new FileOutputStream("testSer.txt");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(c); // 3
            os.close();
	    System.out.println(c);
	    System.out.println(c.getName());
	    System.out.println(c.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
        try {
            FileInputStream fis = new FileInputStream("testSer.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Cat c2 = (Cat) ois.readObject(); // 4
	    System.out.println(c2);
	    System.out.println(c2.getName());
	    System.out.println(c2.getAge());
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
