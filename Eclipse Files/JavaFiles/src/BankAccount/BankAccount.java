package BankAccount;

import java.util.Date;

public class BankAccount {
	
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	private int guasa = 0;
	
	BankAccount(){
}
	
	BankAccount(int id, double balance, double annualInterestRate){
		
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;	
	}
	
BankAccount(int id, double balance, double annualInterestRate, int guasa){
		
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;	
		this.guasa = guasa;
	}

int getGuasa(){
	
	return guasa;
	
}
	
	Date getDatecreated(){
		
		return dateCreated;
		
	}
	
	double getMonthlyInterestRate() {
		
		double monthlyInterestRate = ((annualInterestRate/100) / 12);
		return monthlyInterestRate;
	}
	
	double getMonthlyInterest() {
		
		double monthlyInterest = (balance * getMonthlyInterestRate());
		return monthlyInterest;
	}
	
	double withdraw() {
		
		double withdraw = 3500;
		return withdraw;
	}
	
	double deposit() {
		
		double deposit = 500;
		return deposit;
	}

	double getCurrentBalance() {
		
		double currentBalance = (balance - withdraw() + deposit()) + (getMonthlyInterest() * 12);
		return currentBalance;
	}
	public void ToString() {
		
		System.out.println(" Account ID: " + id + "\n Initial Account Balance: $" + balance  + 
				"\n Annual Interest Rate: " + annualInterestRate + "%" + "\n Earned Monthly Interest: " 
				+ " $" + getMonthlyInterest() + "\n Amount Withdrewn: $" + withdraw() + 
				" \n Amount deposited: $" + deposit() + "\n Current balance:  $" + getCurrentBalance() 
				+ "\n Date Opened: " + getDatecreated());
		
	}
	
	
}
