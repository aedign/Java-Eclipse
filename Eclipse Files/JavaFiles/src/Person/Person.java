package Person;


public abstract class Person {
	
	private static String name;
	private String address;
	private long phone;
	private String email;
	
	
	@SuppressWarnings("static-access")
	public Person(String name, String address, long number, String email) {
		
		this.name = name;
		this.address =  address;
		this.phone = number;
		this.email = email;
		
	
	}
	
	

	@SuppressWarnings("static-access")
	public void setName (String name) {
		
		this.name = name;
		
	}
	
	public String getName () {
		
		return name;
	}


	
	void setAddress(String address) {
			
			this.address = address;
		}
	
	public String getAddress () {
		
		return address;
	}

	
	
	public void setPhone(long phone) {
			
			this.phone = phone;
		}
	
	public long getPhone () {	
		
		return phone;
	}

	
	
	public void setEmail(String email) {
		
		this.email = email;
		
	}
	
	public String getEmail() {

		
		
		
		return email;
	}
	
	
	
	public void Info() {
		
		
		System.out.println("Class name: Person"  + "\nName: " + getName() + "\nAdress: " + getAddress() + "\nPhone: " + getPhone() + "\nEmail: " + getEmail());
	}
	

}
