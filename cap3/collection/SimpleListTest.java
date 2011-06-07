package collection;

public class SimpleListTest {
   
    public static void main(String[] args) {
	SimpleList sl = new SimpleList();
	sl.insert(new Value("1"));
	sl.insert(new Value("2"));
	sl.insert(new Value("3"));
	sl.insert(new Value("4"));
	sl.insert(new Value("5"));
	sl.insert(new Value("6"));
	sl.printList();
	System.out.println("\nhead: " + sl.getHead().getValue().getValue());
	System.out.println("last: " + sl.getLast().getValue().getValue());
    }
}