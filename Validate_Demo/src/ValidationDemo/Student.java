package ValidationDemo;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	
	private String FirstName;
	private String LastName;
	private String Email;
	private int FreePasses;
	private String PostalCode;
	private String PhoneNumber;

	public Student(){
		
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getFreePasses() {
		return FreePasses;
	}

	public void setFreePasses(int freePasses) {
		FreePasses = freePasses;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	
	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

}
