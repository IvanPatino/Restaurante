package Ui;

import java.util.Scanner;

public class MenuScreen {

	public int ShowMenuOptions() {

		Scanner sc = new Scanner(System.in);

		System.out.println(" SELECCIONE LA OPCION QUE DESEA REALIZAR : ");
		System.out.println("  ");
		System.out.println(" 1.  CREAR CLIENTE ");
		System.out.println(" 2.  LISTAR CLIENTE ");
		System.out.println(" 3.  BUSCAR CLIENTE");
		System.out.println(" 4.  ACTUALIZAR CLIENTE POR ID");
		System.out.println(" 5.  ELIMINAR CLIENTE POR ID ");
		System.out.println("  ");
		System.out.println(" 6.  CREAR PRODUCTO ");
		System.out.println(" 7.  LISTAR PRODUCTO ");
		System.out.println(" 8.  BUSCAR PRODUCTO ");
		System.out.println(" 9.  ACTUALIZAR PRODUCTO ");
		System.out.println(" 10. ELIMINAR PRODUCTO ");
		System.out.println("  ");
		System.out.println(" 11.  CREAR RECETA ");
		System.out.println(" 12.  LISTAR RECETA ");
		System.out.println(" 13.  BUSCAR RECETA ");
		System.out.println(" 14.  ACTUALIZAR RECETA ");
		System.out.println(" 15.  ELIMINAR RECETA ");
		System.out.println("  ");
		System.out.println(" 16.  CREAR MESA ");
		System.out.println(" 17.  LISTAR MESA ");
		System.out.println(" 18.  BUSCAR MESA ");
		System.out.println(" 19.  ACTUALIZAR MESA ");
		System.out.println(" 20.  ELIMINAR MESA ");
		
		try {

			int optionSelected = Integer.parseInt(sc.nextLine());

			return optionSelected;

		} catch (Exception e) {

			return -1;

		}

	}

}
