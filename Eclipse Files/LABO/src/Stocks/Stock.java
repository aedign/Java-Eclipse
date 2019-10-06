package Stocks;

//1321L Section 17
//Fall 2018
//Andres Di Gregorio
//Kevin Markley
//Lab #10

import java.util.Scanner;


public class Stock {
	
	Scanner scan = new Scanner (System.in);
	
	 private String Symbol;
	 private String Name;
	 private double previousClosingPrice;
	 private double currentPrice;
	 
	 
	 Stock(String sym, String nam){
		 
		 Symbol = sym;
		 
		 Name = nam;
	 }
	 
	 String getName (){
		 
		 return Name;
	 }
	 
	 String getSymbol() {
		 
		 return Symbol;
	 }
	 
	 double setPreviousClosingPrice(double x) {
		 
		 previousClosingPrice = x;
		 
		 return previousClosingPrice;
	 }
	 
	 double getPreviousClosingPrice() {
		 
		 return previousClosingPrice;
	 }
	 
	 double setCurrentPrice(double y) {
		 
		 currentPrice = y;
		
		 return currentPrice;
	 }
	 
	 double getCurrentPrice() {
		 
		 return currentPrice;
	 }
	 
	 double getChangePercent() {
		 
		 double formula = (-(previousClosingPrice - currentPrice)/ previousClosingPrice) * 100;
		 
		 formula = (Math.round(formula) * 10)/10;
		 
		 return formula;
	 }
	 
	 public String toString() {
	
	 String description = "'s stock closing price is ";
	 
	 return description;
}
	 
}


