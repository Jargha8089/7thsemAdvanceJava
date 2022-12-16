package ioPackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
	FileReader in = null;
	FileWriter out = null;
	
	public CharacterStream() throws IOException {
		in = new FileReader("/Users/anuj/Documents/adjava/input.rft");
		out = new FileWriter("/Users/anuj/Documents/adjava/output.rft");
		int ch;
		while ((ch = in.read()) != -1) {// -1 is end of file
			out.write(ch);
			System.out.println();
		}

	public static void main(String[] args) throws IOException{
		new CharacterStream();
	}
	}

}
