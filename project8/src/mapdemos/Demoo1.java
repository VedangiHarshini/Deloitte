package mapdemos;

import java.util.Hashtable;
import java.util.Map;

public class Demoo1 {
	public static void main(String[] args) {
		Map<Integer,String>  data = new Hashtable<Integer,String>();
		
		data.put(1, "rahul");
		data.put(10,"sachin");
		data.put(17,"rishab");
		data.put(18, "virat");
		System.out.println(data);
		System.out.println(data.entrySet());
		
	}

}
