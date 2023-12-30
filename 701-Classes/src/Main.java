
public class Main {
	public static void main(String[] args) {
		Car myCar = new Car();
//		myCar.make = "Porsche";
//		myCar.model = "Carrera";
//		myCar.color = "Red";
		System.out.println("make = " + myCar.make);
		System.out.println("model = " + myCar.model);
		myCar.describeCar();
	}
}
