//Practica 34
import javax.swing.*;
import java.awt.event.*;

public class FormularioNueve extends JFrame implements ItemListener //Con este metodo puedo iniciar mi combobox.
{
	private JComboBox combo;
	
	public FormularioNueve()
	{
		setLayout(null);
		combo = new JComboBox();
		combo.setBounds(10,10,80,20);
		add(combo);
		
		combo.addItem("Rojo");
		combo.addItem("Azul");
		combo.addItem("Negro");
		combo.addItem("Magenta");
		combo.addItem("Marron");
		combo.addItem("Verde");
		combo.addItemListener(this);// este linea es para indicar al progrma del evento que se vaa encontrar.
	}
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getSource() == combo)
		{
			String Seleccion = combo.getSelectedItem().toString();
			setTitle(Seleccion);
		}
	}
	
	public static void main(String args[])
	{
			FormularioNueve formulario1 = new FormularioNueve();
			formulario1.setBounds(0,0,200,150);
			formulario1.setVisible(true);
			formulario1.setResizable(false);
			formulario1.setLocationRelativeTo(null);
	}
}
