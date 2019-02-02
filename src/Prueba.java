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