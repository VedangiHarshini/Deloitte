
public class Doctor {
	static int count =0;
	public void print()
	{
		
		System.out.println(" No of objects created is "+ count);
		
	}
	public Doctor()
	{
	count++;
	}
	
	public static void main(String[] args) {
		Doctor d1 = new Doctor();
		Doctor d2 = new Doctor();
		//Doctor d3 = new Doctor();
		d1.print();
	}

}
