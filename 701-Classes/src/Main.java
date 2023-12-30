
public class Main {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setMake("Porsche");
//		myCar.model = "Carrera";
//		myCar.color = "Red";
		System.out.println("make = " + myCar.getMake());
		System.out.println("model = " + myCar.getModel());
		myCar.describeCar();
	}
}
