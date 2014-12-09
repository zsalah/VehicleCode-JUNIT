package FinalExamCode;

import java.util.UUID;

public class Person {
	
	private String FirstName;
	private String LastName;
	UUID PersonID = UUID.randomUUID();
	
	public Person() {}
	
	public Person(String FirstName, String LastName, UUID PersonID) {
		
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.PersonID = PersonID;
		
	}

	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public UUID getPersonID(UUID personID) {
		return personID;
	}
	
	public void setPersonID(UUID personID) {
		PersonID = personID;
	}

}
