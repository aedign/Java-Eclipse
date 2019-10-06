package Vacation;


// Andres Di Greogorio

public class InclusiveVacation extends Vacation{
	
	private String brand;
	private double rating;
	private int price;
	

	InclusiveVacation(String destination, int budget, String brand, double rating, int price) {
		super(destination, budget);
		
		this.brand = brand;
		this.rating = rating;
		this.price = price;
	
	}

	
	void HowMuch() {
		
		
		System.out.println("Inclusive Vacation: " + "\n\nDestination: " + destination + "\nBudget: " + budget + "\nBrand: " + brand + "\nRating: " + rating + " stars" + "\nPrice: " + price );
		
		
		int math = (budget-price);
		
		if (math > 0) {
			System.out.println("Vacation is under budget by: " + math + "$");
		}
		else if (math < 0) {
			System.out.println("Vacation is over budget by: " + (math*(-1)) + "$");
		}
		else {
			System.out.println("Vacation price is equal to your budget!");
		}
		
	}



	
	
	

}
