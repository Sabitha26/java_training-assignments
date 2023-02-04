package dxc_training;

public class Participant {
	private static int counter;
	private String registrationId;
	private String name;
	private long contactNumber;
	private String city;
	private String register;
	static
	{
		counter=10000;
	}
	public Participant(String name,long contactNumber,String city) {
		this. registrationId ="D"+ ++counter;
		this.name = name;
		
	}
	public int getCounter() {
		return counter;
	} 
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public static void main(String[] args) {
		Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
		Participant participant2 = new Participant("Merina", 7890423112L, "New York");
		System.out.println("Hi "+participant1.getName()+"! Your registration id is "+participant1.getRegistrationId());
		System.out.println("Hi "+participant2.getName()+"! Your registration id is "+participant2.getRegistrationId());
		
	
	
	
	
}}
	
	
	
	
	
	
	
	
	
	


