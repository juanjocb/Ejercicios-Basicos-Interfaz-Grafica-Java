package Vistas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class notaEstudiantes extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtPrimerTrimestre;
	private JTextField txtSegundoTrimestre;
	private JTextField txtTercerTrimestre;
	private JLabel lblNotaFinal;
	private JLabel lblResultado;
	private JButton btnCalcular;
	private JLabel lblNewLabel;
	private JLabel lblNota;
	private JLabel lblNota_1;

	public notaEstudiantes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 391);
		getContentPane().setLayout(null);

		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setBounds(172, 35, 86, 20);
		getContentPane().add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);

		txtSegundoTrimestre = new JTextField();
		txtSegundoTrimestre.setColumns(10);
		txtSegundoTrimestre.setBounds(172, 76, 86, 20);
		getContentPane().add(txtSegundoTrimestre);

		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setColumns(10);
		txtTercerTrimestre.setBounds(172, 117, 86, 20);
		getContentPane().add(txtTercerTrimestre);

		lblNotaFinal = new JLabel("");
		lblNotaFinal.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotaFinal.setBounds(172, 158, 107, 37);
		getContentPane().add(lblNotaFinal);

		lblResultado = new JLabel("");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(172, 206, 266, 37);
		getContentPane().add(lblResultado);

		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(172, 274, 107, 37);
		btnCalcular.addActionListener(this);
		getContentPane().add(btnCalcular);

		lblNewLabel = new JLabel("Nota 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 38, 152, 14);
		getContentPane().add(lblNewLabel);

		lblNota = new JLabel("Nota 2");
		lblNota.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNota.setBounds(10, 79, 152, 14);
		getContentPane().add(lblNota);

		lblNota_1 = new JLabel("Nota 3");
		lblNota_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNota_1.setBounds(10, 120, 152, 14);
		getContentPane().add(lblNota_1);

	}

	public void iniciar() {

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnCalcular) {

			double nota1 = Double.parseDouble(txtPrimerTrimestre.getText());
			double nota2 = Double.parseDouble(txtSegundoTrimestre.getText());
			double nota3 = Double.parseDouble(txtTercerTrimestre.getText());
			double promedio = (nota1 + nota2 + nota3) / 3;
			lblNotaFinal.setText("Su nota es: " + promedio);
			if(promedio < 5) {
				lblResultado.setText("SUSPENSO");
			}else {
				lblResultado.setText("APROBADO");
			}
		}

	}

}
