
public class Student {
	private String id;
	private String name;
	private String dateOfBirth;
	private String classList;

	public Student(String id, String name, String dateOfBirth, String classList) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.classList = classList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append(", classList=");
		builder.append(classList);
		builder.append("]");
		return builder.toString();
	}

}