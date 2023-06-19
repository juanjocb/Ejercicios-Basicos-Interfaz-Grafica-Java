package Vistas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PasarInformacion extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtTexto;
	private JLabel lbl1;
	private JLabel lbl2;
	private JButton btnTras1;
	private JButton btnTras2;

	public PasarInformacion() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(855, 324);
		setLocationRelativeTo(null);

		iniciar();

	}

	public void iniciar() {

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);

		txtTexto = new JTextField();
		txtTexto.setHorizontalAlignment(SwingConstants.CENTER);
		txtTexto.setBounds(206, 17, 427, 40);
		getContentPane().add(txtTexto);
		txtTexto.setColumns(10);

		lbl1 = new JLabel("");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(21, 143, 427, 40);
		getContentPane().add(lbl1);

		lbl2 = new JLabel("");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setBounds(390, 216, 427, 40);
		getContentPane().add(lbl2);

		btnTras1 = new JButton("Traspasa 1");
		btnTras1.setBounds(170, 92, 128, 40);
		btnTras1.addActionListener(this);
		getContentPane().add(btnTras1);

		btnTras2 = new JButton("Traspasa 2");
		btnTras2.setBounds(539, 143, 128, 40);
		btnTras2.addActionListener(this);
		getContentPane().add(btnTras2);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String text = txtTexto.getText();

		if (e.getSource() == btnTras1) {
			lbl1.setText(text);
		} else if (e.getSource() == btnTras2) {
			lbl2.setText(text);
		}

	}
}
