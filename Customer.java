//Arturo Tejeda atejeda18@toromail.csudh.edu
public class Customer {

	private String first;
	private String last;
	private String Social;
	public Customer(String fn,String ln,String ssn) {
		this.first=fn;
		this.last=ln;
		this.Social=ssn;
	}
	public String getFirstName() {
		return first;
	}
	public String getLastName() {
		return last;
	}
	public String getSocialSecurityNumber() {
		return Social;
	}
	public void setFirstName(String firstName) {
		this.first = firstName;
	}
	public void setLastName(String lastName) {
		this.last = lastName;
	}
	public void setSocialSecurityNumber(String sSN) {
		Social = sSN;
	}

}