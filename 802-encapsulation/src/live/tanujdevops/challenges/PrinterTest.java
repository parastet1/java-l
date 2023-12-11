package live.tanujdevops.challenges;

public class PrinterTest {
	public static void main(String[] args) {
		Printer p1 = new Printer(10000, false);
		System.out.println("Printer tonerLevel: " + p1.addToner(-20));
	}
}
