//Practica 36
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario11 extends JFrame implements ActionListener
{
	private JMenuBar menubar;
	private JMenu menu1;
	private JMenuItem menuitem1,menuitem2,menuitem3;
	
	public Formulario11()
	{
		setLayout(null);
		menubar= new JMenuBar();
		setJMenuBar(menubar);
		
		menu1 = new JMenu("Opciones");
		menubar.add(menu1);
		
		menuitem1= new JMenuItem("Rojo");
		menuitem1.addActionListener(this);
		menu1.add(menuitem1);
		
		menuitem2= new JMenuItem("Verde");
		menuitem2.addActionListener(this);
		menu1.add(menuitem2);
		
		menuitem3= new JMenuItem("Azul");
		menuitem3.addActionListener(this);
		menu1.add(menuitem3);
	}
	public void actionPerformed(ActionEvent e)
	{
		Container Font = this.getContentPane();
		if (e.getSource() == menuitem1)
		{
			Font.setBackground(new Color(255,0,0));
		}
		
		if (e.getSource() == menuitem2)
		{
			Font.setBackground(new Color(0,255,0));
		}
		
		if (e.getSource() == menuitem3)
		{
			Font.setBackground(new Color(0,0,255));
		}
	}
		public static void main(String args[])
		{
			Formulario11 formulario = new Formulario11();
			formulario.setBounds(0,0,400,300);
			formulario.setVisible(true);
			formulario.setLocationRelativeTo(null);
		}
	
}