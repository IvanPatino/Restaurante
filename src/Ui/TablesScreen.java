package Ui;

import java.util.ArrayList;
import java.util.Scanner;
import Models.Table;
import controllers.TableScreenController;

public class TablesScreen {

	TableScreenController tableScreenController = new TableScreenController();

	public void createTable() {

		String number;
		int capacity;
		String ubication;

		Scanner sc = new Scanner(System.in);

		System.out.println("");
		System.out.println("-----CREAR MESA-----");
		System.out.println("");

		System.out.println("Ingrese el numero de la mesa: ");
		number = sc.nextLine();
		System.out.println("Ingrese la capacidad de personas que tiene la mesa: ");
		capacity = Integer.parseInt(sc.nextLine());
		System.out.println("Ingrese la ubicacion de la mesa: ");
		ubication = sc.nextLine();

		String result = tableScreenController.createTable(number, capacity, ubication);
		System.out.println(result);

	}

	public void listTables() {

		ArrayList<Table> tables = tableScreenController.getTable();

		if (tables.size() == 0) {
			System.out.println("Error!!! No hay ninguna mesa creada");
		}

		for (int i = 0; i < tables.size(); i++) {

			Table table = tables.get(i);

			System.out.println(table.toString());
		}
	}

	public void searchTable() {

		Scanner sc = new Scanner(System.in);

		System.out.println(" DIGITE NUMERO DE LA MESA A BUSCAR ");
		String number = sc.nextLine();

		Table table = tableScreenController.searchTables(number);

		if (table != null) {

			System.out.println(table.toString());

		} else {

			System.out.println("ERROR!!!, NO HAY NINGUNA MESA CREADA ");

		}

	}

	public void updateTable() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite el numero de mesa que desea actualizar:");
		String number = sc.nextLine();

		Table table = tableScreenController.searchTables(number);

		if (table != null) {

			String number1;
			int capacity;
			String ubication;

			Scanner sc1 = new Scanner(System.in);

			System.out.println("");
			System.out.println("-----CREAR MESA-----");
			System.out.println("");

			System.out.println("Ingrese el numero de la mesa: ");
			number1 = sc1.nextLine();
			System.out.println("Ingrese la capacidad de personas que tiene la mesa: ");
			capacity = Integer.parseInt(sc1.nextLine());
			System.out.println("Ingrese la ubicacion de la mesa: ");
			ubication = sc1.nextLine();

			String result = tableScreenController.createTable(number1, capacity, ubication);

			System.out.println("Se actualizó la mesa correctamente");

		} else {

			System.out.println("ERROR!!!, No se encontró el mesa");
		}

	}

	public void deleteTable() {
      
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE LA MESA QUE DESEA ELIMINAR :");
		String number = sc.nextLine();
		
		boolean tableDelete = tableScreenController.deleteTable(number);
		
		if (tableDelete) {
			
			System.out.println(" SE ELIMINO LA MESA  CORRECTAMENTE ");
		
		} else { 
			
			System.out.println(" ERROR!!!, NO ENCONTRO LA MESA REGISTRADA ");
		}
	}

}
