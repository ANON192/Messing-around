import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DarkSoulsLoadState {
	
	
	private static void copyFileUsingStream(File source, File dest) throws IOException {
		
	    InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(source);
	        os = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close();
	    }
	}

	public static void main(String[] args) throws IOException{
		
		File currentSave = new File("C:/Users/User/AppData/Roaming/DarkSoulsII/0110000100001337/DARKSII0000.sl2");
		File newSave = new File("C:/Users/User/Desktop/darkSoulsBackUps/DARKSII0000.sl2");
		
		
		copyFileUsingStream(newSave, currentSave);		
	}

}
