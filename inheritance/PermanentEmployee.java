package mypackage;

public class PermanentEmployee extends Employee {
	private double basicPay;
	private double hra;
	private float experiance;
	public PermanentEmployee(int employeeId, String employeeName,double basicPay,double hra, float experiance) {
		super(employeeId, employeeName);
		this.basicPay=basicPay;
		this.hra=hra;
		this.experiance=experiance;
	}
	
	
public double getBasicPay() {
		return basicPay;
	}


	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}


	public double getHra() {
		return hra;
	}


	public void setHra(double hra) {
		this.hra = hra;
	}


	public float getExperiance() {
		return experiance;
	}


	public void setExperiance(float experiance) {
		this.experiance = experiance;
	}



		
		
public void  calculateMonthlySalary() {
	double x=0,var;
	if(getExperiance()<3f&&getExperiance()<5f)x=5;
	else if(getExperiance()>=3f&&getExperiance()<5f)x=5;
	else if(getExperiance()>=5f&&getExperiance()<5f)x=7;
	else if(getExperiance()>=10)x=12; 
	var= getBasicPay()*(x/100);
	setSalary((float)(var+getBasicPay()+getHra()));}
		public String toString() {
			return"Employee\n employeeId:"+this.getEmployeeId()+"\nemployeeName:"+this.getEmployeeName()+"\nsalary:"+this.getSalary()+"\nbasicPay:"+this.getBasicPay()+"\nhra:"+this.getHra()+"\nExperiance:"+this.getExperiance();
		}
	
	
		
	


		
		
		
		// TODO Auto-generated constructor stub
	}
	


