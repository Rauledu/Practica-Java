//Practica 27 
import javax.swing.*;
import java.awt.event.*; //me permite controlar los eventos de la interfaz.

public class FormularioIV extends JFrame implements ActionListener
{
		JButton Boton1;
		public FormularioIV()
		{
			setLayout(null);
			Boton1 = new JButton("Cerrar");
			Boton1.setBounds(300,250,100,30);
			add(Boton1);
			Boton1.addActionListener(this);
		}		
		public void actionPerformed(ActionEvent a)//esto me permite capturar el evento 
		{
			if (a.getSource() == Boton1)
			{
				System.exit(0);
			}
		}
		public static void main (String args [])
		{
			FormularioIV formulario1 = new FormularioIV();
			formulario1.setBounds(0,0,450,350);
			formulario1.setVisible(true);
			formulario1.setResizable(false);
			formulario1.setLocationRelativeTo(null);
		}
}