package ioPackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;

public class WriteObjToFile {

	public static void main(String[] args) throws IOException{
		Student s1 = new Student(1,"Subash",21);
		Student s2 = new Student(2,"Sagar",24);
		File file = new File("/Users/anuj/Documents/adjava/output.rft");
		try {
			FileOutputStream fo = new FileOutputStream(file);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(s1);
			oo.writeObject(s2);
			
		}catch(IOException ex) {
			
		}finally {
			fo.close();
			oo.close();
		}
	}

}
