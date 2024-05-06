
public class Condicional
{
	public static void main (String args[])
	{
		int matematica = 4;
		int biologia =4;
		int quimica =3;
		
		int Promedio =0;
		
		Promedio = (matematica + biologia + quimica)/ 3;
		
		if (Promedio >= 6) 
		{
			System.out.println("El Alumno Aprobo con:" + Promedio);
		}
		else
		{
			System.out.println("El Alumno Reprobo con:" + Promedio);
		}
	}
}
//Estructura condicional