package mypackage;

public abstract class Payment {
	private int customerId;
	private String paymentId;
	private double serviceTaxPercentage;
	public Payment(int customerId) {
		
	}
	public abstract double payBill(double amount);
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public double getServiceTaxPercentage() {
		return serviceTaxPercentage;
	}
	public void setServiceTaxPercentage(double serviceTaxPercentage) {
		this.serviceTaxPercentage = serviceTaxPercentage;
	}

}
