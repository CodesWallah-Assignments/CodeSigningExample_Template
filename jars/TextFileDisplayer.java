import com.codeswallah.security.doer.Doer;
import java.io.FileReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class TextFileDisplayer implements Doer {
  private String fileName;
  
  public TextFileDisplayer(String fileName) {
    this.fileName = fileName;
  }

  public void doYourThing() {
    try {
	FileReader fr = new FileReader(fileName);
	try {
	  CharArrayWriter caw = new CharArrayWriter();
	  int c;
	  while((c = fr.read()) != -1) {
	    caw.write(c);
	  }
   	  System.out.println(caw.toString());
	} catch (IOException ex) {
	  System.out.println("Error reading from the file : " + this.fileName + ex.getMessage());
	} finally {
	   try {
		fr.close();
           } catch (IOException ex) {
		System.out.println("Error closing the file-reader" + ex.getMessage());
           }
	}
    } catch (IOException ex) {
	System.out.println("Error opening the file : " + this.fileName + ex.getMessage());
    }
  }
}
