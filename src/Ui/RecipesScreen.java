package Ui;

import java.util.ArrayList;
import java.util.Scanner;
import Models.Recipe;
import controllers.RecipeScreenController;

public class RecipesScreen {

	RecipeScreenController recipeScreenController = new RecipeScreenController();

	public void createRecipe() {

		int codRecipe;
		String name;
		double price;

		Scanner sc = new Scanner(System.in);

		System.out.println(" -----AGREGAR RECETA------- \n ");

		System.out.println(" ");

		System.out.println(" INGRESE CODIGO DE LA RECETA ");
		codRecipe = Integer.parseInt(sc.nextLine());
		System.out.println(" INGRESE NOMBRE DE LA RECETA ");
		name = sc.nextLine();
		System.out.println("  ");
		System.out.println(" INGRESE PRECIO DE RECETA ");
		price = Double.parseDouble(sc.nextLine());

		String result = recipeScreenController.createRecipe(codRecipe, name, price);
		System.out.println(result);

	}

	public void ListRecipe() {

		ArrayList<Recipe> recipes = recipeScreenController.getRecipe();

		if (recipes.size() == 0) {

			System.out.println(" NO HAY NINGUNA RECETA REGISTRADA ");

		}

		for (int i = 0; i < recipes.size(); i++) {

			Recipe recipe = recipes.get(i);
			System.out.println(recipe.toString());

		}

	}

	public void searchRecipe() {

		Scanner sc = new Scanner(System.in);

		System.out.println(" INGRESE RECETA QUE DESEA BUSCAR ");

		int codRecipe = Integer.parseInt(sc.nextLine());

		Recipe recipe = recipeScreenController.searchRecipe(codRecipe);

		if (recipe != null) {

			System.out.println(recipe.toString());
		} else {

			System.out.println(" CODIGO DE LA RECETA NO ENCONTRADO");
		}

	}

	public void updateRecipe() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("DIGITE EL CODIGO DE LA RECETA QUE DESEA ACTUALIZAR :");
		int codRecipe = Integer.parseInt(sc.nextLine());
		
		
		Recipe recipe = recipeScreenController.searchRecipe(codRecipe);
		
		if (recipe != null) {
			
			int codRecipe1;
			String name;
			double price;
			
			System.out.println(" -----ACTUALIZAR RECETA------- \n ");

			System.out.println(" ");

			System.out.println(" INGRESE CODIGO DE LA RECETA ACTUALIZAR ");
			codRecipe1 = Integer.parseInt(sc.nextLine());
			System.out.println(" INGRESE NOMBRE DE LA RECETA ");
			name = sc.nextLine();
			System.out.println("  ");
			System.out.println(" INGRESE PRECIO DE RECETA ");
			price = Double.parseDouble(sc.nextLine());
			
			String result = recipeScreenController.createRecipe(codRecipe, name, price);
			
			System.out.println(" SE ACTUALIZO CORRECTAMENTE LA RECETA ");
			
			
		}else {
		
			System.out.println("ERROR!!!, NO SE ENCONTRO LA RECETA");
		
		}
	}

	public void deleteRecipe() {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println(" INGRESE CODIGO DE LA RECETA QUE DESEA ACTUALIZAR ");
		int codRecipe = Integer.parseInt(sc.nextLine());

		
		boolean recipeDelete  = recipeScreenController.deleteRecipe(codRecipe);
		
		
		if (recipeDelete) {
			
			System.out.println(" SE ELIMINO LA RECETA CORRECTAMENTE ");
			
		} else {
			
			System.out.println(" ERROR!!!, NO SE ENCONTRO LA RECETA ");
		}
		
		
		
	}

}
