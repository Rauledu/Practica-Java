//Practica 32
import javax.swing.*;
import java.awt.event.*;
public class FormularioSiete extends JFrame implements ActionListener
{
	private JButton Agregar;
	private JTextField Text;
	private JScrollPane ScrollPane1;
	private JTextArea TxtArea;
	
	String Texto = "";
	
	public FormularioSiete()
	{
		setLayout(null);
		Text = new JTextField();
		Text.setBounds(10,10,200,30);
		add(Text);
		
		Agregar = new JButton("Agregar");
		Agregar.setBounds (250,10,100,30);
		add(Agregar);
		Agregar.addActionListener(this);
		TxtArea = new JTextArea();
		ScrollPane1 = new JScrollPane(TxtArea);
		ScrollPane1.setBounds (10,50,400,300);
		add(ScrollPane1);
	}
	
	public void actionPerformed (ActionEvent e)
	{
		if (e.getSource() == Agregar)
		{
			Texto += Text.getText()+ "\n"; //con esta propiedad recupero la informacion
			TxtArea.setText(Texto);
			Text.setText("");
		}
	}
	public static void main (String args [])
	{
		FormularioSiete formulario1 = new FormularioSiete();
		formulario1.setBounds(0,0,540,400);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
}