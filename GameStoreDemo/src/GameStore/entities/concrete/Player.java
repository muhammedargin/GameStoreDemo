package GameStore.entities.concrete;

import GameStore.entities.Abstract.Entity;
import GameStore.entities.Abstract.Member;

public class Player extends Member implements Entity{
	
	private String firstName;
	private String lastName;
	private int birthYear;
	private String nationalityId;
	
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(String firstName, String lastName, int birthYear, String nationalityId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.nationalityId = nationalityId;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	
}
