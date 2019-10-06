package Vacation;


// Andres Di Gregorio

abstract public class Vacation {
	
	protected String destination;
	protected int budget;
	
	Vacation(String destination, int budget){
		
		this.destination = destination;
		this.budget = budget;
	
	}
	
	abstract void HowMuch();
		
		
	

}
