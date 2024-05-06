//curso 24 de java
import javax.swing.*;//la propiedad swing se usa para dar acceso a las interface graficas.
public class Formulario extends JFrame // permite crear la interface.
{
	private JLabel label1;	//me permite crear una etiqueta.
	
	public Formulario()
	{
		setLayout(null);
		label1= new JLabel("Practica interface");
		label1.setBounds(10,20,200,300);
		add(label1);
	}
	public static void main(String args[])
	{
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(0,0,400,300);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);
	}
}
//en java el empleo de la herencia,característica muy potente que permite definir una clase tomando como base a otra clase ya existente.