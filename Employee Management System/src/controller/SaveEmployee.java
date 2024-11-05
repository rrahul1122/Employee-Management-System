package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Employee;

public class SaveEmployee implements EmployeeController {
	public static List<Employee> List = null;
	Connection connection = DBUtil.createConnection();
	
	@Override
	public boolean saveEmployee(Employee employee) throws SQLException{
		PreparedStatement statement = connection.prepareStatement("insert into Employee values(?,?,?,?,?);");
		statement.setInt(1, employee.getEmpId());
		statement.setString(2, employee.getName());
		statement.setDouble(3, employee.getSalary());
		statement.setString(4, employee.getEmail());
		statement.setString(5, employee.getDesignation());
		statement.executeUpdate();
		
		return true;
	}
//	boolean b = s.execute("update Laptop set model = '3003' where name ='dell';");
	@Override
	public boolean updateSalaryByEmpId(int empId1, double salary1) throws SQLException {
		PreparedStatement statement = connection.prepareStatement("UPDATE employee SET salary = ? WHERE empId = ?");
		statement.setInt(1, empId1);
		statement.setDouble(2, salary1);
		statement.executeUpdate();
		return true;
	}

	@Override
	public Employee findEmployeeByEmpId(int empId3) throws SQLException {
		Employee employee = new Employee();
	    PreparedStatement statement = connection.prepareStatement("select * from employee where empId = ?");
	    statement.setInt(1, empId3);
	    ResultSet rs = statement.executeQuery();
	    while(rs.next()) {
	    	int empId = rs.getInt("empId");
	    	System.out.println("Employee Id: " + empId);
	    	
	    	String ename = rs.getString("ename");
	    	System.out.println("Ename: " + ename);

	    	String email = rs.getString("email");
	    	System.out.println("Email: " + email);

	    	String designation = rs.getString("designation");
	    	System.out.println("Designation: " + designation);

	    	double salary= rs.getDouble("salary");
	    	System.out.println("Salary: " + salary);
	    }
	    return employee;
	}

	@Override
	public boolean deleteEmployeeByEmpId(int empId2) throws SQLException {
		PreparedStatement statement = connection.prepareStatement("DELETE from employee WHERE empId = ?");
		statement.setInt(1, empId2);
		statement.executeUpdate();
		return true;
	}
	
	@Override
	public List<Employee> findAllEmployee()throws SQLException {
		
	    PreparedStatement statement = connection.prepareStatement("select * from employee");
	    ResultSet rs = statement.executeQuery();
	    while(rs.next()) {
	    	//int empId = rs.getInt("empId");
	    	System.out.println("Employee Id: " + rs.getInt("empId"));
	    	
	    	String ename = rs.getString("ename");
	    	System.out.println("Ename: " + ename);

	    	String email = rs.getString("email");
	    	System.out.println("Email: " + email);

	    	String designation = rs.getString("designation");
	    	System.out.println("Designation: " + designation);

	    	double salary= rs.getDouble("salary");
	    	System.out.println("Salary: " + salary);
	    	
	    	System.out.println();
	    	
	    	
	    }
	    return (List);
	}
}
