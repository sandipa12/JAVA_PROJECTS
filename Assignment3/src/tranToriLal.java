
public class tranToriLal {

	public static void main(String[] args) {
		Account pandeAccount = new Account(1122, 20000);
		pandeAccount.setAnnualInterestRate(4.5);
		pandeAccount.withdraw(2500);
		pandeAccount.deposit(3000);
		System.out.println("Pande Account: ");
		System.out.println("Balance : " + pandeAccount.getBalance());
		System.out.println("Monthly Interest : " + pandeAccount.getMonthlyInterestRate());
		System.out.println("Date Created: " + pandeAccount.getDateCreated());
	}

}
