package iodemos;
import java.io.File;
import java.io.IOException;
public class Demo4 {
	public static void main(String[] args) throws IOException{
		File f = new File("C:\\deloitte\\batch");
		File f1 = new File("C:\\deloitte\\batch\\student");
		File f2 = new File("C:\\deloitte\\batch\\batchmates.txt");
		
		if(f.exists())
		{
		   File allFiles[] = f.listFiles();
		   for(File temp : allFiles)
		   {
			if(temp.isDirectory())
			{
				System.out.println(temp +"is a directory");
			}
			else
			{
				System.out.println(temp +" is a file");
			}
		  }	
		   /*for(File temp : allFiles)
		   {
			   (temp.isDirectory) ? System.out.println(temp +"is a directory"):System.out.println(temp +" is a file");
				   
		   }*/
		}
		else
		{
			f.mkdirs();
			f1.mkdirs();
			f2.createNewFile();
			System.out.println("Files and folders are created");	
		}
	}

}
