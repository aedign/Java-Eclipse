package Person;



public class Student extends Person {
	
	private String status;
	
	public Student(String name, String address, long number, String email, String status) {
		super(name, address, number, email);
		
		this.status = status;
		
	}
	
	public void setStatus(String status) {
		
		this.status = status;
	}

	
	public String getStatus() {
		
		return status;
	}
	
	
	public void Info() {
		
		
		System.out.println("Class: Student " + "\nName: " + getName()  + "\nAdress: " + getAddress() + "\nPhone: " + getPhone() + "\nEmail: " + getEmail() + "\nClass status: " + getStatus()); 
	

}

}