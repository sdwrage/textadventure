package com.java24hours;

import java.util.ArrayList;
import com.java24hours.Exit;

public class Room {
	protected String description;
	protected ArrayList<Exit> exits;
	
	public Room(String description, ArrayList<Exit> exits) {
		setExits(exits);
		setDescription(description);
	}
	
	public Room(String description) {
		setDescription(description);
	}
	
	public void setExits(ArrayList<Exit> exits) {
		for(Exit exit : exits) {
			addExit(exit);
		}
	}
	
	public void addExit(Exit exit) {
		this.exits.add(exit);
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ArrayList<Exit> getExits() {
		return this.exits;
	}
	
	public String getDescription() {
		return this.description;
	}
}
