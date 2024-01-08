
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
		builder.append("Dog [earShape=").append(earShape).append(", tailShape=").append(tailShape).append(", super=")
				.append(super.toString()).append("]");
		return builder.toString();
	}

	public void makeNoise() {
//		bark();
		if (type == "Wolf") {
			System.out.println("Ow Woooo!");
		}
		System.out.println();
	}

	@Override
	public void move(String speed) {
		super.move(speed);
//		do additional stuff
//		System.out.println("Dog walk, run and  their tail");
		if (speed == "slow") {
			walk();
			wagTail();
		} else {
			run();
			bark();
		}
		System.out.println();
	}

	private void bark() {
		System.out.print("Woof! ");
	}

	private void run() {
		System.out.print("Dog Running ");
	}

	private void walk() {
		System.out.print("Dog Walking ");
	}

	private void wagTail() {
		System.out.print("Tail Wagging ");
	}
}
