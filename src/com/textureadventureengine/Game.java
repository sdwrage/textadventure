package com.textureadventureengine;

import java.util.Scanner;

import com.textureadventureengine.Map;

public class Game {
	public static void main(String[] args) {
		boolean gameRunning = true;
		Map currentMap = new Map();
		Room currentRoom = currentMap.setupRooms();
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		
		System.out.println("===================================================");
		System.out.println("            Welcome to my humble abode!");
		System.out.println("===================================================");
		
		
		
		while(gameRunning) {
			System.out.print(currentRoom.getDescription());
			
			System.out.print("\n\n");
			
			System.out.println("Exits:\n");
			int exitCount = currentRoom.getExits().size();
			
			for(int i = 0; i < exitCount; i++) {
				System.out.println((i + 1) +  ": " + currentRoom.getExits().get(i).getDescription() + "\n");
			}
			
			System.out.print("\n Choose an exit: ");
			
			int destination = reader.nextInt();
			
			Exit attemptedDestination = currentRoom.getExits().get(destination - 1);
		
			if (attemptedDestination != null) {
				currentRoom = attemptedDestination.getConnectedRoom();
				//System.out.println("Exiting...\n\n");
				clearScreen();
			}
		}
	}
	
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	   }  
}
