package data;

import java.util.ArrayList;


import Models.Table;

public class TableRepository {

	private ArrayList<Table> tables = new ArrayList<Table>();

	public boolean create(Table table) {

		tables.add(table);

		return true;
	}

	public ArrayList<Table> getAll() {

		return tables;
	}

	public Table findTableById(String number) {

		for (int i = 0; i < tables.size(); i++) {

			Table table = tables.get(i);

			if (table.getNumber().equals(number)) {

				return table;
			}

		}

		return null;
	}

	public boolean updateTable(Table table, Table tableUpdate) {

		int position = tables.indexOf(table);

		tables.set(position, tableUpdate);

		return true;

	}

	public boolean deleteTableByNumber(String number) {

		for (int i = 0; i < tables.size(); i++) {
			Table table = tables.get(i);
			if (table.getNumber().equals(number)) {
				tables.remove(i);
				return true;
			}
		}

		return false;
	}

}