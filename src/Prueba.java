import javax.swing.*;
import java.awt.*;

public class Prueba extends JFrame{
	
	GridBagLayout gbl=new GridBagLayout();
	GridBagConstraints gbc=new GridBagConstraints();
		
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
	
		
		JLabel label2=new JLabel("<html> <body><b>Form Options</b></body></html>");
			label2.setFont(new Font("Arial", 5, 18));
		formato(label2, 0, 2, 1, 1, 1);
		
		
		JLabel label3=new JLabel("Include the following:");
			label3.setBounds(10, 100, 160, 30);
			label3.setFont(new Font("Times New Roman", 5, 18));
		formato(label3, 0, 3, 1, 1, 1);
		
		JCheckBox checkBox1=new JCheckBox("A title for your form");
			checkBox1.setFont(new Font("Times New Roman", 5, 18));
		formato(checkBox1, 0, 4, 1, 1, 1);
		
		
		JTextField txtCaja1=new JTextField("Subscribe to our mailing list");
			txtCaja1.setFont(new Font("Times New Roman", 5, 18));
			txtCaja1.setBackground(new Color(240, 240, 240));
		formato(txtCaja1, 0, 5, 1, 1, 1);
		formato(new JLabel(" "), 0, 6, 1, 1, 1);
		formato(new JLabel(" "), 0, 7, 1, 1, 1);
		
		
		
		
		
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