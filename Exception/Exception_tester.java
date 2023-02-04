package exp;

public class Exception_tester {
	public static void main(String[] args) {
		BUS_BOOKING booking = new BUS_BOOKING(101,"Orlando", "Regular");
		String result = booking.booktrip("BIGBUS", 11);
		if(result.equals("Booking successful")){
		System.out.println(result);
		System.out.println("Total amount for the trip: " + 
		booking.getTotalamount());
		}
		else{
		System.out.println(result);
		System.out.println("Your booking was not successful, please try again!");
		}
		}


}
