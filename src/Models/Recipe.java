package Models;

public class Recipe {

	/// Attributes

	private int codRecipe;
	private String name;
	private double price;

	/// Constructor

	public Recipe(int codRecipe,String name, double price) {

		this.codRecipe = codRecipe;
		this.name = name;
		this.price = price;

	}

	/// Methods / get / set
	

	public int getCodRecipe() {
		return codRecipe;
	}

	public void setCodRecipe(int codRecipe) {
		this.codRecipe = codRecipe;
	}
	

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String  toString() {
		
		return "Recipe [Codigo : " + " " + codRecipe + " " + " " + " Nombre : " + " " + name + " " + " " + " Precio : " + " " + price+"]";
		
	}
	
}
