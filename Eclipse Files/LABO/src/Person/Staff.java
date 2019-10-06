package Person;



public class Staff extends Employee{


			String title;
			
			public Staff (String name, String address, long number, String email, boolean office, int salary, String title) {
				super(name, address, number, email, office, salary);
				
				this.title = title;
				
			}
			
			
			
			
			public void setTitle(String titl) {
				
				this.title = titl;
			}
			public String getTitle() {
				return title;
			}
			
			public void Info() {
				
				
				System.out.println("Class name: Staff" + "\nName: " + getName() +  "\nAdress: " + getAddress() + "\nPhone: " + getPhone() + "\nEmail: " + getEmail() + "\nTitle: " + getTitle() + "\nSalary: " + getSalary() + "$" +   "\nOffice: " + getOffice());
			}
			
			
			
			
		}