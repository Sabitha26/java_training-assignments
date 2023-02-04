package mypackage;

public class Inheritance_tester {

	public static void main(String[] args) {
		
			 
			 PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1855, 115, 3.5f);
			 permanentEmployee.calculateMonthlySalary();
			 System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+permanentEmployee.getSalary());
			 
			 Contractemployee contractEmployee = new Contractemployee(102, "Jennifer", 16, 90);
			 contractEmployee.calculateMonthlySalary();
			 System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+contractEmployee.getSalary());
			 
			 //Create more objects for testing your code
			 }
			 

		// TODO Auto-generated method stub

	

}
