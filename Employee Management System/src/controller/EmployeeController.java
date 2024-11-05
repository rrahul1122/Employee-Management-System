package controller;

import java.sql.SQLException;
import java.util.List;
import model.Employee;

public interface EmployeeController {
	boolean saveEmployee(Employee employee) throws SQLException;
	boolean updateSalaryByEmpId(int empId, double salary) throws SQLException;
	Employee findEmployeeByEmpId(int empId) throws SQLException;
	boolean deleteEmployeeByEmpId(int empId) throws SQLException;
	List<Employee> findAllEmployee() throws SQLException;
	
}
