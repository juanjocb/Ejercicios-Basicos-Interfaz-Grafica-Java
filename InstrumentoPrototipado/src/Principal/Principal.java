package Principal;

import java.awt.Color;

import javax.swing.JOptionPane;

import Vistas.ColoresYPropEtq;
import Vistas.ConcatenarDatos;
import Vistas.DesactivarComponentesGraficos;
import Vistas.EventMousePos;
import Vistas.EventMouseYAsigValores;
import Vistas.EventosMouse;
import Vistas.EventosTeclado;
import Vistas.OcultarYVisualizar;
import Vistas.PasarInformacion;
import Vistas.notaEstudiantes;

public class Principal {

	public static void main(String[] args) {

		new OcultarYVisualizar().setVisible(true);

		new PasarInformacion().setVisible(true);

		new EventosTeclado().setVisible(true);

		new DesactivarComponentesGraficos().setVisible(true);

		new EventosMouse().setVisible(true);

		new ColoresYPropEtq().setVisible(true);

		new notaEstudiantes().setVisible(true);

		new ConcatenarDatos().setVisible(true);

		new EventMouseYAsigValores().setVisible(true);

		new EventMousePos().setVisible(true);

	}
}
