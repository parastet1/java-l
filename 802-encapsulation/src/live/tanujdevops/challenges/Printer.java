package live.tanujdevops.challenges;

public class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;

	public Printer(int tonerLevel, boolean duplex) {
		this(tonerLevel, 0, duplex);
	}

	private Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
		this.tonerLevel = tonerLevel < 0 || tonerLevel > 100 ? -1 : tonerLevel;
		this.pagesPrinted = pagesPrinted;
		this.duplex = duplex;
	}

	public int addToner(int tonerAmount) {
		int tempTonerLevel = tonerLevel + tonerAmount;
		if (tempTonerLevel < 0 || tempTonerLevel > 100) {
			System.out.println("Toner amount is not valid");
			return -1;
		}
		return tonerLevel = tempTonerLevel;
	}

	public int printPages(int numPages) {
		int numSheets = numPages;
		if (duplex) {
			System.out.println("It is duplex printer");
			numSheets = numPages % 2 == 0 ? numPages / 2 : numPages / 2 + 1;
		}
		pagesPrinted += numSheets;
		return numSheets;
	}

}
