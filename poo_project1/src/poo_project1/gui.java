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
import pack.poo1.Inventario;
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
	private JRadioButton rdbtnMj;
	private JRadioButton rdbtnMs;
	private JRadioButton rdbtnUj;
	private JRadioButton rdbtnLaser;
	private JRadioButton rdbtnCuerno;
	private JRadioButton rdbtnLeche;
	private JRadioButton rdbtnAndro;
	private JRadioButton rdbtnOrion;
	private JRadioButton rdbtnOsa;
	
	/*
	 * Declaración de botones que cambian el estado durante la ejecución
	 */
	//Botones de vender en el inventario
	JButton btnVenderMj = new JButton();
	JButton btnVenderSj = new JButton();
	JButton btnVenderUj = new JButton();
	JButton btnVenderRayo = new JButton();
	JButton btnVenderCuerno = new JButton();
	JButton btnVenderLeche = new JButton();
	JButton btnVenderAndro = new JButton();
	JButton btnVenderOrion = new JButton();
	JButton btnVenderOsa = new JButton();
	
	//Botones de Equipar en el inventario
	JButton btnEquiparMj = new JButton("Equipar");
	JButton btnEquiparSj = new JButton("Equipar");
	JButton btnEquiparUj = new JButton("Equipar");
	JButton btnEquiparLaser = new JButton("Equipar");
	JButton btnEquiparCuerno = new JButton("Equipar");
	JButton btnEquiparLeche = new JButton("Equipar");
	JButton btnEquiparAndro = new JButton("Usar");
	JButton btnEquiparOsa = new JButton("Usar");
	JButton btnEquiparOrion = new JButton("Usar");
	
	
	//atributos de la clase gui
	ArrayList<Integer> stats = Personaje.devolverStats();
	ArrayList<Integer> statsModificados = Personaje.previewStats();
	
	//Las listas de los productos obtenidas del proceso del API son estáticas ya que no cambian.
	static ArrayList<Producto> listaJets = new ArrayList<Producto>();
	static ArrayList<Producto> listaMundos = new ArrayList<Producto>();
	static ArrayList<Producto> listaComp = new ArrayList<Producto>();
	
	private JTextField txtfFuerzaTJetsPre;
	private JTextField txtfAgilidadTJetsPre;
	private JTextField txtfPtosSaludTJetsPre;
	private JTextField txtfVelocidadTJetsPre;
	private JTextField txtfAtaqueTJetsPre;
	private JTextField txtfFuerzaTCompPre;
	private JTextField txtfAgilidadTCompPre;
	private JTextField txtfPtosSaludTCompPre;
	private JTextField txtfVelocidadTCompPre;
	private JTextField txtfAtaqueTCompPre;
	private JTextField txtfFuerzaTMunPre;
	private JTextField txtfAgilidadTMunPre;
	private JTextField txtfPtosSaludTMunPre;
	private JTextField txtfVelocidadTMunPre;
	private JTextField txtfAtaqueTMunPre;
	private JTextField txtfFuerzaTJetsSt;
	private JTextField txtfFuerzaTMunSt;
	private JTextField txtfAgilidadTMunSt;
	private JTextField txtfPtosSaludTMunSt;
	private JTextField txtfVelocidadTMunSt;
	private JTextField txtfAtaqueTMunSt;
	private JTextField txtfAgilidadTJetsSt;
	private JTextField txtfPtosSaludTJetsSt;
	private JTextField txtfVelocidadTJetsSt;
	private JTextField txtfAtaqueTJetsSt;
	private JTextField txtfFuerzaTCompSt;
	private JTextField txtfAgilidadTCompSt;
	private JTextField txtfPtosSaludTCompSt;
	private JTextField txtfVelocidadTCompSt;
	private JTextField txtfAtaqueTCompSt;
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
	private void llamarApi() throws Exception{
		//conectar al otro proyecto Java Maven
		/*
		 * Se crearon instancias para cada uno de las listas de productos ya que sucedían conflictos con la obtención de cada producto de categorías diferentes,
		 * como por ejemplo la lista de jets se sustituia por la lista de complementos si esta última se declaraba después de listaJets
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
	
	private static boolean esNumero(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}	

	private void initialize() throws Exception {
		llamarApi();//llama al API al inicio *IMPORTANTE
		frame = new JFrame();
		frame.setResizable(false);
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
		
		String dineroInput = JOptionPane.showInputDialog(frame, "Introduzca la cantidad de dinero que desea: ");
		if (dineroInput == null) System.exit(0);
		else if (esNumero(dineroInput)) Personaje.modificarDinero(Integer.parseInt(dineroInput));// OJO que sólo acepta string, luego hay que hacer cast
		else{
			JOptionPane.showMessageDialog(null, "No ingresó el dinero, se pone el dinero por defecto.");
			Personaje.modificarDinero(1000);
		}

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

///////////////////////////////////////////////////////////////////////////////////////////////////
		// ****************	INVENTARIO JETS
		final JPanel inventarioJets = new JPanel();
		inventarioJets.setLayout(null);
		frame.getContentPane().add(inventarioJets, "name_927931963284500");
		inventarioJets.setVisible(false);
		
		//RADIO BUTTONS
		final JRadioButton rdbtnMjInv = new JRadioButton("   Mini Jet"); //Radio mini jet
		rdbtnMjInv.setEnabled(false);
		rdbtnMjInv.setForeground(new Color(75, 0, 130));
		rdbtnMjInv.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMjInv.setBounds(300, 299, 191, 58);
		inventarioJets.add(rdbtnMjInv);
		
		final JRadioButton rdbtnSjInv = new JRadioButton("   S\u00FAper Jet"); //Radio super jet
		rdbtnSjInv.setEnabled(false);
		rdbtnSjInv.setForeground(new Color(75, 0, 130));
		rdbtnSjInv.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnSjInv.setBounds(300, 373, 191, 58);
		inventarioJets.add(rdbtnSjInv);
			
		final JRadioButton rdbtnUjInv = new JRadioButton("   Ultra Jet"); //Radio ultra jet
		rdbtnUjInv.setEnabled(false);
		rdbtnUjInv.setForeground(new Color(75, 0, 130));
		rdbtnUjInv.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnUjInv.setBounds(300, 448, 191, 58);
		inventarioJets.add(rdbtnUjInv);
		
		//*********************RADIOS		
		//Botón mini jet
		final JRadioButton rdbtnMj = new JRadioButton("   Mini Jet");
		rdbtnMj.setForeground(new Color(75, 0, 130));
		rdbtnMj.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMj.setBounds(283, 299, 191, 58);
		tiendaJets.add(rdbtnMj);
		
		//Botón Super Jet
		final JRadioButton rdbtnMs = new JRadioButton("   S\u00FAper Jet");
		rdbtnMs.setForeground(new Color(75, 0, 130));
		rdbtnMs.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnMs.setBounds(283, 372, 191, 58);
		tiendaJets.add(rdbtnMs);
		
		//Botón Ultra Jet
		final JRadioButton rdbtnUj = new JRadioButton("   Ultra Jet");
		rdbtnUj.setForeground(new Color(75, 0, 130));
		rdbtnUj.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnUj.setBounds(283, 445, 191, 58);
		tiendaJets.add(rdbtnUj);
		
		
		//BOTONES DE VENDER
		//MINI JET
		btnVenderMj.setText("Vender por $"+String.valueOf(listaJets.get(0).getPrecioVender()));
		btnVenderMj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaJets.get(0).vender();
				actualizarTXTInvJets();
				actualizarTXTDinero();
			}
		});
		btnVenderMj.setForeground(new Color(75, 0, 130));
		btnVenderMj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderMj.setBounds(720, 307, 254, 42);
		btnVenderMj.setEnabled(Inventario.buscarObjeto(listaJets.get(0).getNombre()));
		btnVenderMj.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaJets.get(0).getNombre()))+" de Mini Jet.");//mostrar la cantidad de minijets que hay al colocar arriba el cursor
		inventarioJets.add(btnVenderMj);
		
		//SUPER JET
		btnVenderSj.setText("Vender por $"+String.valueOf(listaJets.get(1).getPrecioVender()));
		btnVenderSj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaJets.get(1).vender();
				actualizarTXTInvJets();
				actualizarTXTDinero();
			}
		});
		btnVenderSj.setForeground(new Color(75, 0, 130));
		btnVenderSj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderSj.setBounds(720, 381, 254, 42);
		btnVenderSj.setEnabled(Inventario.buscarObjeto(listaJets.get(1).getNombre())); 
		btnVenderSj.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaJets.get(1).getNombre()))+" de Súper Jet.");//mostrar la cantidad de superjets que hay al colocar arriba el cursor
		inventarioJets.add(btnVenderSj);
		//ULTRA JET
		btnVenderUj.setText("Vender por $"+String.valueOf(listaJets.get(2).getPrecioVender()));
		btnVenderUj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaJets.get(2).vender();
				actualizarTXTInvJets();
				actualizarTXTDinero();
			}
		});
		btnVenderUj.setForeground(new Color(75, 0, 130));
		btnVenderUj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderUj.setBounds(720, 456, 254, 42);
		btnVenderUj.setEnabled(Inventario.buscarObjeto(listaJets.get(2).getNombre()));
		btnVenderUj.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaJets.get(2).getNombre()))+" de Ultra Jet.");//mostrar la cantidad de minijets que hay al colocar arriba el cursor
		inventarioJets.add(btnVenderUj);
		
		final JButton btnComprarMj = new JButton("$"+String.valueOf(listaJets.get(0).getPrecio()));
		btnComprarMj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				if (listaJets.get(0).comprar()) { 
					//Comprar el miniJet
					mostrarMensajeCompra("JETS", 0, btnEquiparMj, rdbtnMjInv, btnVenderMj);
				}else { 
					//Mostrar mensaje "Dinero Insuficiente" 
					mostrarMensajeSinDinero();
				}
			}
		});
		btnComprarMj.setForeground(new Color(75, 0, 130));
		btnComprarMj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarMj.setBounds(529, 307, 128, 42);
		tiendaJets.add(btnComprarMj);
		
		/*Botón precio super jet*/
		final JButton btnComprarSj = new JButton("$"+String.valueOf(listaJets.get(1).getPrecio()));
		btnComprarSj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (listaJets.get(1).comprar()) { //***
					//Comprar el super jet
					mostrarMensajeCompra("JETS", 1, btnEquiparSj, rdbtnSjInv, btnVenderSj);
						
				}else { 
					//Mostrar mensaje "Dinero Insuficiente" 
					mostrarMensajeSinDinero();
				}
				
			}
		});
		btnComprarSj.setForeground(new Color(75, 0, 130));
		btnComprarSj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarSj.setBounds(529, 380, 125, 42);
		tiendaJets.add(btnComprarSj);
		
		//Botón ultra jet
		final JButton btnComprarUj = new JButton("$"+String.valueOf(listaJets.get(2).getPrecio()));
		btnComprarUj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (listaJets.get(2).comprar()) { //***
					//Comprar el super jet
					mostrarMensajeCompra("JETS", 2, btnEquiparUj, rdbtnUjInv, btnVenderUj);
								
				}else { 
					//Mostrar mensaje "Dinero Insuficiente" 
					mostrarMensajeSinDinero();
				}
			}
		});
		btnComprarUj.setForeground(new Color(75, 0, 130));
		btnComprarUj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarUj.setBounds(529, 453, 125, 42);
		tiendaJets.add(btnComprarUj);
		
		

		
		//Botones de equipar
		btnEquiparMj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaJets.get(0).equipar();
				if (rdbtnMjInv.isSelected()==false) {
					equiparObjeto(btnEquiparMj, rdbtnMjInv,false);
					btnVenderMj.setEnabled(false);
				}else {
					desequiparObjeto(btnEquiparMj, rdbtnMjInv,false);
					btnVenderMj.setEnabled(true);
				}
			}
		});
		btnEquiparMj.setEnabled(false);
		btnEquiparMj.setForeground(new Color(75, 0, 130));
		btnEquiparMj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnEquiparMj.setBounds(522, 307, 153, 42);
		inventarioJets.add(btnEquiparMj);

		btnEquiparSj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaJets.get(1).equipar();
				if (rdbtnSjInv.isSelected()==false) {
					equiparObjeto(btnEquiparSj, rdbtnSjInv,false);
					btnVenderSj.setEnabled(false);
				}else {
					desequiparObjeto(btnEquiparSj, rdbtnSjInv,false);
					btnVenderSj.setEnabled(true);
				}
			}
		});
		btnEquiparSj.setEnabled(false);
		btnEquiparSj.setForeground(new Color(75, 0, 130));
		btnEquiparSj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnEquiparSj.setBounds(522, 382, 153, 42);
		inventarioJets.add(btnEquiparSj);
		
		btnEquiparUj.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				listaJets.get(2).equipar();
				if (rdbtnUjInv.isSelected()==false) {
					equiparObjeto(btnEquiparUj, rdbtnUjInv,false);
					btnVenderUj.setEnabled(false);
				}else {
					desequiparObjeto(btnEquiparUj, rdbtnUjInv,false);
					btnVenderUj.setEnabled(true);
				}
			}
		});
		btnEquiparUj.setEnabled(false);
		btnEquiparUj.setForeground(new Color(75, 0, 130));
		btnEquiparUj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnEquiparUj.setBounds(522, 456, 153, 42);
		inventarioJets.add(btnEquiparUj);
		
///////////////////////////////////////////////////////////////////////////////////////////////////	
		// ****************	INVENTARIO COMPLEMENTOS
		final JPanel inventarioComplementos = new JPanel();
		inventarioComplementos.setLayout(null);
		frame.getContentPane().add(inventarioComplementos, "name_928546021998800");
		inventarioComplementos.setVisible(false);
	
		//RADIO BUTTONS
		final JRadioButton rdbtnLaserInv = new JRadioButton("    Rayo L\u00E1ser "); //Radio rayo láser
		rdbtnLaserInv.setEnabled(false);
		rdbtnLaserInv.setForeground(new Color(75, 0, 130));
		rdbtnLaserInv.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnLaserInv.setBounds(299, 299, 243, 58);
		inventarioComplementos.add(rdbtnLaserInv);
				
		final JRadioButton rdbtnCuernoInv = new JRadioButton(" Cuerno de Taurus"); //Radio cuerno de taurus
		rdbtnCuernoInv.setEnabled(false);
		rdbtnCuernoInv.setForeground(new Color(75, 0, 130));
		rdbtnCuernoInv.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnCuernoInv.setBounds(299, 373, 243, 58);
		inventarioComplementos.add(rdbtnCuernoInv);
			
		final JRadioButton rdbtnLecheInv = new JRadioButton("Leche de la V\u00EDa L\u00E1ctea"); //Radio leche de la vía láctea
		rdbtnLecheInv.setEnabled(false);
		rdbtnLecheInv.setForeground(new Color(75, 0, 130));
		rdbtnLecheInv.setFont(new Font("Chiller", Font.BOLD, 28));
		rdbtnLecheInv.setBounds(299, 448, 243, 58);
		inventarioComplementos.add(rdbtnLecheInv);
		btnVenderRayo.setEnabled(false);
		
		//**************RADIOS
		final JRadioButton rdbtnLaser = new JRadioButton("    Rayo L\u00E1ser");
		rdbtnLaser.setForeground(new Color(75, 0, 130));
		rdbtnLaser.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnLaser.setBounds(283, 299, 247, 58);
		tiendaComplementos.add(rdbtnLaser);
		
		final JRadioButton rdbtnCuerno = new JRadioButton(" Cuerno de Taurus");
		rdbtnCuerno.setForeground(new Color(75, 0, 130));
		rdbtnCuerno.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnCuerno.setBounds(283, 372, 247, 58);
		tiendaComplementos.add(rdbtnCuerno);
		
		final JRadioButton rdbtnLeche = new JRadioButton(" Leche de la V\u00EDa L\u00E1ctea");
		rdbtnLeche.setForeground(new Color(75, 0, 130));
		rdbtnLeche.setFont(new Font("Chiller", Font.BOLD, 28));
		rdbtnLeche.setBounds(283, 445, 247, 58);
		tiendaComplementos.add(rdbtnLeche);
		
		//BOTONES VENDER
		btnVenderRayo.setText("Vender por $"+String.valueOf(listaComp.get(0).getPrecioVender()));
		btnVenderRayo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaComp.get(0).vender();
				actualizarTXTDinero();
				actualizarTXTInvComp();
			}
		});
		btnVenderRayo.setForeground(new Color(75, 0, 130));
		btnVenderRayo.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderRayo.setBounds(761, 307, 254, 42);
		inventarioComplementos.add(btnVenderRayo);
		btnVenderRayo.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaComp.get(0).getNombre()))+" de Rayo Láser.");//mostrar la cantidad de rayos laser que hay al colocar arriba el cursor
		btnVenderCuerno.setEnabled(false);
		
		btnVenderCuerno.setText("Vender por $"+String.valueOf(listaComp.get(1).getPrecioVender()));
		btnVenderCuerno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaComp.get(1).vender();
				actualizarTXTInvComp();
				actualizarTXTDinero();
			}
		});
		btnVenderCuerno.setForeground(new Color(75, 0, 130));
		btnVenderCuerno.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderCuerno.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaComp.get(1).getNombre()))+" de Cuerno de Taurus.");//mostrar la cantidad de cuernos de taurus que hay al colocar arriba el cursor
		btnVenderCuerno.setBounds(761, 381, 254, 42);
		inventarioComplementos.add(btnVenderCuerno);
		btnVenderLeche.setEnabled(false);
		
		btnVenderLeche.setText("Vender por $"+String.valueOf(listaComp.get(2).getPrecioVender()));
		btnVenderLeche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaComp.get(2).vender();
				actualizarTXTInvComp();
				actualizarTXTDinero();
			}
		});
		btnVenderLeche.setForeground(new Color(75, 0, 130));
		btnVenderLeche.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderLeche.setBounds(761, 456, 254, 42);
		btnVenderLeche.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaComp.get(2).getNombre()))+" de Leche de Vía Láctea.");//mostrar la cantidad de leche de via lactea que hay al colocar arriba el cursor
		inventarioComplementos.add(btnVenderLeche);
		
		
		//Botones de comprar
		
		//Botón de rayo laser
		final JButton btnComprarLaser = new JButton("$"+String.valueOf(listaComp.get(0).getPrecio()));
		btnComprarLaser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaComp.get(0).comprar()) { 
					//Comprar el rayo láser
					mostrarMensajeCompra("COMPLEMENTOS", 0, btnEquiparLaser, rdbtnLaserInv, btnVenderRayo);
											
				}else { 
					//Mostrar mensaje "Dinero Insuficiente" 
					mostrarMensajeSinDinero();
				}
			}
		});
		btnComprarLaser.setForeground(new Color(75, 0, 130));
		btnComprarLaser.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarLaser.setBounds(572, 307, 128, 42);
		tiendaComplementos.add(btnComprarLaser);
				
		final JButton btnComprarCuerno = new JButton("$"+String.valueOf(listaComp.get(1).getPrecio()));
		btnComprarCuerno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaComp.get(1).comprar()) { 
					//Comprar el cuerno de taurus
					mostrarMensajeCompra("COMPLEMENTOS", 1, btnEquiparCuerno, rdbtnCuernoInv, btnVenderCuerno);
											
				}else { 
					//Mostrar mensaje "Dinero Insuficiente" 
					mostrarMensajeSinDinero();
				}
			}
		});
		btnComprarCuerno.setForeground(new Color(75, 0, 130));
		btnComprarCuerno.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarCuerno.setBounds(572, 380, 125, 42);
		tiendaComplementos.add(btnComprarCuerno);
				
		final JButton btnComprarLeche = new JButton("$"+String.valueOf(listaComp.get(2).getPrecio()));
		btnComprarLeche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaComp.get(2).comprar()) { 
					//Comprar el rayo láser
					mostrarMensajeCompra("COMPLEMENTOS", 2, btnEquiparLeche, rdbtnLecheInv, btnVenderLeche);
											
				}else { 
					//Mostrar mensaje "Dinero Insuficiente" 
					mostrarMensajeSinDinero();
				}
			}
		});
		btnComprarLeche.setForeground(new Color(75, 0, 130));
		btnComprarLeche.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarLeche.setBounds(572, 453, 125, 42);
		tiendaComplementos.add(btnComprarLeche);
			
		//Botones de equipar 
		
		//Botón equipar rayo laser
		btnEquiparLaser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaComp.get(0).equipar();
				if (rdbtnLaserInv.isSelected()==false) {
					equiparObjeto(btnEquiparLaser, rdbtnLaserInv,false);
					btnVenderRayo.setEnabled(false);
				}else {
					desequiparObjeto(btnEquiparLaser, rdbtnLaserInv,false);
					btnVenderRayo.setEnabled(true);
				}
			}
		});
		btnEquiparLaser.setEnabled(false);
		btnEquiparLaser.setForeground(new Color(75, 0, 130));
		btnEquiparLaser.setFont(new Font("Chiller", Font.BOLD, 35));
		btnEquiparLaser.setBounds(575, 307, 153, 42);
		inventarioComplementos.add(btnEquiparLaser);
		
		//Botón equipar cuerno de taurus
		btnEquiparCuerno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaComp.get(1).equipar();
				if (rdbtnCuernoInv.isSelected()==false) {
					equiparObjeto(btnEquiparCuerno, rdbtnCuernoInv,false);
					btnVenderCuerno.setEnabled(false);
				}else {
					desequiparObjeto(btnEquiparCuerno, rdbtnCuernoInv,false);
					btnVenderCuerno.setEnabled(true);
				}
			}
		});
		btnEquiparCuerno.setEnabled(false);
		btnEquiparCuerno.setForeground(new Color(75, 0, 130));
		btnEquiparCuerno.setFont(new Font("Chiller", Font.BOLD, 35));
		btnEquiparCuerno.setBounds(575, 382, 153, 42);
		inventarioComplementos.add(btnEquiparCuerno);
		
		//Botón equipar leche de la vía láctea
		btnEquiparLeche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaComp.get(2).equipar();
				if (rdbtnLecheInv.isSelected()==false) {
					equiparObjeto(btnEquiparLeche, rdbtnLecheInv,false);
					btnVenderLeche.setEnabled(false);
				}else {
					desequiparObjeto(btnEquiparLeche, rdbtnLecheInv,false);
					btnVenderLeche.setEnabled(true);
				}
			}
		});
		btnEquiparLeche.setEnabled(false);
		btnEquiparLeche.setForeground(new Color(75, 0, 130));
		btnEquiparLeche.setFont(new Font("Chiller", Font.BOLD, 35));
		btnEquiparLeche.setBounds(575, 456, 153, 42);
		inventarioComplementos.add(btnEquiparLeche);
		
///////////////////////////////////////////////////////////////////////////////////////////////////
		// ****************	INVENTARIO MUNDOS
		final JPanel inventarioMundos = new JPanel();
		inventarioMundos.setLayout(null);
		frame.getContentPane().add(inventarioMundos, "name_937114439693000");
		inventarioMundos.setVisible(false);	

		//RADIO BUTTONS
		final JRadioButton rdbtnAndroInv = new JRadioButton("  Andr\u00F3meda");
		rdbtnAndroInv.setEnabled(false);
		rdbtnAndroInv.setForeground(new Color(75, 0, 130));
		rdbtnAndroInv.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnAndroInv.setBounds(299, 299, 195, 58);
		inventarioMundos.add(rdbtnAndroInv);
		
		final JRadioButton rdbtnOrionInv = new JRadioButton("   Ori\u00F3n"); //Radio orión
		rdbtnOrionInv.setEnabled(false);
		rdbtnOrionInv.setForeground(new Color(75, 0, 130));
		rdbtnOrionInv.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnOrionInv.setBounds(299, 373, 195, 58);
		inventarioMundos.add(rdbtnOrionInv);
		
		final JRadioButton rdbtnOsaInv = new JRadioButton("   Osa Mayor"); //Radio osa mayor
		rdbtnOsaInv.setEnabled(false);
		rdbtnOsaInv.setForeground(new Color(75, 0, 130));
		rdbtnOsaInv.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnOsaInv.setBounds(299, 448, 195, 58);
		inventarioMundos.add(rdbtnOsaInv);
		
		//**************RADIOS
		final JRadioButton rdbtnAndro = new JRadioButton("  Andr\u00F3meda");
		rdbtnAndro.setForeground(new Color(75, 0, 130));
		rdbtnAndro.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnAndro.setBounds(283, 299, 179, 58);
		tiendaMundos.add(rdbtnAndro);
		
		final JRadioButton rdbtnOrion = new JRadioButton("   Ori\u00F3n");
		rdbtnOrion.setForeground(new Color(75, 0, 130));
		rdbtnOrion.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnOrion.setBounds(283, 372, 179, 58);
		tiendaMundos.add(rdbtnOrion);
		
		final JRadioButton rdbtnOsa = new JRadioButton("   Osa Mayor");
		rdbtnOsa.setForeground(new Color(75, 0, 130));
		rdbtnOsa.setFont(new Font("Chiller", Font.BOLD, 35));
		rdbtnOsa.setBounds(283, 445, 179, 58);
		tiendaMundos.add(rdbtnOsa);
		
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
		btnVenderAndro.setEnabled(false);
		
		//BOTONES VENDER		
		btnVenderAndro.setText("Vender por $"+String.valueOf(listaMundos.get(0).getPrecioVender()));
		btnVenderAndro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaMundos.get(0).vender();
				actualizarTXTInvMun();
				actualizarTXTDinero();
			}
		});
		btnVenderAndro.setForeground(new Color(75, 0, 130));
		btnVenderAndro.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderAndro.setBounds(716, 307, 254, 42);
		btnVenderAndro.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaMundos.get(0).getNombre()))+" de Andrómeda.");//mostrar la cantidad de andromeda que hay al colocar arriba el cursor
		inventarioMundos.add(btnVenderAndro);
		
		btnVenderOrion.setEnabled(false);		
		btnVenderOrion.setText("Vender por $"+String.valueOf(listaMundos.get(1).getPrecioVender()));
		btnVenderOrion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaMundos.get(1).vender();
				actualizarTXTInvMun();
				actualizarTXTDinero();
			}
		});
		btnVenderOrion.setForeground(new Color(75, 0, 130));
		btnVenderOrion.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderOrion.setBounds(716, 381, 254, 42);
		btnVenderOrion.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaMundos.get(1).getNombre()))+" de Orión.");//mostrar la cantidad de orion que hay al colocar arriba el cursor
		inventarioMundos.add(btnVenderOrion);
		btnVenderOsa.setEnabled(false);
		
		btnVenderOsa.setText("Vender por $"+String.valueOf(listaMundos.get(2).getPrecioVender()));
		btnVenderOsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaMundos.get(2).vender();
				actualizarTXTInvMun();
				actualizarTXTDinero();
			}
		});
		btnVenderOsa.setForeground(new Color(75, 0, 130));
		btnVenderOsa.setFont(new Font("Chiller", Font.BOLD, 35));
		btnVenderOsa.setBounds(716, 456, 254, 42);
		btnVenderOsa.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaMundos.get(2).getNombre()))+" de Osa Mayor." );//mostrar la cantidad de osa mayor que hay al colocar arriba el cursor
		inventarioMundos.add(btnVenderOsa);
		
		//BOTONES COMPRAR
		final JButton btnComprarAndro = new JButton("$"+String.valueOf(listaMundos.get(0).getPrecio()));
		btnComprarAndro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaMundos.get(0).comprar()) { 
					//Mundo Andrómeda
					mostrarMensajeCompra("MUNDOS", 0, btnEquiparAndro, rdbtnAndroInv, btnVenderAndro);
											
				}else { 
					//Mostrar mensaje "Dinero Insuficiente" 
					mostrarMensajeSinDinero();
				}
				
				//Image orion = new ImageIcon(this.getClass().getResource("/orion.jpg")).getImage();
				//lblBgInicio.setIcon(new ImageIcon(orion));
				
			}
		});
		btnComprarAndro.setForeground(new Color(75, 0, 130));
		btnComprarAndro.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarAndro.setBounds(515, 307, 128, 42);
		tiendaMundos.add(btnComprarAndro);
				
		final JButton btnComprarOrion = new JButton("$"+String.valueOf(listaMundos.get(1).getPrecio()));
		btnComprarOrion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaMundos.get(1).comprar()) { 
					//Mundo Orión
					mostrarMensajeCompra("MUNDOS", 1, btnEquiparOrion, rdbtnOrionInv, btnVenderOrion);
											
				}else { 
					//Mostrar mensaje "Dinero Insuficiente" 
					mostrarMensajeSinDinero();
				}
			}
		});
		btnComprarOrion.setForeground(new Color(75, 0, 130));
		btnComprarOrion.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarOrion.setBounds(515, 380, 125, 42);
		tiendaMundos.add(btnComprarOrion);
				
		final JButton btnComprarOsa = new JButton("$"+String.valueOf(listaMundos.get(2).getPrecio()));
		btnComprarOsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaMundos.get(2).comprar()) { 
					//Mundo Osa Mayor
					mostrarMensajeCompra("MUNDOS", 2, btnEquiparOsa, rdbtnOsaInv, btnVenderOsa);
											
				}else { 
					//Mostrar mensaje "Dinero Insuficiente" 
					mostrarMensajeSinDinero();
				}
			}
		});
		btnComprarOsa.setForeground(new Color(75, 0, 130));
		btnComprarOsa.setFont(new Font("Chiller", Font.BOLD, 35));
		btnComprarOsa.setBounds(515, 453, 125, 42);
		tiendaMundos.add(btnComprarOsa);
			
			
		//************Botones de equipar Mundos
		//Botón equipar andrómeda
		btnEquiparAndro.setEnabled(false);//se activa cuando está en inventario
		btnEquiparAndro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaMundos.get(0).equipar();
				if (rdbtnAndroInv.isSelected()==false) {
					equiparObjeto(btnEquiparAndro, rdbtnAndroInv,true);
					btnVenderAndro.setEnabled(false);
				}else {
					desequiparObjeto(btnEquiparAndro, rdbtnAndroInv,true);
					btnVenderAndro.setEnabled(true);
				}
			}
		});
		btnEquiparAndro.setForeground(new Color(75, 0, 130));
		btnEquiparAndro.setFont(new Font("Chiller", Font.BOLD, 35));
		btnEquiparAndro.setBounds(523, 307, 153, 42);
		inventarioMundos.add(btnEquiparAndro);
		
		//Botón equipar orión
		btnEquiparOrion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaMundos.get(1).equipar();
				if (rdbtnOrionInv.isSelected()==false) {
					equiparObjeto(btnEquiparOrion, rdbtnOrionInv,true);	
					btnVenderOrion.setEnabled(false);
				}else {
					desequiparObjeto(btnEquiparOrion, rdbtnOrionInv,true);
					btnVenderOrion.setEnabled(true);
				}				
			}
		});
		btnEquiparOrion.setEnabled(false);
		btnEquiparOrion.setForeground(new Color(75, 0, 130));
		btnEquiparOrion.setFont(new Font("Chiller", Font.BOLD, 35));
		btnEquiparOrion.setBounds(523, 382, 153, 42);
		inventarioMundos.add(btnEquiparOrion);
		
		//Botón equipar osa mayor
		btnEquiparOsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaMundos.get(2).equipar();
				if (rdbtnOsaInv.isSelected()==false) {
					equiparObjeto(btnEquiparOsa, rdbtnOsaInv,true);
					btnVenderOsa.setEnabled(false);		
				}else {
					desequiparObjeto(btnEquiparOsa, rdbtnOsaInv,true);
					btnVenderOsa.setEnabled(true);
				}
			}
		});
		btnEquiparOsa.setEnabled(false);
		btnEquiparOsa.setForeground(new Color(75, 0, 130));
		btnEquiparOsa.setFont(new Font("Chiller", Font.BOLD, 35));
		btnEquiparOsa.setBounds(523, 456, 153, 42);
		inventarioMundos.add(btnEquiparOsa);

		/*Lista de los stats
		 * [4, 2, 15, 3, 5]
		 * [fuerza;agilidad;ps;velocidad;ataque]
		 */		
		
		JLabel lblNombreJuego = new JLabel("Alien Jeepeta");
		lblNombreJuego.setForeground(new Color(255, 250, 250));
		lblNombreJuego.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreJuego.setFont(new Font("Chiller", Font.BOLD, 99));
		lblNombreJuego.setBounds(372, 281, 509, 220);
		inicio.add(lblNombreJuego);
		
		
		final JLabel lblFlag = new JLabel(".");
		lblFlag.setForeground(new Color(255, 255, 255));
		lblFlag.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 15));
		lblFlag.setBounds(247, 552, 46, 14);
		inventarioMundos.add(lblFlag);
		
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
		
		
		//****************Text Fields, valores de los stats
		txtfFuerzaInicio = new JTextField(String.valueOf(stats.get(0)));//campo de texto fuerza
		txtfFuerzaInicio.setEditable(false);
		txtfFuerzaInicio.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaInicio.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfFuerzaInicio.setBounds(243, 74, 102, 31);
		inicio.add(txtfFuerzaInicio);
		txtfFuerzaInicio.setColumns(10);
		
		txtfAgilidadInicio = new JTextField(String.valueOf(stats.get(1)));//campo de texto agilidad
		txtfAgilidadInicio.setEditable(false);
		txtfAgilidadInicio.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadInicio.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAgilidadInicio.setColumns(10);
		txtfAgilidadInicio.setBounds(391, 74, 102, 31);
		inicio.add(txtfAgilidadInicio);
		
		txtfAtaqueInicio = new JTextField(String.valueOf(stats.get(4)));//campo de texto ataque
		txtfAtaqueInicio.setEditable(false);
		txtfAtaqueInicio.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueInicio.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAtaqueInicio.setColumns(10);
		txtfAtaqueInicio.setBounds(872, 74, 102, 31);
		inicio.add(txtfAtaqueInicio);
		
		txtfVelocidadInicio = new JTextField(String.valueOf(stats.get(3)));//campo de texto velocidad
		txtfVelocidadInicio.setEditable(false);
		txtfVelocidadInicio.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadInicio.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfVelocidadInicio.setColumns(10);
		txtfVelocidadInicio.setBounds(733, 74, 102, 31);
		inicio.add(txtfVelocidadInicio);
		
		txtfPtosSaludInicio = new JTextField(String.valueOf(stats.get(2)));//campo de texto ps
		txtfPtosSaludInicio.setEditable(false);
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
		
		final JLabel lblBgInicio = new JLabel("");
		lblBgInicio.setIcon(new ImageIcon(img));
		lblBgInicio.setBounds(0, 0, 1264, 681);
		inicio.add(lblBgInicio);
		
		final JButton btnPreStatsJets = new JButton("Previsualizar");
		btnPreStatsJets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<JRadioButton> radiosJet = new ArrayList<JRadioButton>();
				radiosJet.add(rdbtnMj);
				radiosJet.add(rdbtnMs);
				radiosJet.add(rdbtnUj);
				
				ArrayList<JRadioButton> radiosComp = new ArrayList<JRadioButton>();
				radiosComp.add(rdbtnLaser);
				radiosComp.add(rdbtnCuerno);
				radiosComp.add(rdbtnLeche);
				
				ArrayList<JRadioButton> radiosMun = new ArrayList<JRadioButton>();
				radiosMun.add(rdbtnAndro);
				radiosMun.add(rdbtnOrion);
				radiosMun.add(rdbtnOsa);
				
				if ((lblFlag.isEnabled()) && (e.getSource()== btnPreStatsJets)) {
					
					lblFlag.setEnabled(false);
					
					btnComprarMj.setEnabled(false);
					btnComprarSj.setEnabled(false);
					btnComprarUj.setEnabled(false);
					btnComprarLaser.setEnabled(false);
					btnComprarCuerno.setEnabled(false);
					btnComprarLeche.setEnabled(false);
					btnComprarAndro.setEnabled(false);
					btnComprarOrion.setEnabled(false);
					btnComprarOsa.setEnabled(false);
					
					rdbtnMj.setEnabled(false);
					rdbtnMs.setEnabled(false);
					rdbtnUj.setEnabled(false);
					rdbtnLaser.setEnabled(false);
					rdbtnCuerno.setEnabled(false);
					rdbtnLeche.setEnabled(false);
					rdbtnAndro.setEnabled(false);
					rdbtnOrion.setEnabled(false);
					rdbtnOsa.setEnabled(false);
					
					
					actualizarTXTPreStats();	
					
					for (int i = 0; i <= radiosJet.size()-1; i++) {
						listaJets.get(i).resetearStats();
						listaComp.get(i).resetearStats();
						listaMundos.get(i).resetearStats();
					}
					
					for (int i = 0; i <= radiosJet.size()-1; i++) {
						if ((radiosJet.get(i)).isSelected()) {
							listaJets.get(i).previsualizar();
							listaJets.get(i).previsualizarStats();
						}
					}
					for (int i = 0; i <= radiosComp.size()-1; i++) {
						if ((radiosComp.get(i)).isSelected()) {
							listaComp.get(i).previsualizar();	
							listaComp.get(i).previsualizarStats();
						}
					}
					for (int i = 0; i <= radiosMun.size()-1; i++) {
						if ((radiosMun.get(i)).isSelected()) {
							listaMundos.get(i).previsualizar();	
							listaMundos.get(i).previsualizarStats();
						}
					}
					
					actualizarTXTPreStats();
					actualizarTXTStatsStSum();
					mostrarEtiquetasPre();		
					mostrarEtiquetasSt();
				}else {
					for (int i = 0; i <= radiosJet.size()-1; i++) {
						if ((radiosJet.get(i)).isSelected()) {
							listaJets.get(i).desprevisualizar();
							listaJets.get(i).desprevisualizarStats();
						}
					}
					for (int i = 0; i <= radiosComp.size()-1; i++) {
						if ((radiosComp.get(i)).isSelected()) {
							listaComp.get(i).desprevisualizar();	
							listaComp.get(i).desprevisualizarStats();
						}
					}
					for (int i = 0; i <= radiosMun.size()-1; i++) {
						if ((radiosMun.get(i)).isSelected()) {
							listaMundos.get(i).desprevisualizar();		
							listaMundos.get(i).desprevisualizarStats();
						}
					}
					lblFlag.setEnabled(true);
					
					btnComprarMj.setEnabled(true);
					btnComprarSj.setEnabled(true);
					btnComprarUj.setEnabled(true);
					btnComprarLaser.setEnabled(true);
					btnComprarCuerno.setEnabled(true);
					btnComprarLeche.setEnabled(true);
					btnComprarAndro.setEnabled(true);
					btnComprarOrion.setEnabled(true);
					btnComprarOsa.setEnabled(true);
					
					rdbtnMj.setEnabled(!(listaJets.get(0).getEquipado()));
					rdbtnMs.setEnabled(!(listaJets.get(1).getEquipado()));
					rdbtnUj.setEnabled(!(listaJets.get(2).getEquipado()));
					rdbtnLaser.setEnabled(!(listaComp.get(0).getEquipado()));
					rdbtnCuerno.setEnabled(!(listaComp.get(1).getEquipado()));
					rdbtnLeche.setEnabled(!(listaComp.get(2).getEquipado()));
					rdbtnAndro.setEnabled(!(listaMundos.get(0).getEquipado()));
					rdbtnOrion.setEnabled(!(listaMundos.get(1).getEquipado()));
					rdbtnOsa.setEnabled(!(listaMundos.get(2).getEquipado()));
					
					if (listaJets.get(0).getEquipado())rdbtnMj.setSelected(true);
					if (listaJets.get(1).getEquipado())rdbtnMs.setSelected(true);
					if (listaJets.get(2).getEquipado())rdbtnUj.setSelected(true);
					if (listaComp.get(0).getEquipado())rdbtnLaser.setSelected(true);
					if (listaComp.get(1).getEquipado())rdbtnCuerno.setSelected(true);
					if (listaComp.get(2).getEquipado())rdbtnLeche.setSelected(true);
					if (listaMundos.get(0).getEquipado())rdbtnAndro.setSelected(true);
					if (listaMundos.get(1).getEquipado())rdbtnOrion.setSelected(true);
					if (listaMundos.get(2).getEquipado())rdbtnOsa.setSelected(true);
					/*
					rdbtnMj.setEnabled(true);
					rdbtnMs.setEnabled(true);
					rdbtnUj.setEnabled(true);
					rdbtnLaser.setEnabled(true);
					rdbtnCuerno.setEnabled(true);
					rdbtnLeche.setEnabled(true);
					rdbtnAndro.setEnabled(true);
					rdbtnOrion.setEnabled(true);
					rdbtnOsa.setEnabled(true);
					
					rdbtnMj.setSelected(false);
					rdbtnMs.setSelected(false);
					rdbtnUj.setSelected(false);
					rdbtnLaser.setSelected(false);
					rdbtnCuerno.setSelected(false);
					rdbtnLeche.setSelected(false);
					rdbtnAndro.setSelected(false);
					rdbtnOrion.setSelected(false);
					rdbtnOsa.setSelected(false);*/
					
					actualizarTXTPreStats();
					actualizarTXTStatsStRes();
				}
			}
		});
		btnPreStatsJets.setToolTipText("Permite ver como se modificar\u00E1n los stats en caso de comprar el o los elementos");
		btnPreStatsJets.setForeground(new Color(0, 0, 128));
		btnPreStatsJets.setFont(new Font("Chiller", Font.BOLD, 30));
		btnPreStatsJets.setBounds(1033, 264, 186, 42);
		tiendaJets.add(btnPreStatsJets);
		

		
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
		lblNewLabel.setBounds(708, 299, 170, 58);
		tiendaJets.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" En inventario:");
		lblNewLabel_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_1.setBounds(708, 372, 170, 58);
		tiendaJets.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" En inventario:");
		lblNewLabel_2.setBackground(new Color(255, 250, 250));
		lblNewLabel_2.setForeground(new Color(255, 250, 250));
		lblNewLabel_2.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_2.setBounds(708, 445, 170, 58);
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
		
		
		
		
		//**************CAJAS DE TEXTO
		txtfFuerzaTJets = new JTextField(String.valueOf(stats.get(0)));//campo de texto fuerza
		txtfFuerzaTJets.setEditable(false);
		txtfFuerzaTJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaTJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfFuerzaTJets.setColumns(10);
		txtfFuerzaTJets.setBounds(243, 74, 102, 31);
		tiendaJets.add(txtfFuerzaTJets);
		
		txtfAgilidadTJets = new JTextField(String.valueOf(stats.get(1)));//campo de texto agilidad
		txtfAgilidadTJets.setEditable(false);
		txtfAgilidadTJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadTJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAgilidadTJets.setColumns(10);
		txtfAgilidadTJets.setBounds(391, 74, 102, 31);
		tiendaJets.add(txtfAgilidadTJets);
		
		txtfAtaqueTJets = new JTextField(String.valueOf(stats.get(4)));//campo de texto ataque
		txtfAtaqueTJets.setEditable(false);
		txtfAtaqueTJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueTJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAtaqueTJets.setColumns(10);
		txtfAtaqueTJets.setBounds(872, 74, 102, 31);
		tiendaJets.add(txtfAtaqueTJets);
		
		txtfVelocidadTJets = new JTextField(String.valueOf(stats.get(3)));//campo de texto velocidad
		txtfVelocidadTJets.setEditable(false);
		txtfVelocidadTJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadTJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfVelocidadTJets.setColumns(10);
		txtfVelocidadTJets.setBounds(733, 74, 102, 31);
		tiendaJets.add(txtfVelocidadTJets);
		
		txtfPtosSaludTJets = new JTextField(String.valueOf(stats.get(2)));//campo de texto ps
		txtfPtosSaludTJets.setEditable(false);
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
		
		txtfInventarioMj = new JTextField(String.valueOf(listaJets.get(0).enInventario()));//inventario en minijet
		txtfInventarioMj.setHorizontalAlignment(SwingConstants.CENTER);
		txtfInventarioMj.setForeground(new Color(75, 0, 130));
		txtfInventarioMj.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioMj.setBounds(888, 299, 63, 58);
		tiendaJets.add(txtfInventarioMj);
		txtfInventarioMj.setColumns(10);
		
		txtfInventarioSj = new JTextField(String.valueOf(listaJets.get(1).enInventario()));
		txtfInventarioSj.setHorizontalAlignment(SwingConstants.CENTER);
		txtfInventarioSj.setForeground(new Color(75, 0, 130));//inventario en super jet
		txtfInventarioSj.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioSj.setColumns(10);
		txtfInventarioSj.setBounds(888, 372, 63, 58);
		tiendaJets.add(txtfInventarioSj);
		
		
		txtfInventarioUj = new JTextField(String.valueOf(listaJets.get(2).enInventario()));//inventario ultra jet
		txtfInventarioUj.setHorizontalAlignment(SwingConstants.CENTER);
		txtfInventarioUj.setForeground(new Color(75, 0, 130));
		txtfInventarioUj.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioUj.setColumns(10);
		txtfInventarioUj.setBounds(888, 445, 63, 58);
		tiendaJets.add(txtfInventarioUj);
		
		
		//labels del prewiew
		txtfFuerzaTJetsPre =new JTextField(String.valueOf(stats.get(0)));
		txtfFuerzaTJetsPre.setForeground(new Color(0, 0, 128));
		txtfFuerzaTJetsPre.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaTJetsPre.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 35));
		txtfFuerzaTJetsPre.setEditable(false);
		txtfFuerzaTJetsPre.setColumns(10);
		txtfFuerzaTJetsPre.setBounds(243, 116, 56, 31);
		txtfFuerzaTJetsPre.setVisible(false);
		tiendaJets.add(txtfFuerzaTJetsPre);
		
		txtfAgilidadTJetsPre = new JTextField(String.valueOf(stats.get(0)));
		txtfAgilidadTJetsPre.setForeground(new Color(0, 0, 128));
		txtfAgilidadTJetsPre.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadTJetsPre.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 35));
		txtfAgilidadTJetsPre.setEditable(false);
		txtfAgilidadTJetsPre.setColumns(10);
		txtfAgilidadTJetsPre.setBounds(391, 116, 56, 31);
		txtfAgilidadTJetsPre.setVisible(false);
		tiendaJets.add(txtfAgilidadTJetsPre);
		
		txtfPtosSaludTJetsPre = new JTextField("15");
		txtfPtosSaludTJetsPre.setForeground(new Color(0, 0, 128));
		txtfPtosSaludTJetsPre.setHorizontalAlignment(SwingConstants.CENTER);
		txtfPtosSaludTJetsPre.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 35));
		txtfPtosSaludTJetsPre.setEditable(false);
		txtfPtosSaludTJetsPre.setColumns(10);
		txtfPtosSaludTJetsPre.setBounds(564, 116, 56, 31);
		txtfPtosSaludTJetsPre.setVisible(false);
		tiendaJets.add(txtfPtosSaludTJetsPre);
		
		txtfVelocidadTJetsPre = new JTextField("3");
		txtfVelocidadTJetsPre.setForeground(new Color(0, 0, 128));
		txtfVelocidadTJetsPre.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadTJetsPre.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 35));
		txtfVelocidadTJetsPre.setEditable(false);
		txtfVelocidadTJetsPre.setColumns(10);
		txtfVelocidadTJetsPre.setBounds(733, 116, 56, 31);
		txtfVelocidadTJetsPre.setVisible(false);
		tiendaJets.add(txtfVelocidadTJetsPre);
		
		txtfAtaqueTJetsPre = new JTextField("5");
		txtfAtaqueTJetsPre.setForeground(new Color(0, 0, 128));
		txtfAtaqueTJetsPre.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueTJetsPre.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 35));
		txtfAtaqueTJetsPre.setEditable(false);
		txtfAtaqueTJetsPre.setColumns(10);
		txtfAtaqueTJetsPre.setBounds(872, 116, 56, 31);
		txtfAtaqueTJetsPre.setVisible(false);
		tiendaJets.add(txtfAtaqueTJetsPre);
		
		txtfFuerzaTJetsSt = new JTextField();
		txtfFuerzaTJetsSt.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaTJetsSt.setFont(new Font("Chiller", Font.BOLD, 30));
		txtfFuerzaTJetsSt.setEditable(false);
		txtfFuerzaTJetsSt.setColumns(10);
		txtfFuerzaTJetsSt.setBounds(297, 116, 48, 31);
		txtfFuerzaTJetsSt.setVisible(false);
		tiendaJets.add(txtfFuerzaTJetsSt);
		
		txtfAgilidadTJetsSt = new JTextField();
		txtfAgilidadTJetsSt.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadTJetsSt.setFont(new Font("Chiller", Font.BOLD, 30));
		txtfAgilidadTJetsSt.setEditable(false);
		txtfAgilidadTJetsSt.setColumns(10);
		txtfAgilidadTJetsSt.setBounds(445, 116, 48, 31);
		txtfAgilidadTJetsSt.setVisible(false);
		tiendaJets.add(txtfAgilidadTJetsSt);
		
		txtfPtosSaludTJetsSt = new JTextField();
		txtfPtosSaludTJetsSt.setHorizontalAlignment(SwingConstants.CENTER);
		txtfPtosSaludTJetsSt.setFont(new Font("Chiller", Font.BOLD, 30));
		txtfPtosSaludTJetsSt.setEditable(false);
		txtfPtosSaludTJetsSt.setColumns(10);
		txtfPtosSaludTJetsSt.setBounds(618, 116, 48, 31);
		txtfPtosSaludTJetsSt.setVisible(false);
		tiendaJets.add(txtfPtosSaludTJetsSt);
		
		txtfVelocidadTJetsSt = new JTextField();
		txtfVelocidadTJetsSt.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadTJetsSt.setFont(new Font("Chiller", Font.BOLD, 30));
		txtfVelocidadTJetsSt.setEditable(false);
		txtfVelocidadTJetsSt.setColumns(10);
		txtfVelocidadTJetsSt.setBounds(787, 116, 48, 31);
		txtfVelocidadTJetsSt.setVisible(false);
		tiendaJets.add(txtfVelocidadTJetsSt);
		
		txtfAtaqueTJetsSt = new JTextField();
		txtfAtaqueTJetsSt.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueTJetsSt.setFont(new Font("Chiller", Font.BOLD, 30));
		txtfAtaqueTJetsSt.setEditable(false);
		txtfAtaqueTJetsSt.setColumns(10);
		txtfAtaqueTJetsSt.setBounds(926, 116, 48, 31);
		txtfAtaqueTJetsSt.setVisible(false);
		tiendaJets.add(txtfAtaqueTJetsSt);
		
		JLabel btnPvMj = new JLabel();
		btnPvMj.setBackground(new Color(255, 250, 250));
		btnPvMj.setFont(new Font("Chiller", Font.BOLD, 35));
		btnPvMj.setForeground(new Color(75, 0, 130));
		btnPvMj.setIcon(new ImageIcon(img));
		btnPvMj.setBounds(0, 0, 1264, 681);
		tiendaJets.add(btnPvMj);
				
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
		lblNewLabel_4.setBounds(751, 299, 170, 58);
		tiendaComplementos.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("En inventario:");
		lblNewLabel_1_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_1_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_1_1.setBounds(751, 372, 170, 58);
		tiendaComplementos.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("En inventario:");
		lblNewLabel_2_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_2_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_2_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_2_1.setBounds(751, 445, 170, 58);
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
		txtfFuerzaTComp.setEditable(false);
		txtfFuerzaTComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaTComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfFuerzaTComp.setColumns(10);
		txtfFuerzaTComp.setBounds(243, 74, 102, 31);
		tiendaComplementos.add(txtfFuerzaTComp);
		
		txtfAgilidadTComp = new JTextField(String.valueOf(stats.get(1)));//campo de texto agilidad
		txtfAgilidadTComp.setEditable(false);
		txtfAgilidadTComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadTComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAgilidadTComp.setColumns(10);
		txtfAgilidadTComp.setBounds(391, 74, 102, 31);
		tiendaComplementos.add(txtfAgilidadTComp);
		
		txtfAtaqueTComp = new JTextField(String.valueOf(stats.get(4)));//campo de texto ataque
		txtfAtaqueTComp.setEditable(false);
		txtfAtaqueTComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueTComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAtaqueTComp.setColumns(10);
		txtfAtaqueTComp.setBounds(872, 74, 102, 31);
		tiendaComplementos.add(txtfAtaqueTComp);
		
		txtfVelocidadTComp = new JTextField(String.valueOf(stats.get(3)));//campo de texto velocidad
		txtfVelocidadTComp.setEditable(false);
		txtfVelocidadTComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadTComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfVelocidadTComp.setColumns(10);
		txtfVelocidadTComp.setBounds(733, 74, 102, 31);
		tiendaComplementos.add(txtfVelocidadTComp);
		
		txtfPtosSaludTComp = new JTextField(String.valueOf(stats.get(2)));//campo de texto ps
		txtfPtosSaludTComp.setEditable(false);
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
		txtfInventarioLaser = new JTextField(String.valueOf(listaComp.get(0).enInventario()));//en inventario rayo láser
		txtfInventarioLaser.setHorizontalAlignment(SwingConstants.CENTER);
		txtfInventarioLaser.setForeground(new Color(75, 0, 130));
		txtfInventarioLaser.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioLaser.setColumns(10);
		txtfInventarioLaser.setBounds(931, 299, 63, 58);
		tiendaComplementos.add(txtfInventarioLaser);
		
		txtfInventarioCuerno = new JTextField(String.valueOf(listaComp.get(1).enInventario()));//en inventario cuerno de taurus
		txtfInventarioCuerno.setHorizontalAlignment(SwingConstants.CENTER);
		txtfInventarioCuerno.setForeground(new Color(75, 0, 130));
		txtfInventarioCuerno.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioCuerno.setColumns(10);
		txtfInventarioCuerno.setBounds(931, 372, 63, 58);
		tiendaComplementos.add(txtfInventarioCuerno);
		
		txtfInventarioLeche = new JTextField(String.valueOf(listaComp.get(2).enInventario()));//en inventario  via lactea
		txtfInventarioLeche.setHorizontalAlignment(SwingConstants.CENTER);
		txtfInventarioLeche.setForeground(new Color(75, 0, 130));
		txtfInventarioLeche.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioLeche.setColumns(10);
		txtfInventarioLeche.setBounds(931, 445, 63, 58);
		tiendaComplementos.add(txtfInventarioLeche);
			
		txtfFuerzaTCompPre = new JTextField("4");
		txtfFuerzaTCompPre.setForeground(new Color(0, 0, 128));
		txtfFuerzaTCompPre.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaTCompPre.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 35));
		txtfFuerzaTCompPre.setEditable(false);
		txtfFuerzaTCompPre.setColumns(10);
		txtfFuerzaTCompPre.setBounds(243, 116, 56, 31);
		txtfFuerzaTCompPre.setVisible(false);
		tiendaComplementos.add(txtfFuerzaTCompPre);
		
		txtfAgilidadTCompPre = new JTextField("2");
		txtfAgilidadTCompPre.setForeground(new Color(0, 0, 128));
		txtfAgilidadTCompPre.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadTCompPre.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 35));
		txtfAgilidadTCompPre.setEditable(false);
		txtfAgilidadTCompPre.setColumns(10);
		txtfAgilidadTCompPre.setBounds(391, 116, 56, 31);
		txtfAgilidadTCompPre.setVisible(false);
		tiendaComplementos.add(txtfAgilidadTCompPre);
		
		txtfPtosSaludTCompPre = new JTextField("15");
		txtfPtosSaludTCompPre.setForeground(new Color(0, 0, 128));
		txtfPtosSaludTCompPre.setHorizontalAlignment(SwingConstants.CENTER);
		txtfPtosSaludTCompPre.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 35));
		txtfPtosSaludTCompPre.setEditable(false);
		txtfPtosSaludTCompPre.setColumns(10);
		txtfPtosSaludTCompPre.setBounds(564, 116, 56, 31);
		txtfPtosSaludTCompPre.setVisible(false);
		tiendaComplementos.add(txtfPtosSaludTCompPre);
		
		txtfVelocidadTCompPre = new JTextField("3");
		txtfVelocidadTCompPre.setForeground(new Color(0, 0, 128));
		txtfVelocidadTCompPre.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadTCompPre.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 35));
		txtfVelocidadTCompPre.setEditable(false);
		txtfVelocidadTCompPre.setColumns(10);
		txtfVelocidadTCompPre.setBounds(733, 116, 56, 31);
		txtfVelocidadTCompPre.setVisible(false);
		tiendaComplementos.add(txtfVelocidadTCompPre);
		
		txtfAtaqueTCompPre = new JTextField("5");
		txtfAtaqueTCompPre.setForeground(new Color(0, 0, 128));
		txtfAtaqueTCompPre.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueTCompPre.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 35));
		txtfAtaqueTCompPre.setEditable(false);
		txtfAtaqueTCompPre.setColumns(10);
		txtfAtaqueTCompPre.setBounds(872, 116, 56, 31);
		txtfAtaqueTCompPre.setVisible(false);
		tiendaComplementos.add(txtfAtaqueTCompPre);
		
		txtfFuerzaTCompSt = new JTextField();
		txtfFuerzaTCompSt.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaTCompSt.setEditable(false);
		txtfFuerzaTCompSt.setFont(new Font("Chiller", Font.BOLD, 30));
		txtfFuerzaTCompSt.setColumns(10);
		txtfFuerzaTCompSt.setBounds(298, 116, 48, 31);
		txtfFuerzaTCompSt.setVisible(false);
		tiendaComplementos.add(txtfFuerzaTCompSt);
		
		txtfAgilidadTCompSt = new JTextField();
		txtfAgilidadTCompSt.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadTCompSt.setEditable(false);
		txtfAgilidadTCompSt.setFont(new Font("Chiller", Font.BOLD, 30));
		txtfAgilidadTCompSt.setColumns(10);
		txtfAgilidadTCompSt.setBounds(445, 116, 48, 31);
		txtfAgilidadTCompSt.setVisible(false);
		tiendaComplementos.add(txtfAgilidadTCompSt);
		
		txtfPtosSaludTCompSt = new JTextField();
		txtfPtosSaludTCompSt.setHorizontalAlignment(SwingConstants.CENTER);
		txtfPtosSaludTCompSt.setEditable(false);
		txtfPtosSaludTCompSt.setFont(new Font("Chiller", Font.BOLD, 30));
		txtfPtosSaludTCompSt.setColumns(10);
		txtfPtosSaludTCompSt.setBounds(618, 116, 48, 31);
		txtfPtosSaludTCompSt.setVisible(false);
		tiendaComplementos.add(txtfPtosSaludTCompSt);
		
		txtfVelocidadTCompSt = new JTextField();
		txtfVelocidadTCompSt.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadTCompSt.setEditable(false);
		txtfVelocidadTCompSt.setFont(new Font("Chiller", Font.BOLD, 30));
		txtfVelocidadTCompSt.setColumns(10);
		txtfVelocidadTCompSt.setBounds(787, 116, 48, 31);
		txtfVelocidadTCompSt.setVisible(false);
		tiendaComplementos.add(txtfVelocidadTCompSt);
		
		txtfAtaqueTCompSt = new JTextField();
		txtfAtaqueTCompSt.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueTCompSt.setEditable(false);
		txtfAtaqueTCompSt.setFont(new Font("Chiller", Font.BOLD, 30));
		txtfAtaqueTCompSt.setColumns(10);
		txtfAtaqueTCompSt.setBounds(926, 116, 48, 31);
		txtfAtaqueTCompSt.setVisible(false);
		tiendaComplementos.add(txtfAtaqueTCompSt);
		
		final JButton btnPreStatsComp = new JButton("Previsualizar");
		btnPreStatsComp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<JRadioButton> radiosJet = new ArrayList<JRadioButton>();
				radiosJet.add(rdbtnMj);
				radiosJet.add(rdbtnMs);
				radiosJet.add(rdbtnUj);
				
				ArrayList<JRadioButton> radiosComp = new ArrayList<JRadioButton>();
				radiosComp.add(rdbtnLaser);
				radiosComp.add(rdbtnCuerno);
				radiosComp.add(rdbtnLeche);
				
				ArrayList<JRadioButton> radiosMun = new ArrayList<JRadioButton>();
				radiosMun.add(rdbtnAndro);
				radiosMun.add(rdbtnOrion);
				radiosMun.add(rdbtnOsa);
				
				if ((lblFlag.isEnabled()) && (e.getSource()== btnPreStatsComp)) {
					
					lblFlag.setEnabled(false);
					
					btnComprarMj.setEnabled(false);
					btnComprarSj.setEnabled(false);
					btnComprarUj.setEnabled(false);
					btnComprarLaser.setEnabled(false);
					btnComprarCuerno.setEnabled(false);
					btnComprarLeche.setEnabled(false);
					btnComprarAndro.setEnabled(false);
					btnComprarOrion.setEnabled(false);
					btnComprarOsa.setEnabled(false);
					
					rdbtnMj.setEnabled(false);
					rdbtnMs.setEnabled(false);
					rdbtnUj.setEnabled(false);
					rdbtnLaser.setEnabled(false);
					rdbtnCuerno.setEnabled(false);
					rdbtnLeche.setEnabled(false);
					rdbtnAndro.setEnabled(false);
					rdbtnOrion.setEnabled(false);
					rdbtnOsa.setEnabled(false);
					
					
					actualizarTXTPreStats();	
					
					for (int i = 0; i <= radiosJet.size()-1; i++) {
						listaJets.get(i).resetearStats();
						listaComp.get(i).resetearStats();
						listaMundos.get(i).resetearStats();
					}
					
					for (int i = 0; i <= radiosJet.size()-1; i++) {
						if ((radiosJet.get(i)).isSelected()) {
							listaJets.get(i).previsualizar();
							listaJets.get(i).previsualizarStats();
						}
					}
					for (int i = 0; i <= radiosComp.size()-1; i++) {
						if ((radiosComp.get(i)).isSelected()) {
							listaComp.get(i).previsualizar();	
							listaComp.get(i).previsualizarStats();
						}
					}
					for (int i = 0; i <= radiosMun.size()-1; i++) {
						if ((radiosMun.get(i)).isSelected()) {
							listaMundos.get(i).previsualizar();	
							listaMundos.get(i).previsualizarStats();
						}
					}
					
					actualizarTXTPreStats();
					actualizarTXTStatsStSum();
					mostrarEtiquetasPre();		
					mostrarEtiquetasSt();
				}else {
					for (int i = 0; i <= radiosJet.size()-1; i++) {
						if ((radiosJet.get(i)).isSelected()) {
							listaJets.get(i).desprevisualizar();
							listaJets.get(i).desprevisualizarStats();
						}
					}
					for (int i = 0; i <= radiosComp.size()-1; i++) {
						if ((radiosComp.get(i)).isSelected()) {
							listaComp.get(i).desprevisualizar();	
							listaComp.get(i).desprevisualizarStats();
						}
					}
					for (int i = 0; i <= radiosMun.size()-1; i++) {
						if ((radiosMun.get(i)).isSelected()) {
							listaMundos.get(i).desprevisualizar();		
							listaMundos.get(i).desprevisualizarStats();
						}
					}
					lblFlag.setEnabled(true);
					
					btnComprarMj.setEnabled(true);
					btnComprarSj.setEnabled(true);
					btnComprarUj.setEnabled(true);
					btnComprarLaser.setEnabled(true);
					btnComprarCuerno.setEnabled(true);
					btnComprarLeche.setEnabled(true);
					btnComprarAndro.setEnabled(true);
					btnComprarOrion.setEnabled(true);
					btnComprarOsa.setEnabled(true);
					
					rdbtnMj.setEnabled(!(listaJets.get(0).getEquipado()));
					rdbtnMs.setEnabled(!(listaJets.get(1).getEquipado()));
					rdbtnUj.setEnabled(!(listaJets.get(2).getEquipado()));
					rdbtnLaser.setEnabled(!(listaComp.get(0).getEquipado()));
					rdbtnCuerno.setEnabled(!(listaComp.get(1).getEquipado()));
					rdbtnLeche.setEnabled(!(listaComp.get(2).getEquipado()));
					rdbtnAndro.setEnabled(!(listaMundos.get(0).getEquipado()));
					rdbtnOrion.setEnabled(!(listaMundos.get(1).getEquipado()));
					rdbtnOsa.setEnabled(!(listaMundos.get(2).getEquipado()));
					
					if (listaJets.get(0).getEquipado())rdbtnMj.setSelected(true);
					if (listaJets.get(1).getEquipado())rdbtnMs.setSelected(true);
					if (listaJets.get(2).getEquipado())rdbtnUj.setSelected(true);
					if (listaComp.get(0).getEquipado())rdbtnLaser.setSelected(true);
					if (listaComp.get(1).getEquipado())rdbtnCuerno.setSelected(true);
					if (listaComp.get(2).getEquipado())rdbtnLeche.setSelected(true);
					if (listaMundos.get(0).getEquipado())rdbtnAndro.setSelected(true);
					if (listaMundos.get(1).getEquipado())rdbtnOrion.setSelected(true);
					if (listaMundos.get(2).getEquipado())rdbtnOsa.setSelected(true);
					/*
					rdbtnMj.setEnabled(true);
					rdbtnMs.setEnabled(true);
					rdbtnUj.setEnabled(true);
					rdbtnLaser.setEnabled(true);
					rdbtnCuerno.setEnabled(true);
					rdbtnLeche.setEnabled(true);
					rdbtnAndro.setEnabled(true);
					rdbtnOrion.setEnabled(true);
					rdbtnOsa.setEnabled(true);
					
					rdbtnMj.setSelected(false);
					rdbtnMs.setSelected(false);
					rdbtnUj.setSelected(false);
					rdbtnLaser.setSelected(false);
					rdbtnCuerno.setSelected(false);
					rdbtnLeche.setSelected(false);
					rdbtnAndro.setSelected(false);
					rdbtnOrion.setSelected(false);
					rdbtnOsa.setSelected(false);*/
					
					actualizarTXTPreStats();
					actualizarTXTStatsStRes();
				}
			}
		});
		btnPreStatsComp.setToolTipText("Permite ver como se modificar\u00E1n los stats en caso de comprar el o los elementos");
		btnPreStatsComp.setForeground(new Color(0, 0, 128));
		btnPreStatsComp.setFont(new Font("Chiller", Font.BOLD, 30));
		btnPreStatsComp.setBounds(1033, 264, 186, 42);
		tiendaComplementos.add(btnPreStatsComp);
		
		
		
		JLabel lblBgTComp = new JLabel();
		lblBgTComp.setIcon(new ImageIcon(img));
		lblBgTComp.setForeground(new Color(75, 0, 130));
		lblBgTComp.setFont(new Font("Chiller", Font.BOLD, 35));
		lblBgTComp.setBackground(new Color(255, 250, 250));//posición del fondo
		lblBgTComp.setBounds(0, 0, 1264, 681);
		tiendaComplementos.add(lblBgTComp);
		//**************************************************************************************************************
		//**************************************************************************************************************
		//*************************************** PANEL DE TIENDA MUNDOS ***********************************************
		//**************************************************************************************************************
		//**************************************************************************************************************
		//**************ETIQUETAS
		//TITULO		
		JLabel lblTituTMun = new JLabel("MUNDOS");
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
		lblNewLabel_4_1.setBounds(694, 299, 170, 58);
		tiendaMundos.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("En inventario:");
		lblNewLabel_1_1_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_1_1_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_1_1_1.setBounds(694, 372, 170, 58);
		tiendaMundos.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("En inventario:");
		lblNewLabel_2_1_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_2_1_1.setFont(new Font("Chiller", Font.BOLD, 35));
		lblNewLabel_2_1_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_2_1_1.setBounds(694, 445, 170, 58);
		tiendaMundos.add(lblNewLabel_2_1_1);
		
		/*Fondo de pantalla de tienda mundos*/
		
		//**************CAJAS DE TEXTO
		
		//CAJAS DE TEXTO DE LOS STATS
		txtfFuerzaTMun = new JTextField(String.valueOf(stats.get(0)));//campo de texto fuerza
		txtfFuerzaTMun.setEditable(false);
		txtfFuerzaTMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaTMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfFuerzaTMun.setColumns(10);
		txtfFuerzaTMun.setBounds(243, 74, 102, 31);
		tiendaMundos.add(txtfFuerzaTMun);
		
		txtfAgilidadTMun = new JTextField(String.valueOf(stats.get(1)));//campo de texto agilidad
		txtfAgilidadTMun.setEditable(false);
		txtfAgilidadTMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadTMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAgilidadTMun.setColumns(10);
		txtfAgilidadTMun.setBounds(391, 74, 102, 31);
		tiendaMundos.add(txtfAgilidadTMun);
		
		txtfAtaqueTMun = new JTextField(String.valueOf(stats.get(4)));//campo de texto ataque
		txtfAtaqueTMun.setEditable(false);
		txtfAtaqueTMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueTMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAtaqueTMun.setColumns(10);
		txtfAtaqueTMun.setBounds(872, 74, 102, 31);
		tiendaMundos.add(txtfAtaqueTMun);
		
		txtfVelocidadTMun = new JTextField(String.valueOf(stats.get(3)));//campo de texto velocidad
		txtfVelocidadTMun.setEditable(false);
		txtfVelocidadTMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadTMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfVelocidadTMun.setColumns(10);
		txtfVelocidadTMun.setBounds(733, 74, 102, 31);
		tiendaMundos.add(txtfVelocidadTMun);
		
		txtfPtosSaludTMun = new JTextField(String.valueOf(stats.get(2)));//campo de texto ps
		txtfPtosSaludTMun.setEditable(false);
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
		
		txtfInventarioAndro = new JTextField(String.valueOf(listaMundos.get(0).enInventario()));//en inventario andromeda
		txtfInventarioAndro.setHorizontalAlignment(SwingConstants.CENTER);
		txtfInventarioAndro.setForeground(new Color(75, 0, 130));
		txtfInventarioAndro.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioAndro.setColumns(10);
		txtfInventarioAndro.setBounds(874, 299, 63, 58);
		tiendaMundos.add(txtfInventarioAndro);
		
		txtfInventarioOrion = new JTextField(String.valueOf(listaMundos.get(1).enInventario()));//en inventario orión
		txtfInventarioOrion.setHorizontalAlignment(SwingConstants.CENTER);
		txtfInventarioOrion.setForeground(new Color(75, 0, 130));
		txtfInventarioOrion.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioOrion.setColumns(10);
		txtfInventarioOrion.setBounds(874, 372, 63, 58);
		tiendaMundos.add(txtfInventarioOrion);
		
		txtfInventarioOsa = new JTextField(String.valueOf(listaMundos.get(2).enInventario()));//en inventario osa mayor
		txtfInventarioOsa.setHorizontalAlignment(SwingConstants.CENTER);
		txtfInventarioOsa.setForeground(new Color(75, 0, 130));
		txtfInventarioOsa.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfInventarioOsa.setColumns(10);
		txtfInventarioOsa.setBounds(874, 445, 63, 58);
		tiendaMundos.add(txtfInventarioOsa);
		

		
		//********************BOTONES 
		
		
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
		
		final JButton btnSalirTMun = new JButton("Salir");
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
		
		final JButton btnPreStatsJetsMun = new JButton("Previsualizar");	
		btnPreStatsJetsMun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<JRadioButton> radiosJet = new ArrayList<JRadioButton>();
				radiosJet.add(rdbtnMj);
				radiosJet.add(rdbtnMs);
				radiosJet.add(rdbtnUj);
				
				ArrayList<JRadioButton> radiosComp = new ArrayList<JRadioButton>();
				radiosComp.add(rdbtnLaser);
				radiosComp.add(rdbtnCuerno);
				radiosComp.add(rdbtnLeche);
				
				ArrayList<JRadioButton> radiosMun = new ArrayList<JRadioButton>();
				radiosMun.add(rdbtnAndro);
				radiosMun.add(rdbtnOrion);
				radiosMun.add(rdbtnOsa);
				
				if ((lblFlag.isEnabled()) && (e.getSource()== btnPreStatsJetsMun)) {
					
					lblFlag.setEnabled(false);
					
					btnComprarMj.setEnabled(false);
					btnComprarSj.setEnabled(false);
					btnComprarUj.setEnabled(false);
					btnComprarLaser.setEnabled(false);
					btnComprarCuerno.setEnabled(false);
					btnComprarLeche.setEnabled(false);
					btnComprarAndro.setEnabled(false);
					btnComprarOrion.setEnabled(false);
					btnComprarOsa.setEnabled(false);
					
					rdbtnMj.setEnabled(false);
					rdbtnMs.setEnabled(false);
					rdbtnUj.setEnabled(false);
					rdbtnLaser.setEnabled(false);
					rdbtnCuerno.setEnabled(false);
					rdbtnLeche.setEnabled(false);
					rdbtnAndro.setEnabled(false);
					rdbtnOrion.setEnabled(false);
					rdbtnOsa.setEnabled(false);
					
					
					actualizarTXTPreStats();	
					
					for (int i = 0; i <= radiosJet.size()-1; i++) {
						listaJets.get(i).resetearStats();
						listaComp.get(i).resetearStats();
						listaMundos.get(i).resetearStats();
					}
					
					for (int i = 0; i <= radiosJet.size()-1; i++) {
						if ((radiosJet.get(i)).isSelected()) {
							listaJets.get(i).previsualizar();
							listaJets.get(i).previsualizarStats();
						}
					}
					for (int i = 0; i <= radiosComp.size()-1; i++) {
						if ((radiosComp.get(i)).isSelected()) {
							listaComp.get(i).previsualizar();	
							listaComp.get(i).previsualizarStats();
						}
					}
					for (int i = 0; i <= radiosMun.size()-1; i++) {
						if ((radiosMun.get(i)).isSelected()) {
							listaMundos.get(i).previsualizar();	
							listaMundos.get(i).previsualizarStats();
						}
					}
					
					actualizarTXTPreStats();
					actualizarTXTStatsStSum();
					mostrarEtiquetasPre();		
					mostrarEtiquetasSt();
				}else {
					for (int i = 0; i <= radiosJet.size()-1; i++) {
						if ((radiosJet.get(i)).isSelected()) {
							listaJets.get(i).desprevisualizar();
							listaJets.get(i).desprevisualizarStats();
						}
					}
					for (int i = 0; i <= radiosComp.size()-1; i++) {
						if ((radiosComp.get(i)).isSelected()) {
							listaComp.get(i).desprevisualizar();	
							listaComp.get(i).desprevisualizarStats();
						}
					}
					for (int i = 0; i <= radiosMun.size()-1; i++) {
						if ((radiosMun.get(i)).isSelected()) {
							listaMundos.get(i).desprevisualizar();		
							listaMundos.get(i).desprevisualizarStats();
						}
					}
					lblFlag.setEnabled(true);
					
					btnComprarMj.setEnabled(true);
					btnComprarSj.setEnabled(true);
					btnComprarUj.setEnabled(true);
					btnComprarLaser.setEnabled(true);
					btnComprarCuerno.setEnabled(true);
					btnComprarLeche.setEnabled(true);
					btnComprarAndro.setEnabled(true);
					btnComprarOrion.setEnabled(true);
					btnComprarOsa.setEnabled(true);
					rdbtnMj.setEnabled(!(listaJets.get(0).getEquipado()));
					rdbtnMs.setEnabled(!(listaJets.get(1).getEquipado()));
					rdbtnUj.setEnabled(!(listaJets.get(2).getEquipado()));
					rdbtnLaser.setEnabled(!(listaComp.get(0).getEquipado()));
					rdbtnCuerno.setEnabled(!(listaComp.get(1).getEquipado()));
					rdbtnLeche.setEnabled(!(listaComp.get(2).getEquipado()));
					rdbtnAndro.setEnabled(!(listaMundos.get(0).getEquipado()));
					rdbtnOrion.setEnabled(!(listaMundos.get(1).getEquipado()));
					rdbtnOsa.setEnabled(!(listaMundos.get(2).getEquipado()));
					
					if (listaJets.get(0).getEquipado())rdbtnMj.setSelected(true);
					if (listaJets.get(1).getEquipado())rdbtnMs.setSelected(true);
					if (listaJets.get(2).getEquipado())rdbtnUj.setSelected(true);
					if (listaComp.get(0).getEquipado())rdbtnLaser.setSelected(true);
					if (listaComp.get(1).getEquipado())rdbtnCuerno.setSelected(true);
					if (listaComp.get(2).getEquipado())rdbtnLeche.setSelected(true);
					if (listaMundos.get(0).getEquipado())rdbtnAndro.setSelected(true);
					if (listaMundos.get(1).getEquipado())rdbtnOrion.setSelected(true);
					if (listaMundos.get(2).getEquipado())rdbtnOsa.setSelected(true);
					/*
					rdbtnMj.setEnabled(true);
					rdbtnMs.setEnabled(true);
					rdbtnUj.setEnabled(true);
					rdbtnLaser.setEnabled(true);
					rdbtnCuerno.setEnabled(true);
					rdbtnLeche.setEnabled(true);
					rdbtnAndro.setEnabled(true);
					rdbtnOrion.setEnabled(true);
					rdbtnOsa.setEnabled(true);
					
					rdbtnMj.setSelected(false);
					rdbtnMs.setSelected(false);
					rdbtnUj.setSelected(false);
					rdbtnLaser.setSelected(false);
					rdbtnCuerno.setSelected(false);
					rdbtnLeche.setSelected(false);
					rdbtnAndro.setSelected(false);
					rdbtnOrion.setSelected(false);
					rdbtnOsa.setSelected(false);
					*/
					actualizarTXTPreStats();
					actualizarTXTStatsStRes();
				}
			}
		});
		btnPreStatsJetsMun.setToolTipText("Permite ver como se modificar\u00E1n los stats en caso de comprar el o los elementos");
		btnPreStatsJetsMun.setForeground(new Color(0, 0, 128));
		btnPreStatsJetsMun.setFont(new Font("Chiller", Font.BOLD, 30));
		btnPreStatsJetsMun.setBounds(1033, 264, 186, 42);
		tiendaMundos.add(btnPreStatsJetsMun);
		
		txtfFuerzaTMunPre = new JTextField("4");
		txtfFuerzaTMunPre.setForeground(new Color(0, 0, 128));
		txtfFuerzaTMunPre.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaTMunPre.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 35));
		txtfFuerzaTMunPre.setEditable(false);
		txtfFuerzaTMunPre.setColumns(10);
		txtfFuerzaTMunPre.setBounds(243, 116, 56, 31);
		txtfFuerzaTMunPre.setVisible(false);
		tiendaMundos.add(txtfFuerzaTMunPre);
		
		txtfAgilidadTMunPre = new JTextField("2");
		txtfAgilidadTMunPre.setForeground(new Color(0, 0, 128));
		txtfAgilidadTMunPre.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadTMunPre.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 35));
		txtfAgilidadTMunPre.setEditable(false);
		txtfAgilidadTMunPre.setColumns(10);
		txtfAgilidadTMunPre.setBounds(391, 116, 56, 31);
		txtfAgilidadTMunPre.setVisible(false);
		tiendaMundos.add(txtfAgilidadTMunPre);
		
		txtfPtosSaludTMunPre = new JTextField("15");
		txtfPtosSaludTMunPre.setForeground(new Color(0, 0, 128));
		txtfPtosSaludTMunPre.setHorizontalAlignment(SwingConstants.CENTER);
		txtfPtosSaludTMunPre.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 35));
		txtfPtosSaludTMunPre.setEditable(false);
		txtfPtosSaludTMunPre.setColumns(10);
		txtfPtosSaludTMunPre.setBounds(564, 116, 56, 31);
		txtfPtosSaludTMunPre.setVisible(false);
		tiendaMundos.add(txtfPtosSaludTMunPre);
		
		txtfVelocidadTMunPre = new JTextField("3");
		txtfVelocidadTMunPre.setForeground(new Color(0, 0, 128));
		txtfVelocidadTMunPre.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadTMunPre.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 35));
		txtfVelocidadTMunPre.setEditable(false);
		txtfVelocidadTMunPre.setColumns(10);
		txtfVelocidadTMunPre.setBounds(733, 116, 56, 31);
		txtfVelocidadTMunPre.setVisible(false);
		tiendaMundos.add(txtfVelocidadTMunPre);
		
		txtfAtaqueTMunPre = new JTextField("5");
		txtfAtaqueTMunPre.setForeground(new Color(0, 0, 128));
		txtfAtaqueTMunPre.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueTMunPre.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 35));
		txtfAtaqueTMunPre.setEditable(false);
		txtfAtaqueTMunPre.setColumns(10);
		txtfAtaqueTMunPre.setBounds(872, 116, 56, 31);
		txtfAtaqueTMunPre.setVisible(false);
		tiendaMundos.add(txtfAtaqueTMunPre);
		
		txtfFuerzaTMunSt = new JTextField();
		txtfFuerzaTMunSt.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaTMunSt.setEditable(false);
		txtfFuerzaTMunSt.setFont(new Font("Chiller", Font.BOLD, 30));
		txtfFuerzaTMunSt.setColumns(10);
		txtfFuerzaTMunSt.setBounds(297, 116, 48, 31);
		txtfFuerzaTMunSt.setVisible(false);
		tiendaMundos.add(txtfFuerzaTMunSt);
		
		txtfAgilidadTMunSt = new JTextField();
		txtfAgilidadTMunSt.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadTMunSt.setEditable(false);
		txtfAgilidadTMunSt.setFont(new Font("Chiller", Font.BOLD, 30));
		txtfAgilidadTMunSt.setColumns(10);
		txtfAgilidadTMunSt.setBounds(443, 116, 48, 31);
		txtfAgilidadTMunSt.setVisible(false);
		tiendaMundos.add(txtfAgilidadTMunSt);
		
		txtfPtosSaludTMunSt = new JTextField();
		txtfPtosSaludTMunSt.setHorizontalAlignment(SwingConstants.CENTER);
		txtfPtosSaludTMunSt.setEditable(false);
		txtfPtosSaludTMunSt.setFont(new Font("Chiller", Font.BOLD, 30));
		txtfPtosSaludTMunSt.setColumns(10);
		txtfPtosSaludTMunSt.setBounds(616, 116, 48, 31);
		txtfPtosSaludTMunSt.setVisible(false);
		tiendaMundos.add(txtfPtosSaludTMunSt);
		
		txtfVelocidadTMunSt = new JTextField();
		txtfVelocidadTMunSt.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadTMunSt.setEditable(false);
		txtfVelocidadTMunSt.setFont(new Font("Chiller", Font.BOLD, 30));
		txtfVelocidadTMunSt.setColumns(10);
		txtfVelocidadTMunSt.setBounds(787, 116, 48, 31);
		txtfVelocidadTMunSt.setVisible(false);
		tiendaMundos.add(txtfVelocidadTMunSt);
		
		txtfAtaqueTMunSt = new JTextField();
		txtfAtaqueTMunSt.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueTMunSt.setEditable(false);
		txtfAtaqueTMunSt.setFont(new Font("Chiller", Font.BOLD, 30));
		txtfAtaqueTMunSt.setColumns(10);
		txtfAtaqueTMunSt.setBounds(926, 116, 48, 31);
		txtfAtaqueTMunSt.setVisible(false);
		tiendaMundos.add(txtfAtaqueTMunSt);
		
		
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
		
		
		//******************************CAJAS DE TEXTO
		
		//STATS
		txtfFuerzaInvJets = new JTextField(String.valueOf(stats.get(0)));
		txtfFuerzaInvJets.setEditable(false);
		txtfFuerzaInvJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaInvJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfFuerzaInvJets.setColumns(10);
		txtfFuerzaInvJets.setBounds(243, 74, 102, 31);
		inventarioJets.add(txtfFuerzaInvJets);
		
		txtfAgilidadInvJets = new JTextField(String.valueOf(stats.get(1)));
		txtfAgilidadInvJets.setEditable(false);
		txtfAgilidadInvJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadInvJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAgilidadInvJets.setColumns(10);
		txtfAgilidadInvJets.setBounds(391, 74, 102, 31);
		inventarioJets.add(txtfAgilidadInvJets);
		
		txtfAtaqueInvJets = new JTextField(String.valueOf(stats.get(4)));
		txtfAtaqueInvJets.setEditable(false);
		txtfAtaqueInvJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueInvJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAtaqueInvJets.setColumns(10);
		txtfAtaqueInvJets.setBounds(872, 74, 102, 31);
		inventarioJets.add(txtfAtaqueInvJets);
		
		txtfVelocidadInvJets = new JTextField(String.valueOf(stats.get(3)));
		txtfVelocidadInvJets.setEditable(false);
		txtfVelocidadInvJets.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadInvJets.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfVelocidadInvJets.setColumns(10);
		txtfVelocidadInvJets.setBounds(733, 74, 102, 31);
		inventarioJets.add(txtfVelocidadInvJets);
		
		txtfPtosSaludInvJets = new JTextField(String.valueOf(stats.get(2)));
		txtfPtosSaludInvJets.setEditable(false);
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
		txtfFuerzaInvComp.setEditable(false);
		txtfFuerzaInvComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaInvComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfFuerzaInvComp.setColumns(10);
		txtfFuerzaInvComp.setBounds(243, 74, 102, 31);
		inventarioComplementos.add(txtfFuerzaInvComp);
		
		txtfAgilidadInvComp = new JTextField(String.valueOf(stats.get(1)));//campo de texto agilidad
		txtfAgilidadInvComp.setEditable(false);
		txtfAgilidadInvComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadInvComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAgilidadInvComp.setColumns(10);
		txtfAgilidadInvComp.setBounds(391, 74, 102, 31);
		inventarioComplementos.add(txtfAgilidadInvComp);
		
		txtfAtaqueInvComp = new JTextField(String.valueOf(stats.get(4)));//campo de texto ataque
		txtfAtaqueInvComp.setEditable(false);
		txtfAtaqueInvComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaqueInvComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAtaqueInvComp.setColumns(10);
		txtfAtaqueInvComp.setBounds(872, 74, 102, 31);
		inventarioComplementos.add(txtfAtaqueInvComp);
		
		txtfVelocidadInvComp = new JTextField(String.valueOf(stats.get(3)));//campo de texto velocidad
		txtfVelocidadInvComp.setEditable(false);
		txtfVelocidadInvComp.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadInvComp.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfVelocidadInvComp.setColumns(10);
		txtfVelocidadInvComp.setBounds(733, 74, 102, 31);
		inventarioComplementos.add(txtfVelocidadInvComp);
		
		txtfPtosSaludInvComp = new JTextField(String.valueOf(stats.get(2)));//campo de texto ps
		txtfPtosSaludInvComp.setEditable(false);
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
		JLabel lblTituInvMun = new JLabel("MUNDOS");
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
		
		//**************CAJAS DE TEXTO
		
		//CAJAS DE TEXTO DE LOS STATS
		txtfFuerzaInvMun = new JTextField(String.valueOf(stats.get(0)));//campo de texto fuerza
		txtfFuerzaInvMun.setEditable(false);
		txtfFuerzaInvMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfFuerzaInvMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfFuerzaInvMun.setColumns(10);
		txtfFuerzaInvMun.setBounds(243, 74, 102, 31);
		inventarioMundos.add(txtfFuerzaInvMun);
		
		txtfAgilidadInvMun = new JTextField(String.valueOf(stats.get(1)));//campo de texto agilidad
		txtfAgilidadInvMun.setEditable(false);
		txtfAgilidadInvMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAgilidadInvMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAgilidadInvMun.setColumns(10);
		txtfAgilidadInvMun.setBounds(391, 74, 102, 31);
		inventarioMundos.add(txtfAgilidadInvMun);
		
		txtfAtaquesInvMun = new JTextField(String.valueOf(stats.get(4)));//campo de texto ataque
		txtfAtaquesInvMun.setEditable(false);
		txtfAtaquesInvMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfAtaquesInvMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfAtaquesInvMun.setColumns(10);
		txtfAtaquesInvMun.setBounds(872, 74, 102, 31);
		inventarioMundos.add(txtfAtaquesInvMun);
		
		txtfVelocidadInvMun = new JTextField(String.valueOf(stats.get(3)));//campo de texto velocidad
		txtfVelocidadInvMun.setEditable(false);
		txtfVelocidadInvMun.setHorizontalAlignment(SwingConstants.CENTER);
		txtfVelocidadInvMun.setFont(new Font("Chiller", Font.BOLD, 35));
		txtfVelocidadInvMun.setColumns(10);
		txtfVelocidadInvMun.setBounds(733, 74, 102, 31);
		inventarioMundos.add(txtfVelocidadInvMun);
		
		txtfPtosSaludInvMun = new JTextField(String.valueOf(stats.get(2)));//campo de texto ps
		txtfPtosSaludInvMun.setEditable(false);
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
		JLabel lblBgInvMun = new JLabel();//Fondo de pantalla #14
		lblBgInvMun.setIcon(new ImageIcon(img));
		lblBgInvMun.setForeground(new Color(75, 0, 130));
		lblBgInvMun.setFont(new Font("Chiller", Font.BOLD, 35));
		lblBgInvMun.setBackground(new Color(255, 250, 250));
		lblBgInvMun.setBounds(0, 0, 1264, 681);
		inventarioMundos.add(lblBgInvMun);
		
		
		
	}

	//método para actualizar el dinero
		private void actualizarTXTDinero() {
			txtfDineroTJets.setText(String.valueOf(Personaje.devolverDinero()));
			txtfDineroTComp.setText(String.valueOf(Personaje.devolverDinero()));
			txtfDineroTMun.setText(String.valueOf(Personaje.devolverDinero()));
			txtfDineroInvJets.setText(String.valueOf(Personaje.devolverDinero()));
			txtfDineroInvComp.setText(String.valueOf(Personaje.devolverDinero()));
			txtfDineroInvJMun.setText(String.valueOf(Personaje.devolverDinero()));
			txtfDineroInicio.setText(String.valueOf(Personaje.devolverDinero()));
		}
		private void actualizarTXTInvJets() {
			txtfInventarioMj.setText(String.valueOf(listaJets.get(0).enInventario()));//Poner el texto de cuantos minijets hay en inventario		
			txtfInventarioSj.setText(String.valueOf(listaJets.get(1).enInventario()));//Poner el texto de cuantos superjets hay en inventario		
			txtfInventarioUj.setText(String.valueOf(listaJets.get(2).enInventario()));//Poner el texto de cuantos ultrajets hay en inventario
			btnVenderMj.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaJets.get(0).getNombre()))+" de Mini Jet.");
			btnVenderSj.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaJets.get(1).getNombre()))+" de Súper Jet.");
			btnVenderUj.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaJets.get(2).getNombre()))+" de Ultra Jet.");
			//activa los botones de equipar el objeto en el inventario si tal objeto está en inventario
			btnEquiparMj.setEnabled(Inventario.buscarObjeto(listaJets.get(0).getNombre())); 
			btnEquiparSj.setEnabled(Inventario.buscarObjeto(listaJets.get(1).getNombre())); 
			btnEquiparUj.setEnabled(Inventario.buscarObjeto(listaJets.get(2).getNombre()));
			//activa los botones de vender del objeto si tal objeto está en el inventario y no está equipado
			btnVenderMj.setEnabled(Inventario.buscarObjeto(listaJets.get(0).getNombre()) && !(listaJets.get(0).getEquipado())); 
			btnVenderSj.setEnabled(Inventario.buscarObjeto(listaJets.get(1).getNombre()) && !(listaJets.get(1).getEquipado())); 
			btnVenderUj.setEnabled(Inventario.buscarObjeto(listaJets.get(2).getNombre()) && !(listaJets.get(2).getEquipado()));
		}
		private void actualizarTXTInvComp() {
			txtfInventarioLaser.setText(String.valueOf(listaComp.get(0).enInventario()));//Poner el texto de cuantos rayo láser hay en inventario
			txtfInventarioCuerno.setText(String.valueOf(listaComp.get(1).enInventario()));//Poner el texto de cuantos cuerno de taurus hay en inventario
			txtfInventarioLeche.setText(String.valueOf(listaComp.get(2).enInventario()));//Poner el texto de cuantas leches de via lactea hay en inventario
			btnVenderRayo.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaComp.get(0).getNombre()))+" de Rayo Láser.");
			btnVenderCuerno.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaComp.get(1).getNombre()))+" de Cuerno de Taurus.");
			btnVenderLeche.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaComp.get(2).getNombre()))+" de Leche de Vía Láctea.");
			//activa los botones de equipar el objeto en el inventario si tal objeto está en inventario
			btnEquiparLaser.setEnabled(Inventario.buscarObjeto(listaComp.get(0).getNombre())); 
			btnEquiparCuerno.setEnabled(Inventario.buscarObjeto(listaComp.get(1).getNombre())); 
			btnEquiparLeche.setEnabled(Inventario.buscarObjeto(listaComp.get(2).getNombre()));
			//activa los botones de vender del objeto si tal objeto está en el inventario y no está equipado
			btnVenderRayo.setEnabled(Inventario.buscarObjeto(listaComp.get(0).getNombre()) && !(listaComp.get(0).getEquipado())); 
			btnVenderCuerno.setEnabled(Inventario.buscarObjeto(listaComp.get(1).getNombre()) && !(listaComp.get(1).getEquipado())); 
			btnVenderLeche.setEnabled(Inventario.buscarObjeto(listaComp.get(2).getNombre()) && !(listaComp.get(2).getEquipado()));
		}
		private void actualizarTXTInvMun() {
			txtfInventarioAndro.setText(String.valueOf(listaMundos.get(0).enInventario()));//Poner el texto de cuantos Andromeda hay en inventario
			txtfInventarioOrion.setText(String.valueOf(listaMundos.get(1).enInventario()));//Poner el texto de cuantos Orion hay en inventario
			txtfInventarioOsa.setText(String.valueOf(listaMundos.get(2).enInventario()));//Poner el texto de cuantos Osa Mayor hay en inventario
			btnVenderAndro.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaMundos.get(0).getNombre()))+" de Andrómeda.");
			btnVenderOrion.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaMundos.get(1).getNombre()))+" de Orión.");
			btnVenderOsa.setToolTipText("Tiene:"+String.valueOf(Inventario.contarProductos(listaMundos.get(2).getNombre()))+" de Osa Mayor." );
			//activa los botones de equipar el objeto en el inventario si tal objeto está en inventario
			btnEquiparAndro.setEnabled(Inventario.buscarObjeto(listaMundos.get(0).getNombre()));
			btnEquiparOrion.setEnabled(Inventario.buscarObjeto(listaMundos.get(1).getNombre())); 
			btnEquiparOsa.setEnabled(Inventario.buscarObjeto(listaMundos.get(2).getNombre())); 
			//activa los botones de vender del objeto si tal objeto está en el inventario y no está equipado
			btnVenderAndro.setEnabled(Inventario.buscarObjeto(listaMundos.get(0).getNombre()) && !(listaMundos.get(0).getEquipado())); 
			btnVenderOrion.setEnabled(Inventario.buscarObjeto(listaMundos.get(1).getNombre()) && !(listaMundos.get(1).getEquipado()));
			btnVenderOsa.setEnabled(Inventario.buscarObjeto(listaMundos.get(2).getNombre()) && !(listaMundos.get(2).getEquipado())); 
		}
		

	public void actualizarTXTStats() {
		
		stats = Personaje.devolverStats();
		
		txtfFuerzaInicio.setText(String.valueOf(stats.get(0)));
		txtfAgilidadInicio.setText(String.valueOf(stats.get(1)));
		txtfAtaqueInicio.setText(String.valueOf(String.valueOf(stats.get(4))));
		txtfVelocidadInicio.setText(String.valueOf(String.valueOf(stats.get(3))));
		txtfPtosSaludInicio.setText(String.valueOf(String.valueOf(stats.get(2))));
		
		txtfFuerzaTJets.setText(String.valueOf(stats.get(0)));
		txtfAgilidadTJets.setText(String.valueOf(stats.get(1)));;
		txtfAtaqueTJets.setText(String.valueOf(String.valueOf(stats.get(4))));;
		txtfVelocidadTJets.setText(String.valueOf(String.valueOf(stats.get(3))));;
		txtfPtosSaludTJets.setText(String.valueOf(String.valueOf(stats.get(2))));;
		
		txtfFuerzaTComp.setText(String.valueOf(stats.get(0)));
		txtfAgilidadTComp.setText(String.valueOf(stats.get(1)));
		txtfAtaqueTComp.setText(String.valueOf(String.valueOf(stats.get(4))));
		txtfVelocidadTComp.setText(String.valueOf(String.valueOf(stats.get(3))));
		txtfPtosSaludTComp.setText(String.valueOf(String.valueOf(stats.get(2))));
		
		txtfFuerzaTMun.setText(String.valueOf(stats.get(0)));
		txtfAgilidadTMun.setText(String.valueOf(stats.get(1)));
		txtfAtaqueTMun.setText(String.valueOf(String.valueOf(stats.get(4))));
		txtfVelocidadTMun.setText(String.valueOf(String.valueOf(stats.get(3))));
		txtfPtosSaludTMun.setText(String.valueOf(String.valueOf(stats.get(2))));
		
		txtfFuerzaInvJets.setText(String.valueOf(stats.get(0)));
		txtfAgilidadInvJets.setText(String.valueOf(stats.get(1)));
		txtfAtaqueInvJets.setText(String.valueOf(String.valueOf(stats.get(4))));
		txtfVelocidadInvJets.setText(String.valueOf(String.valueOf(stats.get(3))));
		txtfPtosSaludInvJets.setText(String.valueOf(String.valueOf(stats.get(2))));
		
		txtfFuerzaInvComp.setText(String.valueOf(stats.get(0)));
		txtfAgilidadInvComp.setText(String.valueOf(stats.get(1)));
		txtfAtaqueInvComp.setText(String.valueOf(String.valueOf(stats.get(4))));
		txtfVelocidadInvComp.setText(String.valueOf(String.valueOf(stats.get(3))));
		txtfPtosSaludInvComp.setText(String.valueOf(String.valueOf(stats.get(2))));
		
		txtfFuerzaInvMun.setText(String.valueOf(stats.get(0)));
		txtfAgilidadInvMun.setText(String.valueOf(stats.get(1)));
		txtfAtaquesInvMun.setText(String.valueOf(String.valueOf(stats.get(4))));
		txtfVelocidadInvMun.setText(String.valueOf(String.valueOf(stats.get(3))));
		txtfPtosSaludInvMun.setText(String.valueOf(String.valueOf(stats.get(2))));
	}
	public void actualizarTXTPreStats() {
		
		stats = Personaje.devolverStats();
				
		txtfFuerzaTJetsPre.setText(String.valueOf(stats.get(0)));
		txtfAgilidadTJetsPre.setText(String.valueOf(stats.get(1)));;
		txtfAtaqueTJetsPre.setText(String.valueOf(String.valueOf(stats.get(4))));;
		txtfVelocidadTJetsPre.setText(String.valueOf(String.valueOf(stats.get(3))));;
		txtfPtosSaludTJetsPre.setText(String.valueOf(String.valueOf(stats.get(2))));;
		
		txtfFuerzaTCompPre.setText(String.valueOf(stats.get(0)));
		txtfAgilidadTCompPre.setText(String.valueOf(stats.get(1)));
		txtfAtaqueTCompPre.setText(String.valueOf(String.valueOf(stats.get(4))));
		txtfVelocidadTCompPre.setText(String.valueOf(String.valueOf(stats.get(3))));
		txtfPtosSaludTCompPre.setText(String.valueOf(String.valueOf(stats.get(2))));
		
		txtfFuerzaTMunPre.setText(String.valueOf(stats.get(0)));
		txtfAgilidadTMunPre.setText(String.valueOf(stats.get(1)));
		txtfAtaqueTMunPre.setText(String.valueOf(String.valueOf(stats.get(4))));
		txtfVelocidadTMunPre.setText(String.valueOf(String.valueOf(stats.get(3))));
		txtfPtosSaludTMunPre.setText(String.valueOf(String.valueOf(stats.get(2))));
	
	}
	
	public void actualizarTXTStatsStSum() {
		statsModificados = Personaje.previewStats();
				
		txtfFuerzaTJetsSt.setText(String.valueOf("+" + statsModificados.get(0)));	
		txtfFuerzaTJetsSt.setForeground(new Color(0,128,0));
		txtfAgilidadTJetsSt.setText(String.valueOf("+" +statsModificados.get(1)));;
		txtfAgilidadTJetsSt.setForeground(new Color(0,128,0));
		txtfAtaqueTJetsSt.setText(String.valueOf(String.valueOf("+" +statsModificados.get(4))));;
		txtfAtaqueTJetsSt.setForeground(new Color(0,128,0));
		txtfVelocidadTJetsSt.setText(String.valueOf(String.valueOf("+" +statsModificados.get(3))));;
		txtfVelocidadTJetsSt.setForeground(new Color(0,128,0));
		txtfPtosSaludTJetsSt.setText(String.valueOf(String.valueOf("+" +statsModificados.get(2))));;
		txtfPtosSaludTJetsSt.setForeground(new Color(0,128,0));
		
		txtfFuerzaTCompSt.setText(String.valueOf("+" + statsModificados.get(0)));	
		txtfFuerzaTCompSt.setForeground(new Color(0,128,0));
		txtfAgilidadTCompSt.setText(String.valueOf("+" +statsModificados.get(1)));
		txtfAgilidadTCompSt.setForeground(new Color(0,128,0));
		txtfAtaqueTCompSt.setText(String.valueOf(String.valueOf("+" +statsModificados.get(4))));
		txtfAtaqueTCompSt.setForeground(new Color(0,128,0));
		txtfVelocidadTCompSt.setText(String.valueOf(String.valueOf("+" +statsModificados.get(3))));
		txtfVelocidadTCompSt.setForeground(new Color(0,128,0));
		txtfPtosSaludTCompSt.setText(String.valueOf(String.valueOf("+" +statsModificados.get(2))));
		txtfPtosSaludTCompSt.setForeground(new Color(0,128,0));
		
		txtfFuerzaTMunSt.setText(String.valueOf("+" + statsModificados.get(0)));	
		txtfFuerzaTMunSt.setForeground(new Color(0,128,0));
		txtfAgilidadTMunSt.setText(String.valueOf("+" +statsModificados.get(1)));
		txtfAgilidadTMunSt.setForeground(new Color(0,128,0));
		txtfAtaqueTMunSt.setText(String.valueOf(String.valueOf("+" +statsModificados.get(4))));
		txtfAtaqueTMunSt.setForeground(new Color(0,128,0));
		txtfVelocidadTMunSt.setText(String.valueOf(String.valueOf("+" +statsModificados.get(3))));
		txtfVelocidadTMunSt.setForeground(new Color(0,128,0));
		txtfPtosSaludTMunSt.setText(String.valueOf(String.valueOf("+" +statsModificados.get(2))));
		txtfPtosSaludTMunSt.setForeground(new Color(0,128,0));
	}
	
	public void actualizarTXTStatsStRes() {
		statsModificados = Personaje.previewStats();
				
		txtfFuerzaTJetsSt.setText(String.valueOf(statsModificados.get(0)));	
		txtfFuerzaTJetsSt.setForeground(new Color(255, 0, 0));
		txtfAgilidadTJetsSt.setText(String.valueOf(statsModificados.get(1)));;
		txtfAgilidadTJetsSt.setForeground(new Color(255, 0, 0));
		txtfAtaqueTJetsSt.setText(String.valueOf(String.valueOf(statsModificados.get(4))));;
		txtfAtaqueTJetsSt.setForeground(new Color(255, 0, 0));
		txtfVelocidadTJetsSt.setText(String.valueOf(String.valueOf(statsModificados.get(3))));;
		txtfVelocidadTJetsSt.setForeground(new Color(255, 0, 0));
		txtfPtosSaludTJetsSt.setText(String.valueOf(String.valueOf(statsModificados.get(2))));;
		txtfPtosSaludTJetsSt.setForeground(new Color(255, 0, 0));
		
		txtfFuerzaTCompSt.setText(String.valueOf(statsModificados.get(0)));
		txtfFuerzaTCompSt.setForeground(new Color(255, 0, 0));
		txtfAgilidadTCompSt.setText(String.valueOf(statsModificados.get(1)));
		txtfAgilidadTCompSt.setForeground(new Color(255, 0, 0));
		txtfAtaqueTCompSt.setText(String.valueOf(String.valueOf(statsModificados.get(4))));
		txtfAtaqueTCompSt.setForeground(new Color(255, 0, 0));
		txtfVelocidadTCompSt.setText(String.valueOf(String.valueOf(statsModificados.get(3))));
		txtfVelocidadTCompSt.setForeground(new Color(255, 0, 0));
		txtfPtosSaludTCompSt.setText(String.valueOf(String.valueOf(statsModificados.get(2))));
		txtfPtosSaludTCompSt.setForeground(new Color(255, 0, 0));
		
		txtfFuerzaTMunSt.setText(String.valueOf(statsModificados.get(0)));
		txtfFuerzaTMunSt.setForeground(new Color(255, 0, 0));
		txtfAgilidadTMunSt.setText(String.valueOf(statsModificados.get(1)));
		txtfAgilidadTMunSt.setForeground(new Color(255, 0, 0));
		txtfAtaqueTMunSt.setText(String.valueOf(String.valueOf(statsModificados.get(4))));
		txtfAtaqueTMunSt.setForeground(new Color(255, 0, 0));
		txtfVelocidadTMunSt.setText(String.valueOf(String.valueOf(statsModificados.get(3))));
		txtfVelocidadTMunSt.setForeground(new Color(255, 0, 0));
		txtfPtosSaludTMunSt.setText(String.valueOf(String.valueOf(statsModificados.get(2))));
		txtfPtosSaludTMunSt.setForeground(new Color(255, 0, 0));
	}
	
    public void equiparObjeto(JButton btn, JRadioButton rdbtn, boolean mundos) {
    	rdbtn.setSelected(true);
    	if(mundos) btn.setText("Almacenar");
    	else btn.setText("Desequipar");
		actualizarTXTStats();
		actualizarTXTPreStats();
		//Cambiar stats	++
    }
    
    public void desequiparObjeto(JButton btn, JRadioButton rdbtn, boolean mundos) {
    	rdbtn.setSelected(false);
    	if(mundos) btn.setText("Usar");
    	else btn.setText("Equipar");
		actualizarTXTStats();
		actualizarTXTPreStats();
		//Cambiar stats	--
    }
    
    public void comprarG(String categoria, int indice, JButton btn) {
    	
		if (categoria=="JETS") {
    		Inventario.agregarProducto(listaJets.get(indice));
    		actualizarTXTInvJets();
    		
    	}else if(categoria=="COMPLEMENTOS") {
    		Inventario.agregarProducto(listaComp.get(indice));
    		actualizarTXTInvComp();
    		
    	}else {
    		Inventario.agregarProducto(listaMundos.get(indice));
    		actualizarTXTInvMun();
    	}
		
    	actualizarTXTDinero();
		btn.setEnabled(true);
    	
    }
    
    public void equiparG(String categoria, int indice, JButton btnEquipar, JRadioButton rdbtn, JButton btnVender) {
    	
    	if (categoria=="JETS") {
    		if (!(listaJets.get(indice).getEquipado())) {
	    		listaJets.get(indice).equipar();
	    		actualizarTXTInvJets();
    		}
    		
    	}else if(categoria=="COMPLEMENTOS") {
    		if (!(listaComp.get(indice).getEquipado())) {
	    		listaComp.get(indice).equipar();
	    		actualizarTXTInvComp();
    		}
    		
    	}else {
    		if (!(listaMundos.get(indice).getEquipado())) listaMundos.get(indice).equipar();
    		categoria = "MUNDOS";
    	}
    	
    	
    	if (!rdbtn.isSelected()) {
    		if(categoria=="MUNDOS")equiparObjeto(btnEquipar, rdbtn,true);
    		else equiparObjeto(btnEquipar, rdbtn,false);
    		btnVender.setEnabled(false);
    		
    	}else {
    		 JOptionPane.showMessageDialog(null, "Este elemento ya está equipado");
    	}

    }

    public void mostrarMensajeCompra(String categoria, int indice, JButton btnEquipar, JRadioButton rdbtn, JButton btnVender) {
    	String accion;
    	if (categoria=="MUNDOS") accion = "Comprar y Usar";
    	else accion = "Comprar y Equipar";
        String[] opciones = {accion, "Comprar", "Cancelar"};
        int opcionEscogida = JOptionPane.showOptionDialog(null, "¿Está seguro que desea comprar este elemento?",
                "Compra",0, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);
        
        if (opcionEscogida==0) { //Comprar y equipar
        	comprarG(categoria, indice, btnEquipar);
        	equiparG(categoria, indice, btnEquipar, rdbtn, btnVender);
        	
        }else if (opcionEscogida==1){ //solo comprar
        	comprarG(categoria, indice, btnEquipar);  
        	
        }else; //opción cancelar   
        
    }
    
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
	
/*
	public int buscarRadiosActivados() {
		ArrayList<JRadioButton> radios = new ArrayList<JRadioButton>();
		radios.add(rdbtnMj);
		radios.add(rdbtnMs);
		radios.add(rdbtnUj);
		radios.add(rdbtnLaser);
		radios.add(rdbtnCuerno);
		radios.add(rdbtnLeche);
		radios.add(rdbtnAndro);
		radios.add(rdbtnOrion);
		radios.add(rdbtnOsa);
		
		for (int i = 0; i <= radios.size()-1; i++) {
			if ((radios.get(i)).isSelected()) {
				return 1;
			}
		}
		return 0;
	}
*/
	
	public void mostrarEtiquetasPre() {
		txtfFuerzaTJetsPre.setVisible(true);
		txtfAgilidadTJetsPre.setVisible(true);
		txtfPtosSaludTJetsPre.setVisible(true);
		txtfVelocidadTJetsPre.setVisible(true);
		txtfAtaqueTJetsPre.setVisible(true);
		
		txtfFuerzaTCompPre.setVisible(true);
		txtfAgilidadTCompPre.setVisible(true);
		txtfPtosSaludTCompPre.setVisible(true);
		txtfVelocidadTCompPre.setVisible(true);
		txtfAtaqueTCompPre.setVisible(true);
		
		txtfFuerzaTMunPre.setVisible(true);
		txtfAgilidadTMunPre.setVisible(true);
		txtfPtosSaludTMunPre.setVisible(true);
		txtfVelocidadTMunPre.setVisible(true);
		txtfAtaqueTMunPre.setVisible(true);
		
	}
	
	public void mostrarEtiquetasSt() {
		
		txtfFuerzaTJetsSt.setVisible(true);
		txtfAgilidadTJetsSt.setVisible(true);
		txtfPtosSaludTJetsSt.setVisible(true);
		txtfVelocidadTJetsSt.setVisible(true);
		txtfAtaqueTJetsSt.setVisible(true);		
		
		txtfFuerzaTCompSt.setVisible(true);
		txtfAgilidadTCompSt.setVisible(true);
		txtfPtosSaludTCompSt.setVisible(true);
		txtfVelocidadTCompSt.setVisible(true);
		txtfAtaqueTCompSt.setVisible(true);
		
		txtfFuerzaTMunSt.setVisible(true);
		txtfAgilidadTMunSt.setVisible(true);
		txtfPtosSaludTMunSt.setVisible(true);
		txtfVelocidadTMunSt.setVisible(true);
		txtfAtaqueTMunSt.setVisible(true);
	}
	
	public void ocultarEtiquetasPre() {
		
		txtfFuerzaTJetsPre.setVisible(false);
		txtfAgilidadTJetsPre.setVisible(false);
		txtfPtosSaludTJetsPre.setVisible(false);
		txtfVelocidadTJetsPre.setVisible(false);
		txtfAtaqueTJetsPre.setVisible(false);		
		
		txtfFuerzaTCompPre.setVisible(false);
		txtfAgilidadTCompPre.setVisible(false);
		txtfPtosSaludTCompPre.setVisible(false);
		txtfVelocidadTCompPre.setVisible(false);
		txtfAtaqueTCompPre.setVisible(false);
		
		txtfFuerzaTMunPre.setVisible(false);
		txtfAgilidadTMunPre.setVisible(false);
		txtfPtosSaludTMunPre.setVisible(false);
		txtfVelocidadTMunPre.setVisible(false);
		txtfAtaqueTMunPre.setVisible(false);
	}
	
	public void actualizarTXTSt() {
		txtfFuerzaTJetsSt.setVisible(false);
		txtfAgilidadTJetsSt.setVisible(false);
		txtfPtosSaludTJetsSt.setVisible(false);
		txtfVelocidadTJetsSt.setVisible(false);
		txtfAtaqueTJetsSt.setVisible(false);		
		
		txtfFuerzaTCompSt.setVisible(false);
		txtfAgilidadTCompSt.setVisible(false);
		txtfPtosSaludTCompSt.setVisible(false);
		txtfVelocidadTCompSt.setVisible(false);
		txtfAtaqueTCompSt.setVisible(false);
		
		txtfFuerzaTMunSt.setVisible(false);
		txtfAgilidadTMunSt.setVisible(false);
		txtfPtosSaludTMunSt.setVisible(false);
		txtfVelocidadTMunSt.setVisible(false);
		txtfAtaqueTMunSt.setVisible(false);
	}
	
	public void desSeleccionarRadios() {
		rdbtnMj.setSelected(false);
		rdbtnMs.setSelected(false);
		rdbtnUj.setSelected(false);
		rdbtnLaser.setSelected(false);
		rdbtnCuerno.setSelected(false);
		rdbtnLeche.setSelected(false);
		rdbtnAndro.setSelected(false);
		rdbtnOrion.setSelected(false);
		rdbtnOsa.setSelected(false);
		
	}
	
	
	
	public void desHabilitarRadios() {
		rdbtnMj.setEnabled(false);
		rdbtnMs.setEnabled(false);
		rdbtnUj.setEnabled(false);
		rdbtnLaser.setEnabled(false);
		rdbtnCuerno.setEnabled(false);
		rdbtnLeche.setEnabled(false);
		rdbtnAndro.setEnabled(false);
		rdbtnOrion.setEnabled(false);
		rdbtnOsa.setEnabled(false);
		
	}
	
	
	
}	
/*
listaJets.get(0).equipar();
if (rdbtnMjInv.isSelected()==false) {
	equiparObjeto(btnEquiparMj, rdbtnMjInv);
	btnVenderMj.setEnabled(false);
}else {
	desequiparObjeto(btnEquiparMj, rdbtnMjInv);
	btnVenderMj.setEnabled(true);
}


	if (listaJets.get(0).comprar()) { //***
		//Comprar el miniJet
		Inventario.agregarProducto(listaJets.get(0));//agrega en inventario el mini jet ****
		actualizarTXTDinero();
		actualizarTXTInvJets(); //******!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		btnEquiparMj.setEnabled(true);
							
	}else { 
		//Mostrar mensaje "Dinero Insuficiente" 
		mostrarMensajeSinDinero();
	}
}

					ArrayList<JRadioButton> radiosJet = new ArrayList<JRadioButton>();
					radiosJet.add(rdbtnMj);
					radiosJet.add(rdbtnMs);
					radiosJet.add(rdbtnUj);
					
					for (int i = 0; i <= radiosJet.size()-1; i++) {
						if ((radiosJet.get(i)).isSelected()) {
							listaJets.get(i).previsualizar();
							previsualizarTXTStats();		
						}
					}

*/

