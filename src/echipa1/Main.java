package echipa1;

import echipa1.services.UserService;

public class Main {
	public static void main(String[] args) {
		UserService userService = new UserService();
		userService.register("Lori", "L0r1");
		userService.register("Adi", "@d1");
		userService.register("Andrei", "#31");
		userService.register("Lori", "L0r1");
		userService.register("Meli", "m3l1");
		userService.register("Adi", "132");

		userService.add_friend("Adi", "Lori");
		userService.add_friend("Adi", "Andrei");

		userService.add_friend("Adi", "Andreii");
		userService.add_friend("Adii", "Andrei");

		userService.add_friend("Adi", "Andrei");

		userService.delete_friend("Adi", "Andrei");
		userService.delete_friend("Adi", "Andreii");
		userService.delete_friend("Adi", "Meli");

		userService.organizeEvent("Lori", "Velo sport", "19.10.19", "UVT central building");
		userService.organizeEvent("Adi", "Film festival", "19.10.19", "UVT central building");

		userService.joinEvent("Velo sport", "19.10.19", "UVT central building", "Adi");
		userService.joinEvent("Velo sport", "19.10.19", "UVT central building", "Lori");
		userService.joinEvent("Film festival", "19.10.19", "UVT central building", "Loki");
	}
}
