package Servicios;

import java.util.Scanner;

public class OperativaImplementacion implements OperativaInterfaz{

	Scanner sc = new Scanner(System.in);
 	
	/*
	 * Metodo encargado de solicitar al cliente su DNI. Y validarlo.
	 * */
	public void registroLlegada() {
		
		
		boolean esValidado = false;
		
		do {
			
			System.out.println("Introduce su dni:");
			int numeroDni = sc.nextInt();
			
			System.out.println("Introduce su letra:");
			String letraDni = sc.next();
			
			esValidado = validarDni(numeroDni, letraDni);
			
			String dniCompleto = numeroDni + letraDni;
			
		}
		
		while(!esValidado);
		
		
	}
	
	/*
	 * Metodo que realizara en base al numeroo y la letra del dni. La comprobacion de los mismos.
	 * */
	private boolean validarDni(int numeroDni, String letraDni) {
		
		
		String[] letrasAbc = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		
		int posicionLetra = numeroDni % 23;
		
		boolean validoDni = false;

		
		if (letraDni.equals(letrasAbc[posicionLetra])) {
			validoDni = true;
			
			
		}
		
		else {
			validoDni = false;
			
			System.out.println("El DNI introducido es incorrecto. ");
		}
		
		return validoDni;
		
	}
	
	
	
	
	
	
}
