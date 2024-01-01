
public class BankAccount {
	private String number;
	private double balance;
	private String customeName;
	private String customerEmail;
	private String customerPhone;

	public void depositFund(double amount) {
		if (amount < 0) {
			System.out.println("Invalid deposit Rs. " + amount);
			return;
		}
		balance += amount;
		System.out.println("You deposited Rs. " + amount + ". Current balance is Rs. " + balance);
	}

	public void withdrawFund(double amount) {
		if (amount < 0) {
			System.out.println("Invalid withdrawal Rs. " + amount);
			return;
		}
		if (balance < amount) {
			System.out.println("Insufficient balance. You have only Rs. " + balance);
		} else {
			balance -= amount;
			System.out.println("You withdrew Rs. " + amount + " Current balance is Rs. " + balance);
		}
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomeName() {
		return customeName;
	}

	public void setCustomeName(String customeName) {
		this.customeName = customeName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

}
