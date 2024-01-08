
public class Fish extends Animal {
	private int gills;
	private int fins;

	public Fish(String type, double weight, int gills, int fins) {
		super(type, "small", weight);
		this.gills = gills;
		this.fins = fins;
	}

	private void moveMuscle() {
		System.out.print("muscle moving ");
	}

	private void moveBackFins() {
		System.out.print("backfin moving ");
	}

	public void move(String speed) {
		super.move(speed);
		moveMuscle();
		if (speed == "fast") {
			moveBackFins();
		}
		System.out.println();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fish [gills=").append(gills).append(", fins=").append(fins).append(", super=")
				.append(super.toString()).append("]");
		return builder.toString();
	}

}
