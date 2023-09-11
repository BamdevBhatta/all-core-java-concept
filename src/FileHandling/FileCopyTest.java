package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileCopyTest {
	public static void main(String[] args) throws IOException {
		//Path pt = Paths.get("D://bintest.txt");
		//Files.createFile(pt, null);
		//Files.write(pt, "Hello guys ".getBytes(), StandardOpenOption.CREATE);
		Path pt = Paths.get("D://bintext.txt");
		Files.createFile(pt, null);
		Files.write(pt,"Hii".getBytes(), StandardOpenOption.CREATE);
		
		//add content in file bintext
		//Files.write(pt, "It's java Class".getBytes(), StandardOpenOption.APPEND);
		
		//=========Read Files=============
//		
//	Path path = Paths.get("D://bintest.txt");
//	
//	List<String> lines = Files.readAllLines(path);
//	lines.forEach(System.out::println);
//		System.out.println("Created:");
	
		
		//===========Copy File============
		
//		
		Path sourceFile = Paths.get("D://bintest.txt");
		Path targetFile =Paths.get("D://bincopy.txt");
		Files.copy(sourceFile, targetFile,StandardCopyOption.REPLACE_EXISTING);
		
//		//=============delete files============
//		Files.delete(targetFile);
//		System.out.println("Delete Success:");
	}
}
