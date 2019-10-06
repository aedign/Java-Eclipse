package Person;


public class Employee extends Person{
	

	private boolean office = false;
	private int salary;
	
	public Employee (String name, String address, long number, String email, boolean office, int salary) {
		super(name, address, number, email);
		
		this.office = office;
		this.salary = salary;
		
	}
		public void setSalary(int salary) {
		
		this.salary = salary;
	}
	public int getSalary() {
		
		return salary;
	}
	
	
	
	public void hasOffice() {
		
		office = true;
		
	}
	
	public String getOffice() {
		
		if (office == true) {
			
			return "Yes";
		}
		else {
			return "No";
		}
	}

	
	public void Info() {
		
		
		System.out.println("Class: Employee " + "\nName: " + getName() +  "\nAdress: " + getAddress() + "\nPhone: " + getPhone() + "\nEmail: " + getEmail()  +"\nSalary: " + salary + "$" + "\nOffice: " + getOffice() );
	}
	

	
}
