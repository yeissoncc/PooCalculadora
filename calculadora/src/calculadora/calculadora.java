package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class calculadora {

	private JFrame frame;
	private JTextField txtDato;
	
	double primerNumero;
	double segundoNumero;
	double respuesta;// result
	String operacion;//operations
	String aswer;//awer

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
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
	public calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 343, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String IngresarNumero = txtDato.getText() + btn0.getText();
				txtDato.setText(IngresarNumero);
			}
		});
		btn0.setBounds(20, 211, 65, 23);
		frame.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String IngresarNumero = txtDato.getText() + btn1.getText();
				txtDato.setText(IngresarNumero);
			}
		});
		btn1.setBounds(20, 177, 65, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngresarNumero = txtDato.getText() + btn2.getText();
				txtDato.setText(IngresarNumero);
			}
		});
		btn2.setBounds(95, 177, 65, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngresarNumero = txtDato.getText() + btn3.getText();
				txtDato.setText(IngresarNumero);
			}
		});
		btn3.setBounds(170, 177, 65, 23);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngresarNumero = txtDato.getText() + btn4.getText();
				txtDato.setText(IngresarNumero);
				
			}
		});
		btn4.setBounds(20, 143, 65, 23);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String IngresarNumero = txtDato.getText() + btn5.getText();
				txtDato.setText(IngresarNumero);
			}
		});
		btn5.setBounds(95, 143, 65, 23);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngresarNumero = txtDato.getText() + btn6.getText();
				txtDato.setText(IngresarNumero);
			}
		});
		btn6.setBounds(170, 143, 65, 23);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			String IngresarNumero = txtDato.getText() + btn7.getText();
			txtDato.setText(IngresarNumero);
			}
			
		});
		btn7.setBounds(20, 109, 65, 23);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String IngresarNumero = txtDato.getText() + btn8.getText();
				txtDato.setText(IngresarNumero);
			}
		});
		btn8.setBounds(95, 109, 65, 23);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngresarNumero = txtDato.getText() + btn9.getText();
				txtDato.setText(IngresarNumero);
			}
		});
		btn9.setBounds(170, 109, 65, 23);
		frame.getContentPane().add(btn9);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String aswer;
				segundoNumero = Double.parseDouble(txtDato.getText());
				if(operacion == "+") {
					
					respuesta = primerNumero + segundoNumero;
					aswer = String.format("%.2f", respuesta);
					txtDato.setText(aswer);
					
				}
				else if(operacion == "-") {
					
					respuesta = primerNumero - segundoNumero;
					aswer = String.format("%.2f", respuesta);
					txtDato.setText(aswer);
					
				}
				else if(operacion == "*") {
					
					respuesta = primerNumero * segundoNumero;
					aswer = String.format("%.2f", respuesta);
					txtDato.setText(aswer);
					
				}
				else if(operacion == "/") {
					
					respuesta = primerNumero / segundoNumero;
					aswer = String.format("%.2f", respuesta);
					txtDato.setText(aswer);
					
				}
				

			}
		});
		btnIgual.setBounds(95, 211, 140, 23);
		frame.getContentPane().add(btnIgual);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNumero = Double.parseDouble(txtDato.getText());
				txtDato.setText("");
				operacion = "+";
				
			}
		});
		btnSuma.setBounds(245, 109, 65, 23);
		frame.getContentPane().add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primerNumero = Double.parseDouble(txtDato.getText());
				txtDato.setText("");
				operacion = "-";
			}
		});
		btnResta.setBounds(245, 143, 65, 23);
		frame.getContentPane().add(btnResta);
		
		JButton btnMultiplicasion = new JButton("*");
		btnMultiplicasion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primerNumero = Double.parseDouble(txtDato.getText());
				txtDato.setText("");
				operacion = "*";
			}
		});
		btnMultiplicasion.setBounds(245, 177, 65, 23);
		frame.getContentPane().add(btnMultiplicasion);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNumero = Double.parseDouble(txtDato.getText());
				txtDato.setText("");
				operacion = "/";
			}
		});
		btnDivision.setBounds(245, 211, 65, 23);
		frame.getContentPane().add(btnDivision);
		
		txtDato = new JTextField();
		txtDato.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDato.setBounds(20, 25, 290, 36);
		frame.getContentPane().add(txtDato);
		txtDato.setColumns(10);
		
		JButton btnLimpiar = new JButton("C");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDato.setText(null);
			}
		});
		btnLimpiar.setBounds(20, 75, 65, 23);
		frame.getContentPane().add(btnLimpiar);
	}
}
