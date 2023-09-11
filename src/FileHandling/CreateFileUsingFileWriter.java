package FileHandling;

 import java.io.FileWriter;
import java.io.IOException;

public class CreateFileUsingFileWriter {
	/* (This is only for write and read text only)
	 * 1> FileReader : Read file. 
	 * 2> FileWriter : Write File.
	 */
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("d://user.txt",true);
		file.write("id: 200");
		file.write(System.lineSeparator());
		file.write("First name: hari");
		file.write(System.lineSeparator());
		file.write("Last Name:  Joshi");
		file.write(System.lineSeparator());
		file.write("City: bamdev");
		file.write(System.lineSeparator());
		file.write("Age: 40");
		file.write(System.lineSeparator());
		
		file.close();
	}

}
