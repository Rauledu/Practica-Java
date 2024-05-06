//cadena de caracteres. practica 17
import java.util.Scanner;
public class cadenaCaracteres
{
	public static void main (String args [])
	{
		Scanner entrada =  new Scanner (System.in);
		String Nombre1 = "";
		String Nombre2= "";
		
		System.out.print("Por Favor introduce el nombre: ");
		Nombre1 = entrada.nextLine();
		
		System.out.print("Por favor introduce el segundo Nombre: ");
		Nombre2 = entrada.nextLine();
		
		if (Nombre1.equalsIgnoreCase(Nombre2))// el IgnoreCase me permite obviar si la cadena contiene o no letras mayusculas-
		{
			System.out.println("los Nombres son iguales.");
		}
		else 
		{
			System.out.println("los nombres no son iguales.");
		}
	}
}
//realizar un programa donde el usuario introduzca el primer y segundo nombre 
// dicho programa debe indicar si son o no iguales los nombres que llegue a introducir.