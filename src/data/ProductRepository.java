package data;

import java.util.ArrayList;

import Models.Product;


public class ProductRepository {

	/// CRUD

	/*
	 * CREATE READ / ONE O MANY UPDATE DELETE
	 * 
	 */

	private ArrayList<Product> products = new ArrayList<Product>(); /// Se va a cambiar por una base de datos real

	public boolean create(Product product) {

		products.add(product);

		//// Una conexión a la base datos ej: Mysql
		/// con una consulta SQL que inserte los datos.

		return true;
	}

	public ArrayList<Product> getAll() {

		return products;
	}

	public Product findProductByCod(int codProduct) {

		for (int i = 0; i < products.size(); i++) {

			Product product = products.get(i);

			if (product.getCodProduct() == codProduct) {

				return product;
			}

		}

		return null;
	}
	
	public boolean updateProductByCod (Product product , Product productUpdate) {
		
		int position = products.indexOf(product);
		
		products.set(position, productUpdate);
		
		return true;
		
	}

	public boolean deleteProductByCod (int codProduct) {
		
		for (int i = 0 ; i < products.size(); i++) {
			
			Product product = products.get(i);
			
			if (product.getCodProduct() == codProduct) {
				
				return true;
			}
			
			
		}
		
		return false ;
	}
	
}
