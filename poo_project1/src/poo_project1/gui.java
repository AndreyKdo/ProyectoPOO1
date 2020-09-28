package poo_project1;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import javax.swing.ImageIcon;
import java.awt.Button;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTree;
import java.awt.Panel;
import java.awt.Choice;
import java.awt.Component;
import javax.swing.Box;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;

public class gui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField cantitadMini;
	private JTextField textField_7;

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
		frame.setResizable(false);
		frame.setBackground(Color.BLUE);
		frame.setBounds(100, 100, 1288, 726);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel tienda = new JPanel();
		tienda.setBounds(236, 631, 782, -500);
		frame.getContentPane().add(tienda);
		tienda.setLayout(null);
		
		JRadioButton rdbtnMiniJ_1 = new JRadioButton("Mini Jet");
		rdbtnMiniJ_1.setForeground(new Color(255, 250, 250));
		rdbtnMiniJ_1.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMiniJ_1.setBounds(0, 0, 203, 71);
		tienda.add(rdbtnMiniJ_1);
		
		JRadioButton rdbtnSuperJ_1 = new JRadioButton("Super Jet");
		rdbtnSuperJ_1.setForeground(new Color(255, 250, 250));
		rdbtnSuperJ_1.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnSuperJ_1.setBounds(0, 0, 245, 286);
		tienda.add(rdbtnSuperJ_1);
		
		JRadioButton rdbtnUltraJ_1 = new JRadioButton("Ultra Jet");
		rdbtnUltraJ_1.setForeground(new Color(255, 250, 250));
		rdbtnUltraJ_1.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnUltraJ_1.setBounds(0, 0, 335, 270);
		tienda.add(rdbtnUltraJ_1);
		
		cantitadMini = new JTextField();
		cantitadMini.setBounds(0, 0, 86, 20);
		tienda.add(cantitadMini);
		cantitadMini.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 46, 14);
		tienda.add(lblNewLabel);
		
		JButton btnComprarM = new JButton("New button");
		btnComprarM.setBounds(0, 0, 89, 23);
		tienda.add(btnComprarM);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(0, 0, 86, 20);
		tienda.add(textField_7);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 46, 14);
		tienda.add(lblNewLabel_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(0, 0, 89, 23);
		tienda.add(btnNewButton_1_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setFont(new Font("Chiller", Font.BOLD, 40));
		textField.setForeground(new Color(0, 0, 128));
		textField.setBounds(1078, 233, 165, 62);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel inventario = new JPanel();
		inventario.setBounds(236, 631, 782, -500);
		frame.getContentPane().add(inventario);
		inventario.setLayout(null);
		
		JRadioButton rdbtnMiniJ = new JRadioButton("Mini Jet");
		rdbtnMiniJ.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMiniJ.setForeground(new Color(255, 250, 250));
		rdbtnMiniJ.setBounds(6, -48, 203, 71);
		inventario.add(rdbtnMiniJ);
		
		JRadioButton rdbtnSuperJ = new JRadioButton("Super Jet");
		rdbtnSuperJ.setForeground(new Color(255, 250, 250));
		rdbtnSuperJ.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnSuperJ.setBounds(-44, -263, 245, 286);
		inventario.add(rdbtnSuperJ);
		
		JRadioButton rdbtnUltraJ = new JRadioButton("Ultra Jet");
		rdbtnUltraJ.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnUltraJ.setForeground(new Color(255, 250, 250));
		rdbtnUltraJ.setBounds(0, -247, 335, 270);
		inventario.add(rdbtnUltraJ);
		
		JButton btnVenderM = new JButton("Vender");
		btnVenderM.setFont(new Font("Chiller", Font.BOLD, 30));
		btnVenderM.setBounds(0, 0, 89, 23);
		inventario.add(btnVenderM);
		
		JButton btnVenderS = new JButton("Vender");
		btnVenderS.setFont(new Font("Chiller", Font.BOLD, 30));
		btnVenderS.setBounds(0, 0, 89, 23);
		inventario.add(btnVenderS);
		
		JButton btnVenderU = new JButton("Vender");
		btnVenderU.setFont(new Font("Chiller", Font.BOLD, 30));
		btnVenderU.setBounds(0, 0, 89, 23);
		inventario.add(btnVenderU);
		
		JButton button = new JButton("New button");
		button.setBounds(0, 0, 89, 23);
		frame.getContentPane().add(button);
		
		JPanel inicio = new JPanel();
		inicio.setBounds(139, 319, 339, -171);
		frame.getContentPane().add(inicio);
		inicio.setLayout(null);
		
		
		JButton btnNewButton = new JButton("Inventario");
		btnNewButton.setIcon(null);
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Chiller", Font.BOLD, 40));
		btnNewButton.setBounds(1083, 430, 161, 67);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnTienda = new JButton("Tienda");
		btnTienda.setIcon(null);
		btnTienda.setForeground(new Color(0, 0, 128));
		btnTienda.setFont(new Font("Chiller", Font.BOLD, 40));
		btnTienda.setBounds(1080, 329, 164, 64);
		frame.getContentPane().add(btnTienda);
		
		textField_1 = new JTextField();
		textField_1.setBounds(236, 59, 113, 37);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(396, 59, 113, 37);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(553, 59, 113, 37);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(705, 59, 113, 37);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(876, 59, 113, 37);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblFuerza = new JLabel("Fuerza:");
		lblFuerza.setFont(new Font("Chiller", Font.BOLD, 35));
		lblFuerza.setForeground(new Color(255, 250, 250));
		lblFuerza.setBounds(244, 11, 105, 37);
		frame.getContentPane().add(lblFuerza);
		
		JLabel lblPtosSalud = new JLabel("Puntos de salud:");
		lblPtosSalud.setForeground(new Color(255, 250, 250));
		lblPtosSalud.setFont(new Font("Chiller", Font.BOLD, 35));
		lblPtosSalud.setBounds(844, 11, 195, 37);
		frame.getContentPane().add(lblPtosSalud);
		
		JLabel lblAtaque = new JLabel("Ataque:");
		lblAtaque.setForeground(new Color(255, 250, 250));
		lblAtaque.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAtaque.setBounds(561, 11, 105, 37);
		frame.getContentPane().add(lblAtaque);
		
		JLabel lblAgilidad = new JLabel("Agilidad:");
		lblAgilidad.setForeground(new Color(255, 250, 250));
		lblAgilidad.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAgilidad.setBounds(404, 11, 105, 37);
		frame.getContentPane().add(lblAgilidad);
		
		JLabel lblVelocidad = new JLabel("Velocidad:");
		lblVelocidad.setForeground(new Color(255, 250, 250));
		lblVelocidad.setFont(new Font("Chiller", Font.BOLD, 35));
		lblVelocidad.setBounds(705, 11, 140, 37);
		frame.getContentPane().add(lblVelocidad);
		
		JLabel bg = new JLabel("");
		Image img= new ImageIcon(this.getClass().getResource("/background.jpg")).getImage();
		bg.setIcon(new ImageIcon(img));
		bg.setFont(new Font("Chiller", Font.BOLD, 20));
		bg.setBounds(0, 0, 1282, 697);
		frame.getContentPane().add(bg);
		
	}
}
