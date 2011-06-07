class Animal {
    void doSomething() throws Exception{
	System.out.println("A...");
    }
}

class Dog extends Animal {
    protected void doSomething() {
	System.out.println("B...");
    }

    public static void main(String[] args) {
	Animal a = new Dog();
	Dog d = new Dog();
	a.doSomething();
	d.doSomething();
    }
}