package customerdetails;

public class Customerapp {
	public static void main(String[] args) {
		Customer customer1 = new Customer();
		Customer customer2 = new Customer(23,"Asdf","Hyderabad",2800);
		Customer customer3 = new Customer(40,"Zxcv","vjw",5000);
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
		customer2.setCustomerAddress("Noida");
		System.out.println(customer2);
		
		
		
		
	}

}
