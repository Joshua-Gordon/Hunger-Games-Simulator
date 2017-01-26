package event;

import java.io.Serializable;

import tribute.Tribute;

public class Event implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4031966842159109874L;

	private String name, description;
	private Tribute[] tributes; //Tributes involves
	private int[] directEffects; //Health & sanity effects
	
	public Event(String name, String description, Tribute[] tributes, int[] directEffects) {
		super();
		this.name = name;
		this.description = description;
		this.tributes = tributes;
		this.directEffects = directEffects;
	}
	
	public void execute() {
		for(int i = 0; i < tributes.length; i++) {
			tributes[i].takeDamage(directEffects[2*i]);
			tributes[i].takeSanityDamage(directEffects[2*i + 1]);
		}
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Tribute[] getTributes() {
		return tributes;
	}

	public int[] getDirectEffects() {
		return directEffects;
	}
	
	
	
}
