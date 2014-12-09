package FinalExamCode;

public class TestVehicle {
	
	public static void main(String[] args) {
		
		Person a = new Person();
		a.setFirstName("a");
		
		Car newCar = new Car();
		newCar.setOwner(a);
		newCar.setNumberOfDoors(4);
		
		System.out.println(newCar.getOwner().getFirstName());
		
		Truck newTruck = new Truck();
		newTruck.setOwner(a);
		newTruck.setNumberOfAxels(2);
		
		System.out.println(newTruck.getOwner().getFirstName());
		
		Person b = new Person();
		b.setFirstName("b");
		
		newTruck.setOwner(b);
		
		MotorCycle newMC = new MotorCycle();
		newMC.setHasSideCar(false);
		
		System.out.println(newTruck.getOwner().getFirstName());
		
		System.out.println(newCar.getNumberOfDoors());
		
		System.out.println(newMC.isHasSideCar());
	}

}
