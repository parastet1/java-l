
public class Car {
	private String make;
	private String model;
	private String color;
	private int doors;
	private boolean convertible;

	public void describeCar() {
		System.out.printf("%d-Door %s %s %s %s\n", doors, color, make, model, convertible ? "Convertible" : "");
	}
}
