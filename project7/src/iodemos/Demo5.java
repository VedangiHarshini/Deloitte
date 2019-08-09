package iodemos;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Demo5 {
	public static void main(String[] args) throws IOException {
		/*FileWriter fw = new FileWriter("C:\\deloitte\\test.txt");
		fw.write("Hello,how are you");
		fw.close();
		System.out.println("done");*/
		FileReader fr = new FileReader("C:\\deloitte\\test.txt");
		int i =0;
		while((i = fr.read()) != -1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}

}
