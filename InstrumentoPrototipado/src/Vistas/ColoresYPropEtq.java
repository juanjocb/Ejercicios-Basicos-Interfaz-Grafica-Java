package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ColoresYPropEtq extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnAzul;
	private JButton btnRojo;
	private JButton btnVerde;
	private JButton btnFondoazul;
	private JButton btnFondorojo;
	private JButton btnFondoverde;
	private JButton btnTrasparente;
	private JButton btnOpaca;
	private JLabel lblTexto;

	public ColoresYPropEtq() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(809, 419);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		lblTexto = new JLabel("Manejo");
		lblTexto.setOpaque(true);
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setBounds(342, 84, 91, 28);
		getContentPane().add(lblTexto);

		btnAzul = new JButton("Azul");
		btnAzul.setBounds(144, 176, 89, 23);
		getContentPane().add(btnAzul);
		btnAzul.addActionListener(this);

		btnRojo = new JButton("Rojo");
		btnRojo.setBounds(344, 176, 89, 23);
		getContentPane().add(btnRojo);
		btnRojo.addActionListener(this);

		btnVerde = new JButton("Verde");
		btnVerde.addActionListener(this);
		btnVerde.setBounds(554, 176, 89, 23);
		getContentPane().add(btnVerde);

		btnFondoazul = new JButton("FondoAzul");
		btnFondoazul.addActionListener(this);
		btnFondoazul.setBounds(182, 230, 129, 23);
		getContentPane().add(btnFondoazul);

		btnFondorojo = new JButton("FondoRojo");
		btnFondorojo.addActionListener(this);
		btnFondorojo.setBounds(374, 230, 147, 23);
		getContentPane().add(btnFondorojo);

		btnFondoverde = new JButton("fondoVerde");
		btnFondoverde.addActionListener(this);
		btnFondoverde.setBounds(593, 230, 138, 23);
		getContentPane().add(btnFondoverde);

		btnTrasparente = new JButton("Trasparente");
		btnTrasparente.addActionListener(this);
		btnTrasparente.setBounds(253, 289, 155, 23);
		getContentPane().add(btnTrasparente);

		btnOpaca = new JButton("Opaca");
		btnOpaca.addActionListener(this);
		btnOpaca.setBounds(502, 289, 89, 23);
		getContentPane().add(btnOpaca);
	}

	public void iniciar() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnAzul) {
			lblTexto.setForeground(Color.BLUE);
		} else if (e.getSource() == btnRojo) {
			lblTexto.setForeground(Color.RED);
		} else if (e.getSource() == btnVerde) {
			lblTexto.setForeground(Color.GREEN);
		} else if (e.getSource() == btnFondoazul) {
			lblTexto.setBackground(Color.BLUE);
		} else if (e.getSource() == btnFondorojo) {
			lblTexto.setBackground(Color.RED);
		} else if (e.getSource() == btnFondoverde) {
			lblTexto.setBackground(Color.GREEN);
		} else if (e.getSource() == btnTrasparente) {
			lblTexto.setBackground(Color.white);
		} else if (e.getSource() == btnOpaca) {
			lblTexto.setOpaque(false);
		}

	}
}
