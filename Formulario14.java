//Practica 39
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Formulario14 extends JFrame implements ActionListener, ChangeListener
{
	private JCheckBox Check1;
	private JLabel label1;
	private JButton button1;
	
	public Formulario14()
	{
		setLayout(null);
		label1 = new JLabel("Aceptar terminos y condiciones.");
		label1.setBounds(10,10,400,30);
		add(label1);
		
		Check1 = new JCheckBox("Acepto");
		Check1.setBounds(10,50,100,30);
		Check1.addChangeListener(this);
		add(Check1);
		
		button1 = new JButton("Continuar");
		button1.setBounds(10,100,100,30);
		add(button1);
		button1.addActionListener(this);
		button1.setEnabled(false);
	}
	public void stateChanged(ChangeEvent e)
	{
		if (Check1.isSelected() == true)
		{
			button1.setEnabled(true);
		}
		else
		{
			button1.setEnabled(false);
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == button1)
		{
			System.exit(0);
		}
	}
	
	public static void main (String args[])
	{
		Formulario14 formulario = new Formulario14();
		formulario.setBounds(0,0,350,200);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
} 