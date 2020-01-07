
public class MainPolymorphism {

	public static void main(String[] args) {
		

		//car and motorBike has inherited from Vecihles class
		Car car = new Car("KC1200", 3200, "volvo", 2020);
		MotorBike motorBike = new MotorBike("KM900", 900, "harley", 1995);
		
		displayVecihles(car);
		displayVecihles(motorBike);
	}
	// we dont need to write any other methods for display car and motorBike
	public static void displayVecihles(Vecihles vecihles) {
		System.out.println(vecihles);
	}
}
