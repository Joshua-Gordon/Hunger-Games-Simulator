package tribute;

import java.io.Serializable;
import java.util.ArrayList;

import event.Item;

public class Tribute implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1619149575892843717L;
	private int health, sanity;
	private int[] skills;
	/*
	 * 0 - Base HP
	 * 1 - Base Sanity
	 * 2 - Hunting
	 * 3 - Fishing
	 * 4 - Foraging
	 * 5 - Archery
	 * 6 - Fighting
	 * 7 - Throwing
	 * 8 - Running
	 * 9 - Swimming
	 */
	private int[] attitudes;
	private ArrayList<Item> items;
	
	public Tribute(int[] skills, int[] attitudes, ArrayList<Item> items) {
		super();
		this.health = skills[0];
		this.sanity = skills[1];
		this.skills = skills;
		this.attitudes = attitudes;
		this.items = items;
	}

}
