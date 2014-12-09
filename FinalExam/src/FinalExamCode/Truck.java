package FinalExamCode;

public class Truck extends Vehicle implements InterfaceVehicle{

	private int NumberOfAxels;
	
	public Person newOwner;
	
	public Truck(int NumberOfAxels, Person Owner) {
		
		this.NumberOfAxels = NumberOfAxels;
		this.newOwner = Owner;
	}
	
	public Truck(){}
	
	public int getNumberOfAxels() {
		return NumberOfAxels;
	}

	public void setNumberOfAxels(int numberOfAxels) {
		NumberOfAxels = numberOfAxels;
	}

	public Person OwnerShip(Person newOwner) {
		// TODO Auto-generated method stub
		
		super.transferOwnerShip(newOwner);
		
		return newOwner;
	}

}
