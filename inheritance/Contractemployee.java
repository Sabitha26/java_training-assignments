package mypackage;

public class Contractemployee extends Employee {
	private  double wage;
	private float hoursworked;
	public Contractemployee(int employeeId,String name,double wage,float hoursworked) {
		super(employeeId,name);
		this.setWage(wage);
		this.setHoursworked(hoursworked);
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public float getHoursworked() {
		return hoursworked;
	}
	public void setHoursworked(float hoursworked) {
		this.hoursworked = hoursworked;
	}
	public void  calculateMonthlySalary() {
		double x=0,var;
		
		var= getWage()*(x/100);
	setSalary((float)(var+getWage()*getHoursworked()));}
	public String toString() {
		return"Employee\n employeeId:"+this.getEmployeeId()+"\nemployeeName:"+this.getEmployeeName()+"\nsalary:"+this.getSalary()+"\nwage:"+this.getWage()+"\nhoursWorked:"+this.getHoursworked();
	}
	

}
