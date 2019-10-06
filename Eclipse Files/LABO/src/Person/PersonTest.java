package Person;



public class PersonTest {

	public static void main(String[] args) {
		
	//	Person donald = new Person("Donald","1600 Pennsylvania Avenue", 1012223333, "donald@email.com");
		
	//	donald.Info();
		
		System.out.println();
		
		Student andres = new Student("Andres","1100 Marietta Lane", 123456789, "andres@email.com", "Junior");
	
		andres.Info();
		
		
		System.out.println();
		
		Employee lisa = new Employee("Lisa","1234 Kennesaw Lane",987654332,"lisa@email.com",true, 40000 );
	
		lisa.Info();
		
		System.out.println();
		
		Faculty moktar = new Faculty("Moktar","1234 Somewhere St.",123412341, "moktar@email.com", true, 90000, 80,"Professor");
		
		moktar.Info();
		
		System.out.println();

		Staff jasmine = new Staff("Jasmine", "9999 Hello Lane", 123456777, "jasmine@email.com", false,70000 , "Coordinator of Student Affairs");
		
		jasmine.Info();
		
		

	}

}
