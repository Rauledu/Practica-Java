//Practica 31
//JScrollPane permite la combinacion con el textarea.
import javax.swing.*;

public class FormVII extends JFrame
{
	private JTextField TextField1;
	private JTextArea Jarea;
	private JScrollPane Scrollpane1;
	
	public FormVII()
	{
		setLayout(null);
		TextField1 = new JTextField();
		TextField1.setBounds(10,10,200,30);
		add(TextField1);
		
		Jarea = new JTextArea();
		Scrollpane1 = new JScrollPane(Jarea); //Nuevo
		Scrollpane1.setBounds(10,50,400,300);
		add(Scrollpane1);
	}
	
	public static void main (String args[])
	{
		FormVII formulario1 = new FormVII();
		formulario1.setBounds(0,0,540,400);
		formulario1.setVisible (true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
}