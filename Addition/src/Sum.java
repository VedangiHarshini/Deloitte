/*import java.util.Scanner;
public class Sum {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c;
	public void getSum() 
	{	
		c = a+b;
		System.out.println("Sum is" +c);
		if(c<0)
		{
			System.out.println("enter proper input");
		}
	}
	
	public static void main(String args[]){
	
		Sum s = new Sum();
		s.getSum();
	}
	


}*/public class Sum
{public static void main(String... args)
 {
 for(String s:args) 
System.out.print(s + ", ");
 System.out.println(args.length); } }

