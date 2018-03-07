package ClientWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import businessDelegate.BusinessDelegate;
import dto.AlumnoVO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;

public class createAlumnoWindow {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtLegajo;
	private JTextField txtEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createAlumnoWindow window = new createAlumnoWindow();
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
	public createAlumnoWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 39, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblLegajo = new JLabel("Legajo");
		lblLegajo.setBounds(10, 64, 46, 14);
		frame.getContentPane().add(lblLegajo);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(10, 89, 46, 14);
		frame.getContentPane().add(lblEstado);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(66, 36, 86, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtLegajo = new JTextField();
		txtLegajo.setBounds(66, 61, 86, 20);
		frame.getContentPane().add(txtLegajo);
		txtLegajo.setColumns(10);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(66, 89, 86, 20);
		frame.getContentPane().add(txtEstado);
		txtEstado.setColumns(10);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlumnoVO avo = new AlumnoVO();
				avo.setLegajo(Integer.parseInt(txtLegajo.getText()));
				avo.setNombre(txtNombre.getText());
				avo.setEstado(txtEstado.getText());
				try 
				{
					BusinessDelegate.getInstance().agregarAlumno(avo);
				}
				catch (RemoteException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnCrear.setBounds(10, 167, 89, 23);
		frame.getContentPane().add(btnCrear);
	}
}
