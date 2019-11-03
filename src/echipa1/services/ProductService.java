package echipa1.services;

import echipa1.Database;
import echipa1.models.Product;

public class ProductService {
	public void registerProduct(String productName, float pret)
	{
		Database.products.add(new Product(productName, pret));
	}
	public Product orderProduct(String productName)
	{
		for(Product product : Database.products)
			if(product.getNume().equals(productName))
				return product;
		return null;
	}

}
