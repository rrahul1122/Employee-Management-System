package view;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import controller.EmployeeController;
import controller.SaveEmployee;
import model.Employee;

public class MainClass {
	static Scanner sc = new Scanner(System.in);
//	static SaveEmployee se = new SaveEmployee();
	public static void main(String[] args) {
		EmployeeController se = new SaveEmployee();
		Employee emp = new Employee();
		
		// INSERT
	    
//		int empId = sc.nextInt();
//		emp.setEmpId(empId);
//		
//		sc.nextLine();
//		String name = sc.nextLine();
//		emp.setName(name);
//		
//		String email = sc.nextLine();
//		emp.setEmail(email);
//		
//		String designation = sc.nextLine();
//		emp.setDesignation(designation);
//		
//		double salary = sc.nextDouble();
//		emp.setSalary(salary);
//		
//		 try {
//			boolean b = se.saveEmployee(emp);
//			System.out.println(b );
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		 
		// UPDATE
		 
//		 double salary1 = sc.nextDouble();
//		 emp.setSalary(salary1);
//		 
//		 int empId1 = sc.nextInt();
//			emp.setEmpId(empId1);
//		 
//		 try {
//			boolean b = se.updateSalaryByEmpId(empId1, salary1);
//			System.out.println(b);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		 
		 // DELETE
		
//		 int empId2 = sc.nextInt();
//			emp.setEmpId(empId2);
//		 
//		 try {
//			boolean b = se.deleteEmployeeByEmpId(empId2);
//			System.out.println(b);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		 
		 //Find Employee
		 
//		 int empId3 = sc.nextInt();
//			emp.setEmpId(empId3);
//			
//				try {
//					Employee b = se.findEmployeeByEmpId(empId3);
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
				
		//Find All Data
				
			try {
				List b = se.findAllEmployee();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
