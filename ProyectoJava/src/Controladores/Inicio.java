package Controladores;

import java.util.ArrayList;
import java.util.List;

import Dtos.PacienteDtos;
import Servicios.FicherosImplementacion;
import Servicios.FicherosInterfaz;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

/*
 * Clase por la cual, la aplicacion se lanzara.
 * */
public class Inicio {

	public static List<PacienteDtos>listaPacientes=new ArrayList<PacienteDtos>();

	/*
	 * Metodo por el cual, la aplicacion se lanzara.
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MenuInterfaz  me = new MenuImplementacion();
		
		FicherosInterfaz fi = new FicherosImplementacion();
		
		OperativaInterfaz op = new OperativaImplementacion();
		
		String mesajeLog;
		
		boolean esCerrarMenu = false;
		
		
		do {
			
			int seleccionMenu = me.menuAccesoPrincipal();
			
			switch (seleccionMenu) {
	
			case 0:
				System.out.println("[INFO] -> Se cerrara la aplicacion");
				mesajeLog = "Se cerrara la aplicacion";
				fi.cargaInicialFicheros();
				fi.ficherosLog(mesajeLog);
				
				esCerrarMenu = true;
				break;
			
			case 1:
				System.out.println("[INFO] -> Registro de llegada.");
				op.registroLlegada();
				
				mesajeLog = "Registro de llegada.";
				fi.ficherosLog(mesajeLog);

				break;
				
			case 2:
				System.out.println("[INFO] -> Listado de consultas.");
				mesajeLog = "Listado de consultas.";
				fi.ficherosLog(mesajeLog);
				
				break;
			
				default:
					System.out.println("[ALERTA] -> Seleccion no valida.");

				 break;
			}
			
			}
		
		
		while(!esCerrarMenu);
		
		
	}

}
