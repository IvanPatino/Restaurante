package controllers;

import data.ClientRepository;

import java.util.ArrayList;

import Models.Client;

public class ClientsScreenController {

	ClientRepository clientRepository = new ClientRepository();

	public String createClient(String name, String lastname, String id, String phoneNumber, boolean hasChildrens) {

		if (name.trim().length() < 3) {

			return " ERROR!!!, el nombre no debe tener menos de 3 Digitos ";
		}

		if (lastname.trim().length() < 3) {

			return " ERROR!!!, el apellido no debe tener menos de 3 Digitos ";

		}

		if (id.trim().length() > 10) {
			
			return " EL DOCUMENTO DEBE ID NO DEBE TENER MENOS DE 10 NUMEROS ";
			
		}
		
		if (phoneNumber.trim().length() < 10) {

			return " ERROR!!!, EL NUMERO DE TELEFONO DEBE TENER MENOS DE 10 NUMEROS ";
		}

		Client client = new Client(name, lastname, id, phoneNumber, hasChildrens);

		boolean result = clientRepository.create(client);

		if (result) {

			return " Cliente creado con éxito ";

		} else {

			return " ERROR!!! al crear el cliente  ";

		}

	}

	public ArrayList<Client> getClients() {

		return clientRepository.getAll();

	}

	public Client searchClients(String id) {

		Client client = clientRepository.findClientById(id);
		return client;

	}

	public String updateClient(Client client, String name, String lastname, String id, String phoneNumber,
			boolean hasChildrens) {

		Client clientUpdate = new Client(name, lastname, id, phoneNumber, hasChildrens);

		clientRepository.updateClient(client, clientUpdate);

		return null;
	}

	public boolean deleteClient(String id) {

		return clientRepository.deleteClientById(id);

	}

}
