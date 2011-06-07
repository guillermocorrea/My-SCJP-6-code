import java.io.*;

public class ConsoleTest {
   
    public static void main(String[] args) {
	System.out.println("Enter password and hit 'enter'");
	Console c = System.console(); // #1: get a Console
	startGUI(c);	
    }

    public static void startGUI(Console c) {
	// validatePassword(c);
	mainMenu(c);
    }

    public static void mainMenu(Console c) {
	c.format("Enter the options number\n");
	c.format("1 Create directory\n");
	c.format("2 Create file\n");
	c.format("3 Browse files\n");
	c.format("4 Open file\n");
	c.format("5 Delete file\n");
	c.format("0 Exit\n\n");
	String option = c.readLine("%s", "number: ");
	validateOption(option, c);
    }

    public static void validateOption(String option, Console c) {
	if (option != null && option.equals("")) {
	    c.format("Please enter a number option.\n\n");
	    mainMenu(c);
	}
	try {
	    int number = Integer.parseInt(option);
	    processOption(number, c);
	} catch (NumberFormatException nfe) {
	    c.format("Enter a valid option\n\n");
            mainMenu(c);
	}

    }

    public static void processOption(int option, Console c) {
	switch (option) {
	    case 1: 
		createDirectoryHelper(c);
		break;
	    case 2: 
		createFileHelper(c);
		break;
	    case 3: 
		browseFiles(c); 
		break;
	    case 4: 
		c.format("Selected: %s", option); 
		break;
	    case 5: 
		c.format("Selected: %s", option); 
		break;
	    case 0: 
		System.exit(0); 
		break;
	    default: 
		c.format("Enter a valid option\n\n");
                mainMenu(c);
    	}
    }

    public static void browseFiles(Console c) {
	File file = new File("");
	c.format("Absolute path: %s \n", file.getAbsolutePath());
	c.format("Last modified: %s \n\n", file.lastModified());
	c.format("%s / \n", file.getName());
	browseFilesHelper(file, c);
	mainMenu(c);
    }

    public static void browseFilesHelper(File file, Console c) {
	c.format("   ");
	if (file != null) {
	    if (file.listFiles() != null) {
	        for (File item : file.listFiles()) {
	            c.format("...%s", item.getName());
	            if (item.isDirectory()) {
		        c.format(" (dir) \n");
		        browseFilesHelper(item, c);
	            }
	        }
	    }
	}
    }

    public static String readFileNameInput(Console c) {
	String option = c.readLine("%s", "name: ");
	if (option != null && option.equals("")) {
	    readFileNameInput(c);
	}
	return option;
    }

    public static void createDirectoryHelper(Console c) {
	createDirectory(readFileNameInput(c), c);
    }

    public static void createFileHelper(Console c) {
	createFile(readFileNameInput(c), c);
    }

    public static void createDirectory(String fileName, Console c) {
	File dir = new File(fileName);
	c.format("\n");
	if (dir.exists()) {
	    c.format("Directory alread exists.\n\n");
	    mainMenu(c);
	}
	if (dir.mkdirs()) {
	    c.format("Directory created successfully.\n\n");
	    mainMenu(c);
	} else {
	    c.format("Error, directory couldn´t be created.\n\n");
	    mainMenu(c);	
	}
    }

    public static void createFile(String fileName, Console c) {
	File file = new File(fileName);
	c.format("\n");
	if (file.exists()) {
	    c.format("File alread exists.\n\n");
	    mainMenu(c);
	}
	try {
	    if (file.createNewFile()) {
	        c.format("File created successfully.\n\n");
	        mainMenu(c);
	    } else {
	        c.format("Error, file couldn´t be created.\n\n");
	        mainMenu(c);
	    }
	} catch (IOException e) {
	    c.format("Error, file couldn´t be created.\n\n");
	    mainMenu(c);	
	}
    }

    public static boolean validatePassword(Console c) {
	if (readPassword(c)) {
	    c.format("Welcome!!! File Manager v0.1\n");
	    return true;
	} else {
	    validatePassword(c);
	}
	return false;
    }

    public static boolean readPassword(Console c) {
	char[] pw;
	pw = c.readPassword("%s", "pw: "); // #2: return a char[]
	char[] admin = {'a','d','m', 'i', 'n'};
	if (pw.length != admin.length) {
	    return false;
	}
	for(int i = 0; i < admin.length; i++) {
	    if (admin[i] != pw[i]) {
		return false;
	    }
	    //c.format("%c", ch); // #3: format output
	}
	return true;
    }
}