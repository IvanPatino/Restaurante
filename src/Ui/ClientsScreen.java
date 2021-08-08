package Ui;

import java.util.ArrayList;
import java.util.Scanner;
import Models.Client;
import controllers.ClientsScreenController;

public class ClientsScreen {

	ClientsScreenController clientsScreenController = new ClientsScreenController();

	public void createClient() {

		String name;
		String lastname;
		String id;
		String phoneNumber;
		boolean hasChildrens;

		Scanner sc = new Scanner(System.in);

		System.out.println(" ");

		System.out.println(" DIGITE NOMBRE :");
		name = sc.nextLine();
		System.out.println(" ");
		System.out.println(" DIGITE APELLIDO : ");
		lastname = sc.nextLine();
		System.out.println(" ");
		System.out.println(" DIGITE DOCUMENTO DE IDENTIDAD : ");
		id = sc.nextLine();
		System.out.println(" ");
		System.out.println(" DIGITE NUMERO DE CELULAR : ");
		phoneNumber = sc.nextLine();
		System.out.println(" ");
		System.out.println(" EL CLIENTE TIENE HIJOS ? S / N  ");
		String hasChildString = sc.nextLine();
		System.out.println(" ");

		if (hasChildString.toLowerCase().equals("s")) {

			hasChildrens = true;

		} else {

			hasChildrens = false;
		}

		String result = clientsScreenController.createClient(name, lastname, id, phoneNumber, hasChildrens);
		System.out.println(result);

	}

	public void listClients() {

		ArrayList<Client> clients = clientsScreenController.getClients();

		if (clients.size() == 0) {

			System.out.println(" NO HAY NINGUN CLIENTE REGISTRADO ");

		}

		for (int i = 0; i < clients.size(); i++) {

			Client client = clients.get(i);
			System.out.println(client.toString());

		}

	}

	public void searchClient() {

		Scanner sc = new Scanner(System.in);

		System.out.println(" INGRESE NUMERO DE DOCUMENTO DE BUSQUEDA ");

		String id = sc.nextLine();

		Client client = clientsScreenController.searchClients(id);

		if (client != null) {

			System.out.println(client.toString());
		} else {

			System.out.println(" DOCUMENTO DEL CLIENTE NO ENCONTRADO");
		}
	}

	public void updateClient() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE NUMERO DE DOCUMENTO DEL CLIENTE ACTUALIZAR :");
		String id = sc.nextLine();
		
		Client client = clientsScreenController.searchClients(id);
		
		if (client != null) {
			
			String name;
			String lastName;
			String nId;
			String phoneNumber;
			boolean hasChildren;
			
		
			Scanner sc1 = new Scanner (System.in);
			
			System.out.println("----ACTUALIZACIÓN DE CLIENTE-----");
			
			System.out.println(" ");
			System.out.println("DIGITE EL NOMBRE : ");
			name = sc1.nextLine();
			System.out.println(" ");
			System.out.println("DIGITE APELLIDO : ");
			lastName = sc1.nextLine();
			System.out.println(" ");
			System.out.println("DIGITE N* DOCUMENTO DE IDENTIDAD : ");
			nId = sc1.nextLine();
			System.out.println(" ");
			System.out.println("DIGITE N* DE TELEFONO : ");
			phoneNumber = sc1.nextLine();
			System.out.println(" ");
			System.out.println("EL CLIENTE TIENE HIJOS ? S/ N : ");
			String hasChildString = sc1.nextLine();
					
			if (hasChildString.toLowerCase().equals("s")) {
				hasChildren = true;
			} else {
				hasChildren = false;
			}
			
			
			String result = clientsScreenController.updateClient(client, name, lastName, nId, phoneNumber, hasChildren);
			
			System.out.println("SE ACTUALIZO CORRECTAMENTE EL CLIENTE ");
		
		} else {
		
			System.out.println("ERROR!!!, No se encontró el cliente");
		
		}
	}

	
	public void deleteClient() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE DOCUMENTO DEL CLIENTE QUE DESEA ELIMINAR :");
		String id = sc.nextLine();
		
		Boolean clientDeleted = clientsScreenController.deleteClient(id);
		
		if (clientDeleted) {
			
			System.out.println("  SE ELIMINO EL CLIENTE CORRECTAMENTE ");
			
		} else {
			
			System.out.println(" ERROR!!!, NO SE ENCONTRO EL CLIENTE ");
		}
		
	}
}
