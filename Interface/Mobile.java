package mypackage;

public class Mobile {
	private String name;
	private String brand;
	private String operatingsystemname;
	private String operatingsystemversions;
	public Mobile (String name,String brand, String operatingsystemname, String operatingsystemversions) {
		this.name=name;
		this.brand=brand;
		this.operatingsystemname=operatingsystemname;
		this.operatingsystemversions=operatingsystemversions;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOperatingsystemname() {
		return operatingsystemname;
	}
	public void setOperatingsystemname(String operatingsystemname) {
		this.operatingsystemname = operatingsystemname;
	}
	public String getOperatingsystemversions() {
		return operatingsystemversions;
	}
	public void setOperatingsystemversions(String operatingsystemversions) {
		this.operatingsystemversions = operatingsystemversions;
	}
	
	

}
