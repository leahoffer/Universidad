package clientWindows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UniversidadWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UniversidadWindow window = new UniversidadWindow();
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
	public UniversidadWindow() {
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
		
		JLabel lblTest = new JLabel("Universidad");
		lblTest.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTest.setBounds(275, 11, 120, 26);
		frame.getContentPane().add(lblTest);
		
		JButton btnAgregarAlumno = new JButton("AGREGAR ALUMNO");
		btnAgregarAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarAlumnoWindow.nuevoAlumno();
			}
		});
		btnAgregarAlumno.setBounds(10, 95, 148, 23);
		frame.getContentPane().add(btnAgregarAlumno);
		
		JButton btnAgregarMateria = new JButton("AGREGAR MATERIA");
		btnAgregarMateria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarMateriaWindow.nuevaMateria();
			}
		});
		btnAgregarMateria.setBounds(10, 228, 148, 23);
		frame.getContentPane().add(btnAgregarMateria);
		
		JLabel lblAlumnos = new JLabel("Alumnos");
		lblAlumnos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAlumnos.setBounds(10, 59, 66, 25);
		frame.getContentPane().add(lblAlumnos);
		
		JButton btnEliminarAlumno = new JButton("ELIMINAR ALUMNO");
		btnEliminarAlumno.setBounds(10, 129, 148, 23);
		frame.getContentPane().add(btnEliminarAlumno);
		
		JLabel lblMaterias = new JLabel("Materias");
		lblMaterias.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMaterias.setBounds(10, 191, 66, 26);
		frame.getContentPane().add(lblMaterias);
		
		JLabel lblProfesores = new JLabel("Profesores");
		lblProfesores.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProfesores.setBounds(275, 66, 80, 18);
		frame.getContentPane().add(lblProfesores);
		
		JButton btnAgregarProfesor = new JButton("AGREGAR PROFESOR");
		btnAgregarProfesor.setBounds(275, 95, 148, 23);
		frame.getContentPane().add(btnAgregarProfesor);
	}
}
