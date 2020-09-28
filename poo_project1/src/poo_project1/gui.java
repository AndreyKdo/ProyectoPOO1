package poo_project1;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Checkbox;

public class gui {

	private JFrame frame;
	private JTextField textFieldFuerza;
	private JTextField textFieldAgilidad;
	private JTextField textFieldAtaque;
	private JTextField textFieldVelocidad;
	private JTextField textFieldPtosSalud;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField dinero_1;
	private JTextField dinero;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_27;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JPanel inicio;
	private JPanel tiendaJets;
	private JPanel tiendaComplementos;
	private JPanel tiendaMundos;
	private JPanel inventarioJets;
	private JPanel inventarioComplementos;
	private JPanel inventarioMundos;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
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
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel inicio = new JPanel();
		frame.getContentPane().add(inicio, "name_907429623456800");
		inicio.setLayout(null);
		Image img = new ImageIcon(this.getClass().getResource("/background.jpg")).getImage();
		inicio.setVisible(true);
		
		final JPanel tiendaJets = new JPanel();
		tiendaJets.setLayout(null);
		frame.getContentPane().add(tiendaJets, "name_914930016762800");

		final JPanel tiendaComplementos = new JPanel();
		tiendaComplementos.setLayout(null);
		frame.getContentPane().add(tiendaComplementos, "name_919401987160500");
		tiendaComplementos.setVisible(false);
		
		final JPanel tiendaMundos = new JPanel();
		tiendaMundos.setLayout(null);
		frame.getContentPane().add(tiendaMundos, "name_927194566434100");
		tiendaMundos.setVisible(false);
		
		final JPanel inventarioJets = new JPanel();
		inventarioJets.setLayout(null);
		frame.getContentPane().add(inventarioJets, "name_927931963284500");
		inventarioJets.setVisible(false);
		
		final JPanel inventarioComplementos = new JPanel();
		inventarioComplementos.setLayout(null);
		frame.getContentPane().add(inventarioComplementos, "name_928546021998800");
		inventarioComplementos.setVisible(false);
		
		final JPanel inventarioMundos = new JPanel();
		inventarioMundos.setLayout(null);
		frame.getContentPane().add(inventarioMundos, "name_937114439693000");
		inventarioMundos.setVisible(false);
		
		JLabel lblFuerza = new JLabel("Fuerza:");
		lblFuerza.setForeground(new Color(255, 250, 250));
		lblFuerza.setFont(new Font("Chiller", Font.BOLD, 35));
		lblFuerza.setBounds(250, 23, 128, 42);
		inicio.add(lblFuerza);
		
		JLabel lblAgilidad = new JLabel("Agilidad:");
		lblAgilidad.setForeground(new Color(255, 250, 250));
		lblAgilidad.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAgilidad.setBounds(392, 23, 128, 42);
		inicio.add(lblAgilidad);
		
		JLabel lblAtaque = new JLabel("Ataque:");
		lblAtaque.setForeground(new Color(255, 250, 250));
		lblAtaque.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAtaque.setBounds(876, 23, 150, 42);
		inicio.add(lblAtaque);
		
		JLabel lblVelocidad = new JLabel("Velocidad:");
		lblVelocidad.setForeground(new Color(255, 250, 250));
		lblVelocidad.setFont(new Font("Chiller", Font.BOLD, 35));
		lblVelocidad.setBounds(727, 23, 128, 42);
		inicio.add(lblVelocidad);
		
		JLabel lblPtosSalud = new JLabel("Puntos de salud:");
		lblPtosSalud.setForeground(new Color(255, 250, 250));
		lblPtosSalud.setFont(new Font("Chiller", Font.BOLD, 35));
		lblPtosSalud.setBounds(513, 23, 197, 42);
		inicio.add(lblPtosSalud);
		
		JButton btnInventario = new JButton("Inventario");
		btnInventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicio.setVisible(false);
				inventarioJets.setVisible(true);
			}
		});
		btnInventario.setFont(new Font("Chiller", Font.BOLD, 40));
		btnInventario.setForeground(new Color(0, 0, 128));
		btnInventario.setBounds(1033, 403, 186, 42);
		inicio.add(btnInventario);
		
		JButton btnTienda = new JButton("Tienda");
		btnTienda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicio.setVisible(false);
				tiendaJets.setVisible(true);
			}
		});
		btnTienda.setForeground(new Color(0, 0, 128));
		btnTienda.setFont(new Font("Chiller", Font.BOLD, 40));
		btnTienda.setBounds(1033, 293, 186, 42);
		inicio.add(btnTienda);
		
		textFieldFuerza = new JTextField();
		textFieldFuerza.setFont(new Font("Chiller", Font.BOLD, 35));
		textFieldFuerza.setBounds(243, 74, 102, 31);
		inicio.add(textFieldFuerza);
		textFieldFuerza.setColumns(10);
		
		textFieldAgilidad = new JTextField();
		textFieldAgilidad.setFont(new Font("Chiller", Font.BOLD, 35));
		textFieldAgilidad.setColumns(10);
		textFieldAgilidad.setBounds(391, 74, 102, 31);
		inicio.add(textFieldAgilidad);
		
		textFieldAtaque = new JTextField();
		textFieldAtaque.setFont(new Font("Chiller", Font.BOLD, 35));
		textFieldAtaque.setColumns(10);
		textFieldAtaque.setBounds(872, 74, 102, 31);
		inicio.add(textFieldAtaque);
		
		textFieldVelocidad = new JTextField();
		textFieldVelocidad.setFont(new Font("Chiller", Font.BOLD, 35));
		textFieldVelocidad.setColumns(10);
		textFieldVelocidad.setBounds(733, 74, 102, 31);
		inicio.add(textFieldVelocidad);
		
		textFieldPtosSalud = new JTextField();
		textFieldPtosSalud.setFont(new Font("Chiller", Font.BOLD, 35));
		textFieldPtosSalud.setColumns(10);
		textFieldPtosSalud.setBounds(564, 74, 102, 31);
		inicio.add(textFieldPtosSalud);
		
		dinero = new JTextField();
		dinero.setForeground(new Color(0, 0, 128));
		dinero.setFont(new Font("Chiller", Font.BOLD, 40));
		dinero.setColumns(10);
		dinero.setBounds(1033, 198, 186, 42);
		inicio.add(dinero);
		
		JLabel lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon(img));
		lblBg.setBounds(0, 0, 1264, 681);
		inicio.add(lblBg);
		

		
		JLabel lblNewLabel_3 = new JLabel("JETS");
		lblNewLabel_3.setForeground(new Color(255, 250, 250));
		lblNewLabel_3.setFont(new Font("Chiller", Font.BOLD, 99));
		lblNewLabel_3.setBounds(543, 181, 197, 84);
		tiendaJets.add(lblNewLabel_3);
		
		JLabel lblFuerza_2 = new JLabel("Fuerza:");
		lblFuerza_2.setForeground(new Color(255, 250, 250));
		lblFuerza_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblFuerza_2.setBounds(250, 23, 128, 42);
		tiendaJets.add(lblFuerza_2);
		
		JLabel lblAgilidad_2 = new JLabel("Agilidad:");
		lblAgilidad_2.setForeground(new Color(255, 250, 250));
		lblAgilidad_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAgilidad_2.setBounds(392, 23, 128, 42);
		tiendaJets.add(lblAgilidad_2);
		
		JLabel lblAtaque_2 = new JLabel("Ataque:");
		lblAtaque_2.setForeground(new Color(255, 250, 250));
		lblAtaque_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAtaque_2.setBounds(876, 23, 150, 42);
		tiendaJets.add(lblAtaque_2);
		
		JLabel lblVelocidad_2 = new JLabel("Velocidad:");
		lblVelocidad_2.setForeground(new Color(255, 250, 250));
		lblVelocidad_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblVelocidad_2.setBounds(727, 23, 128, 42);
		tiendaJets.add(lblVelocidad_2);
		
		JLabel lblPtosSalud_2 = new JLabel("Puntos de salud:");
		lblPtosSalud_2.setForeground(new Color(255, 250, 250));
		lblPtosSalud_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblPtosSalud_2.setBounds(513, 23, 197, 42);
		tiendaJets.add(lblPtosSalud_2);
		
		JButton btnInventario_2 = new JButton("Salir");
		btnInventario_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiendaJets.setVisible(false);
				inicio.setVisible(true);
			}
		});
		btnInventario_2.setForeground(new Color(0, 0, 128));
		btnInventario_2.setFont(new Font("Chiller", Font.BOLD, 40));
		btnInventario_2.setBounds(392, 596, 158, 42);
		tiendaJets.add(btnInventario_2);
		
		JButton btnTienda_2 = new JButton("Complementos");
		btnTienda_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiendaJets.setVisible(false);
				tiendaComplementos.setVisible(true);
			}
		});
		btnTienda_2.setForeground(new Color(0, 0, 128));
		btnTienda_2.setFont(new Font("Chiller", Font.BOLD, 40));
		btnTienda_2.setBounds(651, 596, 227, 42);
		tiendaJets.add(btnTienda_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_5.setColumns(10);
		textField_5.setBounds(243, 74, 102, 31);
		tiendaJets.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_6.setColumns(10);
		textField_6.setBounds(391, 74, 102, 31);
		tiendaJets.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_7.setColumns(10);
		textField_7.setBounds(872, 74, 102, 31);
		tiendaJets.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_8.setColumns(10);
		textField_8.setBounds(733, 74, 102, 31);
		tiendaJets.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_9.setColumns(10);
		textField_9.setBounds(564, 74, 102, 31);
		tiendaJets.add(textField_9);
		
		JRadioButton rdbtnMj = new JRadioButton("   Mini Jet");
		rdbtnMj.setForeground(new Color(75, 0, 130));
		rdbtnMj.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMj.setBounds(283, 330, 191, 58);
		tiendaJets.add(rdbtnMj);
		
		dinero_1 = new JTextField();
		dinero_1.setForeground(new Color(0, 0, 128));
		dinero_1.setFont(new Font("Chiller", Font.BOLD, 40));
		dinero_1.setBounds(1033, 198, 186, 42);
		tiendaJets.add(dinero_1);
		dinero_1.setColumns(10);
		
		JRadioButton rdbtnMs = new JRadioButton("   S\u00FAper Jet");
		rdbtnMs.setForeground(new Color(75, 0, 130));
		rdbtnMs.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMs.setBounds(283, 402, 191, 58);
		tiendaJets.add(rdbtnMs);
		
		JRadioButton rdbtnUj = new JRadioButton("   Ultra Jet");
		rdbtnUj.setForeground(new Color(75, 0, 130));
		rdbtnUj.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnUj.setBounds(283, 476, 191, 58);
		tiendaJets.add(rdbtnUj);
		
		JButton btnComprarMj = new JButton("$250");
		btnComprarMj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComprarMj.setForeground(new Color(75, 0, 130));
		btnComprarMj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarMj.setBounds(529, 338, 128, 42);
		tiendaJets.add(btnComprarMj);
		
		JButton btnComprarSj = new JButton("$500");
		btnComprarSj.setForeground(new Color(75, 0, 130));
		btnComprarSj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarSj.setBounds(529, 410, 125, 42);
		tiendaJets.add(btnComprarSj);
		
		JButton btnComprarUj = new JButton("$1000");
		btnComprarUj.setForeground(new Color(75, 0, 130));
		btnComprarUj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarUj.setBounds(529, 487, 125, 42);
		tiendaJets.add(btnComprarUj);
		
		JLabel lblNewLabel = new JLabel(" En inventario:");
		lblNewLabel.setBackground(new Color(255, 250, 250));
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel.setBounds(708, 330, 170, 58);
		tiendaJets.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" En inventario:");
		lblNewLabel_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_1.setBounds(708, 399, 170, 58);
		tiendaJets.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" En inventario:");
		lblNewLabel_2.setBackground(new Color(255, 250, 250));
		lblNewLabel_2.setForeground(new Color(255, 250, 250));
		lblNewLabel_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_2.setBounds(708, 473, 170, 58);
		tiendaJets.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setForeground(new Color(75, 0, 130));
		textField.setFont(new Font("Chiller", Font.BOLD, 35));
		textField.setBounds(888, 331, 63, 58);
		tiendaJets.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(75, 0, 130));
		textField_1.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_1.setColumns(10);
		textField_1.setBounds(888, 402, 63, 58);
		tiendaJets.add(textField_1);
		
		JLabel lblBg_2_2 = new JLabel("");
		lblBg_2_2.setForeground(new Color(75, 0, 130));
		lblBg_2_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblBg_2_2.setBackground(new Color(255, 250, 250));
		lblBg_2_2.setBounds(-45, 49, 1264, 681);
		tiendaJets.add(lblBg_2_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(75, 0, 130));
		textField_3.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_3.setColumns(10);
		textField_3.setBounds(888, 477, 63, 58);
		tiendaJets.add(textField_3);
		
		JLabel lblBg_2 = new JLabel(" En inventario:");
		lblBg_2.setBackground(new Color(255, 250, 250));
		lblBg_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblBg_2.setForeground(new Color(75, 0, 130));
		lblBg_2.setIcon(new ImageIcon(img));
		lblBg_2.setBounds(0, 0, 1264, 681);
		tiendaJets.add(lblBg_2);
		
		
		textField_16 = new JTextField();
		textField_16.setForeground(new Color(75, 0, 130));
		textField_16.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_16.setColumns(10);
		textField_16.setBounds(931, 476, 63, 58);
		tiendaComplementos.add(textField_16);
		
		JLabel lblNewLabel_3_1 = new JLabel("COMPLEMENTOS");
		lblNewLabel_3_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_3_1.setFont(new Font("Chiller", Font.BOLD, 99));
		lblNewLabel_3_1.setBounds(338, 180, 599, 84);
		tiendaComplementos.add(lblNewLabel_3_1);
		
		JLabel lblFuerza_2_1 = new JLabel("Fuerza:");
		lblFuerza_2_1.setForeground(new Color(255, 250, 250));
		lblFuerza_2_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblFuerza_2_1.setBounds(250, 23, 128, 42);
		tiendaComplementos.add(lblFuerza_2_1);
		
		JLabel lblAgilidad_2_1 = new JLabel("Agilidad:");
		lblAgilidad_2_1.setForeground(new Color(255, 250, 250));
		lblAgilidad_2_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAgilidad_2_1.setBounds(392, 23, 128, 42);
		tiendaComplementos.add(lblAgilidad_2_1);
		
		JLabel lblAtaque_2_1 = new JLabel("Ataque:");
		lblAtaque_2_1.setForeground(new Color(255, 250, 250));
		lblAtaque_2_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAtaque_2_1.setBounds(876, 23, 150, 42);
		tiendaComplementos.add(lblAtaque_2_1);
		
		JLabel lblVelocidad_2_1 = new JLabel("Velocidad:");
		lblVelocidad_2_1.setForeground(new Color(255, 250, 250));
		lblVelocidad_2_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblVelocidad_2_1.setBounds(727, 23, 128, 42);
		tiendaComplementos.add(lblVelocidad_2_1);
		
		JLabel lblPtosSalud_2_1 = new JLabel("Puntos de salud:");
		lblPtosSalud_2_1.setForeground(new Color(255, 250, 250));
		lblPtosSalud_2_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblPtosSalud_2_1.setBounds(513, 23, 197, 42);
		tiendaComplementos.add(lblPtosSalud_2_1);
		
		JButton btnInventario_2_1 = new JButton("Jets");
		btnInventario_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiendaComplementos.setVisible(false);
				tiendaJets.setVisible(true);
			}
		});
		btnInventario_2_1.setForeground(new Color(0, 0, 128));
		btnInventario_2_1.setFont(new Font("Chiller", Font.BOLD, 40));
		btnInventario_2_1.setBounds(431, 596, 158, 42);
		tiendaComplementos.add(btnInventario_2_1);
		
		JButton btnTienda_2_1 = new JButton("Mundos");
		btnTienda_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiendaComplementos.setVisible(false);
				tiendaMundos.setVisible(true);
			}
		});
		btnTienda_2_1.setForeground(new Color(0, 0, 128));
		btnTienda_2_1.setFont(new Font("Chiller", Font.BOLD, 40));
		btnTienda_2_1.setBounds(716, 596, 158, 42);
		tiendaComplementos.add(btnTienda_2_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_2.setColumns(10);
		textField_2.setBounds(243, 74, 102, 31);
		tiendaComplementos.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_4.setColumns(10);
		textField_4.setBounds(391, 74, 102, 31);
		tiendaComplementos.add(textField_4);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_10.setColumns(10);
		textField_10.setBounds(872, 74, 102, 31);
		tiendaComplementos.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_11.setColumns(10);
		textField_11.setBounds(733, 74, 102, 31);
		tiendaComplementos.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_12.setColumns(10);
		textField_12.setBounds(564, 74, 102, 31);
		tiendaComplementos.add(textField_12);
		
		JRadioButton rdbtnMj_1 = new JRadioButton("  Rayo L\u00E1ser");
		rdbtnMj_1.setForeground(new Color(75, 0, 130));
		rdbtnMj_1.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMj_1.setBounds(283, 330, 267, 58);
		tiendaComplementos.add(rdbtnMj_1);
		
		textField_13 = new JTextField();
		textField_13.setForeground(new Color(0, 0, 128));
		textField_13.setFont(new Font("Chiller", Font.BOLD, 40));
		textField_13.setColumns(10);
		textField_13.setBounds(1033, 198, 186, 42);
		tiendaComplementos.add(textField_13);
		
		JRadioButton rdbtnMs_1 = new JRadioButton("   Cuerno de Taurus");
		rdbtnMs_1.setForeground(new Color(75, 0, 130));
		rdbtnMs_1.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMs_1.setBounds(283, 402, 267, 58);
		tiendaComplementos.add(rdbtnMs_1);
		
		JRadioButton rdbtnUj_1 = new JRadioButton("   Leche de la V\u00EDa L\u00E1ctea");
		rdbtnUj_1.setForeground(new Color(75, 0, 130));
		rdbtnUj_1.setFont(new Font("Chiller", Font.BOLD, 28));
		rdbtnUj_1.setBounds(283, 476, 267, 58);
		tiendaComplementos.add(rdbtnUj_1);
		
		JButton btnComprarMj_1 = new JButton("$400");
		btnComprarMj_1.setForeground(new Color(75, 0, 130));
		btnComprarMj_1.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarMj_1.setBounds(572, 337, 128, 42);
		tiendaComplementos.add(btnComprarMj_1);
		
		JButton btnComprarSj_1 = new JButton("$800");
		btnComprarSj_1.setForeground(new Color(75, 0, 130));
		btnComprarSj_1.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarSj_1.setBounds(572, 409, 125, 42);
		tiendaComplementos.add(btnComprarSj_1);
		
		JButton btnComprarUj_1 = new JButton("$1200");
		btnComprarUj_1.setForeground(new Color(75, 0, 130));
		btnComprarUj_1.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarUj_1.setBounds(572, 486, 125, 42);
		tiendaComplementos.add(btnComprarUj_1);
		
		JLabel lblNewLabel_4 = new JLabel(" En inventario:");
		lblNewLabel_4.setForeground(new Color(255, 250, 250));
		lblNewLabel_4.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_4.setBackground(new Color(255, 250, 250));
		lblNewLabel_4.setBounds(751, 329, 170, 58);
		tiendaComplementos.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel(" En inventario:");
		lblNewLabel_1_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_1_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_1_1.setBounds(751, 398, 170, 58);
		tiendaComplementos.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel(" En inventario:");
		lblNewLabel_2_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_2_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_2_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_2_1.setBounds(751, 472, 170, 58);
		tiendaComplementos.add(lblNewLabel_2_1);
		
		textField_14 = new JTextField();
		textField_14.setForeground(new Color(75, 0, 130));
		textField_14.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_14.setColumns(10);
		textField_14.setBounds(931, 330, 63, 58);
		tiendaComplementos.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setForeground(new Color(75, 0, 130));
		textField_15.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_15.setColumns(10);
		textField_15.setBounds(931, 401, 63, 58);
		tiendaComplementos.add(textField_15);
		
		JLabel lblBg_2_2_1 = new JLabel("");
		lblBg_2_2_1.setIcon(new ImageIcon(img));
		lblBg_2_2_1.setForeground(new Color(75, 0, 130));
		lblBg_2_2_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblBg_2_2_1.setBackground(new Color(255, 250, 250));
		lblBg_2_2_1.setBounds(39, 0, 1264, 681);
		tiendaComplementos.add(lblBg_2_2_1);
		
		
		textField_17 = new JTextField();
		textField_17.setForeground(new Color(75, 0, 130));
		textField_17.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_17.setColumns(10);
		textField_17.setBounds(874, 477, 63, 58);
		tiendaMundos.add(textField_17);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Mundos");
		lblNewLabel_3_1_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_3_1_1.setFont(new Font("Chiller", Font.BOLD, 99));
		lblNewLabel_3_1_1.setBounds(497, 180, 440, 99);
		tiendaMundos.add(lblNewLabel_3_1_1);
		
		JLabel lblFuerza_2_1_1 = new JLabel("Fuerza:");
		lblFuerza_2_1_1.setForeground(new Color(255, 250, 250));
		lblFuerza_2_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblFuerza_2_1_1.setBounds(250, 23, 128, 42);
		tiendaMundos.add(lblFuerza_2_1_1);
		
		JLabel lblAgilidad_2_1_1 = new JLabel("Agilidad:");
		lblAgilidad_2_1_1.setForeground(new Color(255, 250, 250));
		lblAgilidad_2_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAgilidad_2_1_1.setBounds(392, 23, 128, 42);
		tiendaMundos.add(lblAgilidad_2_1_1);
		
		JLabel lblAtaque_2_1_1 = new JLabel("Ataque:");
		lblAtaque_2_1_1.setForeground(new Color(255, 250, 250));
		lblAtaque_2_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAtaque_2_1_1.setBounds(876, 23, 150, 42);
		tiendaMundos.add(lblAtaque_2_1_1);
		
		JLabel lblVelocidad_2_1_1 = new JLabel("Velocidad:");
		lblVelocidad_2_1_1.setForeground(new Color(255, 250, 250));
		lblVelocidad_2_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblVelocidad_2_1_1.setBounds(727, 23, 128, 42);
		tiendaMundos.add(lblVelocidad_2_1_1);
		
		JLabel lblPtosSalud_2_1_1 = new JLabel("Puntos de salud:");
		lblPtosSalud_2_1_1.setForeground(new Color(255, 250, 250));
		lblPtosSalud_2_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblPtosSalud_2_1_1.setBounds(513, 23, 197, 42);
		tiendaMundos.add(lblPtosSalud_2_1_1);
		
		JButton btnInventario_2_1_1 = new JButton("Complementos");
		btnInventario_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiendaMundos.setVisible(false);
				tiendaComplementos.setVisible(true);
			}
		});
		btnInventario_2_1_1.setForeground(new Color(0, 0, 128));
		btnInventario_2_1_1.setFont(new Font("Chiller", Font.BOLD, 40));
		btnInventario_2_1_1.setBounds(374, 597, 224, 42);
		tiendaMundos.add(btnInventario_2_1_1);
		
		JButton btnTienda_2_1_1 = new JButton("Salir");
		btnTienda_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiendaMundos.setVisible(false);
				inicio.setVisible(true);
			}
		});
		btnTienda_2_1_1.setForeground(new Color(0, 0, 128));
		btnTienda_2_1_1.setFont(new Font("Chiller", Font.BOLD, 40));
		btnTienda_2_1_1.setBounds(716, 596, 158, 42);
		tiendaMundos.add(btnTienda_2_1_1);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_18.setColumns(10);
		textField_18.setBounds(243, 74, 102, 31);
		tiendaMundos.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_19.setColumns(10);
		textField_19.setBounds(391, 74, 102, 31);
		tiendaMundos.add(textField_19);
		
		textField_35 = new JTextField();
		textField_35.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_35.setColumns(10);
		textField_35.setBounds(872, 74, 102, 31);
		tiendaMundos.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_36.setColumns(10);
		textField_36.setBounds(733, 74, 102, 31);
		tiendaMundos.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_37.setColumns(10);
		textField_37.setBounds(564, 74, 102, 31);
		tiendaMundos.add(textField_37);
		
		JRadioButton rdbtnMj_1_1 = new JRadioButton("  Andr\u00F3meda");
		rdbtnMj_1_1.setForeground(new Color(75, 0, 130));
		rdbtnMj_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMj_1_1.setBounds(283, 330, 179, 58);
		tiendaMundos.add(rdbtnMj_1_1);
		
		textField_38 = new JTextField();
		textField_38.setForeground(new Color(0, 0, 128));
		textField_38.setFont(new Font("Chiller", Font.BOLD, 40));
		textField_38.setColumns(10);
		textField_38.setBounds(1033, 198, 186, 42);
		tiendaMundos.add(textField_38);
		
		JRadioButton rdbtnMs_1_1 = new JRadioButton("   Ori\u00F3n");
		rdbtnMs_1_1.setForeground(new Color(75, 0, 130));
		rdbtnMs_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMs_1_1.setBounds(283, 402, 179, 58);
		tiendaMundos.add(rdbtnMs_1_1);
		
		JRadioButton rdbtnUj_1_1 = new JRadioButton("   Osa Mayor");
		rdbtnUj_1_1.setForeground(new Color(75, 0, 130));
		rdbtnUj_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnUj_1_1.setBounds(283, 476, 179, 58);
		tiendaMundos.add(rdbtnUj_1_1);
		
		JButton btnComprarMj_1_1 = new JButton("$800");
		btnComprarMj_1_1.setForeground(new Color(75, 0, 130));
		btnComprarMj_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarMj_1_1.setBounds(515, 338, 128, 42);
		tiendaMundos.add(btnComprarMj_1_1);
		
		JButton btnComprarSj_1_1 = new JButton("$900");
		btnComprarSj_1_1.setForeground(new Color(75, 0, 130));
		btnComprarSj_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarSj_1_1.setBounds(515, 410, 125, 42);
		tiendaMundos.add(btnComprarSj_1_1);
		
		JButton btnComprarUj_1_1 = new JButton("$1000");
		btnComprarUj_1_1.setForeground(new Color(75, 0, 130));
		btnComprarUj_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarUj_1_1.setBounds(515, 487, 125, 42);
		tiendaMundos.add(btnComprarUj_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel(" En inventario:");
		lblNewLabel_4_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_4_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_4_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_4_1.setBounds(694, 330, 170, 58);
		tiendaMundos.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(" En inventario:");
		lblNewLabel_1_1_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_1_1_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_1_1_1.setBounds(694, 399, 170, 58);
		tiendaMundos.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel(" En inventario:");
		lblNewLabel_2_1_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_2_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_2_1_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_2_1_1.setBounds(694, 473, 170, 58);
		tiendaMundos.add(lblNewLabel_2_1_1);
		
		textField_39 = new JTextField();
		textField_39.setForeground(new Color(75, 0, 130));
		textField_39.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_39.setColumns(10);
		textField_39.setBounds(874, 331, 63, 58);
		tiendaMundos.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setForeground(new Color(75, 0, 130));
		textField_40.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_40.setColumns(10);
		textField_40.setBounds(874, 402, 63, 58);
		tiendaMundos.add(textField_40);
		
		JLabel lblBg_2_2_1_1 = new JLabel("");
		lblBg_2_2_1_1.setIcon(new ImageIcon(img));
		lblBg_2_2_1_1.setForeground(new Color(75, 0, 130));
		lblBg_2_2_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblBg_2_2_1_1.setBackground(new Color(255, 250, 250));
		lblBg_2_2_1_1.setBounds(0, 0, 1264, 681);
		tiendaMundos.add(lblBg_2_2_1_1);
		

		JLabel lblNewLabel_3_2 = new JLabel("JETS");
		lblNewLabel_3_2.setForeground(new Color(255, 250, 250));
		lblNewLabel_3_2.setFont(new Font("Chiller", Font.BOLD, 99));
		lblNewLabel_3_2.setBounds(543, 181, 197, 84);
		inventarioJets.add(lblNewLabel_3_2);
		
		JLabel lblFuerza_2_2 = new JLabel("Fuerza:");
		lblFuerza_2_2.setForeground(new Color(255, 250, 250));
		lblFuerza_2_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblFuerza_2_2.setBounds(250, 23, 128, 42);
		inventarioJets.add(lblFuerza_2_2);
		
		JLabel lblAgilidad_2_2 = new JLabel("Agilidad:");
		lblAgilidad_2_2.setForeground(new Color(255, 250, 250));
		lblAgilidad_2_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAgilidad_2_2.setBounds(392, 23, 128, 42);
		inventarioJets.add(lblAgilidad_2_2);
		
		JLabel lblAtaque_2_2 = new JLabel("Ataque:");
		lblAtaque_2_2.setForeground(new Color(255, 250, 250));
		lblAtaque_2_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAtaque_2_2.setBounds(876, 23, 150, 42);
		inventarioJets.add(lblAtaque_2_2);
		
		JLabel lblVelocidad_2_2 = new JLabel("Velocidad:");
		lblVelocidad_2_2.setForeground(new Color(255, 250, 250));
		lblVelocidad_2_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblVelocidad_2_2.setBounds(727, 23, 128, 42);
		inventarioJets.add(lblVelocidad_2_2);
		
		JLabel lblPtosSalud_2_2 = new JLabel("Puntos de salud:");
		lblPtosSalud_2_2.setForeground(new Color(255, 250, 250));
		lblPtosSalud_2_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblPtosSalud_2_2.setBounds(513, 23, 197, 42);
		inventarioJets.add(lblPtosSalud_2_2);
		
		JButton btnInventario_2_2 = new JButton("Salir");
		btnInventario_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventarioJets.setVisible(false);
				inicio.setVisible(true);
			}
		});
		btnInventario_2_2.setForeground(new Color(0, 0, 128));
		btnInventario_2_2.setFont(new Font("Chiller", Font.BOLD, 40));
		btnInventario_2_2.setBounds(392, 596, 158, 42);
		inventarioJets.add(btnInventario_2_2);
		
		JButton btnTienda_2_2 = new JButton("Complementos");
		btnTienda_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventarioJets.setVisible(false);
				inventarioComplementos.setVisible(true);
			}
		});
		btnTienda_2_2.setForeground(new Color(0, 0, 128));
		btnTienda_2_2.setFont(new Font("Chiller", Font.BOLD, 40));
		btnTienda_2_2.setBounds(651, 596, 227, 42);
		inventarioJets.add(btnTienda_2_2);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_20.setColumns(10);
		textField_20.setBounds(243, 74, 102, 31);
		inventarioJets.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_21.setColumns(10);
		textField_21.setBounds(391, 74, 102, 31);
		inventarioJets.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_22.setColumns(10);
		textField_22.setBounds(872, 74, 102, 31);
		inventarioJets.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_23.setColumns(10);
		textField_23.setBounds(733, 74, 102, 31);
		inventarioJets.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_24.setColumns(10);
		textField_24.setBounds(564, 74, 102, 31);
		inventarioJets.add(textField_24);
		
		JRadioButton rdbtnMj_2 = new JRadioButton("   Mini Jet");
		rdbtnMj_2.setForeground(new Color(75, 0, 130));
		rdbtnMj_2.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMj_2.setBounds(378, 331, 191, 58);
		inventarioJets.add(rdbtnMj_2);
		
		textField_25 = new JTextField();
		textField_25.setForeground(new Color(0, 0, 128));
		textField_25.setFont(new Font("Chiller", Font.BOLD, 40));
		textField_25.setColumns(10);
		textField_25.setBounds(1033, 198, 186, 42);
		inventarioJets.add(textField_25);
		
		JRadioButton rdbtnMs_2 = new JRadioButton("   S\u00FAper Jet");
		rdbtnMs_2.setForeground(new Color(75, 0, 130));
		rdbtnMs_2.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMs_2.setBounds(378, 403, 191, 58);
		inventarioJets.add(rdbtnMs_2);
		
		JRadioButton rdbtnUj_2 = new JRadioButton("   Ultra Jet");
		rdbtnUj_2.setForeground(new Color(75, 0, 130));
		rdbtnUj_2.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnUj_2.setBounds(378, 477, 191, 58);
		inventarioJets.add(rdbtnUj_2);
		
		JButton btnComprarMj_2 = new JButton("Vender por $125");
		btnComprarMj_2.setForeground(new Color(75, 0, 130));
		btnComprarMj_2.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarMj_2.setBounds(624, 339, 254, 42);
		inventarioJets.add(btnComprarMj_2);
		
		JButton btnComprarSj_2 = new JButton("Vender por $250");
		btnComprarSj_2.setForeground(new Color(75, 0, 130));
		btnComprarSj_2.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarSj_2.setBounds(624, 411, 254, 42);
		inventarioJets.add(btnComprarSj_2);
		
		JButton btnComprarUj_2 = new JButton("Vender por $500");
		btnComprarUj_2.setForeground(new Color(75, 0, 130));
		btnComprarUj_2.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarUj_2.setBounds(624, 488, 254, 42);
		inventarioJets.add(btnComprarUj_2);
		
		JLabel lblBg_2_1 = new JLabel(" En inventario:");
		lblBg_2_1.setForeground(new Color(75, 0, 130));
		lblBg_2_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblBg_2_1.setBackground(new Color(255, 250, 250));
		lblBg_2_1.setBounds(0, 0, 1264, 681);
		inventarioJets.add(lblBg_2_1);
		
		JLabel lblBg_2_2_2 = new JLabel("");
		lblBg_2_2_2.setIcon(new ImageIcon(img));
		lblBg_2_2_2.setForeground(new Color(75, 0, 130));
		lblBg_2_2_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblBg_2_2_2.setBackground(new Color(255, 250, 250));
		lblBg_2_2_2.setBounds(-10, 0, 1264, 681);
		inventarioJets.add(lblBg_2_2_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("COMPLEMENTOS");
		lblNewLabel_3_1_2.setForeground(new Color(255, 250, 250));
		lblNewLabel_3_1_2.setFont(new Font("Chiller", Font.BOLD, 99));
		lblNewLabel_3_1_2.setBounds(338, 180, 599, 84);
		inventarioComplementos.add(lblNewLabel_3_1_2);
		
		JLabel lblFuerza_2_1_2 = new JLabel("Fuerza:");
		lblFuerza_2_1_2.setForeground(new Color(255, 250, 250));
		lblFuerza_2_1_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblFuerza_2_1_2.setBounds(250, 23, 128, 42);
		inventarioComplementos.add(lblFuerza_2_1_2);
		
		JLabel lblAgilidad_2_1_2 = new JLabel("Agilidad:");
		lblAgilidad_2_1_2.setForeground(new Color(255, 250, 250));
		lblAgilidad_2_1_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAgilidad_2_1_2.setBounds(392, 23, 128, 42);
		inventarioComplementos.add(lblAgilidad_2_1_2);
		
		JLabel lblAtaque_2_1_2 = new JLabel("Ataque:");
		lblAtaque_2_1_2.setForeground(new Color(255, 250, 250));
		lblAtaque_2_1_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAtaque_2_1_2.setBounds(876, 23, 150, 42);
		inventarioComplementos.add(lblAtaque_2_1_2);
		
		JLabel lblVelocidad_2_1_2 = new JLabel("Velocidad:");
		lblVelocidad_2_1_2.setForeground(new Color(255, 250, 250));
		lblVelocidad_2_1_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblVelocidad_2_1_2.setBounds(727, 23, 128, 42);
		inventarioComplementos.add(lblVelocidad_2_1_2);
		
		JLabel lblPtosSalud_2_1_2 = new JLabel("Puntos de salud:");
		lblPtosSalud_2_1_2.setForeground(new Color(255, 250, 250));
		lblPtosSalud_2_1_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblPtosSalud_2_1_2.setBounds(513, 23, 197, 42);
		inventarioComplementos.add(lblPtosSalud_2_1_2);
		
		JButton btnInventario_2_1_2 = new JButton("Jets");
		btnInventario_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventarioComplementos.setVisible(false);
				inventarioJets.setVisible(true);
			}
		});
		btnInventario_2_1_2.setForeground(new Color(0, 0, 128));
		btnInventario_2_1_2.setFont(new Font("Chiller", Font.BOLD, 40));
		btnInventario_2_1_2.setBounds(431, 596, 158, 42);
		inventarioComplementos.add(btnInventario_2_1_2);
		
		JButton btnTienda_2_1_2 = new JButton("Mundos");
		btnTienda_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventarioComplementos.setVisible(false);
				inventarioMundos.setVisible(true);
			}
		});
		btnTienda_2_1_2.setForeground(new Color(0, 0, 128));
		btnTienda_2_1_2.setFont(new Font("Chiller", Font.BOLD, 40));
		btnTienda_2_1_2.setBounds(716, 596, 158, 42);
		inventarioComplementos.add(btnTienda_2_1_2);
		
		textField_27 = new JTextField();
		textField_27.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_27.setColumns(10);
		textField_27.setBounds(243, 74, 102, 31);
		inventarioComplementos.add(textField_27);
		
		textField_29 = new JTextField();
		textField_29.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_29.setColumns(10);
		textField_29.setBounds(391, 74, 102, 31);
		inventarioComplementos.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_30.setColumns(10);
		textField_30.setBounds(872, 74, 102, 31);
		inventarioComplementos.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_31.setColumns(10);
		textField_31.setBounds(733, 74, 102, 31);
		inventarioComplementos.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_32.setColumns(10);
		textField_32.setBounds(564, 74, 102, 31);
		inventarioComplementos.add(textField_32);
		
		JRadioButton rdbtnMj_1_2 = new JRadioButton("  Rayo L\u00E1ser");
		rdbtnMj_1_2.setForeground(new Color(75, 0, 130));
		rdbtnMj_1_2.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMj_1_2.setBounds(378, 331, 267, 58);
		inventarioComplementos.add(rdbtnMj_1_2);
		
		textField_33 = new JTextField();
		textField_33.setForeground(new Color(0, 0, 128));
		textField_33.setFont(new Font("Chiller", Font.BOLD, 40));
		textField_33.setColumns(10);
		textField_33.setBounds(1033, 198, 186, 42);
		inventarioComplementos.add(textField_33);
		
		JRadioButton rdbtnMs_1_2 = new JRadioButton("   Cuerno de Taurus");
		rdbtnMs_1_2.setForeground(new Color(75, 0, 130));
		rdbtnMs_1_2.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMs_1_2.setBounds(378, 402, 267, 58);
		inventarioComplementos.add(rdbtnMs_1_2);
		
		JRadioButton rdbtnUj_1_2 = new JRadioButton("   Leche de la V\u00EDa L\u00E1ctea");
		rdbtnUj_1_2.setForeground(new Color(75, 0, 130));
		rdbtnUj_1_2.setFont(new Font("Chiller", Font.BOLD, 28));
		rdbtnUj_1_2.setBounds(378, 476, 267, 58);
		inventarioComplementos.add(rdbtnUj_1_2);
		
		JButton btnComprarMj_1_2 = new JButton("Vender por $200");
		btnComprarMj_1_2.setForeground(new Color(75, 0, 130));
		btnComprarMj_1_2.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarMj_1_2.setBounds(683, 338, 254, 42);
		inventarioComplementos.add(btnComprarMj_1_2);
		
		JButton btnComprarSj_1_2 = new JButton("Vender por $400");
		btnComprarSj_1_2.setForeground(new Color(75, 0, 130));
		btnComprarSj_1_2.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarSj_1_2.setBounds(685, 409, 248, 42);
		inventarioComplementos.add(btnComprarSj_1_2);
		
		JButton btnComprarUj_1_2 = new JButton("Vender por $600");
		btnComprarUj_1_2.setForeground(new Color(75, 0, 130));
		btnComprarUj_1_2.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarUj_1_2.setBounds(685, 481, 248, 42);
		inventarioComplementos.add(btnComprarUj_1_2);
		
		JLabel lblBg_2_2_1_2 = new JLabel("");
		lblBg_2_2_1_2.setIcon(new ImageIcon(img));
		lblBg_2_2_1_2.setForeground(new Color(75, 0, 130));
		lblBg_2_2_1_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblBg_2_2_1_2.setBackground(new Color(255, 250, 250));
		lblBg_2_2_1_2.setBounds(39, 0, 1264, 681);
		inventarioComplementos.add(lblBg_2_2_1_2);

		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Mundos");
		lblNewLabel_3_1_1_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_3_1_1_1.setFont(new Font("Chiller", Font.BOLD, 99));
		lblNewLabel_3_1_1_1.setBounds(509, 180, 428, 84);
		inventarioMundos.add(lblNewLabel_3_1_1_1);
		
		JLabel lblFuerza_2_1_1_1 = new JLabel("Fuerza:");
		lblFuerza_2_1_1_1.setForeground(new Color(255, 250, 250));
		lblFuerza_2_1_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblFuerza_2_1_1_1.setBounds(250, 23, 128, 42);
		inventarioMundos.add(lblFuerza_2_1_1_1);
		
		JLabel lblAgilidad_2_1_1_1 = new JLabel("Agilidad:");
		lblAgilidad_2_1_1_1.setForeground(new Color(255, 250, 250));
		lblAgilidad_2_1_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAgilidad_2_1_1_1.setBounds(392, 23, 128, 42);
		inventarioMundos.add(lblAgilidad_2_1_1_1);
		
		JLabel lblAtaque_2_1_1_1 = new JLabel("Ataque:");
		lblAtaque_2_1_1_1.setForeground(new Color(255, 250, 250));
		lblAtaque_2_1_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAtaque_2_1_1_1.setBounds(876, 23, 150, 42);
		inventarioMundos.add(lblAtaque_2_1_1_1);
		
		JLabel lblVelocidad_2_1_1_1 = new JLabel("Velocidad:");
		lblVelocidad_2_1_1_1.setForeground(new Color(255, 250, 250));
		lblVelocidad_2_1_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblVelocidad_2_1_1_1.setBounds(727, 23, 128, 42);
		inventarioMundos.add(lblVelocidad_2_1_1_1);
		
		JLabel lblPtosSalud_2_1_1_1 = new JLabel("Puntos de salud:");
		lblPtosSalud_2_1_1_1.setForeground(new Color(255, 250, 250));
		lblPtosSalud_2_1_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblPtosSalud_2_1_1_1.setBounds(513, 23, 197, 42);
		inventarioMundos.add(lblPtosSalud_2_1_1_1);
		
		JButton btnInventario_2_1_1_1 = new JButton("Complementos");
		btnInventario_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventarioMundos.setVisible(false);
				inventarioComplementos.setVisible(true);
			}
		});
		btnInventario_2_1_1_1.setForeground(new Color(0, 0, 128));
		btnInventario_2_1_1_1.setFont(new Font("Chiller", Font.BOLD, 40));
		btnInventario_2_1_1_1.setBounds(374, 597, 228, 42);
		inventarioMundos.add(btnInventario_2_1_1_1);
		
		JButton btnTienda_2_1_1_1 = new JButton("Salir");
		btnTienda_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventarioMundos.setVisible(false);
				inicio.setVisible(true);
			}
		});
		btnTienda_2_1_1_1.setForeground(new Color(0, 0, 128));
		btnTienda_2_1_1_1.setFont(new Font("Chiller", Font.BOLD, 40));
		btnTienda_2_1_1_1.setBounds(716, 596, 158, 42);
		inventarioMundos.add(btnTienda_2_1_1_1);
		
		textField_34 = new JTextField();
		textField_34.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_34.setColumns(10);
		textField_34.setBounds(243, 74, 102, 31);
		inventarioMundos.add(textField_34);
		
		textField_41 = new JTextField();
		textField_41.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_41.setColumns(10);
		textField_41.setBounds(391, 74, 102, 31);
		inventarioMundos.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_42.setColumns(10);
		textField_42.setBounds(872, 74, 102, 31);
		inventarioMundos.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_43.setColumns(10);
		textField_43.setBounds(733, 74, 102, 31);
		inventarioMundos.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setFont(new Font("Chiller", Font.BOLD, 35));
		textField_44.setColumns(10);
		textField_44.setBounds(564, 74, 102, 31);
		inventarioMundos.add(textField_44);
		
		JRadioButton rdbtnMj_1_1_1 = new JRadioButton("  Andr\u00F3meda");
		rdbtnMj_1_1_1.setForeground(new Color(75, 0, 130));
		rdbtnMj_1_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMj_1_1_1.setBounds(378, 331, 191, 58);
		inventarioMundos.add(rdbtnMj_1_1_1);
		
		textField_45 = new JTextField();
		textField_45.setForeground(new Color(0, 0, 128));
		textField_45.setFont(new Font("Chiller", Font.BOLD, 40));
		textField_45.setColumns(10);
		textField_45.setBounds(1033, 198, 186, 42);
		inventarioMundos.add(textField_45);
		
		JRadioButton rdbtnMs_1_1_1 = new JRadioButton("   Ori\u00F3n");
		rdbtnMs_1_1_1.setForeground(new Color(75, 0, 130));
		rdbtnMs_1_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMs_1_1_1.setBounds(374, 402, 195, 58);
		inventarioMundos.add(rdbtnMs_1_1_1);
		
		JRadioButton rdbtnUj_1_1_1 = new JRadioButton("   Osa Mayor");
		rdbtnUj_1_1_1.setForeground(new Color(75, 0, 130));
		rdbtnUj_1_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnUj_1_1_1.setBounds(374, 476, 195, 58);
		inventarioMundos.add(rdbtnUj_1_1_1);
		
		JButton btnComprarMj_1_1_1 = new JButton("Vender por $400");
		btnComprarMj_1_1_1.setForeground(new Color(75, 0, 130));
		btnComprarMj_1_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarMj_1_1_1.setBounds(624, 339, 254, 42);
		inventarioMundos.add(btnComprarMj_1_1_1);
		
		JButton btnComprarSj_1_1_1 = new JButton("Vender por $450");
		btnComprarSj_1_1_1.setForeground(new Color(75, 0, 130));
		btnComprarSj_1_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarSj_1_1_1.setBounds(616, 410, 258, 42);
		inventarioMundos.add(btnComprarSj_1_1_1);
		
		JButton btnComprarUj_1_1_1 = new JButton("Vender por $500");
		btnComprarUj_1_1_1.setForeground(new Color(75, 0, 130));
		btnComprarUj_1_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarUj_1_1_1.setBounds(616, 482, 258, 42);
		inventarioMundos.add(btnComprarUj_1_1_1);
		
		JLabel lblBg_2_2_1_1_1 = new JLabel("");
		lblBg_2_2_1_1_1.setIcon(new ImageIcon(img));
		lblBg_2_2_1_1_1.setForeground(new Color(75, 0, 130));
		lblBg_2_2_1_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblBg_2_2_1_1_1.setBackground(new Color(255, 250, 250));
		lblBg_2_2_1_1_1.setBounds(0, 0, 1264, 681);
		inventarioMundos.add(lblBg_2_2_1_1_1);
	}
}
