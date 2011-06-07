package collection;

public class Node {
   
    private Value value;
    private Node next;

    public Node() {}

    public Node(String value) {
	this.setValue(new Value(value));
    }

    public Node(Value value) {
	this.setValue(value);
    }

    public Node(String value, Node next) {
	this.setValue(new Value(value));
	this.setNext(next);
    }

    public Node(Value value, Node next) {
	this.setValue(value);
	this.setNext(next);
    }
    
    public Value getValue() {
	return value;
    }

    public void setValue(Value value) {
	this.value = value;
    }

    public Node getNext() {
	return next;
    }

    public void setNext(Node next) {
	this.next = next;
    }
}