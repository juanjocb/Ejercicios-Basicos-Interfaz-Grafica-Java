package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class DesactivarComponentesGraficos extends JFrame {

	private JPanel contentPane;
	private JTextField txtCiudad;
	private JTextField txtNombre;
	private JTextField txtTexto;

	public DesactivarComponentesGraficos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(701, 355);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		txtCiudad = new JTextField();
		txtCiudad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCiudad.setBounds(225, 68, 241, 41);
		getContentPane().add(txtCiudad);
		txtCiudad.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNombre.setHorizontalAlignment(SwingConstants.LEFT);
		txtNombre.setColumns(10);
		txtNombre.setBounds(225, 16, 241, 41);
		getContentPane().add(txtNombre);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 16, 195, 41);
		getContentPane().add(lblNewLabel);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCiudad.setBounds(10, 68, 195, 41);
		getContentPane().add(lblCiudad);
		
		txtTexto = new JTextField();
		txtTexto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTexto.setBounds(224, 136, 451, 41);
		getContentPane().add(txtTexto);
		txtTexto.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(60, 141, 115, 34);
		getContentPane().add(btnAceptar);
		
		JButton btnActivar = new JButton("Activar");
		btnActivar.setBounds(199, 230, 115, 34);
		getContentPane().add(btnActivar);
		
		JButton btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(364, 230, 115, 34);
		getContentPane().add(btnDesactivar);
		
	}
	
	public void iniciar() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
	}
}
