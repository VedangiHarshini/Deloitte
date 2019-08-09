
public class H {
	int id;
	String name;

public H(int Id, String Name) {
	super();
	this.id = id;
	this.name = name;
}
	public static void main(String[] args) {
		
	H h1 = new H(1,"Qwerty");
	H h2 = new H(1,"Qwerty");
	H h3 = h1;
	System.out.println(h1.equals(h2));
	System.out.println(h1.equals(h3));
	System.out.println(h1 == h2);
	System.out.println(h1 ==h3);
	
}
}
	