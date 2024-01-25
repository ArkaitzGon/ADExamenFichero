/**
 * Ejercicio 1 del examen
 * Cambia las vocales minusculas por numeros
 */
package paquete;

import java.io.*;

public class CambioVocalPorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ficheroLectura = new File("ficheroLectura.txt");
		File ficheroEscritura = new File("ficheroEscritura.txt");
		
		try {
			FileReader lectura = new FileReader(ficheroLectura);
			FileWriter escritura = new FileWriter(ficheroEscritura);
			
			String cadena ="";
			
			int i = 0;
			
			while((i=lectura.read()) != -1) {
				if(((char)i)=='a') {
					i = 1;
					cadena += i;
				}else if(((char)i)=='e') {
					i = 2;
					cadena += i;
				}else if(((char)i)=='i') {
					i = 3;
					cadena += i;
				}else if(((char)i)=='o') {
					i = 4;
					cadena += i;
				}else if(((char)i)=='u') {
					i = 5;
					cadena += i;
				}else {
					cadena += ((char)i);
				}
			}
			escritura.write(cadena);
			
			lectura.close();
			escritura.close();
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
			System.out.println("Error con el fichero. No existe");
		}

	}

}
