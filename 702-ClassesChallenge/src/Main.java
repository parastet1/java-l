
public class Main {
	public static void main(String[] args) {
//		BankAccount rameshsAccount = new BankAccount();
		BankAccount rameshsAccount = new BankAccount("12345678", 1000.0, "Ramesh Singh", "ramesh@rameshs.com",
				"(0123) 456789");

//		rameshsAccount.setNumber("12345678");
//		rameshsAccount.setCustomeName("Ramesh Singh");
//		rameshsAccount.setBalance(1000);
//		rameshsAccount.setCustomerEmail("ramesh@rameshs.com");
//		rameshsAccount.setCustomerPhone("(0123) 456789");

		rameshsAccount.depositFund(1000);
		rameshsAccount.withdrawFund(200);
		rameshsAccount.depositFund(-10);
		rameshsAccount.withdrawFund(1000);
		rameshsAccount.withdrawFund(-10);
		rameshsAccount.withdrawFund(800);
		rameshsAccount.withdrawFund(1);

		BankAccount johnsAccount = new BankAccount();
		System.out.println(johnsAccount.getBalance());
		System.out.println(johnsAccount.getCustomeName());

		BankAccount myAccount = new BankAccount("Tanuj", "tanuj@gmail.com", "(0123) 456789");
		System.out.println(myAccount.getNumber());
		System.out.println(myAccount.getBalance());
		System.out.println(myAccount.getCustomeName());
		System.out.println(myAccount.getCustomerEmail());
		System.out.println(myAccount.getCustomerPhone());

	}
}
