
public class BankAccount {
	private long accountNumber;
	private double accountBalance;
	private String accountName;
	private String accountEmail;
	private String accountPhone;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountEmail() {
		return accountEmail;
	}

	public void setAccountEmail(String accountEmail) {
		this.accountEmail = accountEmail;
	}

	public String getAccountPhone() {
		return accountPhone;
	}

	public void setAccountPhone(String accountPhone) {
		this.accountPhone = accountPhone;
	}

	public void depositFund(double amount) {
		if (amount < 0) {
			System.out.println("Invalid deposit amount " + amount);
			return;
		}
		accountBalance += amount;
		System.out.println("You deposited " + amount + ". Current balance is " + accountBalance);
	}

	public void withdrawFund(double amount) {
		if (amount < 0) {
			System.out.println("Invalid withdrawal amount " + amount);
			return;
		}
		if (accountBalance < amount) {
			System.out.println("Insufficient balance");
		} else {
			accountBalance -= amount;
			System.out.println("You withdrew " + amount + " Current balance is " + accountBalance);
		}
	}
}
