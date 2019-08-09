package demos;

public class Demo1 {
	int i =100;
	public Demo1()
	{
		System.out.println("i ="+i);
		System.out.println("1st con");
	}
	public Demo1(int num)
	{
		i = num;
		System.out.println(--i);
		System.out.println("2nd con");
	}
	/*public void display()
	{
		System.out.println(i);
	}*/
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		//d.display();
		
		Demo1 d2 = new Demo1(100);
		//d2.display();
		
		
		
	}

}
