package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class gestionSocios extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			gestionSocios dialog = new gestionSocios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public gestionSocios() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JButton btnNewButton = new JButton("A\u00F1adir Socio");
			btnNewButton.setBounds(55, 82, 128, 23);
			getContentPane().add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("Borrar Socio");
			btnNewButton_1.setBounds(55, 136, 128, 23);
			getContentPane().add(btnNewButton_1);
		}
		{
			JButton btnNewButton_2 = new JButton("Cambiar Socio");
			btnNewButton_2.setBounds(55, 190, 128, 23);
			getContentPane().add(btnNewButton_2);
		}
	}

}
