package JUNIT;

import org.junit.Test;

import FinalExamCode.Person;
import FinalExamCode.Car;
import FinalExamCode.Truck;
import FinalExamCode.MotorCycle;
import junit.framework.TestCase;

public class JunitTest extends TestCase{

	@Test
	public void testVehicle() {
		
		Person a = new Person();
		a.setFirstName("a");
		
		Car newCar = new Car();
		newCar.setOwner(a);
		newCar.setNumberOfDoors(4);
		
		//Use assertEquals to make true of Owner first Name as "a"
		assertEquals("Person FirstName is 'a'","a",a.getFirstName());
		
		//Car owned by Person 'a'
		assertEquals("Car Owned by Person'a'","a",newCar.getOwner().getFirstName());
		
		Truck newTruck = new Truck();
		newTruck.setOwner(a);
		
		//Use assertEquals to make true that truck is owned by Person 'a'
		assertEquals("Truck owned by Person 'a'","a",newTruck.getOwner().getFirstName());
		
		//Truck owned by Person 'b'
		
		Person b = new Person();
		b.setFirstName("b");
		newTruck.setOwner(b);
		
		assertEquals("Truck owned by Person 'b'","b",newTruck.getOwner().getFirstName());
		
		newCar.setOwner(b);
		
		//Car owned by Person 'b'
		assertEquals("Car Owned by Person'b'","b",newCar.getOwner().getFirstName());

		newCar.setNumberOfDoors(4);
		
		//Car NumberOfDoors to be 4
		assertEquals("NuumberOfDoors for Car is 4",4,newCar.getNumberOfDoors());
		
		//MotorCycle isHasSideCar outputs false
		MotorCycle newMc = new MotorCycle();
		newMc.setHasSideCar(false);
		
		assertEquals("No sideCar for MotorCycle",false,newMc.isHasSideCar());
		
	}
	
	

}
