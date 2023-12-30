
public class Main {
	public static void main(String[] args) {
		Car myCar;// = new Car();
		myCar.setMake("Maserati");
		myCar.setModel("Carrera");
		myCar.setColor("Red");
		myCar.setConvertible(true);
		myCar.setDoors(2);
		System.out.println("make = " + myCar.getMake());
		System.out.println("model = " + myCar.getModel());
		myCar.describeCar();
	}
}
