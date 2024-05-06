//Switch
import java.util.Scanner;
public class Switch 
{
	public static void main (String args [])
	{
		Scanner Entrada = new Scanner (System.in);
		int num1 = 5 , num2 = 3, resultado = 0;
		 int params = 4;
		
		switch(params)
		{
				case 1: resultado = num1 + num2;
				System.out.println("EL resultado de la suma  es:" + resultado);
				break;
				
				case 2: resultado = num1 - num2;
				System.out.println("EL resultado de la resta es:" + resultado);
				break;
				
				case 3: resultado = num1 * num2;
				System.out.println("EL resultado de la multiplicacion es:" + resultado);
				break;
				
				case 4: resultado = num1 / num2;
				System.out.println("EL resultado de la division es:" + resultado);
				break;
				
				default: System.out.println("Error, la opcion no existe");
				break;
				
		}
	}
}