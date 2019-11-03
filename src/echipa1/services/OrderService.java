package echipa1.services;

import echipa1.models.Order;
import echipa1.models.Product;
import echipa1.models.User;

public class OrderService {
	public void placeOrder(User user, String productName, float quantity)
	{
		Product product;
		if((product = (new ProductService()).orderProduct(productName)) != null)
		{
			user.getOrders().add(new Order(product, quantity));
			return;
		}
		System.out.println(String.format("Produsul \"%s\" nu exista", productName));
	}
}
