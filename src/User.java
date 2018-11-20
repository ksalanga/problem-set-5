/**
 * Just like last time, the User class is responsible for retrieving
 * (i.e., getting), and updating (i.e., setting) user information.
 * This time, though, you'll need to add the ability to update user
 * information and display that information in a formatted manner.
 * 
 * Most of the functionality for this class should have already been
 * implemented last time. You can always reference my Github repository
 * for inspiration (https://github.com/rwilson-ucvts/java-sample-atm).
 */

public class User {
	
	private int pin;
	private String firstName;
	private String lastName;
	private String dob;
	private int phone;
	private String streetAddress;
	private String city;
	private String state;
	private String postalCode;
	
	/**
	 * Constructor for User class.
	 * 
	 * @param name
	 * @param dob
	 * @param address
	 */
	
	public User(int pin, String firstName, String lastName, String dob, int phone, String streetAddress, String city, String state, String postalCode) {
		this.pin = pin;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	
	/////////////////////////////////// GETTERS AND SETTERS ///////////////////////////////////
	
	/**
	 * Retrieves the user's PIN.
	 * 
	 * @return pin
	 */
	
	public int getPIN() {
		return pin;
	}
	
	/**
	 * Retrieves the user's name.
	 * 
	 * @return name
	 */
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	/**
	 * Retrieves the user's date of birth.
	 * 
	 * @return dob
	 */
	
	public String getDOB() {
		return dob;
	}
	
	public int getPhone() {
		return phone;
	}
	/**
	 * Retrieves the user's address.
	 * 
	 * @return address
	 */
	
	public String getstreetAddress() {
		return streetAddress;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getpostalCode() {
		return postalCode;
	}
	
	/**
	 * Sets the value of the user's PIN.
	 * 
	 * @param pin the new PIN
	 */
	
	public void setPIN(int pin) {
		this.pin = pin;
	}
	
	/**
	 * Sets the value of the user's name.
	 * 
	 * @param name the new name
	 */
	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	/**
	 * Sets the value of the user's address.
	 * 
	 * @param address the new address
	 */
	
	public void setstreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setpostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}