
public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			Student s = new Student("S2023" + i, switch (i) {
			case 1 -> "John";
			case 2 -> "Mary";
			case 3 -> "Tanuj";
			case 4 -> "Ramesh";
			case 5 -> "Praveen";
			default -> "Anonymous";
			}, "01/01/2023", "Java Masterclass");

			System.out.println(s);
		}
	}
}
