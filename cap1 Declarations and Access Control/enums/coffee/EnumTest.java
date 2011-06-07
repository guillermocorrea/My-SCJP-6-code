package coffee;

class A {}

public class EnumTest {
    CoffeeSize2 cs;
    public static void main(String[] args) {
	for(CoffeeSize2 item : CoffeeSize2.values()) {
	    System.out.println(item + " ounces:" + item.getOunces() + " code:" + item.getCoffeeCode());
	}
    }
}