package ioPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream {
	FileInputStream input = null;
	FileOutputStream output = null;

	public ByteStream() throws IOException {
		input = new FileInputStream("/Users/anuj/Documents/adjava/input.rft");// read
		output = new FileOutputStream("/Users/anuj/Documents/adjava/output.rft");// write
		int ch;
		while ((ch = input.read()) != -1) {// -1 is end of file
			output.write(ch);
		}

	}

	public static void main(String[] args) throws IOException {
		new ByteStream();
	}

}
