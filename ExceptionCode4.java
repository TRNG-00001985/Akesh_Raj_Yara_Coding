//package demo1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class ExceptionCode4 {
public static void main(String[] args) {	
	FileReader fr = null;
	try {
		fr = new FileReader(new File("fileName.txt"));
	 }
	catch(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	finally {
		if(fr != null) {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
}
