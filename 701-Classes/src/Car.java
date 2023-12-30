
public class Car {
	private String make = "Tesla";
	private String model = "Model X";
	private String color = "Gray";
	private int doors = 2;
	private boolean convertible = true;

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getDoors() {
		return doors;
	}

	public boolean isConvertible() {
		return convertible;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void describeCar() {
		System.out.printf("%d-Door %s %s %s %s\n", doors, color, make, model, convertible ? "Convertible" : "");
	}
}
