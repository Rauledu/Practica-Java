import javax.swwing.*;
import java.awt.event.*;

public class Seleccion extends JFrame implements ActionListener
{
	private JButton Opcion1;
	private JButton Opcion2;
	private JButton Opcion3;
	
	private JLabel label;
	
	public Seleccion()
	{
		setLayout(null);
		Opcion1 = new JButton("Opcion1");
		Opcion1.setBounds(10,100,90,30);
		add(Opcion1);
		Opcion1.addActionListener(this);
		
		Opcion2 = new JButton("Opcion2");
		Opcion2.setBounds(110,100,90,30);
		add(Opcion2);
		Opcion2.addActionListener(this);
		
		Opcion3 = new JButton("Opcion3");
		Opcion3.setBounds(210,100,90,30);
		add(Opcion3);
		Opcion3.addActionListener(this);
		
		label =new JLabel("En Espera...");
		label.setBounds(10,10,300,30);
		add(label);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == Opcion1)
		{
			label.setText("Has presionado el boton 1.");
		}
		if (e.getSource() == Opcion2)
		{
			label.setText("Has presionado el boton 2.");
		}
		if (e.getSource() == Opcion3)
		{
			label.setText("Has presionado el boton 3.");
		}
		
		public static void main (String args [])
		{
			Seleccion seleccion1 = new Seleccion();
			seleccion1.setBounds(0,0,350,200);
			seleccion1.setVisible(true);
			seleccion1.setResizable(false);
			seleccion1.setLocationReltiveTo(null);
		}
	}
}