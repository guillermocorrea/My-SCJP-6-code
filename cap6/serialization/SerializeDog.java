//package serialization;

import java.io.*;

class Dog implements Serializable {
    private String name;
    private transient int age;
    private transient Collar collar;

    public Collar getCollar() {
	return collar;
    }

    public void setCollar(Collar collar) {
	this.collar = collar;
    }
    
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

    Dog() {
  	name = "Troski";
	age = 10;
	collar = new Collar(10);
    }

    protected Dog(Collar collar, String name, int age) {
	this.collar = collar;
	this.name = name;
	this.age = age;
    }

    private void writeObject(ObjectOutputStream os) {
	// throws IOException // 1
        try {
	    os.defaultWriteObject(); // 2
	    os.writeInt(collar.getSize()); // 3
	} catch (Exception e) { e.printStackTrace(); }
    }

    private void readObject(ObjectInputStream is) {
	// throws IOException, ClassNotFoundException // 4
	try {
	    is.defaultReadObject(); // 5
	    collar = new Collar(is.readInt()); // 6
	} catch (Exception e) { e.printStackTrace(); }
    }
} 

class Collar {
    private int size;

    public int getSize() {
	return size;
    }

    Collar(int size) {
	this.size = size;
    }
}

public class SerializeDog {

    public static void main(String[] args) {
        Dog d = new Dog(new Collar(3), "Foo", 5);
	
        try {
            FileOutputStream fs = new FileOutputStream("testSer.txt");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(d); // 3
            os.close();
	    System.out.println(d);
	    System.out.println(d.getName());
	    System.out.println(d.getAge());
	    System.out.println(d.getCollar().getSize());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("");
        try {
            FileInputStream fis = new FileInputStream("testSer.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Dog c2 = (Dog) ois.readObject(); // 4
	    System.out.println(c2);
	    System.out.println(c2.getName());
	    System.out.println(c2.getAge());
	    System.out.println(c2.getCollar().getSize());
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
