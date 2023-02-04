package mypackage;
class DebitCardPayment extends Payment {
	private static int counter;
	private int customerId;
	private double discountPercentage;
	private String paymentId;
	private double amount;
	private double finalamount;
	
	static{
		counter=1000;
		
	}
	public DebitCardPayment(int customerId) {
		super(customerId);
		this.paymentId="D"+ ++counter;
		this.customerId=customerId;
		
	}public String getPaymentId() {
		return paymentId;}
	

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	private double serviceTaxPercentage;
	public double getServiceTaxPercentage() {
		return serviceTaxPercentage;
	}

	public void setServiceTaxPercentage(double serviceTaxPercentage) {
		this.serviceTaxPercentage = serviceTaxPercentage;
	}
	
	
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public double getFinalamount() {
		return finalamount;
	}
	public void setFinalamount(double finalamount) {
		this.finalamount = finalamount;
	}
	public double calculateserviceTax() {
		if(amount<=500) this.setServiceTaxPercentage(2.5);
		else if((amount>500)&&(amount<=1000))this.setServiceTaxPercentage(4);
		else this.setServiceTaxPercentage(5);
		return serviceTaxPercentage;
	
	}public double calculatediscount()
	{
		if(amount<=500)this.discountPercentage=1;
		else if(amount>500 && amount<=1000)this.discountPercentage=2;
		
		else if(amount>1000)this.discountPercentage=3;
		
		return discountPercentage;
		
	}
	
	public double payBill(double amount) {
		if(amount<=500) {
			finalamount=amount+amount*(2.5/100)-amount*(1/100);
			
		}
		else if((amount>500)&&(amount<=1000)) {
			finalamount=amount+amount*(4/100)-amount*(2/100);
			
		}
		else {
			finalamount=amount+amount*(5/100)-amount*(3/100);	
		}
		
		
		return finalamount;
		
		// TODO Auto-generated method stub
	}
	
}
