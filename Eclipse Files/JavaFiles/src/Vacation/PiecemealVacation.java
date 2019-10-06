package Vacation;


// Andres Di Gregorio

public class PiecemealVacation extends Vacation{
	
	private String [] items = {"Hotel", "Meal", "Airfare", "Taxi", "Spa"};
	
	private int [] cost = new int [5];
	
	PiecemealVacation(String destination, int budget, int hotelcost, int mealcost, int airfarecost, int taxicost, int spacost){
		super(destination, budget);
		
		
		this.cost[0] = hotelcost;
		this.cost[1] = mealcost;
		this.cost[2] = airfarecost;
		this.cost[3] = taxicost;
		this.cost[4] = spacost;
	
	
	}


	void HowMuch() {
		
		int price = 0;
		
		for (int count = 0; count < cost.length; count++) {
			
			price += cost[count];
		}
		
		System.out.println("Piecemeal Vacation: " + "\n\nDestination: " + destination + "\nBudget: " + budget);
		for (int count = 0; count < cost.length; count++) {
			
			System.out.println(items[count] + ":" + cost[count] + "$");
		}
		
		

		int math = (budget - price);
		
		if (math > 0) {
			System.out.println("Vacation is under budget by: " + math + "$");
		}
		else if (math < 0) {
			System.out.println("Vacation is over budget by: " + math + "$");
		}
		else {
			System.out.println("Vacation price is equal to your budget!");
		}
	}
	
	
	}


