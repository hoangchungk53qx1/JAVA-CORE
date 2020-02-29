import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class L1_input_output {

	public static void main(String[] args) {
		File file = new File("files/demo.txt");

		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
			
			String outFile = "xin chào";
	/*		
			for(int i = 0 ; i < 10 ; i++) {
				dos.writeUTF(outFile + "\n");
			}*/
			dos.writeUTF("abc");
			
			DataInputStream dis = new DataInputStream(new FileInputStream(file));
			
			String x = null;
			
			while(true) {
				/*int tmp = dis.read();	// đọc tới -1 ==> hết file
				if(tmp != -1)
					System.out.println((char)tmp + " - " + tmp);
				else
					break;
				*/
				x = dis.readLine();
				if(x == null)
					break;
				System.out.println(x);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
