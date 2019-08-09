import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
class properties
{
public static void main(String args[]) throws IOException
{
	Properties properties1 = new Properties();
	FileReader fr = new FileReader("C:\\Deloitte\\mydatab.properties");
	properties1.load(fr);
	System.out.println(properties1.get("username"));
	System.out.println(properties1.get("password"));
	System.out.println(properties1.get("driver"));
	System.out.println(properties1.get("url"));
	System.out.println(properties1.get("hii"));
}
}

