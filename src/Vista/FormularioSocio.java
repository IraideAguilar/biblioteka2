package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.SociosControlador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioSocio extends JDialog {

	private SociosControlador socioControlador;

	public SociosControlador getSocioControlador() {
		return socioControlador;
	}

	public void setSocioControlador(SociosControlador socioControlador) {
		this.socioControlador = socioControlador;
	}

	private final JLabel lblNewLabel_5 = new JLabel("DNI");
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldDireccion;
	private JTextField textFieldPoblacion;
	private JTextField textFieldProvincia;
	private JTextField textFieldDni;

	/**
	 * Create the dialog.
	 */
	public FormularioSocio(JDialog parent, boolean modal) {
		super(parent, modal);
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
			botonGuardar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					socioControlador.guardarSocio(textFieldNombre.getText(), textFieldApellido.getText(),
							textFieldDireccion.getText(), textFieldPoblacion.getText(), textFieldProvincia.getText(),
							textFieldDni.getText());
					        clear();
				}
			});
			botonGuardar.setBounds(308, 178, 89, 23);
			getContentPane().add(botonGuardar);
		}

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(97, 34, 86, 20);
		getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);

		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(97, 68, 86, 20);
		getContentPane().add(textFieldApellido);
		textFieldApellido.setColumns(10);

		textFieldDireccion = new JTextField();
		textFieldDireccion.setBounds(97, 105, 86, 20);
		getContentPane().add(textFieldDireccion);
		textFieldDireccion.setColumns(10);

		textFieldPoblacion = new JTextField();
		textFieldPoblacion.setBounds(97, 143, 86, 20);
		getContentPane().add(textFieldPoblacion);
		textFieldPoblacion.setColumns(10);

		textFieldProvincia = new JTextField();
		textFieldProvincia.setBounds(97, 179, 86, 20);
		getContentPane().add(textFieldProvincia);
		textFieldProvincia.setColumns(10);

		textFieldDni = new JTextField();
		textFieldDni.setBounds(97, 209, 86, 20);
		getContentPane().add(textFieldDni);
		textFieldDni.setColumns(10);

		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				socioControlador.cerrarFormularioSocio();
			}
		});
		btnNewButton.setBounds(308, 208, 89, 23);
		getContentPane().add(btnNewButton);
		
		
	}
	protected void clear(){
	    this.textFieldNombre.setText("");
	    this.textFieldApellido.setText("");
	    this.textFieldDireccion.setText("");
	    this.textFieldPoblacion.setText("");
	    this.textFieldProvincia.setText("");
	    this.textFieldDni.setText("");
	}
}
