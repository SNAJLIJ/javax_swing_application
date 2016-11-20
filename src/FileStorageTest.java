import java.io.File;
import java.io.IOException;

public class FileStorageTest {

	public static void main(String[] args) throws IOException {
		
		File folder = new File("Folder");
		File file = new File("Folder/test.txt");
		
		folder.mkdir();
		file.createNewFile();
		
		System.out.println("Folder and File created");
	}
}