package game;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		runGame();
	}
	
	public static void runGame() {
		Rooms currentRoom = World.buildWorld();
		Scanner input = new Scanner(System.in);
		
		
		Game[] inventory[]= new inventory[10]; //Create inventory object array length 10?
								               // Should be an array list - check canvas and rephactor
		
		
		
				
		String command; //player's command
		do {
			System.out.println(currentRoom);
			System.out.print("Where do you want to go? ");
			command = input.nextLine();
			String[] words = command.split(" "); // splits players command into multiple strings
			
			switch(words[0]) {
			case "n":
			case "s":
			case "e":
			case "w":
			case "u":
			case "d":
				Rooms nextRoom = currentRoom.getExit(command.charAt(0));
				if (nextRoom == null)
					System.out.println("You can't go that way.");
				else
					currentRoom = nextRoom;
				break;
			case "x":
				System.out.println("Thanks for walking through my game!");
				break;
			case "take":
				System.out.println("You are trying to take the "+words[1]+".");
				Item i = currentRoom.getItem();
				if(i == null)
					System.out.println("There is nothing to take.");
				else
					// removes item from room    currentRoom.setItem(null);
					// code to add item to the inventory   inventory.add(i);
					System.out.println("You picked up the "+i.getName(command)+".");
			case "i":
				System.out.println("You are carrying:");
				for (Item it : inventory) // dont have inventory yet
					System.out.println(it);
				System.out.println(); //prints a space for esthetics
				break;
			default:
				System.out.println("I don't know what that means.");
			}
			
		} while(!command.equals("x"));
		
		input.close();
}