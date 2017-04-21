package com.textureadventureengine;

public class Exit {
	protected String description;
	protected Room connectedRoom;
	
	public Exit(String description, Room room) {
		setDescription(description);
		setConnectedRoom(room);
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Room getConnectedRoom() {
		return connectedRoom;
	}
	
	public void setConnectedRoom(Room connectedRoom) {
		this.connectedRoom = connectedRoom;
	}
}
