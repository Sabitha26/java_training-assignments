package mypackage;

 class CreditCardPayment extends Payment {
	 private static int counter;
	 private int customerId;
	 private String paymentId;
	 private double amount;
		private double finalamount;
	 static {
		 counter=1000;
	 }
	 public CreditCardPayment(int customerId) {
			super(customerId);
			this.paymentId="C"+ ++counter;
			this.customerId=customerId;
			
			
		}
		
	public String getPaymentId() {
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
	public double getFinalamount() {
		return finalamount;
	}
	public void setFinalamount(double finalamount) {
		this.finalamount = finalamount;
	}
	
	public double calculateServiceTax() {
		if(amount<=500)this.serviceTaxPercentage =3;
		else if((amount>500)&&(amount<=1000))this.serviceTaxPercentage =5;
		else this.serviceTaxPercentage =6;
		return amount;
	
	}
	

	@Override
	public double payBill(double amount) 
		// TODO Auto-generated method stub
		{
			if(amount<=500)
			{

			finalamount=amount+amount*3/100;
			}
			else if(amount>500 && amount<=1000)
			{
				finalamount=amount+amount*5/100;
			}
			else if(amount>1000)
			{
				finalamount=amount+amount*6/100;
			}
			return finalamount;
	}
	}


