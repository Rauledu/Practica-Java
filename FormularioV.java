//Practica 29
import javax.swing.*;
import java.awt.event.*;

public class FormularioV extends JFrame implements ActionListener
{
	private JTextField textF1;
	private JLabel Label;
	private JButton Btn;
	public FormularioV ()
	{
		setLayout(null);
		Label = new JLabel("Usuario:");
		Label.setBounds(10,10,100,30);
		add(Label);
		
		textF1 = new JTextField();
		textF1.setBounds(120,17,150,20);
		add(textF1);
		
		Btn = new JButton("Aceptar");
		Btn.setBounds(10,80,100,30);
		add(Btn);
		Btn.addActionListener(this);
	}	
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == Btn)
			{
				String text = textF1.getText();
				setTitle(text);
			}
		}
		public static void main (String args[])
		{
			FormularioV formulario1 = new FormularioV();
			formulario1.setBounds(0,0,300,150);
			formulario1.setVisible(true);
			formulario1.setResizable(false);
			formulario1.setLocationRelativeTo(null);
		}	
}
//Nota: Layout-->> Esta clase es la que decide en qué posición van los botones y demás componentes, 
//si van alineados, en forma de matriz, cuáles se hacen grandes al agrandar la ventana.

//setBounds>>no solo especifica el tamaño del marco, sino la ubicación de la esquina superior izquierda.
// ActionListener es un controlador de eventos que ejecuta una tarea cuando una determinada acción se lleva a cabo por el usuario. 