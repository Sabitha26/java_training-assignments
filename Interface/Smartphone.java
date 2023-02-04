package mypackage;

 class Smartphone  extends Mobile implements Testable {
	private String  networkgeneration;
    public Smartphone(String name,String brand, String operatingsystemname, String operatingsystemversions) {
	super(name,brand,operatingsystemname,operatingsystemversions);
	this.networkgeneration=networkgeneration;
}
public boolean testCompatibility() {
	if(getOperatingsystemname().equals("Saturn")) {
if(( getNetworkgeneration().equals("3G"))&&(getOperatingsystemversions().equals("1.1")||getOperatingsystemversions().equals("1.2")||getOperatingsystemversions().equals("1.3")))
return true;
else if
(( getNetworkgeneration().equals("4G"))&&(getOperatingsystemversions().equals("1.2")||getOperatingsystemversions().equals("1.3")))
	return true;
else if
(( getNetworkgeneration().equals("5G"))&&(getOperatingsystemversions().equals("1.3")))
	return true;
	}
else if
(getOperatingsystemname().equals("Gara")) {
if(( getNetworkgeneration().equals("3G"))&&(getOperatingsystemversions().equals("EXRT.1")||getOperatingsystemversions().equals("EXRT.2")||getOperatingsystemversions().equals("EXRT.3")))
	return true;
else if
(( getNetworkgeneration().equals("4G"))&&(getOperatingsystemversions().equals("EXRT.2")||getOperatingsystemversions().equals("EXRT.3")))
	return true;
else if
(( getNetworkgeneration().equals("5G"))&&(getOperatingsystemversions().equals("EXRT.3")))
	return true;


}
// TODO Auto-generated method stub
	return false;
}
public String getNetworkgeneration() {
	return networkgeneration;
}
public void setNetworkgeneration(String networkgeneration) {
	this.networkgeneration = networkgeneration;
}
}
