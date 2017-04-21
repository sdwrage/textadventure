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
			
			System.out.print("\n");
			
			System.out.println("Choose an exit: ");
			int destination = reader.nextInt();
		}
	}
}
