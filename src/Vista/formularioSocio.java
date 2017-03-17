package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class formularioSocio extends JDialog {
	private final JLabel lblNewLabel_5 = new JLabel("DNI");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			formularioSocio dialog = new formularioSocio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public formularioSocio() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nombre");
			lblNewLabel.setBounds(35, 37, 46, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Apellido");
			lblNewLabel_1.setBounds(35, 71, 46, 14);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Direcci\u00F3n");
			lblNewLabel_2.setBounds(35, 108, 46, 14);
			getContentPane().add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Poblaci\u00F3n");
			lblNewLabel_3.setBounds(35, 146, 46, 14);
			getContentPane().add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Provincia");
			lblNewLabel_4.setBounds(35, 182, 46, 14);
			getContentPane().add(lblNewLabel_4);
		}
		lblNewLabel_5.setBounds(35, 204, 98, 31);
		getContentPane().add(lblNewLabel_5);
		{
			JButton botonGuardar = new JButton("Guardar");
			botonGuardar.setBounds(308, 208, 89, 23);
			getContentPane().add(botonGuardar);
		}
		
		textField = new JTextField();
		textField.setBounds(97, 34, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 68, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(97, 105, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(97, 143, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(97, 179, 86, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(97, 209, 86, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
	}
}
