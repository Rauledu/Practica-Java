//Estructuras COndicionales anidadas.
public class CondicionalAnidada
{
	public static void main (String args[])
	{
		int operacion= 2; 
		int num1 = 8;
		int num2 = 4;
		int Resultado = 0;
		
		if (operacion == 1)
		{
			Resultado = num1 + num2;
			System.out.println("El resultado de la suma es:" + Resultado);
		}
		else if (operacion == 2)
		{
			Resultado = num1 - num2;
			System.out.println("El resultado de la Resta es:" + Resultado);
		}
		else if (operacion == 3)
		{
			Resultado = num1 * num2;
			System.out.println("El resultado de la Multiplicacion es:" + Resultado);
		}
		else if (operacion == 4)
		{
			Resultado = num1 /num2;
			System.out.println("El resultado de la Division es:" + Resultado);
		}
		else 
		{
			System.out.println("Ninguno de las opciones existe");
		}
	}
}