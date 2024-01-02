
public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer("Tanuj", 1000, "tanuj@email.com");
		System.out.println(customer.getName());
		System.out.println(customer.getCreditLimit());
		System.out.println(customer.getEmail());

		Customer customer2 = new Customer();
		System.out.println(customer2.getName());
		System.out.println(customer2.getCreditLimit());
		System.out.println(customer2.getEmail());
	}
}
