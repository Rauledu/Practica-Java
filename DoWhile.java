public class DoWhile
{
		public static void main (String args[])
		{
			int i= 1000;
			do
			{
				System.out.print(i + ", ");
				i -= 200;	
			}
			while(i >=0);
		}
}

//realizar un progrma que imprima la siguiente serie numerica
//Nota: el comportamiento del do while consta de lo siguiente manera
// 	1) se tiene un valor inicial que para practicas del ejercicio es 1000
//	2) se va al while donde me dice si i es mayor o igual a 0, en este caso si lo es por ende nos imprime en pantalla el primer valor.
//	3) el segundo valor, se detiene en el iterador donde tenemos un decremento y resta el primer valor con 200 donde ya no es 1000 sino 800
//	4) pasa por el while donde evalua la condicion y si esta mayor a 0 se va al print donde imiprime el segundo valor. esto sucedera hasta llegar
// a cero.