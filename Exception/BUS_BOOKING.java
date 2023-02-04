package exp;

public class BUS_BOOKING {
 private int bookingId;
 private String destination;
 private String trippackage;
 private double totalamount;
 public  BUS_BOOKING(int bookingId,String destination,String trippackage) {
	 this.bookingId=bookingId;
	 this.destination=destination;
 }
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getTrippackage() {
	return trippackage;
}
public void setTrippackage(String trippackage) {
	this.trippackage = trippackage;
}
public double getTotalamount() {
	return totalamount;
}
public void setTotalamount(double totalamount) {
	this.totalamount = totalamount;
}

public String booktrip(String couponcode,int numberofMembers) {
	try
	{
		if(!(this.destination.equals("Washington DC")||this.destination.equals("philadelphia")||this.destination.equals("Orlando")||this.destination.equals("Atlanta")))
	throw new InvalidDestinationException("Invalid destination");
		else if (!(this.trippackage.equals("Regular")||this.trippackage.equals("Premium")))	;
		throw new InvalidTripPackageException	("Invalid trip package");
	
		
	if(this.trippackage.equals("Regular")) {setTotalamount(500*numberofMembers);
	return"Booking successful";}
	else if (this.trippackage.equals("Premium")) {setTotalamount(800*numberofMembers);
	return"Booking successful";}
	else
		throw new InvalidTripPackageException("Invalid package");
	}
	catch(InvalidTripPackageException|InvalidDestinationException|InvalidCouponCodeException e) {
		String getMessage;

	}
	
	throw new InvalidCouponCodeException("Invalid couponcode"); 
		if((couponcode.equals("BIGBUS")&&numberofMembers>=10||couponcode.equals("MAGICBUS")&&numberofMembers>=15))
			return "Booking successful";
		else throw new InvalidCouponCodeException("Invalid coupon code");}}

	
	
	


























}
