//segunda parte de la practica 17
import java.util.Scanner;
public class login
{
	public static void main (String args [])
	{
		String usuario = "", password = "";
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Ingresa tu usuario:");
		usuario = entrada.nextLine ();
		
		System.out.print("Ingresa tu password:");
		password = entrada.nextLine ();
		
		if (usuario.equals("Raul")&& password.equals("R234edu."))
		{
			System.out.println("Bienvenido");
		}
		else 
		{
			System.out.println("Usuario o Clave Incorrecta");
		}
	
	}
}