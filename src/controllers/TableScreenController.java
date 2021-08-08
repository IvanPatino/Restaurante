package controllers;

import java.util.ArrayList;

import Models.Table;
import data.TableRepository;

public class TableScreenController {

	TableRepository tableRepository = new TableRepository();

	public String createTable(String number, int capacity, String ubication) {

		if (number.trim().length() < 0) {

			return " ERROR!!! , El numero de la mesa  debe ser mayor a 0  ";

		}
		
		if (number.trim().length() < -1) {

			return " ERROR!!! , El numero de la mesa  deben tener numeros negativos  ";

		}

		if (capacity >= 1) {

			return " Error!!!, la capacidad de las mezas debe ser mayor a 1  ";

		}

		if (ubication.trim().length() < 3) {

			return " ERROR!!!, la ubicacion de la mesa no debe tener menos de 2 Digitos ";

		}

		
		
		Table table = new Table(number, capacity, ubication);

		boolean result = tableRepository.create(table);

		if (result) {

			System.out.println("");

			return "La mesa se ha creado con exito";

		} else {

			System.out.println("");

			return "ERROR!!! al crear el Producto";
		}

	}

	public ArrayList<Table> getTable() {
		
		return tableRepository.getAll();
	}

	public Table searchTables(String number) {

		Table table = tableRepository.findTableById(number);
		return table;
	}
	
	
	public String updateTable (Table table, String number, int capacity , String ubication) {
		
		Table tableUpdate = new Table (number, capacity, ubication);
		
		tableRepository.updateTable(table, tableUpdate);
		
		return null;
		
	}

	public boolean deleteTable (String number) {
		
		return tableRepository.deleteTableByNumber(number);
		
	}
	
}
