package mypackage;


public class TesterAbstract {

	public static void main(String[] args) 
	{
		DebitCardPayment debitcardpayment=new DebitCardPayment(101);
		double billAmount=Math.round(debitcardpayment.payBill(500)*100)/100.0;
		debitcardpayment.calculateserviceTax();
		debitcardpayment.calculatediscount();
		debitcardpayment.payBill(0);
		System.out.println("Customer Id :"+debitcardpayment.getCustomerId());
		System.out.println("Payment Id :"+debitcardpayment.getPaymentId());
		System.out.println("Service Tax percentage:"+debitcardpayment.getServiceTaxPercentage());
		System.out.println("Discount percentage :"+debitcardpayment.getDiscountPercentage());
		debitcardpayment.getDiscountPercentage();
		System.out.println("Total bill amount: " + billAmount);
		
		System.out.println();
		CreditCardPayment creditcardpayment=new CreditCardPayment(102);
		double billAmount1=Math.round(creditcardpayment.payBill(1000)*100)/100.0;
		creditcardpayment.calculateServiceTax();
		creditcardpayment. payBill(0);
		System.out.println("Customer Id :"+creditcardpayment.getCustomerId());
		System.out.println("Payment Id :"+creditcardpayment.getPaymentId());
		System.out.println("Service Tax percentage:"+creditcardpayment.getServiceTaxPercentage());
		creditcardpayment.getServiceTaxPercentage();
		System.out.println("Total bill amount: " + billAmount1);
		
	}}

