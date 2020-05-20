package com.my.designpattern.day6.fileSample2;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo {
	
	public static void main(String[] args) {
		File file = new File("./writeOutput.txt");
		try {
			file.createNewFile();
			
			OutputStream ostream = new FileOutputStream(file);
			DataOutputStream dstream = new DataOutputStream(ostream);
			
			dstream.writeChars("Another sample to show Decorator Pttern");
			
			dstream.close();
			ostream.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
