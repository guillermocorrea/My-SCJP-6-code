package collection;

public class SimpleList {
   
    private Node head;
    private Node last;

    public SimpleList() {}

    public SimpleList(String value) {
	this.setHead(new Node(value));
    }

    public SimpleList(Node head) {
	this.setHead(head);
    }

    public Node getHead() {
	return head;
    }

    public void setHead(Node head) {
	this.head = head;
    }

    public Node getLast() {
	return last;
    }

    public void setLast(Node last) {
	this.last = last;
    }

    public void insert(Value value) {
	if (head == null) {
	    head = new Node(value);
	    last = head;
	} else {
	    insertHelper(value, getLast());	
	}
    }

/*    private void insertHelper(Value value, Node currentNode) {
	if (currentNode.getNext() == null) {
	    this.last = new Node(value);
	    currentNode.setNext(this.last);
	} else {
	    insertHelper(value, currentNode.getNext());
	}
    }*/

    private void insertHelper(Value value, Node currentNode) {
	if (currentNode.getNext() == null) {
	    this.last = new Node(value);
	    currentNode.setNext(this.last);
	} else {
	    insertHelper(value, currentNode.getNext());
	}
    }

    public void printList() {
	if (head != null) {
	     printListHelper(head);
	}
    }

    private void printListHelper(Node node) {
	if (node != null) {
	     System.out.print(node.getValue().getValue() + " -> ");
	     printListHelper(node.getNext());
	}
    }
}