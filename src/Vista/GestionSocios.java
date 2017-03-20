package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.SociosControlador;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class GestionSocios extends JDialog {
	
	private SociosControlador sociosControlador;
	
	

	public SociosControlador getSociosControlador() {
		return sociosControlador;
	}

	public void setSociosControlador(SociosControlador sociosControlador) {
		this.sociosControlador = sociosControlador;
	}


	/**
	 * Create the dialog.
	 */
	public GestionSocios(JFrame parent,boolean modal) {
		super(parent,modal);
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JButton btnNewButton = new JButton("A\u00F1adir Socio");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sociosControlador.abrirFormularioSocios();
				}
			});
			btnNewButton.setBounds(166, 87, 128, 23);
			getContentPane().add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("Borrar Socio");
			btnNewButton_1.setBounds(166, 132, 128, 23);
			getContentPane().add(btnNewButton_1);
		}
		{
			JButton btnNewButton_2 = new JButton("Cambiar Socio");
			btnNewButton_2.setBounds(166, 179, 128, 23);
			getContentPane().add(btnNewButton_2);
		}
		
		JLabel lblGestionDeSocios = new JLabel("GESTION DE SOCIOS");
		lblGestionDeSocios.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGestionDeSocios.setBounds(143, 11, 201, 23);
		getContentPane().add(lblGestionDeSocios);
	}
}
