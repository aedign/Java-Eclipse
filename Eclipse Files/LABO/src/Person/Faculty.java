package Person;



public class Faculty extends Employee{

		private int hours;
		private String rank;
		

		
		public Faculty (String name, String address, long number, String email, boolean office, int salary, int hours, String rank) {
			super(name, address, number, email, office, salary);
			
			this.hours = hours;
			this.rank = rank;
	
			
		}
		
		
		
		
		public void setHours(int hours) {
			
			this.hours = hours;
		}
		public int getHours() {
			return hours;
		}
		
		
		public void setRank(String rank) {
			
			this.rank = rank;
		}
		public String getRank() {
			return rank;
		}
			
		public void Info() {
			
			
			System.out.println("Class name: Faculty " + "\nName: " + getName()  + "\nAdress: " + getAddress() + "\nPhone: " + getPhone() + "\nEmail: " + getEmail() + "\nRank: " + rank + "\nSalary: " + getSalary() + "$" + "\nOffice: " + getOffice() + "\nOffice Hours: " + hours );
		}
		
		
	}