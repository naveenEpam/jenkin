package com.my.designpattern.day6;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo {
	
	public static void main(String[] args) {
		int c;
		
		try {
			InputStream in = 
					new LowerCaseInputStream(
							new BufferedInputStream(
									new FileInputStream("C:\\Users\\pc\\Downloads\\MyFile.txt")));
			
			while((c = in.read()) >= 0) {
				System.out.print((char) c);
			} 
			
			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
