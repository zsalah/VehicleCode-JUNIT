package FinalExamCode;

public class Car extends Vehicle implements InterfaceVehicle {

	private int NumberOfDoors;
	
	public int getNumberOfDoors() {
		return NumberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		NumberOfDoors = numberOfDoors;
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transferOwnerShip(Person newOwner) {
		// TODO Auto-generated method stub
		
		setOwner(newOwner);
	}

}
