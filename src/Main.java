package pack;

public class Main {
	public static void main(String[] args){
		UserService userService=new UserService();
		userService.register("Lori", "L0r1");
		userService.register("Adi", "@d1");
		userService.register("Andrei", "#31");
		userService.register("Lori", "L0r1");
		
		userService.register("Adi", "132");
		
		userService.add_friend("Adi", "Lori");
		userService.add_friend("Adi", "Andrei");
		
		userService.add_friend("Adi", "Andreii");
		userService.add_friend("Adii", "Andrei");
		
		userService.add_friend("Adi", "Andrei");
}}
