import java.util.*;
import com.foo.*;

public class TestProp {
   
    public static void main(String[] args) {
	MyClass mc = new MyClass();
	Properties p = System.getProperties();
	p.setProperty("myProp", "myValue");
	p.list(System.out);	
    }
}