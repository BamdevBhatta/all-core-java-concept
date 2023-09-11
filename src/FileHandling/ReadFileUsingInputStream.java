package FileHandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingInputStream {
	public static void main(String[] args) throws IOException {
			FileInputStream file = new FileInputStream("D://hello.txt");
			BufferedInputStream br =  new BufferedInputStream(file);
			int data;
		while((data=file.read())!=-1){
				System.out.print(data);
			}
			file.close();
	}
}
