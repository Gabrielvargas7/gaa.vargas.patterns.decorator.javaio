package gaa.vargas.decorator.controller.main;

import gaa.vargas.decorator.services.LowerCaseInputStream;

import java.io.*;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;

		try {
			// create a concrete component
			InputStream inputStream = new FileInputStream("c://test.txt"); 
			
			// add decorator front the abstract decorator (FilterInputStream) 
			inputStream = new BufferedInputStream(inputStream);
			
			// add Our decorator the extend front FilterInputStream decorator 
			
			inputStream = new LowerCaseInputStream(inputStream);
			
			// add another decorator 
			
			inputStream = new LineNumberInputStream(inputStream);
			
			
			
			
			
			while((c =inputStream.read()) >= 0) {
				System.out.print((char)c);
			}

			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
