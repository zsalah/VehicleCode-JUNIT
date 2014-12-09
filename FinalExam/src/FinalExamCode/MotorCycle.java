package FinalExamCode;

public class MotorCycle extends Vehicle implements InterfaceVehicle{
	
	public MotorCycle() {
		// TODO Auto-generated constructor stub
	}
	
	private boolean hasSideCar;

	public boolean isHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}
	
	public MotorCycle(boolean hasSideCar) {
		
		this.hasSideCar = hasSideCar;
		
	}
	
}
