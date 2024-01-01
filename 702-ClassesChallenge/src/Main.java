
public class Main {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		account1.depositFund(1000);
		account1.withdrawFund(200);
		account1.depositFund(-10);
		account1.withdrawFund(1000);
		account1.withdrawFund(-10);
	}
}
