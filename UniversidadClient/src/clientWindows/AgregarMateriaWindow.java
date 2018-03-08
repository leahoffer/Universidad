package clientWindows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import businessDelegate.BusinessDelegate;
import dto.MateriaVO;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;

public class AgregarMateriaWindow {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtNumero;

	/**
	 * Launch the application.
	 */
	public static void nuevaMateria() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarMateriaWindow window = new AgregarMateriaWindow();
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
	public AgregarMateriaWindow() {
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
		lblNombre.setBounds(10, 88, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(10, 113, 46, 14);
		frame.getContentPane().add(lblNumero);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(66, 85, 86, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(66, 110, 86, 20);
		frame.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblAgregarMateria = new JLabel("Agregar Materia");
		lblAgregarMateria.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAgregarMateria.setBounds(10, 11, 166, 36);
		frame.getContentPane().add(lblAgregarMateria);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MateriaVO mvo = new MateriaVO();
				mvo.setNombre(txtNombre.getText());
				mvo.setNumero(txtNumero.getText());
				try 
				{
					BusinessDelegate.getInstance().agregarMateria(mvo);
				} 
				catch (RemoteException e1) 
				{
					e1.printStackTrace();
				}
			}
		});
		btnAceptar.setBounds(10, 165, 89, 23);
		frame.getContentPane().add(btnAceptar);
	}
}
