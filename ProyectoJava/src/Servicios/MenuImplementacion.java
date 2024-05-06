package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz	{
	
	Scanner sc = new Scanner(System.in);
	/*
	 * Metodo encargado de mostras las opciones del menu principal.
	 * El metodo, recogera la opcion seleccionada, y la devolvera como parametro al metodo Main.
	 * */
	public int menuAccesoPrincipal() {
		
		System.out.println("[0] -> Cerrar Aplicacion. ");
		System.out.println("[1] -> Registro de llegada. ");
		System.out.println("[2] -> Listado de consultas. ");
		int seleccionMenu = sc.nextInt();
		return seleccionMenu;
		
		
	}
	
	public int menuConsultas() {
		
		System.out.println("0.Volver, 1.Mostrar consultas, 2. Imprimir consultas.");
		int seleccionMenu = sc.nextInt();
		return seleccionMenu;
	}
	
	public int menuAccionesConsultas() {
		
		System.out.println("0. Psicología, 1.Traumatología, 2.Fisioterapia. ");
		int seleccionMenu = sc.nextInt();
		return seleccionMenu;
	}
}
