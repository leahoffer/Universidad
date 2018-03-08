package clientWindows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import businessDelegate.BusinessDelegate;
import dto.DireccionVO;
import dto.ProfesorVO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.rmi.server.RemoteObject;
import java.awt.event.ActionEvent;

public class AgregarProfesorWindow {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtLegajo;
	private JTextField txtCalle;
	private JTextField txtNumero;
	private JTextField txtcodpostal;
	private JTextField txtLocalidad;
	private JTextField txtPiso;
	private JTextField txtDepto;

	/**
	 * Launch the application.
	 */
	public static void nuevoProfesor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarProfesorWindow window = new AgregarProfesorWindow();
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
	public AgregarProfesorWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 462, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAgregarProfesor = new JLabel("Agregar Profesor");
		lblAgregarProfesor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAgregarProfesor.setBounds(10, 11, 125, 19);
		frame.getContentPane().add(lblAgregarProfesor);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 60, 69, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblLegajo = new JLabel("Legajo");
		lblLegajo.setBounds(10, 85, 69, 14);
		frame.getContentPane().add(lblLegajo);
		
		JLabel lblCalle = new JLabel("Calle");
		lblCalle.setBounds(10, 110, 69, 14);
		frame.getContentPane().add(lblCalle);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(10, 135, 69, 14);
		frame.getContentPane().add(lblNumero);
		
		JLabel lblCodPostal = new JLabel("Cod. Postal");
		lblCodPostal.setBounds(10, 160, 69, 14);
		frame.getContentPane().add(lblCodPostal);
		
		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setBounds(10, 185, 69, 14);
		frame.getContentPane().add(lblLocalidad);
		
		JLabel lblPiso = new JLabel("Piso");
		lblPiso.setBounds(10, 210, 69, 14);
		frame.getContentPane().add(lblPiso);
		
		JLabel lblDepto = new JLabel("Depto");
		lblDepto.setBounds(10, 235, 69, 14);
		frame.getContentPane().add(lblDepto);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(89, 57, 200, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtLegajo = new JTextField();
		txtLegajo.setBounds(89, 82, 200, 20);
		frame.getContentPane().add(txtLegajo);
		txtLegajo.setColumns(10);
		
		txtCalle = new JTextField();
		txtCalle.setBounds(89, 107, 200, 20);
		frame.getContentPane().add(txtCalle);
		txtCalle.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(89, 132, 200, 20);
		frame.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		txtcodpostal = new JTextField();
		txtcodpostal.setBounds(89, 157, 200, 20);
		frame.getContentPane().add(txtcodpostal);
		txtcodpostal.setColumns(10);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setBounds(89, 182, 200, 20);
		frame.getContentPane().add(txtLocalidad);
		txtLocalidad.setColumns(10);
		
		txtPiso = new JTextField();
		txtPiso.setBounds(89, 207, 200, 20);
		frame.getContentPane().add(txtPiso);
		txtPiso.setColumns(10);
		
		txtDepto = new JTextField();
		txtDepto.setBounds(89, 232, 200, 20);
		frame.getContentPane().add(txtDepto);
		txtDepto.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DireccionVO dvo = new DireccionVO(txtCalle.getText(), Integer.parseInt(txtNumero.getText()), txtcodpostal.getText(), txtLocalidad.getText(), Integer.parseInt(txtPiso.getText()), txtDepto.getText());
				ProfesorVO pvo = new ProfesorVO();
				pvo.setDireccion(dvo);
				pvo.setNombre(txtNombre.getText());
				pvo.setNumeroLegajo(Integer.parseInt(txtLegajo.getText()));
				try 
				{
					BusinessDelegate.getInstance().agregarProfesor(pvo);
				}
				catch (RemoteException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnAceptar.setBounds(10, 281, 89, 23);
		frame.getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnCancelar.setBounds(109, 281, 89, 23);
		frame.getContentPane().add(btnCancelar);
	}

}
