import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.*;
import java.text.ParseException;

public class Prueba extends JFrame{
	
	GridBagLayout gbl=new GridBagLayout();
	GridBagConstraints gbc=new GridBagConstraints();
	JPanel panel1=new JPanel();
	
	public Prueba() {
		crearComponentes();
	}
	
	public void formato(JComponent componente, int gx, int gy, int gWidth, int gHeigth, int gFill){
		gbc.gridx=gx;
		gbc.gridy=gy;
		gbc.gridwidth=gWidth;
		gbc.gridheight=gHeigth;
		gbc.fill=gFill;
		
		gbl.setConstraints(componente, gbc);
		add(componente);
	}
	
	public void formato2(JComponent componente, int gx, int gy, int gWidth, int gHeigth, int gFill){
		gbc.gridx=gx;
		gbc.gridy=gy;
		gbc.gridwidth=gWidth;
		gbc.gridheight=gHeigth;
		gbc.fill=gFill;
		
		gbl.setConstraints(componente, gbc);
		panel1.add(componente);
	}
	
	public void crearComponentes(){
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Formulario");
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		
		
		JLabel label1=new JLabel("<html> <body>The <b>Classic Form</b> includes all visible fields for<br>this list</body></html>");
			label1.setFont(new Font("Times New Roman", 5, 18));
		formato(label1, 0, 0, 1, 1, 1);
		formato(new JLabel(" "), 0, 1, 1, 1, 1);
		formato(new JLabel(" "), 0, 2, 1, 1, 1);
	
		
		JLabel label2=new JLabel("<html> <body><b>Form Options</b></body></html>");
			label2.setFont(new Font("Arial", 5, 18));
		formato(label2, 0, 3, 1, 1, 1);
		formato(new JLabel(" "), 0, 4, 1, 1, 1);
		
		
		JLabel label3=new JLabel("Include the following:");
			label3.setFont(new Font("Times New Roman", 5, 18));
		formato(label3, 0, 5, 1, 1, 1);
		
		JCheckBox checkBox1=new JCheckBox("A title for your form");
			checkBox1.setFont(new Font("Times New Roman", 5, 18));
		formato(checkBox1, 0, 6, 1, 1, 1);
		
		
		JTextField txtCaja1=new JTextField("Subscribe to our mailing list");
			txtCaja1.setFont(new Font("Times New Roman", 5, 18));
			txtCaja1.setBackground(new Color(240, 240, 240));
		formato(txtCaja1, 0, 7, 1, 1, 1);
		formato(new JLabel(" "), 0, 8, 1, 1, 1);
		formato(new JLabel(" "), 0, 9, 1, 1, 1);
		formato(new JLabel(" "), 0, 10, 1, 1, 1);
		
		
		ButtonGroup bg=new ButtonGroup();
			JRadioButton rb1=new JRadioButton("   Only required fields");
				rb1.setFont(new Font("Times New Roman", 5, 18));
				bg.add(rb1);
				formato(rb1, 0, 11, 1, 1, 1);
			JRadioButton rb2=new JRadioButton("   All fields");
				rb2.setFont(new Font("Times New Roman", 5, 18));
				bg.add(rb2);
				formato(rb2, 0, 12, 1, 1, 1);
						
		
		JLabel label4=new JLabel("<html><body>(edit required fields in <font color=blue>the form builder</font>)</body></html>");
			label4.setFont(new Font("Times New Roman", 5, 14));
		formato(label4, 0, 13, 1, 1, 1);
		formato(new JLabel(" "), 0, 14, 1, 1, 1);
		formato(new JLabel(" "), 0, 15, 1, 1, 1);
		formato(new JLabel(" "), 0, 16, 1, 1, 1);
		
		
		JCheckBox checkBox2=new JCheckBox("Interest group fields");
			checkBox2.setFont(new Font("Times New Roman", 5, 18));
		formato(checkBox2, 0, 17, 1, 1, 1);
		
		
		JCheckBox checkBox3=new JCheckBox("Required fields indicators");
			checkBox3.setFont(new Font("Times New Roman", 5, 18));
		formato(checkBox3, 0, 18, 1, 1, 1);
		formato(new JLabel(" "), 0, 19, 1, 1, 1);
		formato(new JLabel(" "), 0, 20, 1, 1, 1);
				
		
		JLabel label5=new JLabel("Set form width:");
			label5.setFont(new Font("Times New Roman", 5, 18));
		formato(label5, 0, 21, 1, 1, 1);
		
		
		JTextField txtCaja2=new JTextField();
			txtCaja2.setFont(new Font("Times New Roman", 5, 18));
			txtCaja2.setBackground(new Color(240, 240, 240));
		formato(txtCaja2, 0, 22, 1, 1, 1);
		formato(new JLabel(" "), 0, 23, 1, 1, 1);
		formato(new JLabel(" "), 0, 24, 1, 1, 1);
		formato(new JLabel(" "), 0, 24, 1, 1, 1);
				
		
		JLabel label6=new JLabel("Enhance your form");
			label6.setFont(new Font("Times New Roman", 5, 18));
		formato(label6, 0, 25, 1, 1, 1);
		
		
		JCheckBox checkBox4=new JCheckBox("<html><body>Enable <b>evil</b> popup mode</body></html>");
			checkBox4.setFont(new Font("Times New Roman", 5, 18));
		formato(checkBox4, 0, 26, 1, 1, 1);
		
		
		JCheckBox checkBox5=new JCheckBox("<html><body>Disable all <b>JavaScript</b></body></html>");
			checkBox5.setFont(new Font("Times New Roman", 5, 18));
		formato(checkBox5, 0, 27, 1, 1, 1);
		
		
		JCheckBox checkBox6=new JCheckBox("Include archive link");
			checkBox6.setFont(new Font("Times New Roman", 5, 18));
		formato(checkBox6, 0, 28, 1, 1, 1);
		
		
		JCheckBox checkBox7=new JCheckBox("<html><body>Include <font color=blue>MonkeyRewards link</font></body></html>");
			checkBox7.setFont(new Font("Times New Roman", 5, 18));
		formato(checkBox7, 0, 29, 1, 1, 1);
		formato(new JLabel("   "), 1, 0, 1, 1, 1);
		
		
		JLabel label7=new JLabel("      .");
			label7.setFont(new Font("Times New Roman", 5, 1));
		formato(label7, 1, 20, 1, 1, 1);
		
		JLabel label8=new JLabel("Preview");
			label8.setFont(new Font("Arial", 5	, 24));
		formato(label8, 2, 0, 1, 1, 1);
		
		
		panel1.setLayout(gbl);
			panel1.setBorder(BorderFactory.createTitledBorder(""));
			
			JLabel label9=new JLabel("<html><body><font color=red>* </font>Inidcates required</body></html>");
				label9.setFont(new Font("Times New Roman", 5	, 14));
				label9.setHorizontalAlignment(JLabel.RIGHT);
			formato2(label9, 5, 0, 1, 1, 1);
			formato2(new JLabel("                                                                                                            ."), 1, 0, 1, 1, 1);
					
			
			JLabel label10=new JLabel("<html><body>Email Address <font color=red>* </font></body></html>");
				label10.setFont(new Font("Times New Roman", 5, 18));
			formato2(label10, 0, 1, 1, 1, 1);
			
			
			
			MaskFormatter mask = null;
	        try {
	            mask = new MaskFormatter("?????????#####@gmail.com");
	            mask.setPlaceholderCharacter('*');
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	        JFormattedTextField fTxtCaja3 = new JFormattedTextField(mask);
		        //fTxtCaja3.setHorizontalAlignment(JTextField.RIGHT);// ¿Es realmente necesario?
				//fTxtCaja3.setForeground(Color.RED); //LO QUITE POR QUE ME PONIA TODO EN ROJO
		        fTxtCaja3.setBounds(10, 35, 590, 35);
		        fTxtCaja3.setFont(new Font("Times New Roman", 5, 18));
				fTxtCaja3.setBackground(new Color(240, 240, 240));
			formato2(fTxtCaja3, 0, 2, 6, 1, 1);
						
	        
			JLabel label11=new JLabel("First Name");
				label11.setFont(new Font("Times New Roman", 5, 18));
			formato2(label11, 0, 3, 1, 1, 1);
			
			
			
		formato(panel1, 2, 1, 2, 13, 1);
		
		
		
		
		pack();	
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
				
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Prueba();
			}
		});
		
		System.gc();
	}
}