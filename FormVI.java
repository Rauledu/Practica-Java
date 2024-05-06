//Practica 30
import javax.swing.*;
public class FormVI extends JFrame 
{
	private JTextField Jtext;
	private JTextArea Jarea; //Nuevo
	
	public FormVI()
	{
		setLayout (null);
		Jtext = new JTextField();
		Jtext.setBounds(10,10,200,30);
		add(Jtext);
		
		Jarea = new JTextArea();
		Jarea.setBounds(10,50,400,300);
		add(Jarea);
	}
	public static void main (String args [])
	{
		FormVI formulario1 = new FormVI();
		formulario1.setBounds(0,0,540,400);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
}

//Nota: como no se esta trabajando con eventos, no fue necesario usar el ActionListener y actionResponsive.