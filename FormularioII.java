//practica 25
import javax.swing.*;

public class FormularioII extends JFrame
{
	public FormularioII ()
	{
		setLayout(null); //nos permite indicarle al programa el uso de coordenadas.
		
	}
	public static void main(String args [])
	{
		FormularioII formulario1 = new FormularioII();
		formulario1.setBounds(350,0,400,550);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);
		formulario1.setResizable(false);
		
	}
}
