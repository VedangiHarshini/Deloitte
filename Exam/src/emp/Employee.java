package emp;

import java.io.Serializable;
//import java.util.Date;
import java.sql.Date;

public class Employee implements Serializable 
{
	private String Fname ;
	private String LastName;
	private String Empid ;
	private String Address;
	private String Dob ;
	public Employee(String fname, String lastName, String empid,  String dob,String address) {
		super();
		Fname = fname;
		LastName = lastName;
		Empid = empid;
		Address = address;
		Dob = dob;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmpid() {
		return Empid;
	}
	public void setEmpid(String empid) {
		Empid = empid;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	
	
}
