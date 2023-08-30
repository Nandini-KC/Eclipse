package com.xworkz.util.player;

public class PlayerRunner {

	public static void main(String[] args) {
		PlayerDTO dto = new PlayerDTO("MarryKom", "Boxing");
		PlayerDTO dto1 = new PlayerDTO("Saniya", "Tennis");
		PlayerDTO dto2 = new PlayerDTO("Virat", "Cricket");
		PlayerService service = new PlayerServiceImpl();
		boolean saved = service.validateAndSave(dto);
		if (saved) {
			System.out.println("Player details saved " + saved);
		} else {
			System.out.println("Player details not saved " + saved);
		}
		boolean saved1 = service.validateAndSave(dto1);
		if (saved1) {
			System.out.println("Player details saved " + saved1);
		} else {
			System.out.println("Player details not saved " + saved1);
		}
		boolean saved2 = service.validateAndSave(dto2);
		if (saved2) {
			System.out.println("Player details saved " + saved2);
		} else {
			System.out.println("Player details not saved " + saved2);
		}
		service.findByName("MarryKom");
		System.out.println(".................");
		service.findByNameAnd("virat", "Cricket");
		
	}

}
