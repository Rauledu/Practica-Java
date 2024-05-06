//clase 18
import java.util.Scanner;
public class Cadenas
{
	public static void main (String args[])
	{
		String CadenaOrig="", CadenaSub= "";
		int numCaracteres = 0, Desde = 0, Hasta =0;
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduce una cadena de caracteres:");
		CadenaOrig = entrada.nextLine();
		
		numCaracteres = CadenaOrig.length();
		
		System.out.println("La Cadena " + CadenaOrig + "posee " + numCaracteres + "Caracteres. ");
		
		System.out.print("Desde que caracter desea obtener la nueva cadena?.");
		Desde = entrada.nextInt();
		System.out.print("Hasta que caracter desea obtener la nueva cadena?.");
		Hasta = entrada.nextInt();
		
		CadenaSub = CadenaOrig.substring(Desde,Hasta);
		System.out.println("La Nueva es: "+ CadenaSub);
	}
}

//Ejercicio.
// Realizar un programa que solicite desde teclado una cadena de caracteres, porsteriormente
//el programa debe indicar a traves de un mensaje en pantalla, la cantidad de caracteres que
//posee dicha cadena. finalmente el programa debe pregunar al usuario,
//que parte de la cadena desea obtener.