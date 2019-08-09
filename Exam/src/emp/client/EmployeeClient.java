package emp.client;
import java.sql.Date;
import java.util.Scanner;
import emp.dao.EmployeeDAO;
import emp.dao.impl.EmployeeDAOImpl;
import emp.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		int id = 0;
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
		String f = fname.substring(0, 2);
		String l = lastName.substring(0, 2);
		id++;
		String empid = f+l+Integer.toString(id);
		
		
		Employee employee = new Employee(fname,lastName,empid, dob,address);
		employeeDAO.insertEmployee(employee);
					
		}

}
