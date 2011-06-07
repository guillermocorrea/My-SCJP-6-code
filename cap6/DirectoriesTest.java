import java.io.*;

public class DirectoriesTest {
   
    public static void main(String[] args) {
	File myDir = new File("myDir/dir1");
	System.out.println("Directory created: " + myDir.mkdir());
	File myDirs = new File("dir1/sub1Dir1");
	System.out.println("Directories created: " + myDirs.mkdirs());
	File fileMyDir = new File(myDir, "file");
	File fileMyDirs = new File("dir1/sub1Dir1/file");
	try {
 	    System.out.println("File created: " + fileMyDirs.createNewFile());    
	    System.out.println("File created: " + fileMyDir.createNewFile());	    
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}