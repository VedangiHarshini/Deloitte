package stringdemos;

public class Demo2 {
	protected void finalize() throws Throwable{
		System.out.println("Demo2 finalize");
	}
	
	public static void main(String[] args) {
		Demo2 d2 = new Demo2();
		//d2 = new Demo2();
		System.out.println("Demo2 object");
		System.gc();
	}

}
