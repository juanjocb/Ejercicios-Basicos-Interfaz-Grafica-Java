package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class EventMouseYAsigValores extends JFrame implements ActionListener, MouseListener {

	private JPanel contentPane;
	private JTextField txtNumeros;
	private JButton btnBorrar;
	private JLabel lbl9;
	private JLabel lbl8;
	private JLabel lbl7;
	private JLabel lbl6;
	private JLabel lbl5;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl2;
	private JLabel lbl1;
	private JLabel lbl0;

	public EventMouseYAsigValores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 593);
		iniciar();
	}

	public void iniciar() {

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbl0 = new JLabel("0");
		lbl0.setHorizontalAlignment(SwingConstants.CENTER);
		lbl0.addMouseListener(this);
		lbl0.setBounds(38, 22, 97, 32);
		contentPane.add(lbl0);

		lbl1 = new JLabel("1");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.addMouseListener(this);
		lbl1.setBounds(38, 73, 97, 32);
		contentPane.add(lbl1);

		lbl2 = new JLabel("2");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.addMouseListener(this);
		lbl2.setBounds(38, 116, 97, 32);
		contentPane.add(lbl2);

		lbl3 = new JLabel("3");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.addMouseListener(this);
		lbl3.setBounds(38, 172, 97, 32);
		contentPane.add(lbl3);

		lbl4 = new JLabel("4");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.addMouseListener(this);
		lbl4.setBounds(38, 219, 97, 32);
		contentPane.add(lbl4);

		lbl5 = new JLabel("5");
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.addMouseListener(this);
		lbl5.setBounds(38, 272, 97, 32);
		contentPane.add(lbl5);

		lbl6 = new JLabel("6");
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.addMouseListener(this);
		lbl6.setBounds(38, 325, 97, 32);
		contentPane.add(lbl6);

		lbl7 = new JLabel("7");
		lbl7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7.addMouseListener(this);
		lbl7.setBounds(38, 368, 97, 32);
		contentPane.add(lbl7);

		lbl8 = new JLabel("8");
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8.addMouseListener(this);
		lbl8.setBounds(38, 416, 97, 32);
		contentPane.add(lbl8);

		lbl9 = new JLabel("9");
		lbl9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl9.addMouseListener(this);
		lbl9.setBounds(38, 462, 97, 32);
		contentPane.add(lbl9);

		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(200, 157, 127, 38);
		btnBorrar.addActionListener(this);
		contentPane.add(btnBorrar);

		txtNumeros = new JTextField();
		txtNumeros.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumeros.setBounds(155, 70, 217, 38);
		contentPane.add(txtNumeros);
		txtNumeros.setColumns(10);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {

		String text = txtNumeros.getText();

		if (e.getSource() == lbl0) {
			txtNumeros.setText(text + "0");
		} else if (e.getSource() == lbl1) {
			txtNumeros.setText(text + "1");
		} else if (e.getSource() == lbl2) {
			txtNumeros.setText(text + "2");
		} else if (e.getSource() == lbl3) {
			txtNumeros.setText(text + "3");
		} else if (e.getSource() == lbl4) {
			txtNumeros.setText(text + "4");
		} else if (e.getSource() == lbl5) {
			txtNumeros.setText(text + "5");
		} else if (e.getSource() == lbl6) {
			txtNumeros.setText(text + "6");
		} else if (e.getSource() == lbl7) {
			txtNumeros.setText(text + "7");
		} else if (e.getSource() == lbl8) {
			txtNumeros.setText(text + "8");
		} else if (e.getSource() == lbl9) {
			txtNumeros.setText(text + "9");
		}

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnBorrar) {
			txtNumeros.setText("");
		}

	}

}
