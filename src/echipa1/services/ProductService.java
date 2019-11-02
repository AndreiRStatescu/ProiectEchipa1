package echipa1.services;

import echipa1.models.Product;

public class ProductService {
	public Product orderProduct(String name, float pret)
	{
		return new Product(name, pret);
	}

}
