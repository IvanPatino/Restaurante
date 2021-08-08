package Ui;

public class Main {

	public static void main (String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" **** BIENVENIDOS A SU RESTAURANTE EL GRAN SAZON ******");

		System.out.println(" ");

		ClientsScreen clientsScreen = new ClientsScreen();
		ProductsScreen productsScreen = new ProductsScreen();
		RecipesScreen recipesScreen = new RecipesScreen();
		TablesScreen tablesScreen = new TablesScreen();
		MenuScreen menuScreen = new MenuScreen();

		while (true) {

			int selected = menuScreen.ShowMenuOptions();

			switch (selected) {

			case 1:

				clientsScreen.createClient();
				break;

			case 2:
				
				clientsScreen.listClients();
				break;
				
			case 3:
				
				clientsScreen.searchClient();
				break;
				
			case 4:
				
				clientsScreen.updateClient();
				break;
				
			case 5:
				
				clientsScreen.deleteClient();
				break;
				
			case 6:
				
				productsScreen.createProduct();
				break;

			case 7:
				
				productsScreen.listProducts();
				break;

			case 8:
				
				productsScreen.searchProduct();
				break;

			case 9:
				
				productsScreen.updateProduct();
				break;
				
			case 10:
				
				productsScreen.deleteProduct();
				break;
			
			case 11:
			
				recipesScreen.createRecipe();
				break;

			case 12:
				
				recipesScreen.ListRecipe();
				break;

			case 13:
				
				recipesScreen.searchRecipe();
				break;
				
			case 14:
				
				recipesScreen.updateRecipe();
				break;
				
			case 15:
				
				recipesScreen.deleteRecipe();
				break;
				
			case 16:
				
				tablesScreen.createTable();
				break;

			case 17:
				
				tablesScreen.listTables();
				break;

			case 18:
				
				tablesScreen.searchTable();
				break;

			case 19:
				
				tablesScreen.updateTable();
				break;
				
			case 20:
				
				tablesScreen.deleteTable();
				break;
				
			default:

				System.out.println(" ");
				System.out.println(" ERROR!!! Esta opcion no esta disponible ");
			
			}
		}
	}

}