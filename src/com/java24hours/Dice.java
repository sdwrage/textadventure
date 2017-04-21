package com.java24hours;

import java.io.IOException;

// Imports

public class Dice {

	public static void main(String[] args) throws IOException, InterruptedException {
		int count = 10;
		int seconds = 1;
		int milliseconds = seconds * 1000; // First integer in seconds
		int digitCount;	
		
		while (count > 0) {
			digitCount = Integer.toString(count).length();
			
			System.out.print(count--);
			Thread.sleep(milliseconds);
			for(int i = 0; i < digitCount; i++) {
				System.out.print("\b");
			}
		}
		
		System.out.println("Boom!");
	}

}
