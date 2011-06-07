import java.util.regex.*;
import java.io.Console;

/**
* Patterns:
* email:.+@.+\.com
*/

public class RegexTest {

    private static Console c = System.console(); // #1: get a Console

    private static String source = "yyxxxyxx";
    private static String pattern = ".*xx";
   
    public static void main(String[] args) {
	//String s = "abaaaba";
	/*Pattern p = Pattern.compile("ab"); // the expression
	Matcher m = p.matcher("abaaaba"); // the source
	while(m.find()) {
	    System.out.print(m.start() + " ");
	}*/
	start();
    }

    public static void title() {
	c.format("Regex machine!!! v0.1\n");
    }

    public static void start() {
	title();
	c.format("1. Enter source. (" + source + ")\n");
	c.format("2. Enter pattern. (" + pattern + ")\n");
	c.format("3. Match\n");
	c.format("0. Exit\n\n");
	String option = c.readLine("%s", "option number:");
	c.format("\n");
	parseOption(option);
    }

    public static void parseOption(String option) {
	try {
	    int o = Integer.parseInt(option);
	    processOption(o);
	} catch(NumberFormatException e) {
	    e.printStackTrace();
	    System.out.println("Enter a fucking number!!!");
	    start();
	}
    }

    public static void processOption(int option) {
	switch (option) {
	    case 1: 
		source = c.readLine("%s", "source:");
	        start();
		break;
	    case 2:
		pattern = c.readLine("%s", "pattern:");
	        start();
		break;
	    case 3:
		match();
		break;
	    default:
		System.exit(0);
	}
    }

    public static void match() {
	title();
	Pattern p = Pattern.compile(pattern);
	Matcher m = p.matcher(source);
	c.format("Match regex \n source: " + source + "\npattern: " + m.pattern());
	c.format("\n result:\n");

	while(m.find()) {
	    System.out.println(m.start() + " " + m.end() + " " + m.group());
	    
	}

	c.format("\n\n");
	start();
    }

    
}