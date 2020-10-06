package poo_project1;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;

import pack.poo1.Personaje;
import pack.poo1.Principal;
import pack.poo1.Producto;

public class gui {

	private JFrame frame;
	private JTextField txtfFuerzaInicio;
	private JTextField txtfAgilidadInicio;
	private JTextField txtfAtaqueInicio;
	private JTextField txtfVelocidadInicio;
	private JTextField txtfPtosSaludInicio;
	private JTextField txtfFuerzaTJets;
	private JTextField txtfAgilidadTJets;
	private JTextField txtfAtaqueTJets;
	private JTextField txtfVelocidadTJets;
	private JTextField txtfPtosSaludTJets;
	private JTextField txtfDineroTJets;
	private JTextField txtfDineroInicio;
	private JTextField txtfInventarioMj;
	private JTextField txtfInventarioSj;
	private JTextField txtfInventarioUj;
	private JTextField txtfFuerzaTComp;
	private JTextField txtfAgilidadTComp;
	private JTextField txtfAtaqueTComp;
	private JTextField txtfVelocidadTComp;
	private JTextField txtfPtosSaludTComp;
	private JTextField txtfDineroTComp;
	private JTextField txtfInventarioLaser;
	private JTextField txtfInventarioCuerno;
	private JTextField txtfInventarioLeche;
	private JTextField txtfInventarioOsa;
	private JTextField txtfFuerzaTMun;
	private JTextField txtfAgilidadTMun;
	private JTextField txtfAtaqueTMun;
	private JTextField txtfVelocidadTMun;
	private JTextField txtfPtosSaludTMun;
	private JTextField txtfDineroTMun;
	private JTextField txtfInventarioAndro;
	private JTextField txtfInventarioOrion;
	private JTextField txtfFuerzaInvJets;
	private JTextField txtfAgilidadInvJets;
	private JTextField txtfAtaqueInvJets;
	private JTextField txtfVelocidadInvJets;
	private JTextField txtfPtosSaludInvJets;
	private JTextField txtfDineroInvJets;
	private JTextField txtfFuerzaInvComp;
	private JTextField txtfAgilidadInvComp;
	private JTextField txtfAtaqueInvComp;
	private JTextField txtfVelocidadInvComp;
	private JTextField txtfPtosSaludInvComp;
	private JTextField txtfDineroInvComp;
	private JTextField txtfFuerzaInvMun;
	private JTextField txtfAgilidadInvMun;
	private JTextField txtfAtaquesInvMun;
	private JTextField txtfVelocidadInvMun;
	private JTextField txtfPtosSaludInvMun;
	private JTextField txtfDineroInvJMun;
	private JPanel inicio;
	private JPanel tiendaJets;
	private JPanel tiendaComplementos;
	private JPanel tiendaMundos;
	private JPanel inventarioJets;
	private JPanel inventarioComplementos;
	private JPanel inventarioMundos;
	private JLabel lblPtosSaludInvComp;
	private JOptionPane msgNoCompra;
	
	//atributos de la clase gui
	ArrayList<Integer> stats = Personaje.devolverStats();
	//Las listas de los productos obtenidas del proceso del API son est�ticas ya que no cambian.
	static ArrayList<Producto> listaJets = new ArrayList<Producto>();
	static ArrayList<Producto> listaMundos = new ArrayList<Producto>();
	static ArrayList<Producto> listaComp = new ArrayList<Producto>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frame.setVisible(true);		
					/*Para conectar otro proyecto (el java maven) a este proyecto de window builder
					 * basta con tener los dos proyectos en el directorio de trabajo
					 * e inicializar la clase
					 */
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public gui() throws Exception {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 * @throws Exception 
	 */
	private void mostrarMensajeSinDinero(){
		//Etiqueta con el texto del JOptionPane
		JLabel lblSinDinero = new JLabel("Dinero Insuficiente");
		lblSinDinero.setFont(new Font("Chiller", Font.BOLD, 30)); 
			
		//Etiqueta con la imagen del JOptionPane
		JLabel lblImgSinDinero = new JLabel();
			
		Image alienTriste = new ImageIcon(this.getClass().getResource("/alienTriste.jpg")).getImage();
		lblImgSinDinero.setIcon(new ImageIcon(alienTriste));
			
		//Arreglo que tiene las dos etiquetas: texto + imagen
		JLabel[] imagenesAviso = {lblSinDinero, lblImgSinDinero};
		JOptionPane.showMessageDialog(null, imagenesAviso);
	}
	
	private void llamarApi() throws Exception{
		//conectar al otro proyecto Java Maven
		/*
		 * Se crearon instancias para cada uno de las listas de productos ya que suced�an conflictos con la obtenci�n de cada producto de categor�as diferentes,
		 * como por ejemplo la lista de jets se sustituia por la lista de complementos si esta �ltima se declaraba despu�s de listaJets
		 */
		Principal llamadaJ = new Principal();
		llamadaJ.main("JETS");
		gui.listaJets = llamadaJ.devolverLista();

		Principal llamadaC = new Principal();
		llamadaC.main("COMPLEMENTOS");
		gui.listaComp = llamadaC.devolverLista();
		
		Principal llamadaM = new Principal();
		llamadaM.main("MUNDOS");
		gui.listaMundos = llamadaM.devolverLista();		
	}
	private void initialize() throws Exception {
		llamarApi();//llama al API al inicio *IMPORTANTE
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		
		//**************************************************************************************************************
		//**************************************************************************************************************
		//*********************************************		PANELES		************************************************
		//**************************************************************************************************************
		//**************************************************************************************************************
		// ****************	INICIO
		final JPanel inicio = new JPanel();
		frame.getContentPane().add(inicio, "name_907429623456800");
		inicio.setLayout(null);
		Image img = new ImageIcon(this.getClass().getResource("/background.jpg")).getImage();
		inicio.setVisible(true);
		
		// ****************	TIENDA JETS		
		final JPanel tiendaJets = new JPanel();
		tiendaJets.setLayout(null);
		frame.getContentPane().add(tiendaJets, "name_914930016762800");

		// ****************	TIENDA COMPLEMENTOS
		final JPanel tiendaComplementos = new JPanel();
		tiendaComplementos.setLayout(null);
		frame.getContentPane().add(tiendaComplementos, "name_919401987160500");
		tiendaComplementos.setVisible(false);
		
		// ****************	TIENDA MUNDOS
		final JPanel tiendaMundos = new JPanel();
		tiendaMundos.setLayout(null);
		frame.getContentPane().add(tiendaMundos, "name_927194566434100");
		tiendaMundos.setVisible(false);
		
		// ****************	INVENTARIO JETS
		final JPanel inventarioJets = new JPanel();
		inventarioJets.setLayout(null);
		frame.getContentPane().add(inventarioJets, "name_927931963284500");
		inventarioJets.setVisible(false);
		
		// ****************	INVENTARIO COMPLEMENTOS
		final JPanel inventarioComplementos = new JPanel();
		inventarioComplementos.setLayout(null);
		frame.getContentPane().add(inventarioComplementos, "name_928546021998800");
		inventarioComplementos.setVisible(false);
	
		// ****************	INVENTARIO MUNDOS
		final JPanel inventarioMundos = new JPanel();
		inventarioMundos.setLayout(null);
		frame.getContentPane().add(inventarioMundos, "name_937114439693000");
		inventarioMundos.setVisible(false);		
		
		/*
		 * Vista de los stats #1
		 */
		
		/*Lista de los stats
		 * [4, 2, 15, 3, 5]
		 * [fuerza;agilidad;ps;velocidad;ataque]
		 */		
				
		//**************************************************************************************************************
		//**************************************************************************************************************
		//*************************************** PANEL DE INICIO ******************************************************
		//**************************************************************************************************************
		//**************************************************************************************************************
		
		// ETIQUETAS DE LOS STATS
		
		// Stat fuerza
		JLabel lblFuerzaInicio = new JLabel("Fuerza");
		lblFuerzaInicio.setForeground(new Color(255, 250, 250));
		lblFuerzaInicio.setFont(new Font("Chiller", Font.BOLD, 35));
		lblFuerzaInicio.setBounds(250, 23, 128, 42);
		inicio.add(lblFuerzaInicio);
		
		// Stat agilidad
		JLabel lblAgilidadInicio = new JLabel("Agilidad");
		lblAgilidadInicio.setForeground(new Color(255, 250, 250));
		lblAgilidadInicio.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAgilidadInicio.setBounds(392, 23, 128, 42);
		inicio.add(lblAgilidadInicio);
		
		// Stat ataque
		JLabel lblAtaqueInicio = new JLabel("Ataque");
		lblAtaqueInicio.setForeground(new Color(255, 250, 250));
		lblAtaqueInicio.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAtaqueInicio.setBounds(876, 23, 150, 42);
		inicio.add(lblAtaqueInicio);
		
		//Stat velocidad
		JLabel lblVelocidadInicio = new JLabel("Velocidad:");
		lblVelocidadInicio.setForeground(new Color(255, 250, 250));
		lblVelocidadInicio.setFont(new Font("Chiller", Font.BOLD, 35));
		lblVelocidadInicio.setBounds(727, 23, 128, 42);
		inicio.add(lblVelocidadInicio);
		
		//Stat Puntos de Salud
		JLabel lblPtosSaludInicio = new JLabel("Puntos de salud:");
		lblPtosSaludInicio.setForeground(new Color(255, 250, 250));
		lblPtosSaludInicio.setFont(new Font("Chiller", Font.BOLD, 35));
		lblPtosSaludInicio.setBounds(513, 23, 197, 42);
		inicio.add(lblPtosSaludInicio);
	
		/*FONDO DE PANTALLA DEL INICIO*/
		
		//*****************BOTONES
		
		//Botones para desplazarse entre paneles
		JButton btnInventarioInicio = new JButton("Inventario");
		btnInventarioInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicio.setVisible(false);
				inventarioJets.setVisible(true);
			}
		});
		btnInventarioInicio.setFont(new Font("Chiller", Font.BOLD, 40));
		btnInventarioInicio.setForeground(new Color(0, 0, 128));
		btnInventarioInicio.setBounds(1033, 403, 186, 42);
		inicio.add(btnInventarioInicio);
		JButton btnTiendaInicio = new JButton("Tienda");
		btnTiendaInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicio.setVisible(false);
				tiendaJets.setVisible(true);
			}
		});
		btnTiendaInicio.setForeground(new Color(0, 0, 128));
		btnTiendaInicio.setFont(new Font("Chiller", Font.BOLD, 40));
		btnTiendaInicio.setBounds(1033, 293, 186, 42);
		inicio.add(btnTiendaInicio);
		
		
		//****************Text Fields
		txtfFuerzaInicio = new JTextField(String.valueOf(stats.get(0)));//campo de texto fuerza
		txtfFuerzaInicio.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaInicio.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfFuerzaInicio.setBounds(243, 74, 102, 31);
		inicio.add(txtfFuerzaInicio);
		txtfFuerzaInicio.setColumns(10);
		
		txtfAgilidadInicio = new JTextField(String.valueOf(stats.get(1)));//campo de texto agilidad
		txtfAgilidadInicio.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadInicio.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAgilidadInicio.setColumns(10);
		txtfAgilidadInicio.setBounds(391, 74, 102, 31);
		inicio.add(txtfAgilidadInicio);
		
		txtfAtaqueInicio = new JTextField(String.valueOf(stats.get(4)));//campo de texto ataque
		txtfAtaqueInicio.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueInicio.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAtaqueInicio.setColumns(10);
		txtfAtaqueInicio.setBounds(872, 74, 102, 31);
		inicio.add(txtfAtaqueInicio);
		
		txtfVelocidadInicio = new JTextField(String.valueOf(stats.get(3)));//campo de texto velocidad
		txtfVelocidadInicio.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadInicio.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfVelocidadInicio.setColumns(10);
		txtfVelocidadInicio.setBounds(733, 74, 102, 31);
		inicio.add(txtfVelocidadInicio);
		
		txtfPtosSaludInicio = new JTextField(String.valueOf(stats.get(2)));//campo de texto ps
		txtfPtosSaludInicio.setHorizontalAlignment(SwingConstants.CENTER);
		txtfPtosSaludInicio.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfPtosSaludInicio.setColumns(10);
		txtfPtosSaludInicio.setBounds(564, 74, 102, 31);
		inicio.add(txtfPtosSaludInicio);
		
		txtfDineroInicio = new JTextField(String.valueOf(Personaje.devolverDinero()));//campo de texto dinero
		txtfDineroInicio.setEditable(false);
		txtfDineroInicio.setHorizontalAlignment(SwingConstants.CENTER);
		txtfDineroInicio.setForeground(new Color(0, 0, 128));
		txtfDineroInicio.setFont(new Font("Chiller", Font.BOLD, 40));
		txtfDineroInicio.setColumns(10);
		txtfDineroInicio.setBounds(1033, 198, 186, 42);
		inicio.add(txtfDineroInicio);
		
		JLabel lblBgInicio = new JLabel("");
		lblBgInicio.setIcon(new ImageIcon(img));
		lblBgInicio.setBounds(0, 0, 1264, 681);
		inicio.add(lblBgInicio);
		
		//**************************************************************************************************************
		//**************************************************************************************************************
		//*************************************** PANEL DE TIENDA JETS *************************************************
		//**************************************************************************************************************
		//**************************************************************************************************************
		//
		//**************ETIQUETAS 	

		//TITULO
		JLabel lblTituTJets = new JLabel("JETS");
		lblTituTJets.setForeground(new Color(255, 250, 250));
		lblTituTJets.setFont(new Font("Chiller", Font.BOLD, 99));
		lblTituTJets.setBounds(543, 181, 197, 84);
		tiendaJets.add(lblTituTJets);
		
		//ETIQUETAS DE LOS STATS
		
		// Stat fuerza
		JLabel lblFuerzaTJets = new JLabel("Fuerza:");
		lblFuerzaTJets.setForeground(new Color(255, 250, 250));
		lblFuerzaTJets.setFont(new Font("Chiller", Font.BOLD, 35));
		lblFuerzaTJets.setBounds(250, 23, 128, 42);
		tiendaJets.add(lblFuerzaTJets);
		
		// Stat agilidad
		JLabel lblAgilidadTJets = new JLabel("Agilidad:");
		lblAgilidadTJets.setForeground(new Color(255, 250, 250));
		lblAgilidadTJets.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAgilidadTJets.setBounds(392, 23, 128, 42);
		tiendaJets.add(lblAgilidadTJets);
		
		// Stat ataque
		JLabel lblAtaqueTJets = new JLabel("Ataque:");
		lblAtaqueTJets.setForeground(new Color(255, 250, 250));
		lblAtaqueTJets.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAtaqueTJets.setBounds(876, 23, 150, 42);
		tiendaJets.add(lblAtaqueTJets);

		//Stat velocidad
		JLabel lblVelocidadTJets = new JLabel("Velocidad:");
		lblVelocidadTJets.setForeground(new Color(255, 250, 250));
		lblVelocidadTJets.setFont(new Font("Chiller", Font.BOLD, 35));
		lblVelocidadTJets.setBounds(727, 23, 128, 42);
		tiendaJets.add(lblVelocidadTJets);
		
		//Stat Puntos de Salud
		JLabel lblPtosSaludTJets = new JLabel("Puntos de salud:");
		lblPtosSaludTJets.setForeground(new Color(255, 250, 250));
		lblPtosSaludTJets.setFont(new Font("Chiller", Font.BOLD, 35));
		lblPtosSaludTJets.setBounds(513, 23, 197, 42);
		tiendaJets.add(lblPtosSaludTJets);
		
		/* Fondo de pantalla de tienda Jets */
		
		// Textos de En inventario de la tienda de Jets 
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
		//**************BOTONES	
		JButton btnSalirTJets = new JButton("Salir");
		btnSalirTJets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiendaJets.setVisible(false);
				inicio.setVisible(true);
			}
		});
		btnSalirTJets.setForeground(new Color(0, 0, 128));
		btnSalirTJets.setFont(new Font("Chiller", Font.BOLD, 40));
		btnSalirTJets.setBounds(392, 596, 158, 42);
		tiendaJets.add(btnSalirTJets);
		
		JButton btnCompTJets = new JButton("Complementos");
		btnCompTJets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiendaJets.setVisible(false);
				tiendaComplementos.setVisible(true);
			}
		});
		btnCompTJets.setForeground(new Color(0, 0, 128));
		btnCompTJets.setFont(new Font("Chiller", Font.BOLD, 40));
		btnCompTJets.setBounds(651, 596, 227, 42);
		tiendaJets.add(btnCompTJets);
		
		/*Bot�n precio mini jet*/
		
		JButton btnComprarMj = new JButton("$"+String.valueOf(listaJets.get(0).getPrecio()));
		btnComprarMj.setToolTipText("Fuerza +3     Agilidad  +5     Puntos de salud +1     Velocidad +15     Ataque +7\r\n\r\n\t");
		btnComprarMj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaJets.get(0).comprar()) {
					//Comprar el miniJet
					actualizarTXTDinero();
					System.out.println(Personaje.devolverDinero());
					
				} else {
					//Mostrar mensaje "Dinero Insuficiente"
					mostrarMensajeSinDinero();						
				}
			}
		});
		btnComprarMj.setForeground(new Color(75, 0, 130));
		btnComprarMj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarMj.setBounds(529, 338, 128, 42);
		tiendaJets.add(btnComprarMj);
		
		/*Bot�n precio super jet*/
		JButton btnComprarSj = new JButton("$"+String.valueOf(listaJets.get(1).getPrecio()));
		btnComprarSj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaJets.get(1).comprar()) {
					//Comprar el s�per jet
					actualizarTXTDinero();
					System.out.println(Personaje.devolverDinero());
				} else {
					//Mostrar mensaje "Dinero Insuficiente"
					mostrarMensajeSinDinero();
				}
			}
		});
		btnComprarSj.setForeground(new Color(75, 0, 130));
		btnComprarSj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarSj.setBounds(529, 410, 125, 42);
		tiendaJets.add(btnComprarSj);
		//Bot�n ultra jet
		JButton btnComprarUj = new JButton("$"+String.valueOf(listaJets.get(2).getPrecio()));
		btnComprarUj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaJets.get(2).comprar()) {
					//Comprar el ultrajet
					actualizarTXTDinero();
					System.out.println(Personaje.devolverDinero());
				} else {
					//Mostrar mensaje "Dinero Insuficiente"
					mostrarMensajeSinDinero();
				}
			}
		});
		btnComprarUj.setForeground(new Color(75, 0, 130));
		btnComprarUj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarUj.setBounds(529, 487, 125, 42);
		tiendaJets.add(btnComprarUj);
		
		
		//**************CAJAS DE TEXTO
		txtfFuerzaTJets = new JTextField(String.valueOf(stats.get(0)));//campo de texto fuerza
		txtfFuerzaTJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaTJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfFuerzaTJets.setColumns(10);
		txtfFuerzaTJets.setBounds(243, 74, 102, 31);
		tiendaJets.add(txtfFuerzaTJets);
		
		txtfAgilidadTJets = new JTextField(String.valueOf(stats.get(1)));//campo de texto agilidad
		txtfAgilidadTJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadTJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAgilidadTJets.setColumns(10);
		txtfAgilidadTJets.setBounds(391, 74, 102, 31);
		tiendaJets.add(txtfAgilidadTJets);
		
		txtfAtaqueTJets = new JTextField(String.valueOf(stats.get(4)));//campo de texto ataque
		txtfAtaqueTJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueTJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAtaqueTJets.setColumns(10);
		txtfAtaqueTJets.setBounds(872, 74, 102, 31);
		tiendaJets.add(txtfAtaqueTJets);
		
		txtfVelocidadTJets = new JTextField(String.valueOf(stats.get(3)));//campo de texto velocidad
		txtfVelocidadTJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadTJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfVelocidadTJets.setColumns(10);
		txtfVelocidadTJets.setBounds(733, 74, 102, 31);
		tiendaJets.add(txtfVelocidadTJets);
		
		txtfPtosSaludTJets = new JTextField(String.valueOf(stats.get(2)));//campo de texto ps
		txtfPtosSaludTJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfPtosSaludTJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfPtosSaludTJets.setColumns(10);
		txtfPtosSaludTJets.setBounds(564, 74, 102, 31);
		tiendaJets.add(txtfPtosSaludTJets);
			
		txtfDineroTJets = new JTextField(String.valueOf(Personaje.devolverDinero()));//campo de texto dinero
		txtfDineroTJets.setEditable(false);
		txtfDineroTJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfDineroTJets.setForeground(new Color(0, 0, 128));
		txtfDineroTJets.setFont(new Font("Chiller", Font.BOLD, 40));
		txtfDineroTJets.setBounds(1033, 198, 186, 42);
		tiendaJets.add(txtfDineroTJets);
		txtfDineroTJets.setColumns(10);
		
		txtfInventarioMj = new JTextField("-");//inventario en minijet
		txtfInventarioMj.setForeground(new Color(75, 0, 130));
		txtfInventarioMj.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioMj.setBounds(888, 331, 63, 58);
		tiendaJets.add(txtfInventarioMj);
		txtfInventarioMj.setColumns(10);
		
		txtfInventarioSj = new JTextField("-");
		txtfInventarioSj.setForeground(new Color(75, 0, 130));//inventario en super jet
		txtfInventarioSj.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioSj.setColumns(10);
		txtfInventarioSj.setBounds(888, 402, 63, 58);
		tiendaJets.add(txtfInventarioSj);
		
		
		txtfInventarioUj = new JTextField("-");//inventario ultra jet
		txtfInventarioUj.setForeground(new Color(75, 0, 130));
		txtfInventarioUj.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioUj.setColumns(10);
		txtfInventarioUj.setBounds(888, 477, 63, 58);
		tiendaJets.add(txtfInventarioUj);
				
		//**************RADIOS
		//Bot�n mini jet
				JRadioButton rdbtnMj = new JRadioButton("   Mini Jet");
				rdbtnMj.setEnabled(false);
		rdbtnMj.setForeground(new Color(75, 0, 130));
		rdbtnMj.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMj.setBounds(283, 330, 191, 58);
		tiendaJets.add(rdbtnMj);
		
		//Bot�n Super Jet
		JRadioButton rdbtnMs = new JRadioButton("   S\u00FAper Jet");
		rdbtnMs.setEnabled(false);
		rdbtnMs.setForeground(new Color(75, 0, 130));
		rdbtnMs.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMs.setBounds(283, 402, 191, 58);
		tiendaJets.add(rdbtnMs);
		
		//Bot�n Ultra Jet
		JRadioButton rdbtnUj = new JRadioButton("   Ultra Jet");
		rdbtnUj.setEnabled(false);
		rdbtnUj.setForeground(new Color(75, 0, 130));
		rdbtnUj.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnUj.setBounds(283, 476, 191, 58);
		tiendaJets.add(rdbtnUj);
		
		JLabel lblBgTJets = new JLabel();
		lblBgTJets.setBackground(new Color(255, 250, 250));
		lblBgTJets.setFont(new Font("Chiller", Font.BOLD, 35));
		lblBgTJets.setForeground(new Color(75, 0, 130));
		lblBgTJets.setIcon(new ImageIcon(img));
		lblBgTJets.setBounds(0, 0, 1264, 681);
		tiendaJets.add(lblBgTJets);
		
		
		//*****************************************************************************************************************
		//*****************************************************************************************************************
		//*************************************** PANEL DE TIENDA COMPLEMENTOS *********************************************
		//*****************************************************************************************************************
		//*****************************************************************************************************************
		
		//**************ETIQUETAS 
		
		//TITULO
		JLabel lblTituTComp = new JLabel("COMPLEMENTOS");
		lblTituTComp.setForeground(new Color(255, 250, 250));
		lblTituTComp.setFont(new Font("Chiller", Font.BOLD, 90));
		lblTituTComp.setBounds(338, 180, 599, 84);
		tiendaComplementos.add(lblTituTComp);
		
		//ETIQUETAS DE LOS STATS
		
		// Stat fuerza
		JLabel lblFuerzaTComp = new JLabel("Fuerza:");
		lblFuerzaTComp.setForeground(new Color(255, 250, 250));
		lblFuerzaTComp.setFont(new Font("Chiller", Font.BOLD, 35));
		lblFuerzaTComp.setBounds(250, 23, 128, 42);
		tiendaComplementos.add(lblFuerzaTComp);
		
		// Stat agilidad
		JLabel lblAgilidadTComp = new JLabel("Agilidad:");
		lblAgilidadTComp.setForeground(new Color(255, 250, 250));
		lblAgilidadTComp.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAgilidadTComp.setBounds(392, 23, 128, 42);
		tiendaComplementos.add(lblAgilidadTComp);
		
		// Stat ataque
		JLabel lblAtaqueTComp = new JLabel("Ataque:");
		lblAtaqueTComp.setForeground(new Color(255, 250, 250));
		lblAtaqueTComp.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAtaqueTComp.setBounds(876, 23, 150, 42);
		tiendaComplementos.add(lblAtaqueTComp);
		
		//Stat velocidad
		JLabel lblVelocidadTComp = new JLabel("Velocidad:");
		lblVelocidadTComp.setForeground(new Color(255, 250, 250));
		lblVelocidadTComp.setFont(new Font("Chiller", Font.BOLD, 35));
		lblVelocidadTComp.setBounds(727, 23, 128, 42);
		tiendaComplementos.add(lblVelocidadTComp);
		
		//Stat Puntos de Salud
		JLabel lblPtosSaludTComp = new JLabel("Puntos de salud:");
		lblPtosSaludTComp.setForeground(new Color(255, 250, 250));
		lblPtosSaludTComp.setFont(new Font("Chiller", Font.BOLD, 35));
		lblPtosSaludTComp.setBounds(513, 23, 197, 42);
		tiendaComplementos.add(lblPtosSaludTComp);
		
		/* *********************** Fondo de pantalla tienda complementos *********************** */
		
		
		/* *************** Textos de En inventario de la tienda de Complementos**************** */
		JLabel lblNewLabel_4 = new JLabel("En inventario:");
		lblNewLabel_4.setForeground(new Color(255, 250, 250));
		lblNewLabel_4.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_4.setBackground(new Color(255, 250, 250));
		lblNewLabel_4.setBounds(751, 329, 170, 58);
		tiendaComplementos.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("En inventario:");
		lblNewLabel_1_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_1_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_1_1.setBounds(751, 398, 170, 58);
		tiendaComplementos.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("En inventario:");
		lblNewLabel_2_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_2_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_2_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_2_1.setBounds(751, 472, 170, 58);
		tiendaComplementos.add(lblNewLabel_2_1);
		
		//****************BOTONES
		
		//PASAR AL PANEL ANTERIOR
		JButton btnJetsTComp = new JButton("Jets");
		btnJetsTComp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiendaComplementos.setVisible(false);
				tiendaJets.setVisible(true);
			}
		});
		btnJetsTComp.setForeground(new Color(0, 0, 128));
		btnJetsTComp.setFont(new Font("Chiller", Font.BOLD, 40));
		btnJetsTComp.setBounds(431, 596, 158, 42);
		tiendaComplementos.add(btnJetsTComp);
		
		//PASAR AL SIGUIENTE PANEL
		JButton btnMunTComp = new JButton("Mundos");
		btnMunTComp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiendaComplementos.setVisible(false);
				tiendaMundos.setVisible(true);
			}
		});
		btnMunTComp.setForeground(new Color(0, 0, 128));
		btnMunTComp.setFont(new Font("Chiller", Font.BOLD, 40));
		btnMunTComp.setBounds(716, 596, 158, 42);
		tiendaComplementos.add(btnMunTComp);
		//**********************CAJAS DE TEXTO
		
		//STATS
		txtfFuerzaTComp = new JTextField(String.valueOf(stats.get(0)));//campo de texto fuerza
		txtfFuerzaTComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaTComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfFuerzaTComp.setColumns(10);
		txtfFuerzaTComp.setBounds(243, 74, 102, 31);
		tiendaComplementos.add(txtfFuerzaTComp);
		
		txtfAgilidadTComp = new JTextField(String.valueOf(stats.get(1)));//campo de texto agilidad
		txtfAgilidadTComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadTComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAgilidadTComp.setColumns(10);
		txtfAgilidadTComp.setBounds(391, 74, 102, 31);
		tiendaComplementos.add(txtfAgilidadTComp);
		
		txtfAtaqueTComp = new JTextField(String.valueOf(stats.get(4)));//campo de texto ataque
		txtfAtaqueTComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueTComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAtaqueTComp.setColumns(10);
		txtfAtaqueTComp.setBounds(872, 74, 102, 31);
		tiendaComplementos.add(txtfAtaqueTComp);
		
		txtfVelocidadTComp = new JTextField(String.valueOf(stats.get(3)));//campo de texto velocidad
		txtfVelocidadTComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadTComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfVelocidadTComp.setColumns(10);
		txtfVelocidadTComp.setBounds(733, 74, 102, 31);
		tiendaComplementos.add(txtfVelocidadTComp);
		
		txtfPtosSaludTComp = new JTextField(String.valueOf(stats.get(2)));//campo de texto ps
		txtfPtosSaludTComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfPtosSaludTComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfPtosSaludTComp.setColumns(10);
		txtfPtosSaludTComp.setBounds(564, 74, 102, 31);
		tiendaComplementos.add(txtfPtosSaludTComp);
		
		
		//DINERO 
		txtfDineroTComp = new JTextField(String.valueOf(Personaje.devolverDinero()));//campo de texto dinero
		txtfDineroTComp.setEditable(false);
		txtfDineroTComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfDineroTComp.setForeground(new Color(0, 0, 128));
		txtfDineroTComp.setFont(new Font("Chiller", Font.BOLD, 40));
		txtfDineroTComp.setColumns(10);
		txtfDineroTComp.setBounds(1033, 198, 186, 42);
		tiendaComplementos.add(txtfDineroTComp);
		
		//DATOS EN INVENTARIO
		txtfInventarioLaser = new JTextField("-");//en inventario rayo l�ser
		txtfInventarioLaser.setForeground(new Color(75, 0, 130));
		txtfInventarioLaser.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioLaser.setColumns(10);
		txtfInventarioLaser.setBounds(931, 330, 63, 58);
		tiendaComplementos.add(txtfInventarioLaser);
		
		txtfInventarioCuerno = new JTextField("-");//en inventario cuerno de taurus
		txtfInventarioCuerno.setForeground(new Color(75, 0, 130));
		txtfInventarioCuerno.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioCuerno.setColumns(10);
		txtfInventarioCuerno.setBounds(931, 401, 63, 58);
		tiendaComplementos.add(txtfInventarioCuerno);
		
		txtfInventarioLeche = new JTextField("-");//en inventario  via lactea
		txtfInventarioLeche.setForeground(new Color(75, 0, 130));
		txtfInventarioLeche.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioLeche.setColumns(10);
		txtfInventarioLeche.setBounds(931, 476, 63, 58);
		tiendaComplementos.add(txtfInventarioLeche);
		
		
		//**************RADIOS
		JRadioButton rdbtnLaser = new JRadioButton("  Rayo L\u00E1ser");
		rdbtnLaser.setEnabled(false);
		rdbtnLaser.setForeground(new Color(75, 0, 130));
		rdbtnLaser.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnLaser.setBounds(283, 330, 267, 58);
		tiendaComplementos.add(rdbtnLaser);
		
		JRadioButton rdbtnCuerno = new JRadioButton("   Cuerno de Taurus");
		rdbtnCuerno.setEnabled(false);
		rdbtnCuerno.setForeground(new Color(75, 0, 130));
		rdbtnCuerno.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnCuerno.setBounds(283, 402, 267, 58);
		tiendaComplementos.add(rdbtnCuerno);
		
		JRadioButton rdbtnLeche = new JRadioButton("   Leche de la V\u00EDa L\u00E1ctea");
		rdbtnLeche.setEnabled(false);
		rdbtnLeche.setForeground(new Color(75, 0, 130));
		rdbtnLeche.setFont(new Font("Chiller", Font.BOLD, 28));
		rdbtnLeche.setBounds(283, 476, 267, 58);
		tiendaComplementos.add(rdbtnLeche);
		
		
		//Botones de comprar
		
		//Bot�n de rayo laser
		JButton btnComprarLaser = new JButton("$"+String.valueOf(listaComp.get(0).getPrecio()));
		btnComprarLaser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaComp.get(0).comprar()) {
					//Comprar el rayo l�ser
					actualizarTXTDinero();
					System.out.println(Personaje.devolverDinero());
				} else {
					//Mostrar mensaje "Dinero Insuficiente"
					mostrarMensajeSinDinero();
				}
			}
		});
		btnComprarLaser.setForeground(new Color(75, 0, 130));
		btnComprarLaser.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarLaser.setBounds(572, 337, 128, 42);
		tiendaComplementos.add(btnComprarLaser);
		
		JButton btnComprarCuerno = new JButton("$"+String.valueOf(listaComp.get(1).getPrecio()));
		btnComprarCuerno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaComp.get(1).comprar()) {
					//Comprar el cuerno de taurus
					actualizarTXTDinero();
					System.out.println(Personaje.devolverDinero());
				} else {
					//Mostrar mensaje "Dinero Insuficiente"
					mostrarMensajeSinDinero();
				}
			}
		});
		btnComprarCuerno.setForeground(new Color(75, 0, 130));
		btnComprarCuerno.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarCuerno.setBounds(572, 409, 125, 42);
		tiendaComplementos.add(btnComprarCuerno);
		
		JButton btnComprarLeche = new JButton("$"+String.valueOf(listaComp.get(2).getPrecio()));
		btnComprarLeche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaComp.get(2).comprar()) {
					//Comprar la leche de la v�a l�ctea
					actualizarTXTDinero();
					System.out.println(Personaje.devolverDinero());
				} else {
					//Mostrar mensaje "Dinero Insuficiente"
					mostrarMensajeSinDinero();
				}
			}
		});
		btnComprarLeche.setForeground(new Color(75, 0, 130));
		btnComprarLeche.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarLeche.setBounds(572, 486, 125, 42);
		tiendaComplementos.add(btnComprarLeche);
		
		
		JLabel lblBgTComp = new JLabel();
		lblBgTComp.setIcon(new ImageIcon(img));
		lblBgTComp.setForeground(new Color(75, 0, 130));
		lblBgTComp.setFont(new Font("Chiller", Font.BOLD, 35));
		lblBgTComp.setBackground(new Color(255, 250, 250));//posici�n del fondo
		lblBgTComp.setBounds(0, 0, 1264, 681);
		tiendaComplementos.add(lblBgTComp);
		//**************************************************************************************************************
		//**************************************************************************************************************
		//*************************************** PANEL DE TIENDA MUNDOS ***********************************************
		//**************************************************************************************************************
		//**************************************************************************************************************
		//**************ETIQUETAS
		//TITULO		
		JLabel lblTituTMun = new JLabel("Mundos");
		lblTituTMun.setForeground(new Color(255, 250, 250));
		lblTituTMun.setFont(new Font("Chiller", Font.BOLD, 99));
		lblTituTMun.setBounds(497, 180, 440, 99);
		tiendaMundos.add(lblTituTMun);
		
		//ETIQUETAS DE LOS STATS
		
		// Stat fuerza
		JLabel lblFuerzaTMun = new JLabel("Fuerza:");
		lblFuerzaTMun.setForeground(new Color(255, 250, 250));
		lblFuerzaTMun.setFont(new Font("Chiller", Font.BOLD, 35));
		lblFuerzaTMun.setBounds(250, 23, 128, 42);
		tiendaMundos.add(lblFuerzaTMun);
		
		// Stat agilidad
		JLabel lblAgilidadTMun = new JLabel("Agilidad:");
		lblAgilidadTMun.setForeground(new Color(255, 250, 250));
		lblAgilidadTMun.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAgilidadTMun.setBounds(392, 23, 128, 42);
		tiendaMundos.add(lblAgilidadTMun);
		
		// Stat ataque
		JLabel lblAtaqueTMun = new JLabel("Ataque:");
		lblAtaqueTMun.setForeground(new Color(255, 250, 250));
		lblAtaqueTMun.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAtaqueTMun.setBounds(876, 23, 150, 42);
		tiendaMundos.add(lblAtaqueTMun);
		
		//Stat velocidad
		JLabel lblVelocidadTMun = new JLabel("Velocidad:");
		lblVelocidadTMun.setForeground(new Color(255, 250, 250));
		lblVelocidadTMun.setFont(new Font("Chiller", Font.BOLD, 35));
		lblVelocidadTMun.setBounds(727, 23, 128, 42);
		tiendaMundos.add(lblVelocidadTMun);
		
		//Stat Puntos de Salud
		JLabel lblPtosSaludTMun = new JLabel("Puntos de salud:");
		lblPtosSaludTMun.setForeground(new Color(255, 250, 250));
		lblPtosSaludTMun.setFont(new Font("Chiller", Font.BOLD, 35));
		lblPtosSaludTMun.setBounds(513, 23, 197, 42);
		tiendaMundos.add(lblPtosSaludTMun);
		
		//**** Textos de En inventario de la tienda de Mundos ****//
		JLabel lblNewLabel_4_1 = new JLabel("En inventario:");
		lblNewLabel_4_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_4_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_4_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_4_1.setBounds(694, 330, 170, 58);
		tiendaMundos.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("En inventario:");
		lblNewLabel_1_1_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_1_1_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_1_1_1.setBounds(694, 399, 170, 58);
		tiendaMundos.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("En inventario:");
		lblNewLabel_2_1_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_2_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_2_1_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_2_1_1.setBounds(694, 473, 170, 58);
		tiendaMundos.add(lblNewLabel_2_1_1);
		
		/*Fondo de pantalla de tienda mundos*/
		
		//**************CAJAS DE TEXTO
		
		//CAJAS DE TEXTO DE LOS STATS
		txtfFuerzaTMun = new JTextField(String.valueOf(stats.get(0)));//campo de texto fuerza
		txtfFuerzaTMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaTMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfFuerzaTMun.setColumns(10);
		txtfFuerzaTMun.setBounds(243, 74, 102, 31);
		tiendaMundos.add(txtfFuerzaTMun);
		
		txtfAgilidadTMun = new JTextField(String.valueOf(stats.get(1)));//campo de texto agilidad
		txtfAgilidadTMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadTMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAgilidadTMun.setColumns(10);
		txtfAgilidadTMun.setBounds(391, 74, 102, 31);
		tiendaMundos.add(txtfAgilidadTMun);
		
		txtfAtaqueTMun = new JTextField(String.valueOf(stats.get(4)));//campo de texto ataque
		txtfAtaqueTMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueTMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAtaqueTMun.setColumns(10);
		txtfAtaqueTMun.setBounds(872, 74, 102, 31);
		tiendaMundos.add(txtfAtaqueTMun);
		
		txtfVelocidadTMun = new JTextField(String.valueOf(stats.get(3)));//campo de texto velocidad
		txtfVelocidadTMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadTMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfVelocidadTMun.setColumns(10);
		txtfVelocidadTMun.setBounds(733, 74, 102, 31);
		tiendaMundos.add(txtfVelocidadTMun);
		
		txtfPtosSaludTMun = new JTextField(String.valueOf(stats.get(2)));//campo de texto ps
		txtfPtosSaludTMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfPtosSaludTMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfPtosSaludTMun.setColumns(10);
		txtfPtosSaludTMun.setBounds(564, 74, 102, 31);
		tiendaMundos.add(txtfPtosSaludTMun);
		
		//CAJA DE TEXTO QUE MUESTRA EL DINERO
		txtfDineroTMun = new JTextField(String.valueOf(Personaje.devolverDinero()));//campo de texto dinero
		txtfDineroTMun.setEditable(false);
		txtfDineroTMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfDineroTMun.setForeground(new Color(0, 0, 128));
		txtfDineroTMun.setFont(new Font("Chiller", Font.BOLD, 40));
		txtfDineroTMun.setColumns(10);
		txtfDineroTMun.setBounds(1033, 198, 186, 42);
		tiendaMundos.add(txtfDineroTMun);
				
		//CAJA DE TEXTO QUE MUESTRA LO QUE HAY EN INVENTARIOS
		txtfInventarioOsa = new JTextField("-");//en inventario osa mayor
		txtfInventarioOsa.setForeground(new Color(75, 0, 130));
		txtfInventarioOsa.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioOsa.setColumns(10);
		txtfInventarioOsa.setBounds(874, 477, 63, 58);
		tiendaMundos.add(txtfInventarioOsa);
		
		txtfInventarioAndro = new JTextField("-");//en inventario andromeda
		txtfInventarioAndro.setForeground(new Color(75, 0, 130));
		txtfInventarioAndro.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioAndro.setColumns(10);
		txtfInventarioAndro.setBounds(874, 331, 63, 58);
		tiendaMundos.add(txtfInventarioAndro);
		
		txtfInventarioOrion = new JTextField("-");//en inventario ori�n
		txtfInventarioOrion.setForeground(new Color(75, 0, 130));
		txtfInventarioOrion.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioOrion.setColumns(10);
		txtfInventarioOrion.setBounds(874, 402, 63, 58);
		tiendaMundos.add(txtfInventarioOrion);
		
		//**************RADIOS
		JRadioButton rdbtnAndro = new JRadioButton("  Andr\u00F3meda");
		rdbtnAndro.setEnabled(false);
		rdbtnAndro.setForeground(new Color(75, 0, 130));
		rdbtnAndro.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnAndro.setBounds(283, 330, 179, 58);
		tiendaMundos.add(rdbtnAndro);
		
		JRadioButton rdbtnOrion = new JRadioButton("   Ori\u00F3n");
		rdbtnOrion.setEnabled(false);
		rdbtnOrion.setForeground(new Color(75, 0, 130));
		rdbtnOrion.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnOrion.setBounds(283, 402, 179, 58);
		tiendaMundos.add(rdbtnOrion);
		
		JRadioButton rdbtnOsa = new JRadioButton("   Osa Mayor");
		rdbtnOsa.setEnabled(false);
		rdbtnOsa.setForeground(new Color(75, 0, 130));
		rdbtnOsa.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnOsa.setBounds(283, 476, 179, 58);
		tiendaMundos.add(rdbtnOsa);
		
		//********************BOTONES 
		
		//BOTONES COMPRAR
		JButton btnComprarAndro = new JButton("$"+String.valueOf(listaMundos.get(0).getPrecio()));
		btnComprarAndro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaMundos.get(0).comprar()) {
					//Comprar Andr�meda
					actualizarTXTDinero();
					System.out.println(Personaje.devolverDinero());
				} else {
					//Mostrar mensaje "Dinero Insuficiente"
					mostrarMensajeSinDinero();
				}
			}
		});
		btnComprarAndro.setForeground(new Color(75, 0, 130));
		btnComprarAndro.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarAndro.setBounds(515, 338, 128, 42);
		tiendaMundos.add(btnComprarAndro);
		
		JButton btnComprarOrion = new JButton("$"+String.valueOf(listaMundos.get(1).getPrecio()));
		btnComprarOrion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaMundos.get(1).comprar()) {
					//Comprar Ori�n
					actualizarTXTDinero();
					System.out.println(Personaje.devolverDinero());
				} else {
					//Mostrar mensaje "Dinero Insuficiente"
					mostrarMensajeSinDinero();
				}
			}
		});
		btnComprarOrion.setForeground(new Color(75, 0, 130));
		btnComprarOrion.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarOrion.setBounds(515, 410, 125, 42);
		tiendaMundos.add(btnComprarOrion);
		
		JButton btnComprarOsa = new JButton("$"+String.valueOf(listaMundos.get(2).getPrecio()));
		btnComprarOsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaMundos.get(2).comprar()) {
					//Comprar Osa Mayor
					actualizarTXTDinero();
					System.out.println(Personaje.devolverDinero());
				} else {
					//Mostrar mensaje "Dinero Insuficiente"
					mostrarMensajeSinDinero();
				}
			}
		});
		btnComprarOsa.setForeground(new Color(75, 0, 130));
		btnComprarOsa.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarOsa.setBounds(515, 487, 125, 42);
		tiendaMundos.add(btnComprarOsa);
		
		//BOTONES PARA DESPLAZARSE ENTRE PANELES
		JButton btnCompTMun = new JButton("Complementos");
		btnCompTMun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiendaMundos.setVisible(false);
				tiendaComplementos.setVisible(true);
			}
		});
		btnCompTMun.setForeground(new Color(0, 0, 128));
		btnCompTMun.setFont(new Font("Chiller", Font.BOLD, 40));
		btnCompTMun.setBounds(374, 597, 224, 42);
		tiendaMundos.add(btnCompTMun);
		
		JButton btnSalirTMun = new JButton("Salir");
		btnSalirTMun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiendaMundos.setVisible(false);
				inicio.setVisible(true);
			}
		});
		btnSalirTMun.setForeground(new Color(0, 0, 128));
		btnSalirTMun.setFont(new Font("Chiller", Font.BOLD, 40));
		btnSalirTMun.setBounds(716, 596, 158, 42);
		tiendaMundos.add(btnSalirTMun);
		JLabel lblBgTMun = new JLabel();//
		lblBgTMun.setIcon(new ImageIcon(img));
		lblBgTMun.setForeground(new Color(75, 0, 130));
		lblBgTMun.setFont(new Font("Chiller", Font.BOLD, 35));
		lblBgTMun.setBackground(new Color(255, 250, 250));
		lblBgTMun.setBounds(0, 0, 1264, 681);
		tiendaMundos.add(lblBgTMun);
		//**************************************************************************************************************
		//**************************************************************************************************************
		//*************************************** PANEL DE INVENTARIO JETS *********************************************
		//**************************************************************************************************************
		//**************************************************************************************************************
		
		//**************ETIQUETAS 	
		//TITULO		
		JLabel lblTituInvJets = new JLabel("JETS");
		lblTituInvJets.setForeground(new Color(255, 250, 250));
		lblTituInvJets.setFont(new Font("Chiller", Font.BOLD, 99));
		lblTituInvJets.setBounds(543, 181, 197, 84);
		inventarioJets.add(lblTituInvJets);
		
		//ETIQUETAS DE LOS STATS
		
		// Stat fuerza
		JLabel lblFuerzaInvJets = new JLabel("Fuerza:");
		lblFuerzaInvJets.setForeground(new Color(255, 250, 250));
		lblFuerzaInvJets.setFont(new Font("Chiller", Font.BOLD, 35));
		lblFuerzaInvJets.setBounds(250, 23, 128, 42);
		inventarioJets.add(lblFuerzaInvJets);
		
		// Stat agilidad
		JLabel lblAgilidadInvJets = new JLabel("Agilidad:");
		lblAgilidadInvJets.setForeground(new Color(255, 250, 250));
		lblAgilidadInvJets.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAgilidadInvJets.setBounds(392, 23, 128, 42);
		inventarioJets.add(lblAgilidadInvJets);
		
		// Stat ataque
		JLabel lblAtaqueInvJets = new JLabel("Ataque:");
		lblAtaqueInvJets.setForeground(new Color(255, 250, 250));
		lblAtaqueInvJets.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAtaqueInvJets.setBounds(876, 23, 150, 42);
		inventarioJets.add(lblAtaqueInvJets);
		
		//Stat velocidad
		JLabel lblVelocidadInvJets = new JLabel("Velocidad:");
		lblVelocidadInvJets.setForeground(new Color(255, 250, 250));
		lblVelocidadInvJets.setFont(new Font("Chiller", Font.BOLD, 35));
		lblVelocidadInvJets.setBounds(727, 23, 128, 42);
		inventarioJets.add(lblVelocidadInvJets);
		
		//Stat Puntos de Salud
		JLabel lblPtosSaludInvJets = new JLabel("Puntos de salud:");
		lblPtosSaludInvJets.setForeground(new Color(255, 250, 250));
		lblPtosSaludInvJets.setFont(new Font("Chiller", Font.BOLD, 35));
		lblPtosSaludInvJets.setBounds(513, 23, 197, 42);
		inventarioJets.add(lblPtosSaludInvJets);
		
		/*Fondo de pantalla de inventario jets*/
		
		
		//**************BOTONES
		
		//BOTONES PARA DESPLAZARSE ENTRE PANELES
		JButton btnSalirInvJets = new JButton("Salir");
		btnSalirInvJets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventarioJets.setVisible(false);
				inicio.setVisible(true);
			}
		});
		btnSalirInvJets.setForeground(new Color(0, 0, 128));
		btnSalirInvJets.setFont(new Font("Chiller", Font.BOLD, 40));
		btnSalirInvJets.setBounds(392, 596, 158, 42);
		inventarioJets.add(btnSalirInvJets);
		
		JButton btnCompInvJets = new JButton("Complementos");
		btnCompInvJets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventarioJets.setVisible(false);
				inventarioComplementos.setVisible(true);
			}
		});
		btnCompInvJets.setForeground(new Color(0, 0, 128));
		btnCompInvJets.setFont(new Font("Chiller", Font.BOLD, 40));
		btnCompInvJets.setBounds(651, 596, 227, 42);
		inventarioJets.add(btnCompInvJets);
		
		
		//BOTONES DE VENDER
		//MINI JET
		JButton btnVenderMj = new JButton("Vender por $125");
		btnVenderMj.setForeground(new Color(75, 0, 130));
		btnVenderMj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderMj.setBounds(624, 339, 254, 42);
		inventarioJets.add(btnVenderMj);
		
		//SUPER JET
		JButton btnVenderSj = new JButton("Vender por $250");
		btnVenderSj.setForeground(new Color(75, 0, 130));
		btnVenderSj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderSj.setBounds(624, 411, 254, 42);
		inventarioJets.add(btnVenderSj);
		
		//ULTRA JET
		JButton btnVenderUj = new JButton("Vender por $500");
		btnVenderUj.setForeground(new Color(75, 0, 130));
		btnVenderUj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderUj.setBounds(624, 488, 254, 42);
		inventarioJets.add(btnVenderUj);
		
		//******************************CAJAS DE TEXTO
		
		//STATS
		txtfFuerzaInvJets = new JTextField(String.valueOf(stats.get(0)));//campo de texto fuerza
		txtfFuerzaInvJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaInvJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfFuerzaInvJets.setColumns(10);
		txtfFuerzaInvJets.setBounds(243, 74, 102, 31);
		inventarioJets.add(txtfFuerzaInvJets);
		
		txtfAgilidadInvJets = new JTextField(String.valueOf(stats.get(1)));//campo de texto agilidad
		txtfAgilidadInvJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadInvJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAgilidadInvJets.setColumns(10);
		txtfAgilidadInvJets.setBounds(391, 74, 102, 31);
		inventarioJets.add(txtfAgilidadInvJets);
		
		txtfAtaqueInvJets = new JTextField(String.valueOf(stats.get(4)));//campo de texto ataque
		txtfAtaqueInvJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueInvJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAtaqueInvJets.setColumns(10);
		txtfAtaqueInvJets.setBounds(872, 74, 102, 31);
		inventarioJets.add(txtfAtaqueInvJets);
		
		txtfVelocidadInvJets = new JTextField(String.valueOf(stats.get(3)));//campo de texto velocidad
		txtfVelocidadInvJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadInvJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfVelocidadInvJets.setColumns(10);
		txtfVelocidadInvJets.setBounds(733, 74, 102, 31);
		inventarioJets.add(txtfVelocidadInvJets);
		
		txtfPtosSaludInvJets = new JTextField(String.valueOf(stats.get(2)));//campo de texto ps
		txtfPtosSaludInvJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfPtosSaludInvJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfPtosSaludInvJets.setColumns(10);
		txtfPtosSaludInvJets.setBounds(564, 74, 102, 31);
		inventarioJets.add(txtfPtosSaludInvJets);
		
		//CAJA DE TEXTO DONDE SE MUESTRA EL DINERO
		txtfDineroInvJets = new JTextField(String.valueOf(Personaje.devolverDinero()));//campo de texto dinero
		txtfDineroInvJets.setEditable(false);
		txtfDineroInvJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfDineroInvJets.setForeground(new Color(0, 0, 128));
		txtfDineroInvJets.setFont(new Font("Chiller", Font.BOLD, 40));
		txtfDineroInvJets.setColumns(10);
		txtfDineroInvJets.setBounds(1033, 198, 186, 42);
		inventarioJets.add(txtfDineroInvJets);
		
		//**************RADIOS
		JRadioButton rdbtnMjInv = new JRadioButton("   Mini Jet");
		rdbtnMjInv.setEnabled(false);
		rdbtnMjInv.setForeground(new Color(75, 0, 130));
		rdbtnMjInv.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMjInv.setBounds(378, 331, 191, 58);
		inventarioJets.add(rdbtnMjInv);
		
		JRadioButton rdbtnSjInv = new JRadioButton("   S\u00FAper Jet");
		rdbtnSjInv.setEnabled(false);
		rdbtnSjInv.setForeground(new Color(75, 0, 130));
		rdbtnSjInv.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnSjInv.setBounds(378, 403, 191, 58);
		inventarioJets.add(rdbtnSjInv);
		
		JRadioButton rdbtnUjInv = new JRadioButton("   Ultra Jet");
		rdbtnUjInv.setEnabled(false);
		rdbtnUjInv.setForeground(new Color(75, 0, 130));
		rdbtnUjInv.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnUjInv.setBounds(378, 477, 191, 58);
		inventarioJets.add(rdbtnUjInv);
		JLabel lblBgInvJets = new JLabel();
		lblBgInvJets.setIcon(new ImageIcon(img));
		lblBgInvJets.setForeground(new Color(75, 0, 130));
		lblBgInvJets.setFont(new Font("Chiller", Font.BOLD, 35));
		lblBgInvJets.setBackground(new Color(255, 250, 250));
		lblBgInvJets.setBounds(0, 0, 1264, 681);
		inventarioJets.add(lblBgInvJets);
		
		
		//**********************************************************************************************************************
		//**********************************************************************************************************************
		//*************************************** PANEL DE INVENTARIO COMPLEMENTOS *********************************************
		//**********************************************************************************************************************
		//**********************************************************************************************************************
		
		//**************ETIQUETAS 	

		//TITULO		
		JLabel lblTituInvComp = new JLabel("COMPLEMENTOS");
		lblTituInvComp.setForeground(new Color(255, 250, 250));
		lblTituInvComp.setFont(new Font("Chiller", Font.BOLD, 99));
		lblTituInvComp.setBounds(338, 180, 599, 84);
		inventarioComplementos.add(lblTituInvComp);
		
		//ETIQUETAS DE LOS STATS
		
		// Stat fuerza
		JLabel lblFuerzaInvComp = new JLabel("Fuerza:");
		lblFuerzaInvComp.setForeground(new Color(255, 250, 250));
		lblFuerzaInvComp.setFont(new Font("Chiller", Font.BOLD, 35));
		lblFuerzaInvComp.setBounds(250, 23, 128, 42);
		inventarioComplementos.add(lblFuerzaInvComp);
		
		// Stat agilidad
		JLabel lblAgilidadInvComp = new JLabel("Agilidad:");
		lblAgilidadInvComp.setForeground(new Color(255, 250, 250));
		lblAgilidadInvComp.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAgilidadInvComp.setBounds(392, 23, 128, 42);
		inventarioComplementos.add(lblAgilidadInvComp);
		
		// Stat ataque
		JLabel lblAtaqueInvComp = new JLabel("Ataque:");
		lblAtaqueInvComp.setForeground(new Color(255, 250, 250));
		lblAtaqueInvComp.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAtaqueInvComp.setBounds(876, 23, 150, 42);
		inventarioComplementos.add(lblAtaqueInvComp);
		
		//Stat velocidad
		JLabel lblVelocidadInvComp = new JLabel("Velocidad:");
		lblVelocidadInvComp.setForeground(new Color(255, 250, 250));
		lblVelocidadInvComp.setFont(new Font("Chiller", Font.BOLD, 35));
		lblVelocidadInvComp.setBounds(727, 23, 128, 42);
		inventarioComplementos.add(lblVelocidadInvComp);
		
		//Stat Puntos de Salud
		JLabel lblPtosSaludInvComp = new JLabel("Puntos de salud:");
		lblPtosSaludInvComp.setForeground(new Color(255, 250, 250));
		lblPtosSaludInvComp.setFont(new Font("Chiller", Font.BOLD, 35));
		lblPtosSaludInvComp.setBounds(513, 23, 197, 42);
		inventarioComplementos.add(lblPtosSaludInvComp);
		
		/*Fondo de pantalla de inventario de Complementos*/
				
		//**************BOTONES
		
		//BOTONES VENDER
		JButton btnVenderRayo = new JButton("Vender por $200");
		btnVenderRayo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVenderRayo.setForeground(new Color(75, 0, 130));
		btnVenderRayo.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderRayo.setBounds(683, 338, 254, 42);
		inventarioComplementos.add(btnVenderRayo);
		
		JButton btnVenderCuerno = new JButton("Vender por $400");
		btnVenderCuerno.setForeground(new Color(75, 0, 130));
		btnVenderCuerno.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderCuerno.setBounds(685, 409, 248, 42);
		inventarioComplementos.add(btnVenderCuerno);
		
		JButton btnVenderLeche = new JButton("Vender por $600");
		btnVenderLeche.setForeground(new Color(75, 0, 130));
		btnVenderLeche.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderLeche.setBounds(685, 481, 248, 42);
		inventarioComplementos.add(btnVenderLeche);
		
		//BOTONES PARA DESPLAZARSE ENTRE PANELES
		JButton btnJetsInvComp = new JButton("Jets");
		btnJetsInvComp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventarioComplementos.setVisible(false);
				inventarioJets.setVisible(true);
			}
		});
		btnJetsInvComp.setForeground(new Color(0, 0, 128));
		btnJetsInvComp.setFont(new Font("Chiller", Font.BOLD, 40));
		btnJetsInvComp.setBounds(431, 596, 158, 42);
		inventarioComplementos.add(btnJetsInvComp);
		
		JButton btnMunInvComp = new JButton("Mundos");
		btnMunInvComp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventarioComplementos.setVisible(false);
				inventarioMundos.setVisible(true);
			}
		});
		btnMunInvComp.setForeground(new Color(0, 0, 128));
		btnMunInvComp.setFont(new Font("Chiller", Font.BOLD, 40));
		btnMunInvComp.setBounds(716, 596, 158, 42);
		inventarioComplementos.add(btnMunInvComp);		
		
		
		//**************CAJAS DE TEXTO
		// CAJAS DE TEXTO DE LOS STATS
		txtfFuerzaInvComp = new JTextField(String.valueOf(stats.get(0)));//campo de texto fuerza
		txtfFuerzaInvComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaInvComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfFuerzaInvComp.setColumns(10);
		txtfFuerzaInvComp.setBounds(243, 74, 102, 31);
		inventarioComplementos.add(txtfFuerzaInvComp);
		
		txtfAgilidadInvComp = new JTextField(String.valueOf(stats.get(1)));//campo de texto agilidad
		txtfAgilidadInvComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadInvComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAgilidadInvComp.setColumns(10);
		txtfAgilidadInvComp.setBounds(391, 74, 102, 31);
		inventarioComplementos.add(txtfAgilidadInvComp);
		
		txtfAtaqueInvComp = new JTextField(String.valueOf(stats.get(4)));//campo de texto ataque
		txtfAtaqueInvComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueInvComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAtaqueInvComp.setColumns(10);
		txtfAtaqueInvComp.setBounds(872, 74, 102, 31);
		inventarioComplementos.add(txtfAtaqueInvComp);
		
		txtfVelocidadInvComp = new JTextField(String.valueOf(stats.get(3)));//campo de texto velocidad
		txtfVelocidadInvComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadInvComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfVelocidadInvComp.setColumns(10);
		txtfVelocidadInvComp.setBounds(733, 74, 102, 31);
		inventarioComplementos.add(txtfVelocidadInvComp);
		
		txtfPtosSaludInvComp = new JTextField(String.valueOf(stats.get(2)));//campo de texto ps
		txtfPtosSaludInvComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfPtosSaludInvComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfPtosSaludInvComp.setColumns(10);
		txtfPtosSaludInvComp.setBounds(564, 74, 102, 31);
		inventarioComplementos.add(txtfPtosSaludInvComp);
		
		//CAJA DE TEXTO DEL DINERO
		txtfDineroInvComp = new JTextField(String.valueOf(Personaje.devolverDinero()));//campo de texto dinero
		txtfDineroInvComp.setEditable(false);
		txtfDineroInvComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfDineroInvComp.setForeground(new Color(0, 0, 128));
		txtfDineroInvComp.setFont(new Font("Chiller", Font.BOLD, 40));
		txtfDineroInvComp.setColumns(10);
		txtfDineroInvComp.setBounds(1033, 198, 186, 42);
		inventarioComplementos.add(txtfDineroInvComp);
		
		//**************RADIOS
		JRadioButton rdbtnLaserInv = new JRadioButton("  Rayo L\u00E1ser");
		rdbtnLaserInv.setEnabled(false);
		rdbtnLaserInv.setForeground(new Color(75, 0, 130));
		rdbtnLaserInv.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnLaserInv.setBounds(378, 331, 267, 58);
		inventarioComplementos.add(rdbtnLaserInv);
		
		JRadioButton rdbtnCuernoInv = new JRadioButton("   Cuerno de Taurus");
		rdbtnCuernoInv.setEnabled(false);
		rdbtnCuernoInv.setForeground(new Color(75, 0, 130));
		rdbtnCuernoInv.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnCuernoInv.setBounds(378, 402, 267, 58);
		inventarioComplementos.add(rdbtnCuernoInv);
		
		JRadioButton rdbtnLecheInv = new JRadioButton("   Leche de la V\u00EDa L\u00E1ctea");
		rdbtnLecheInv.setEnabled(false);
		rdbtnLecheInv.setForeground(new Color(75, 0, 130));
		rdbtnLecheInv.setFont(new Font("Chiller", Font.BOLD, 28));
		rdbtnLecheInv.setBounds(378, 476, 267, 58);
		inventarioComplementos.add(rdbtnLecheInv);
		JLabel lblBgInvComp = new JLabel();//Fondo de pantalla #13
		lblBgInvComp.setIcon(new ImageIcon(img));
		lblBgInvComp.setForeground(new Color(75, 0, 130));
		lblBgInvComp.setFont(new Font("Chiller", Font.BOLD, 35));
		lblBgInvComp.setBackground(new Color(255, 250, 250));
		lblBgInvComp.setBounds(0, 0, 1264, 681);
		inventarioComplementos.add(lblBgInvComp);
		
		
		//**************************************************************************************************************
		//**************************************************************************************************************
		//*************************************** PANEL DE INVENTARIO JETS *********************************************
		//**************************************************************************************************************
		//**************************************************************************************************************
		
		//**************ETIQUETAS 	

		//TITULO
		JLabel lblTituInvMun = new JLabel("Mundos");
		lblTituInvMun.setForeground(new Color(255, 250, 250));
		lblTituInvMun.setFont(new Font("Chiller", Font.BOLD, 99));
		lblTituInvMun.setBounds(509, 180, 428, 84);
		inventarioMundos.add(lblTituInvMun);
		
		//ETIQUETAS DE LOS STATS
		
		// Stat fuerza
		JLabel lblFuerzaInvMun = new JLabel("Fuerza:");
		lblFuerzaInvMun.setForeground(new Color(255, 250, 250));
		lblFuerzaInvMun.setFont(new Font("Chiller", Font.BOLD, 35));
		lblFuerzaInvMun.setBounds(250, 23, 128, 42);
		inventarioMundos.add(lblFuerzaInvMun);
		
		//Stat Agilidad
		JLabel lblAgilidadInvMun = new JLabel("Agilidad:");
		lblAgilidadInvMun.setForeground(new Color(255, 250, 250));
		lblAgilidadInvMun.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAgilidadInvMun.setBounds(392, 23, 128, 42);
		inventarioMundos.add(lblAgilidadInvMun);
		
		// Stat ataque
		JLabel lblAtaqueInvMun = new JLabel("Ataque:");
		lblAtaqueInvMun.setForeground(new Color(255, 250, 250));
		lblAtaqueInvMun.setFont(new Font("Chiller", Font.BOLD, 35));
		lblAtaqueInvMun.setBounds(876, 23, 150, 42);
		inventarioMundos.add(lblAtaqueInvMun);
		
		//Stat velocidad
		JLabel lblVelocidadInvMun = new JLabel("Velocidad:");
		lblVelocidadInvMun.setForeground(new Color(255, 250, 250));
		lblVelocidadInvMun.setFont(new Font("Chiller", Font.BOLD, 35));
		lblVelocidadInvMun.setBounds(727, 23, 128, 42);
		inventarioMundos.add(lblVelocidadInvMun);
		
		//Stat Puntos de Salud
		JLabel lblPtosSaludInvMun = new JLabel("Puntos de salud:");
		lblPtosSaludInvMun.setForeground(new Color(255, 250, 250));
		lblPtosSaludInvMun.setFont(new Font("Chiller", Font.BOLD, 35));
		lblPtosSaludInvMun.setBounds(513, 23, 197, 42);
		inventarioMundos.add(lblPtosSaludInvMun);
		
		/* Fondo de inventario mundos */
		
		//**************BOTONES
		//BOTONES PARA DESPLAZARSE ENTRE PANELES
		JButton btnCompInvMun = new JButton("Complementos");
		btnCompInvMun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventarioMundos.setVisible(false);
				inventarioComplementos.setVisible(true);
			}
		});
		btnCompInvMun.setForeground(new Color(0, 0, 128));
		btnCompInvMun.setFont(new Font("Chiller", Font.BOLD, 40));
		btnCompInvMun.setBounds(374, 597, 228, 42);
		inventarioMundos.add(btnCompInvMun);
		
		JButton btnSalirInvMun = new JButton("Salir");
		btnSalirInvMun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventarioMundos.setVisible(false);
				inicio.setVisible(true);
			}
		});
		btnSalirInvMun.setForeground(new Color(0, 0, 128));
		btnSalirInvMun.setFont(new Font("Chiller", Font.BOLD, 40));
		btnSalirInvMun.setBounds(716, 596, 158, 42);
		inventarioMundos.add(btnSalirInvMun);
		
		//BOTONES VENDER		
		JButton btnVenderAndro = new JButton("Vender por $400");
		btnVenderAndro.setForeground(new Color(75, 0, 130));
		btnVenderAndro.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderAndro.setBounds(624, 339, 254, 42);
		inventarioMundos.add(btnVenderAndro);
		
		JButton btnVenderOrion = new JButton("Vender por $450");
		btnVenderOrion.setForeground(new Color(75, 0, 130));
		btnVenderOrion.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderOrion.setBounds(616, 410, 258, 42);
		inventarioMundos.add(btnVenderOrion);
		
		JButton btnVenderOsa = new JButton("Vender por $500");
		btnVenderOsa.setForeground(new Color(75, 0, 130));
		btnVenderOsa.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderOsa.setBounds(616, 482, 258, 42);
		inventarioMundos.add(btnVenderOsa);
		
		//**************CAJAS DE TEXTO
		
		//CAJAS DE TEXTO DE LOS STATS
		txtfFuerzaInvMun = new JTextField(String.valueOf(stats.get(0)));//campo de texto fuerza
		txtfFuerzaInvMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaInvMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfFuerzaInvMun.setColumns(10);
		txtfFuerzaInvMun.setBounds(243, 74, 102, 31);
		inventarioMundos.add(txtfFuerzaInvMun);
		
		txtfAgilidadInvMun = new JTextField(String.valueOf(stats.get(1)));//campo de texto agilidad
		txtfAgilidadInvMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadInvMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAgilidadInvMun.setColumns(10);
		txtfAgilidadInvMun.setBounds(391, 74, 102, 31);
		inventarioMundos.add(txtfAgilidadInvMun);
		
		txtfAtaquesInvMun = new JTextField(String.valueOf(stats.get(4)));//campo de texto ataque
		txtfAtaquesInvMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaquesInvMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAtaquesInvMun.setColumns(10);
		txtfAtaquesInvMun.setBounds(872, 74, 102, 31);
		inventarioMundos.add(txtfAtaquesInvMun);
		
		txtfVelocidadInvMun = new JTextField(String.valueOf(stats.get(3)));//campo de texto velocidad
		txtfVelocidadInvMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadInvMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfVelocidadInvMun.setColumns(10);
		txtfVelocidadInvMun.setBounds(733, 74, 102, 31);
		inventarioMundos.add(txtfVelocidadInvMun);
		
		txtfPtosSaludInvMun = new JTextField(String.valueOf(stats.get(2)));//campo de texto ps
		txtfPtosSaludInvMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfPtosSaludInvMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfPtosSaludInvMun.setColumns(10);
		txtfPtosSaludInvMun.setBounds(564, 74, 102, 31);
		inventarioMundos.add(txtfPtosSaludInvMun);
		
		//CAJA DE TEXTO DEL DINERO
		txtfDineroInvJMun = new JTextField(String.valueOf(Personaje.devolverDinero()));//campo de texto dinero
		txtfDineroInvJMun.setEditable(false);
		txtfDineroInvJMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfDineroInvJMun.setForeground(new Color(0, 0, 128));
		txtfDineroInvJMun.setFont(new Font("Chiller", Font.BOLD, 40));
		txtfDineroInvJMun.setColumns(10);
		txtfDineroInvJMun.setBounds(1033, 198, 186, 42);
		inventarioMundos.add(txtfDineroInvJMun);
		
		//**************RADIOS
		JRadioButton rdbtnAndroInv = new JRadioButton("  Andr\u00F3meda");
		rdbtnAndroInv.setEnabled(false);
		rdbtnAndroInv.setForeground(new Color(75, 0, 130));
		rdbtnAndroInv.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnAndroInv.setBounds(378, 331, 191, 58);
		inventarioMundos.add(rdbtnAndroInv);
		
		JRadioButton rdbtnOrionInv = new JRadioButton("   Ori\u00F3n");
		rdbtnOrionInv.setEnabled(false);
		rdbtnOrionInv.setForeground(new Color(75, 0, 130));
		rdbtnOrionInv.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnOrionInv.setBounds(374, 402, 195, 58);
		inventarioMundos.add(rdbtnOrionInv);
		
		JRadioButton rdbtnOsaInv = new JRadioButton("   Osa Mayor");
		rdbtnOsaInv.setEnabled(false);
		rdbtnOsaInv.setForeground(new Color(75, 0, 130));
		rdbtnOsaInv.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnOsaInv.setBounds(374, 476, 195, 58);
		inventarioMundos.add(rdbtnOsaInv);
		JLabel lblBgInvMun = new JLabel();//Fondo de pantalla #14
		lblBgInvMun.setIcon(new ImageIcon(img));
		lblBgInvMun.setForeground(new Color(75, 0, 130));
		lblBgInvMun.setFont(new Font("Chiller", Font.BOLD, 35));
		lblBgInvMun.setBackground(new Color(255, 250, 250));
		lblBgInvMun.setBounds(0, 0, 1264, 681);
		inventarioMundos.add(lblBgInvMun);
	}
//m�todo para actualizar el dinero
	private void actualizarTXTDinero() {
		// TODO Auto-generated method stub
		txtfDineroTJets.setText(String.valueOf(Personaje.devolverDinero()));
		txtfDineroTComp.setText(String.valueOf(Personaje.devolverDinero()));
		txtfDineroTMun.setText(String.valueOf(Personaje.devolverDinero()));
		txtfDineroInvJets.setText(String.valueOf(Personaje.devolverDinero()));
		txtfDineroInvComp.setText(String.valueOf(Personaje.devolverDinero()));
		txtfDineroInvJMun.setText(String.valueOf(Personaje.devolverDinero()));
		txtfDineroInicio.setText(String.valueOf(Personaje.devolverDinero()));
	}
	
	//m�todo para actualizar los stats
	
}