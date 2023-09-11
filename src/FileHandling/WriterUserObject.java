package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriterUserObject {
	/*
	 * 
	 * 1.> ObjectInputStream : Deserialization (Object read) 
	 * 2.> ObjectOutputStream:  Serialization (Object Write)
	 * 
	 */

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		User u = new User();
		u.setId(123);
		u.setUsername("Hari");
		u.setPassword("hari1");
		//============ Serialization=======
		FileOutputStream fout = new FileOutputStream("D://userobj.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(u);
		System.out.println();
		objout.close();
		fout.close();

		// ========== De-serialization==========
		ObjectInputStream obj = new ObjectInputStream(new FileInputStream("D://userobj.txt"));
		User usr = (User) obj.readObject();
		System.out.println(usr);
		obj.close();

	}
}
