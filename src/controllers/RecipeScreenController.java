package controllers;

import java.util.ArrayList;

import Models.Recipe;
import data.RecipeRepository;

public class RecipeScreenController {

	RecipeRepository recipeRepository = new RecipeRepository();

	public String createRecipe(int codRecipe, String name, double price) {

		
		if (codRecipe > 0) {
			
			return " ERROR!!!, CODIGO DE LA RECETA DEBE SER MAYOR A 0  ";
		}
		
		
		if (name.trim().length() < 2) {

			return " ERROR!!!, El nombre de la receta no debe tener menos de 2 Digitos ";

		}
		
		if (name.trim().length() > 40) {
			
			return " ERROR!!, el nombre de la receta en muy largo ";
			
		}
		
		if (price < 3000) {
			
			return " ERROR!!!, el precio de la receta es muy bajo";
			
		}
		
		
		if(price > 60000 ) {
			
			
			return " ERROR!!!, el precio de la receta es muy caro  ";
		}

		Recipe recipe = new Recipe(codRecipe, name, price);
		boolean result = recipeRepository.create(recipe);

		if (result) {

			System.out.println("");

			return "LA RECETA SE HA CREADO CON EXITO";

		} else {

			System.out.println("");

			return "ERROR!!! al crear el Producto";

		}

	}

	public ArrayList<Recipe> getRecipe() {

		return recipeRepository.getAll();
	}

	public Recipe searchRecipe(int codRecipe) {

		Recipe recipe = recipeRepository.findRecipeById(codRecipe);
		
		return recipe;
	}
	
	public String updateRecipe ( Recipe recipe, int codRecipe, String name, double price) {
		
		Recipe recipeUpdate = new Recipe (codRecipe,name, price);
		recipeRepository.updateRecipe(recipe, recipeUpdate);
		return null;
		
	}

	public boolean deleteRecipe (int codRecipe) {
		
		return recipeRepository.deleteRecipeByCod(codRecipe);
		
	}
	
}