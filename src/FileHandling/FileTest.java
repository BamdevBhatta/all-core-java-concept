package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File file = new File("d://test.txt");
		System.out.println(file.isDirectory());
		System.out.println(file.exists());
		// create folder
		File dir = new File("d://bway");
		dir.mkdir();
		// get all file name from folder
		String[] filename = dir.list();
		Arrays.asList(filename).forEach(System.out::println);

		// get all files from folder
		File[] files = dir.listFiles();
		Arrays.asList(files).forEach(System.out::println);
		for (File f1 : files) {
			BufferedReader br = new BufferedReader(new FileReader(f1.getAbsolutePath()));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);

			}
		}

	}
}
