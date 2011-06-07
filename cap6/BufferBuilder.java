import java.io.*;
public class BufferBuilder {
   
    public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("abc");
	sb.append("def");
	System.out.println("sb = " + sb); // output is "sb = abcdef"
	Console c = System.console();
        c.readLine("%s", "name:");
    }
}