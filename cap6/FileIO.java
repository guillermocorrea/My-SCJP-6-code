import java.io.*;

public class FileIO {
   
    public static void main(String[] args) {
	File file = new File("file.txt");
	// FileWriter FileReader
	System.out.println("////////FileWriter FileReader//////////");
	fileWriter(file);
	fileReader(file);
	// BufferedWriter BufferedReader
	System.out.println("////////BufferedWriter BufferedReader//////////");
	file = new File("file2.txt");
	bufferedWriter(file);
	bufferedReader(file);
	// PrintWriter BufferedReader
	System.out.println("////////PrintWriter BufferedReader//////////");
	file = new File("file3.txt");
	PrintWriter(file);
	bufferedReader(file);
    }

    public static boolean fileWriter(File file) {
	try {
    	    FileWriter fw = new FileWriter(file);
	    fw.write("Winner winner chicken dinner!!!\nDough");
	    fw.flush();
	    fw.close();
	    return true;
	} catch (IOException e) {
	    e.printStackTrace();
	    return false;
	}	
    }

    public static void fileReader(File file) {
	try {
 	    FileReader fr = new FileReader(file);
	    char[] buff = new char[50];
	    // int size = fr.read(buff, 0, buff.length); read the whole file
	    int size = fr.read(buff); // read the whole file
	    System.out.println("Size: " + size);
	    for (char c : buff) {
		System.out.print(c);
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}	
    }

    public static boolean bufferedWriter(File file) {
	try {
    	    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
	    bw.write("Winner winner chicken dinner!!!");
	    bw.newLine();
	    bw.write("Dough");
	    bw.flush();
	    bw.close();
	    return true;
	} catch (IOException e) {
	    e.printStackTrace();
	    return false;
	}	
    }

    public static void bufferedReader(File file) {
	try {
 	    BufferedReader br = new BufferedReader(new FileReader(file));
	    String line = "";
     	    while ((line = br.readLine( )) != null) {
		System.out.println(line);
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}	
    }

    public static boolean PrintWriter(File file) {
	try {
    	    PrintWriter pw = new PrintWriter(file);
	    pw.println("Winner winner chicken dinner!!!");
	    pw.write("Dough");
	    pw.flush();
	    pw.close();
	    return true;
	} catch (IOException e) {
	    e.printStackTrace();
	    return false;
	}	
    }
}