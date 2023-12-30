
public class Car {
	private String make = "Tesla";
	private String model = "Model X";
	private String color = "Gray";
	private int doors = 2;
	private boolean convertible = true;

	public void describeCar() {
		System.out.printf("%d-Door %s %s %s %s\n", doors, color, make, model, convertible ? "Convertible" : "");
	}
}
