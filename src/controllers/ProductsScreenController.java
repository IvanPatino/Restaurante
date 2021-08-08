package controllers;

import java.util.ArrayList;
import Models.Product;
import data.ProductRepository;

public class ProductsScreenController {

	ProductRepository productRepository = new ProductRepository();

	public String createProduct(int codProduct, String name, String brand, int quantity, double price) {

		if (codProduct > 0) {

			return " ERROR!!!, CODIGO DEL PRODUCTO DEBE SER MAYOR A 0   ";

		}

		if (name.trim().length() < 2) {

			return " ERROR!!!, EL NOMBRE DEL PRODUCTO NO DEBE SER INFERIOR A 2 DIGITOS ";

		}

		if (brand.trim().length() < 3) {

			return " ERROR!!!, LA MARCA DEL PRODUCTO NO DEBE TENER MENOS DE 3 DIGITOS  ";

		}

		if (quantity < 1) {

			return " ERROR!!!, CANTIDAD DEL PRODUCTO NO EXISTE  ";

		}

		Product product = new Product(codProduct, name, brand, quantity, price);

		boolean result = productRepository.create(product);

		if (result) {

			System.out.println("");

			return "El producto se ha creado con exito";

		} else {

			System.out.println("");

			return "ERROR!!! al crear el Producto";

		}

	}

	public ArrayList<Product> getProducts() {

		return productRepository.getAll();

	}

	public Product searchProducts(int codProduct) {

		Product product = productRepository.findProductByCod(codProduct);
		return product;

	}

	public String updateProduct(Product product, int codProduct, String name, String brand, int quantity,
			double price) {

		Product productUpdate = new Product(codProduct, name, brand, quantity, price);
		productRepository.updateProductByCod(product, productUpdate);
		return null;
	}

	public boolean deleteProduct(int codProduct) {

		return productRepository.deleteProductByCod(codProduct);

	}
}
