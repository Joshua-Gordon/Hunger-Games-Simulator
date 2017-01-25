package event;

import java.io.Serializable;

public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 334322000418616672L;
	private String name, description;
	private int[] skillUps;
	
	public Item(String name, String description, int[] skillUps) {
		super();
		this.name = name;
		this.description = description;
		this.skillUps = skillUps;
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
	
}
