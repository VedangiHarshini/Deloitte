package emp.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import emp.utility.DbUtility3;
import emp.Employee;
import emp.dao.EmployeeDAO;
import emp.utility.DbUtility3;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String INSERT_EMPLOYEE_QUERY = "insert into hr.employee01 values(?,?,?,?,?)";

	@Override
	public boolean insertEmployee(Employee employee) {
		Connection connection = DbUtility3.getMyConnection();
		int noOfRecords = 0;
		try {
			PreparedStatement statement = 
					connection.prepareStatement(INSERT_EMPLOYEE_QUERY);
			statement.setString(1, employee.getFname());
			statement.setString(2, employee.getLastName());
			statement.setString(3, employee.getEmpid());
			statement.setString(4, employee.getDob());
			statement.setString(5, employee.getAddress());
			
			
			noOfRecords = statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(noOfRecords == 0)
			return false;
		else
			return true;
	}

	}
	

