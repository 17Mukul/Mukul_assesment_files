package com.demo.test;

public class EmpApp extends Exception  { 		
	public EmpApp() {
		
	}
public String findEmployee(int empId) {  
		
	try {
		if(EmpDB.db.containsKey(empId)) {
		return EmpDB.db.get(empId).getDetails();
		}else {
		throw new EmpNotFoundException("Emp not found");
		}
		}
		catch(EmpNotFoundException e) {
		System.out.println("Emp Not Found Exception..");
		}finally {}
		return "Emp Not Found";
		} 
}