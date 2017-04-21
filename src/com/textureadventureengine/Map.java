package com.textureadventureengine;

import com.textureadventureengine.Exit;
import com.textureadventureengine.Room;

public class Map {
	public Room setupRooms()
	{
		Room initialRoom = new Room(
				"You find yourself on a porch of ill repair. The house itself that you stand before "
				+ "Seems to look fine. A doorbell sits in front of you."		
		);
		
		Room livingRoom = new Room(
				"As you enter this room, you smell the aroma of Pizza baking in the kitchen off of "
				+ "one corner of the room. The TV is playing rick and morty and Gavin is passed out "
				+ "due to a food coma."
		);
		
		Room kitchen = new Room(
				"The strong smell of pepperoni and bell peppers fills your nostrils as a gentleman "
				+ "waves at you. He seems to be kneading the dough for future meals."
		);
		
		Room breezeway = new Room(
				"This room seems to be a strange addition to the home... the air seems strange..."
		);
		
		// Living Room Exits
		Exit livingRoomToFrontPorch = new Exit("This wooden door seems old and worn. Crayon is "
				+ "scrawled on the door in the words 'I Love You'.", initialRoom);
		
		Exit livingRoomToKitchen = new Exit("A set of bay doors seems to lead to what can only be a kitchen", kitchen);
		
		// Other
		Exit frontDoorToLivingRoom = new Exit("This wooden door seems old and worn.", livingRoom);
		Exit kitchenToBreezeway = new Exit("A white door leads down two feet to an adjacent room.", breezeway);
		Exit breezewayToKitchen = new Exit("A small set of stairs lead up to a doorway towards the scent of cooked food.", kitchen);
		Exit kitchenToLivingRoom = new Exit("A set of double bay doors leads to a large living room", livingRoom);
		
		initialRoom.addExit(frontDoorToLivingRoom);
		livingRoom.addExit(livingRoomToFrontPorch);
		livingRoom.addExit(livingRoomToKitchen);
		kitchen.addExit(kitchenToBreezeway);
		kitchen.addExit(kitchenToLivingRoom);
		breezeway.addExit(breezewayToKitchen);
		
		return initialRoom;
	}
}
