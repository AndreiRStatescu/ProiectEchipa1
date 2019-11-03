package echipa1;

import echipa1.services.OrderService;
import echipa1.services.ProductService;
import echipa1.services.UserService;

public class Main {

	public static void main(String[] args){
		//inregistrare useri
		UserService userService = new UserService();
		userService.register("Lori", "L0r1", "Lori012@gmail.com", "0742177240");
		userService.register("Adi", "@d1", "adi1@yahoo.com", "075244920");
		userService.register("Andrei", "#31", "&rei@gmail.com", "074566123");
		userService.register("Lori", "L0r1", "L0r114@gmail.com", "074555141");
		userService.register("Meli", "m3l1", "meli09@yahoo.com", "074155623");
		userService.register("Adi", "132", "Adi15@gmail.com", "075436789");

		userService.add_friend("Adi", "Lori");
		userService.add_friend("Adi", "Andrei");

		userService.add_friend("Adi", "Andreii");
		userService.add_friend("Adii", "Andrei");

		userService.add_friend("Adi", "Andrei");

		userService.delete_friend("Adi", "Andrei");
		userService.delete_friend("Adi", "Andreii");
		userService.delete_friend("Adi", "Meli");

		
		//inregistrare produse
		ProductService productService = new ProductService();
		productService.registerProduct("Telefon", 30.4f);
		productService.registerProduct("Aparat foto", 53.34f);
		
		//comanda produs
		OrderService orderService = new OrderService();
		orderService.placeOrder(Database.users.get(0), "Telefon", 3);
		orderService.placeOrder(Database.users.get(0), "Colac de salvare", 4);
		System.out.println(Database.users.get(0).getOrders());
		


		userService.organizeEvent("Lori", "Velo sport", "19.10.19", "UVT central building");
		userService.organizeEvent("Adi", "Film festival", "19.10.19", "UVT central building");

		userService.joinEvent("Velo sport", "19.10.19", "UVT central building", "Adi");
		userService.joinEvent("Velo sport", "19.10.19", "UVT central building", "Lori");
		userService.joinEvent("Film festival", "19.10.19", "UVT central building", "Loki");
	}

}
