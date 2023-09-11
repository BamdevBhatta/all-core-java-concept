package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
public class FileCreateUsingOutputStream  {
/*
 * 
 * 		1> FileOutputStream : file write
 * 		2> FileINputStream : file read
 * 
 */
public static void main(String []args) throws IOException {
	FileOutputStream file = new FileOutputStream("D://hello.txt"); 
	file.write("Hello Ram".getBytes());
	file.close();
}
}
