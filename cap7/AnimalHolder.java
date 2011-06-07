import java.util.*;

public class AnimalHolder<T extends Animal> { // use "T" instead
    // of "?"
    T animal;

    public static void main(String[] args) {
	AnimalHolder<Dog> dogHolder = new AnimalHolder<Dog>(); // OK
	//AnimalHolder<Integer> x = new AnimalHolder<Integer>(); // NO!
	List<Animal> list = new ArrayList<Animal>();
	list.add(new Dog());
	list.add(new Dog());
	list.add(new Animal());
	dogHolder.foo(list);
    }

    public void foo(List<? extends Animal> list) {
	//list.add(new Dog());
	list.size();
	Animal a = list.get(0);
	System.out.println(a);
	System.out.println(list);
    }

    public <T, E> void bar(T t, E e){}

}
class Animal<E> {}
class Dog extends Animal {}

class CreateAnArrayList<T> {
    public <t> void makeArrayList(T t) { // take an object of an
	// unknown type and use a
	// "T" to represent the type
	List<T> list = new ArrayList<T>(); // now we can create the
	List<t> listT;
	// list using "T"
	list.add(t);
    }
}