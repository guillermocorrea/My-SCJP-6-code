import java.util.*;
import java.io.Console;

public class Operator extends Thread{

    private Machine machine;
    Console c = System.console();

    public Operator (Machine machine) {
	this.machine = machine;
    }

    public void run() {
	//synchronized(this.machine) {
	    while(true) {
		String instruction = this.getUserInstruction();
		if (instruction.equals("exit")) {
		    System.exit(0);
		}
		machine.addInstruction(instruction);
		try {
		    this.sleep(1000);
		} catch(InterruptedException e) {e.printStackTrace();}
	    }
	//}
    }

    public String getUserInstruction() {
	String instruction = c.readLine("%s", "Hello " + Thread.currentThread().getName() + ". Please enter instruction to proceed: ");
	System.out.println("===============================================================================================");
	return instruction;
    }
   
    public static void main(String[] args) {
	System.out.println("=================================Welcome to MachineCutter v0.1=================================");
	System.out.println("Enter exit to close application");
	Machine machine = new Machine();
	machine.setName("Machine");
	machine.start();
	Operator operator1 = new Operator(machine);
	operator1.setName("Operator1");
	operator1.start();

	Operator operator2 = new Operator(machine);
	operator2.setName("Operator2");
	operator2.start();
    }
}

class Machine extends Thread {
    
    private List<String> instructions = new ArrayList<String>();
    
    public void addInstruction(String instruction) {
	synchronized (instructions) {
	    instructions.add(instruction);
	    instructions.notify();
	}
    }

    public void run() {
	//System.out.println("Waiting instruction");
	synchronized(instructions) {
	    while(true) {
	        try {
		    if (instructions.isEmpty()) {
		        instructions.wait();
	            } 
		} catch(InterruptedException e) {e.printStackTrace();}
		// Ok now we have instructions
		String instruction = instructions.remove(0);
		System.out.println("Processing instruction... " + instruction);
	    }
	}
    }
}







