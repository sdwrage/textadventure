package com.textureadventureengine;

import java.util.Scanner;

import com.textureadventureengine.Map;

public class Game {
	static Room currentRoom;
	static boolean gameRunning = true;
	static Map currentMap = new Map();
	static Scanner reader = new Scanner(System.in);  // Reading from System.in
	
	public static void main(String[] args) {
		currentRoom = currentMap.setupRooms();
		
		System.out.println("===================================================");
		System.out.println("            Welcome to my humble abode!");
		System.out.println("===================================================");
		
		
		
		while(gameRunning) {
			System.out.print(currentRoom.getDescription());
			exitChoicePrompt();
		}
	}
	
	public static void exitChoicePrompt() {
		System.out.println("Exits:\n");
		int exitCount = currentRoom.getExits().size();
		
		for(int i = 0; i < exitCount; i++) {
			System.out.println((i + 1) +  ": " + currentRoom.getExits().get(i).getDescription() + "\n");
		}
		
		System.out.print("Choose an exit: ");
		
		try {
			int destination = reader.nextInt();	
			Exit attemptedDestination = currentRoom.getExits().get(destination - 1);
			currentRoom = attemptedDestination.getConnectedRoom();
			clearScreen();
		} catch(IndexOutOfBoundsException e) {
			System.out.println("\n\n That is not an exit: \n\n");
			exitChoicePrompt();
		} 
	}
	
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	   }  
}
