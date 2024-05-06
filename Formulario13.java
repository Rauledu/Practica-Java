//Practica 38
import javax.swing.*;
import javax.swing.event.*;

public class Formulario13 extends JFrame implements ChangeListener
{
	private JCheckBox checkbox1, checkbox2, checkbox3;
	//private JLabel label1,label2,label3;
	
	public Formulario13()
	{
		setLayout(null);
		checkbox1= new JCheckBox("Ingles");
		checkbox1.setBounds(10,10,150,30);
		checkbox1.addChangeListener(this);
		add(checkbox1);
		
		checkbox2= new JCheckBox("Frances");
		checkbox2.setBounds(10,50,150,30);
		checkbox2.addChangeListener(this);
		add(checkbox2);
		
		checkbox3= new JCheckBox("Aleman");
		checkbox3.setBounds(10,90,150,30);
		checkbox3.addChangeListener(this);
		add(checkbox3);
	}
	public void stateChanged(ChangeEvent e)
	{
		String cad = "";
		if (checkbox1.isSelected() == true)
		{
			cad = cad + "Ingles-";
		}
		
		if (checkbox2.isSelected() == true)
		{
			cad = cad + "Frances-";
		}
		
		if (checkbox3.isSelected() == true)
		{
			cad = cad + "Aleman-";
		}
		setTitle(cad);
	}
	public static void main (String args[])
	{
		Formulario13 formulario = new Formulario13();
		formulario.setBounds(0,0,350,200);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
	
}