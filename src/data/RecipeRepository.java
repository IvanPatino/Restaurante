package data;

import java.util.ArrayList;

import Models.Recipe;

public class RecipeRepository {

	private ArrayList<Recipe> recipes = new ArrayList<Recipe>();

	public boolean create(Recipe recipe) {

		recipes.add(recipe);

		//// Una conexión a la base datos ej: Mysql
		/// con una consulta SQL que inserte los datos.

		return true;
	}

	public ArrayList<Recipe> getAll() {

		return recipes;
	}

	public Recipe findRecipeById(int codRecipe) {
		
		for (int i = 0; i <  recipes.size(); i++) {
			
			Recipe recipe = recipes.get(i);
			
			if (recipe.getCodRecipe() == codRecipe) {
				
				return recipe;
			}
			
		}

		return null;
	}

	
	public boolean updateRecipe (Recipe recipe, Recipe recipeUpdate) {
		
		int position = recipes.lastIndexOf(recipe);
		recipes.set(position, recipeUpdate);
		return true;
		
	}
	
	public boolean deleteRecipeByCod (int codRecipe ) {
		
		
		for(int i = 0; i < recipes.size(); i++) {
			
			Recipe recipe = recipes.get(i);
			
			if (recipe.getCodRecipe() == codRecipe) {
				
				return true;
				
			}
			
		}
		
		return false;
	}
	
	
	
}
