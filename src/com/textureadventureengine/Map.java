package com.textureadventureengine;

import com.textureadventureengine.Exit;
import com.textureadventureengine.Room;

public class Map {
	public Room setupRooms()
	{
		Room initialRoom = new Room(
				"You find yourself on a porch of ill repair. The house itself that you stand before "
				+ "Seems to look fine. A doorbell sits in front of you"		
		);
		
		Room livingRoom = new Room(
				"As you enter this room, you smell the aroma of Pizza baking in the kitchen off of "
				+ "one corner of the room. The TV is playing rick and morty and Gavin is passed out "
				+ "due to a food coma"
		);
		
		Exit frontDoorToLivingRoom = new Exit("This wooden door seems old and worn", livingRoom);
		Exit livingRoomToFrontPorch = new Exit("This wooden door seems old and worn. Crayon is "
				+ "scrawled on the door in the words 'I Love You'.", initialRoom);
		
		initialRoom.addExit(frontDoorToLivingRoom);
		livingRoom.addExit(livingRoomToFrontPorch);
		
		return initialRoom;
	}
}
