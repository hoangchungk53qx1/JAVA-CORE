package Khainiem_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class B2_byte_IO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream inputStream = null;
	      FileOutputStream outputStream = null;
	 
	      try {
	         inputStream = new FileInputStream("inStream.txt");
	         outputStream = new FileOutputStream("outStream.txt");
	          
	         int c;
	         while ((c = inputStream.read()) != -1) {
	            outputStream.write(c);           
	         }
	      } finally {
	         if (inputStream != null) {
	            inputStream.close();
	         }
	         if (outputStream != null) {
	            outputStream.close();
	         }
	      }         
	    }
	}


