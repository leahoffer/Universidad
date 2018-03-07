package ClientWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class clientWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clientWindow window = new clientWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public clientWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 696, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTest = new JLabel("TEST");
		lblTest.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblTest.setBounds(312, 11, 39, 26);
		frame.getContentPane().add(lblTest);
		
		JButton btnAgregarAlumno = new JButton("AGREGAR ALUMNO");
		btnAgregarAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnAgregarAlumno.setBounds(60, 88, 89, 23);
		frame.getContentPane().add(btnAgregarAlumno);
	}
}
