package FinalExamCode;

public abstract class Vehicle {
	
	private String name;
	private String Color;
	private double Weight;
	private Person Owner;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		Weight = weight;
	}
	
	public Person getOwner() {
		return Owner;
	}
	
	public void setOwner(Person owner){
		
		this.Owner = owner;
	}

	public void transferOwnerShip(Person newOwner) {

		this.Owner = newOwner;
	}
}
