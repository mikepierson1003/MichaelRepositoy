package game;

public class World {
	
	public static Rooms buildWorld() {
		Rooms Entrance = new Rooms("You are in the entrance.");
		Rooms Decontamination = new Rooms("You have entered the decontamination room.");
		Rooms Radar = new Rooms("You have entered the radar room.");
		Rooms Control = new Rooms("You have entered the control room.");
		Rooms Lablower = new Rooms("You have entered the lower part of the research lab.");
		Rooms Labupper = new Rooms("You have entered the upper part of the research lab.");
		Rooms Caf = new Rooms("You have entered the cafeteria.");
		Rooms Kitchen = new Rooms("You have entered the kitchen.");
		Rooms Generator = new Rooms("You have entered the generator and life support room.");
		Rooms Engine = new Rooms("You have entered the engine room.");
		Rooms Sleepinglower = new Rooms("You have entered the lower sleeping quarters.");
		Rooms Sleepingupper = new Rooms("You have entered the upper sleeping quarters.");
		Rooms Observatoryupper = new Rooms("You have entered the upper observatory.");
		Rooms Observatorylower = new Rooms("You have entered the lower observatory.");
		
		//special rooms
		Rooms Ocean = new Rooms("You open the hatch and water floods in and you are sucked out.");
		Rooms Captain = new Rooms("You have entered the captains quarters.");
		Rooms Armory = new Rooms("You have entered the armory.");
		
		Entrance.addExit(Decontamination, 'd');
		Entrance.addExit(Ocean, 'u');
		
		Ocean.addExit(Entrance, 'd');
		
		Decontamination.addExit(Entrance, 'u');
		Decontamination.addExit(Radar, 'd');
		
		Radar.addExit(Decontamination, 'u');
		Radar.addExit(Control, 'd');
		
		Control.addExit(Radar, 'u');
		Control.addExit(Lablower, 'n');
		Control.addExit(Generator, 's');
		Item Flashlight = new Item("flashlight", "It's a flashlight.");
		Control.setItem(Flashlight);
		
		Generator.addExit(Control, 'n');
		Generator.addExit(Engine, 's');
		Item Crowbar = new Item("crowbar", "It's a crowbar."); // creates item
		Generator.setItem(Crowbar); // puts item in the room
		
		Engine.addExit(Generator, 'n');
				
		Lablower.addExit(Caf, 'n');
		Lablower.addExit(Control, 's');
		Lablower.addExit(Labupper, 'u');
		
		Labupper.addExit(Lablower, 'd');
		Labupper.addExit(Kitchen, 'n');
		Labupper.addExit(Armory, 'w');
		
		Armory.addExit(Labupper, 'e');
		Item Gun = new Item("gun", "It's a gun.");
		Armory.setItem(Gun);
		
		Caf.addExit(Lablower, 's');
		Caf.addExit(Kitchen, 'u');
		Caf.addExit(Sleepinglower, 'n');
		
		Kitchen.addExit(Caf, 'd');
		Kitchen.addExit(Labupper, 's');
		Kitchen.addExit(Sleepingupper, 'n');
		Item Knife = new Item("knife", "It's a knife");
		Kitchen.setItem(Knife);
		
		Sleepingupper.addExit(Kitchen, 's');
		Sleepingupper.addExit(Sleepinglower, 'd');
		Sleepingupper.addExit(Observatoryupper, 'n');
		
		Sleepinglower.addExit(Sleepingupper, 'u');
		Sleepinglower.addExit(Caf, 's');
		Sleepinglower.addExit(Observatorylower, 'n');
		Sleepinglower.addExit(Captain, 'e');
		
		Captain.addExit(Sleepinglower, 'w');
		
		Observatoryupper.addExit(Sleepingupper, 's');
		Observatoryupper.addExit(Observatorylower, 'd');
		
		Observatorylower.addExit(Sleepinglower, 's');
		Observatorylower.addExit(Observatoryupper, 'u');
		
		return Entrance;
	}
}
