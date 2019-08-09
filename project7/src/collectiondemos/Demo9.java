package collectiondemos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Demo9 {
	public static void main(String[] args) {
		List a = new ArrayList();
		a.add("Harshini");
		a.add("Kaamy");
		a.add("Preethi");
		a.add("Mounika");
		Collections.sort(a);
		
		a.remove(0);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.get(1));
		System.out.println(a.contains("Kaamy"));
		
		
	}

	
	
}
