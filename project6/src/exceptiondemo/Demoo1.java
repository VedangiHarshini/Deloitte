package exceptiondemo;

public class Demoo1 {
	
	public void display()
	{
		int i = 0;
		
		try {
			i= 10/2;
			System.out.println("value is "+i);
		}
	   catch(Exception e)
		{
			System.out.println("error occured");
		}
	}
	public static void main(String[] args) {
		Demoo1 d = new Demoo1();
		d.display();
	}
}

