
public class Animal {
	private String type;
	private String size;
	private double weight;

	public Animal() {

	}

	public Animal(String type, String size, double weight) {
		this.type = type;
		this.size = size;
		this.weight = weight;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [type=");
		builder.append(type);
		builder.append(", size=");
		builder.append(size);
		builder.append(", weight=");
		builder.append(weight);
		builder.append("]");
		return builder.toString();
	}

	public void move(String speed) {
		System.out.printf("%s moves %s\n", type, speed);
	}

	public void makeNoise() {
		System.out.printf("%s makes some kind of noise\n", type);
	}
}
