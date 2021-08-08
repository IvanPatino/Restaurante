package Ui;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import Models.Product;
import controllers.ProductsScreenController;

public class ProductsScreen {

	ProductsScreenController productsScreenController = new ProductsScreenController();

	public void createProduct() {

		
		String name;
		String brand;
		int quantity;
		double price;
		int codProduct;
		
		Scanner sc = new Scanner(System.in);

		System.out.println(" -----AGREGAR PRODUCTOS------- \n ");

		System.out.println(" ");

		System.out.println("INGRESE CODIGO DEL PRODUCTO ");
		codProduct = Integer.parseInt(sc.nextLine());
		System.out.println("  ");
		System.out.println(" INGRESE NOMBRE DEL PRODUCTO ");
		name = sc.nextLine();
		System.out.println("  ");
		System.out.println(" INGRESE MARCA DEL PRODUCTO ");
		brand = sc.nextLine();
		System.out.println(" ");
		System.out.println(" INGRESE CANTIDAD DEL PRODUCTO ");
		quantity = Integer.parseInt(sc.nextLine());
		System.out.println(" ");
		System.out.println(" INGRESE PRECIO DEL PRODUCTO ");
		price = Double.parseDouble(sc.nextLine());

		String result = productsScreenController.createProduct(codProduct, name, brand, quantity, price);
		System.out.println(result);

	}

	public void listProducts() {

		ArrayList<Product> products = productsScreenController.getProducts();

		if (products.size() == 0) {

			System.out.println(" NO HAY NINGUN PRODUCTO REGISTRADO ");
		}

		for (int i = 0; i < products.size(); i++) {

			Product product = products.get(i);
			System.out.println(product.toString());
		}
	}

	public void searchProduct() {

		Scanner sc = new Scanner(System.in);

		System.out.println(" DIGITE EL CODIGO DEL PRODUCTO QUE DESEA BUSCAR ");

		int codProduct = Integer.parseInt(sc.nextLine());

		Product product = productsScreenController.searchProducts(codProduct);

		if (product != null) {

			System.out.println(product.toString());

		} else {

			System.out.println(" CODIGO DEL PRODUCTO NO ENCONTRADO");
		}

	}

	public void updateProduct() {

		Scanner sc = new Scanner(System.in);

		System.out.println("DIGITE EL CODIGO DE PRODUCTO QUE DESEA ACTUALIZAR :");
		int codProduct = Integer.parseInt(sc.nextLine());

		Product product = productsScreenController.searchProducts(codProduct);

		if (product != null) {

			int codProduct1;
			String name;
			String brand;
			int quantity;
			double price;

			Scanner sc1 = new Scanner(System.in);

			System.out.println(" -----ACTUALIZACION DE PRODUCTOS------- ");

			System.out.println(" ");

			System.out.println("INGRESE CODIGO DEL PRODUCTO ");
			codProduct1 = Integer.parseInt(sc1.nextLine());
			System.out.println("  ");
			System.out.println(" INGRESE NOMBRE DEL PRODUCTO ");
			name = sc1.nextLine();
			System.out.println("  ");
			System.out.println(" INGRESE MARCA DEL PRODUCTO ");
			brand = sc1.nextLine();
			System.out.println(" ");
			System.out.println(" INGRESE CANTIDAD DEL PRODUCTO ");
			quantity = Integer.parseInt(sc1.nextLine());
			System.out.println(" ");
			System.out.println(" INGRESE PRECIO DEL PRODUCTO ");
			price = Double.parseDouble(sc1.nextLine());

			String result = productsScreenController.createProduct(codProduct1, name, brand, quantity, price);
			
			System.out.println(" SE ACTUALIZO CORRECTAMENTE EL PRODUCTO ");
			
			
		}else {
			
			System.out.println(" ERROR!!!, NO SE ENCONTRO EL PRODUCTO ");
			
		}
		
			

	}

	public void deleteProduct() {

		Scanner sc = new Scanner(System.in);

		System.out.println(" INGRESE CODIGO DEL PRODUCTO QUE DESEA ACTUALIZAR ");
		int codProduct = Integer.parseInt(sc.nextLine());
		
		
		boolean productDelete = productsScreenController.deleteProduct(codProduct);
		
		if (productDelete) {
			
			System.out.println(" SE ELIMINO EL PRODUCTO CORRECTAMENTE ");
		
		} else {
			
			System.out.println(" ERROR!!!, NO SE ENCONTRO EL PRODUCTO ");
		}
	
	}

}
