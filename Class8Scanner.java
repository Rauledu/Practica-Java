import java.util.Scanner; //libreria Scanner nos permite introducir datos al sistema
public class Class8Scanner
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		String Nombre= "";
		int num1 = 0, num2 = 0, resultado = 0;
		
		System.out.println("Introduce tu nombre");
		Nombre = in.nextLine(); //el nextline nos permite alojar la cadena de caracteres.
		
		System.out.println("Pasame el Primer valor para sumar:");
		num1 = in.nextInt();
		
		System.out.println("Pasame el Segundo valor para sumar:");
		num2 = in.nextInt();
		
		resultado = num1 + num2;
		
		System.out.println("Hola "+ Nombre + "El resultado es:"+ resultado);
	}
}

//<< al instanciar la sub libreria debemos tomar en cuenta que 
// si queremos introducir datos al sistema debemos inicializarlo con la propiedad System.In que es mi
//variable declarada al principio del codigo.