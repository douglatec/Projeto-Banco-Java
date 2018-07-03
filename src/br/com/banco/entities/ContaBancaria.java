package br.com.banco.entities;

public class ContaBancaria {

	private int number;
	private String holder;
	private double balance;
	
	public ContaBancaria(int number, String holder) {	
		this.number = number;
		this.holder = holder;		
	}
	
	
	public ContaBancaria(int number, String holder, double inicialDeposit) {	
		this.number = number;
		this.holder = holder;
		deposit(inicialDeposit);
	}
	
	
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	
	
	public void deposit (double amount) {
		balance += amount;		
	}
	
	public void withdraw(double amount ) {
		balance = (balance - amount) - 5.00;
	}


	@Override
	public String toString() {
		return "ContaBancaria [number=" + number + ", holder=" + holder + ", balance=" + String.format("%.2f", balance) + "]";
	}	
}
