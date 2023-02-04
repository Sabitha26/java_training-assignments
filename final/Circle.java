package mypackage;

public class Circle {
	private final double PI = 3.14;
	private double diameter;
	private double circumference;
	private double area;
	 
	public Circle(double diameter) {
		this.diameter=diameter;
		
	}
	public void calculateCircumference() {
		circumference=Math.PI*diameter;
		
	}
	public void  calculateArea() {
		double radius=diameter/2;
		area=PI*Math.pow(diameter/2,2);	
	}
	public double getPI() {
		return PI;
	}
	
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public double getCircumference() {
		return circumference;
	}
	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	

}
