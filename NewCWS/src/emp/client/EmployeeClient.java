package emp.client;
import java.sql.Date;
import java.util.Scanner;
import emp.dao.EmployeeDAO;
import emp.dao.impl.EmployeeDAOImpl;
import emp.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		System.out.println("1. Add Customer ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee firstname ");
		String fname = scanner.next();
		System.out.println("Enter employee lastname ");
		String lastName = scanner.next();
		System.out.println("Enter employee dob ");
		String dob = scanner.next();
		System.out.println("Enter employee address ");
		String address = scanner.next();
		Employee employee = new Employee(fname,lastName,null, dob,address);
		employeeDAO.insertEmployee(employee);
					
		}

}
