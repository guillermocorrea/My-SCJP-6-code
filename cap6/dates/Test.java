import java.util.*;
import java.text.*;
public class Test {
   
    public static void main(String[] args) {
	Locale locale = new Locale("es");
	Locale locCO = new Locale("es", "CO");	
	
	DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locCO);

	Date date = new Date();

	Calendar c = Calendar.getInstance();
	System.out.println(df.format(c.getTime()));

	c.roll(Calendar.DAY_OF_MONTH, 35);

	System.out.println(df.format(c.getTime()));

	NumberFormat nf = NumberFormat.getCurrencyInstance(locCO);
	System.out.println(nf.format(new Double(6000000.678)));


	Locale locUS = new Locale("en", "US");	

	Locale locDK = new Locale("da", "DK"); // Denmark

	System.out.println("US DK: " + locDK.getDisplayCountry(locUS));
	System.out.println("CO DK: " + locDK.getDisplayCountry(locCO));
	System.out.println("US US: " + locUS.getDisplayCountry(locUS));
	System.out.println("CO US: " + locUS.getDisplayCountry(locCO));
	System.out.println("DK US: " + locUS.getDisplayCountry(locDK));
	System.out.println("DK CO: " + locCO.getDisplayCountry(locDK));
    }
}