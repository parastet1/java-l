
public class Dog extends Animal {
	private String earShape;
	private String tailShape;

	public Dog() {
		super("Matt", "Big", 50);
	}

	public Dog(String type, double weight) {
		this(type, weight, "Perky", "Curled");
	}

	public Dog(String type, double weight, String earShape, String tailShape) {
		super(type, weight < 15 ? "small" : (weight < 53 ? "medium" : "large"), weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dog [earShape=").append(earShape).append(", tailShape=").append(tailShape)
				.append(", super=").append(super.toString()).append("]");
		return builder.toString();
	}

}
