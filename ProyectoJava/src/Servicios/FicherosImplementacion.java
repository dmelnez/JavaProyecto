package Servicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import Controladores.Inicio;
import Dtos.PacienteDtos;

public class FicherosImplementacion implements FicherosInterfaz{
	
	/*
	 * Metodo encargado de realizar la carga de ficheros inicial, en las listas.
	 * Recogera todos los campos del fichero, realizara una division de los mismos, y lo introducira en las listas.
	 * */
	public void cargaInicialFicheros() { 
		
		

		
		String ficheroCargaString = "C:\\Users\\shish\\Desktop\\Citas.txt";
		
		try {
			
			
			BufferedReader lectura = new BufferedReader(new FileReader(ficheroCargaString));
			
			String linea;
			
			while((linea = lectura.readLine()) !=null) {
				
				System.out.println(linea);
				
				String[] valoresDividos = linea.split(";");
				
				PacienteDtos paciente = new PacienteDtos();
				
				paciente.setDni(valoresDividos[0]);
				paciente.setNombre(valoresDividos[1]);
				paciente.setApellidos(valoresDividos[2]);
				paciente.setEspecialidad(valoresDividos[3]);
				
				// Conversion de string a Date.
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				
				String fechaString = valoresDividos[4];
				Date fechaConvertida = formato.parse(fechaString);
				
				paciente.setFechaDeCita(fechaConvertida);
				
				
				Boolean valorConvertido = Boolean.parseBoolean(valoresDividos[5]);
				
				paciente.setAsistenciaACita(valorConvertido);
				
				
				Inicio.listaPacientes.add(paciente);
				
			}
			
			lectura.close();
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		}
	

	/*
	 * Metodo encargado de escribir todas las operativas, acciones y excepciones, producidas dentro de la aplicacion.
	 * Recibira como parametro un string, el cual sera el mensaje escrito dentro del fichero.
	 * */
	public void ficherosLog(String mesajeLog) {
		
		try {
			
		
		
		LocalDate fechaHoy = LocalDate.now();
		
		String rutaFichero = "C:\\Users\\shish\\Desktop\\log-" + fechaHoy + ".txt";
		
		FileWriter escriturFile = new FileWriter(rutaFichero, true);

		escriturFile.write(mesajeLog + "\n");

		escriturFile.close();
		
		
		} 
		
		
		catch (Exception e) {
			// TODO: handle exception
			
		}
		
	}
	
}
