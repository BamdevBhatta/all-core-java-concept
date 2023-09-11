package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("d://bway/data.csv");
		BufferedReader br = new BufferedReader(file);
		String line;
		while ((line = br.readLine()) != null) {
			String id = null;
			String name = null;
			String password = null;
			String[] sp = line.split(",");
			for (int i = 0; i < sp.length; i++) {
				//System.out.println(sp[i]);
				 id = sp[0];
				 name = sp[1];
				 password =sp[2];
				
				
			}
			System.out.println("id ="+id);
			System.out.println(" name" +name);
			System.out.println("password "+password);
		}
		file.close();
		/*
		 * Q) Read CSV file and store data in db.
		 */
	}
}
