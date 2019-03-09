import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//no-arg constructor
	public Account() {
	}
	
	//constructor
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}
	
	//accessor for id
	public int getId() {
		return this.id;
	}
	
	//mutator for id
	public void setId(int id) {
		this.id = id;
	}
	
	//accessor for balance
	public double getBalance() {
		return this.balance;
	}
		
	//mutator for balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//accessor for annualInterestRate
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	//mutator for annualInterestRate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//accessor for dateCreated
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return this.balance * (this.annualInterestRate / 12) / 100;
	}
	
	public double getMontlyInterest() {
		return (this.balance * this.getMonthlyInterestRate()) / 12;
	}
	
	//withDraw amount
	public void withdraw(double amountToWithDraw) {
		this.balance -= amountToWithDraw;
	}
	
	public void deposit(double amountToDeposit) {
		this.balance += amountToDeposit;
	}
}
