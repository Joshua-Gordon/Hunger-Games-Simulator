package event;

import java.io.Serializable;

import tribute.Tribute;

public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 334322000418616672L;
	private String name, description;
	private int[] skillUps;
	private int uses;
	
	public Item(String name, String description, int[] skillUps, int uses) {
		super();
		this.name = name;
		this.description = description;
		this.skillUps = skillUps;
		this.uses = uses;
	}
	
	public void takeEffect(Tribute t) {
		//To be overidden
		//Include uses--;
		System.err.println("Item not overriding takeEffect!");
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int[] getSkillUps() {
		return skillUps;
	}
	
	public int getUses() {
		return uses;
	}
	
}
