package Vistas;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class EventosMouse extends JFrame implements MouseListener{

	private JPanel contentPane;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JButton btnOcultar;

	public EventosMouse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 300);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		 lbl1 = new JLabel("HOLA");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(60, 48, 76, 28);
		getContentPane().add(lbl1);
		
		 lbl2 = new JLabel("COMO");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setBounds(60, 91, 76, 28);
		getContentPane().add(lbl2);
		
		 lbl3 = new JLabel("ESTAS");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setBounds(60, 131, 76, 28);
		getContentPane().add(lbl3);
		
		 lbl4 = new JLabel("HOY");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setBounds(60, 176, 76, 28);
		getContentPane().add(lbl4);
		
		 btnOcultar = new JButton("OCULTAR");
		btnOcultar.setBounds(217, 91, 107, 42);
		btnOcultar.addMouseListener(this);
		getContentPane().add(btnOcultar);
	}

	public void iniciar() {

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
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
		
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		lbl1.setVisible(false);
		lbl2.setVisible(false);
		lbl3.setVisible(false);
		lbl4.setVisible(false);

	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		lbl1.setVisible(true);
		lbl2.setVisible(true);
		lbl3.setVisible(true);
		lbl4.setVisible(true);
		
	}
	
	
}