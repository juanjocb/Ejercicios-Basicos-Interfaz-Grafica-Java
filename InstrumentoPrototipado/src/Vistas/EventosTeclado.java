package Vistas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class EventosTeclado extends JFrame implements ActionListener, KeyListener {

	private JPanel contentPane;
	private JTextField txtTexto;
	private JLabel lblNewLabel;
	private JLabel lblTexto;
	private JButton btnVaciar;

	public EventosTeclado() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 300);
		setLocationRelativeTo(null);
		iniciar();

	}

	public void iniciar() {

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtTexto = new JTextField();
		txtTexto.setHorizontalAlignment(SwingConstants.CENTER);
		txtTexto.setBounds(133, 11, 291, 47);
		txtTexto.addKeyListener(this);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);

		lblNewLabel = new JLabel("Escribe un texto");
		lblNewLabel.setBounds(22, 19, 117, 31);
		contentPane.add(lblNewLabel);

		lblTexto = new JLabel("");
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setBounds(133, 85, 291, 47);
		contentPane.add(lblTexto);

		btnVaciar = new JButton("VACIAR");
		btnVaciar.setBounds(176, 154, 91, 40);
		btnVaciar.addActionListener(this);
		contentPane.add(btnVaciar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnVaciar) {
			txtTexto.setText("");
			lblTexto.setText("");
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {

		String texto = txtTexto.getText();

		lblTexto.setText(texto);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
