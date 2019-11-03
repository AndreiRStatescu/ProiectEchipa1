package echipa1;
import echipa1.services.OrderService;
import echipa1.services.ProductService;
import echipa1.services.UserService;


public class Main {
	public static void main(String[] args){
		UserService userService = new UserService();
		//inregistrare useri
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
		
		//inregistrare produse
		ProductService productService = new ProductService();
		productService.registerProduct("Telefon", 30.4f);
		productService.registerProduct("Aparat foto", 53.34f);
		
		//comanda produs
		OrderService orderService = new OrderService();
		orderService.placeOrder(Database.users.get(0), "Telefon", 3);
		orderService.placeOrder(Database.users.get(0), "Colac de salvare", 4);
		System.out.println(Database.users.get(0).getOrders());
		
	}		
		
}
