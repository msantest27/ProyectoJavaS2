
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;


import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.TextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Formulario {

	private JFrame frmPrueba;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDepto;
	private JTextField txtdia;
	private Persona [] lPersona = new Persona [3];
	private int pos = 0;
	private JTextField txtAnio;
	private JTextField txtCantHijos;
	
	public void limpiaTxt() {
		txtAnio.setText("");
		txtNombre.setText("");
		txtApellido.setText("");
		txtDepto.setText("");
		txtCantHijos.setText("");
		txtdia.setText("");
		
		
	}
	
	
	
	public int obtenerMes(String mesString) {
		int mes=1;
		switch (mesString) {
		  case "Enero":
			  mes =1;
		    break;
		  case "Febrero":
			  mes =2;
		    break;
		  case "Marzo":
			 mes =3;
			break;
		  case "Abril":
			  mes =4;
		    break;
		  case "Mayo":
			  mes =5;
		    break;
		  case "Junio":
			 mes =6;
			break;
		  case "Julio":
			  mes =7;
		    break;
		  case "Agosto":
			  mes =8;
		    break;
		  case "Septiembre":
			 mes =9;
			break;
		  case "Octubre":
			  mes =10;
		    break;
		  case "Noviembre":
			  mes =11;
		    break;
		  case "Diciembre":
			 mes =12;
			break;
		}
		return mes;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario window = new Formulario();
					window.frmPrueba.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Formulario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrueba = new JFrame();
		frmPrueba.setResizable(false);
		frmPrueba.setBackground(SystemColor.inactiveCaption);
		frmPrueba.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmPrueba.setTitle("Prueba");
		frmPrueba.setBounds(100, 100, 594, 447);
		frmPrueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrueba.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(32, 27, 73, 14);
		frmPrueba.getContentPane().add(lblNewLabel);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(181, 27, 167, 20);
		frmPrueba.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(32, 53, 84, 14);
		frmPrueba.getContentPane().add(lblNewLabel_1);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(181, 59, 167, 20);
		frmPrueba.getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Departamento");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(32, 84, 139, 14);
		frmPrueba.getContentPane().add(lblNewLabel_2);
		
		txtDepto = new JTextField();
		txtDepto.setBounds(181, 84, 167, 20);
		frmPrueba.getContentPane().add(txtDepto);
		txtDepto.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril ", "Mayo ", "Junio", "Julio", "Setiembre", "Octubre", "Noviembre", "Diciembre"}));
		comboBox.setBounds(231, 110, 83, 22);
		frmPrueba.getContentPane().add(comboBox);
		
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
				
				String nom=txtNombre.getText();
				String ape=txtApellido.getText();
				String depto=txtDepto.getText();
				int dia = Integer.parseInt(txtdia.getText());
				int anio = Integer.parseInt(txtAnio.getText());
				int cantHijos = Integer.parseInt(txtCantHijos.getText());
	
				int mes =obtenerMes(comboBox.getSelectedItem().toString());
				LocalDate fecha = LocalDate.of(anio, mes, dia);// (LocalDate)txtFecha.getText();
				if (pos < lPersona.length) {
					Persona p = new Persona(pos+1, nom, ape, depto, cantHijos, fecha);
					lPersona[pos] = p;
					pos = pos + 1;
					limpiaTxt();
				}else {
					System.out.println("No se permite ingresar mas personas");
				}
				}catch (NumberFormatException a) {
					System.out.println("El dato ingresado no es un numero...");
			
				}
				
			}
		});
		btnNewButton.setBounds(52, 218, 129, 23);
		frmPrueba.getContentPane().add(btnNewButton);
		
	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(237, 190, 200, 200);
		frmPrueba.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
	
		
		JButton btnNewButton_1 = new JButton("Mostrar");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					textArea.setText(null);
					for (int k=0;k<lPersona.length;k++) {
						Persona p;
						p = lPersona[k];
						if (lPersona[k] != null)
						textArea.append(" Persona " +  " " + p.toString() +  "\n");
					
					}
				
				
			}
		});
		btnNewButton_1.setBounds(52, 252, 129, 23);
		frmPrueba.getContentPane().add(btnNewButton_1);
	

		
		JLabel lblNewLabel_2_1 = new JLabel("Fecha Nacimiento");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(32, 114, 139, 14);
		frmPrueba.getContentPane().add(lblNewLabel_2_1);
		
		txtdia = new JTextField();
		txtdia.setColumns(10);
		txtdia.setBounds(181, 111, 44, 20);
		frmPrueba.getContentPane().add(txtdia);
		
	
		txtAnio = new JTextField();
		txtAnio.setColumns(10);
		txtAnio.setBounds(320, 111, 73, 20);
		frmPrueba.getContentPane().add(txtAnio);
		
		JLabel lblNewLabel_2_2 = new JLabel("Cantidad Hijos");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(32, 146, 139, 14);
		frmPrueba.getContentPane().add(lblNewLabel_2_2);
		
		txtCantHijos = new JTextField();
		txtCantHijos.setColumns(10);
		txtCantHijos.setBounds(181, 143, 73, 20);
		frmPrueba.getContentPane().add(txtCantHijos);
		
		JButton btnNewButton_2 = new JButton("Ver personas c/hijos");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.setText(null);
				for (int k=0;k<lPersona.length;k++) {
					Persona p;
					p = lPersona[k];
					if (lPersona[k] != null && lPersona[k].getCantHijos()>0)
					textArea.append(" Persona " +  " " + p.toString() +  "\n");
					
				}
			}
		});

		btnNewButton_2.setBounds(52, 286, 129, 23);
		frmPrueba.getContentPane().add(btnNewButton_2);
	}
}
