package imageProcess;
import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	
	private JMenuBar mb;
	private JPanel imageJP = new JPanel();
	
	
	public MainFrame(){
		super("Image Process");
		this.setSize(800, 600);
		this.setLocation(600, 100);
		JRootPane rp = new JRootPane();
		super.setContentPane(rp);
		JMenuBar mb1 = new JMenuBar();
		rp.setJMenuBar(mb1);
		rp.add(imageJP);
		JMenu menu1= new JMenu("File");
		JMenu menu2= new JMenu("Tools");
		JMenu menu3= new JMenu("BG remove");
		JMenu menu4= new JMenu("Neuro");
		JMenu menu5= new JMenu("Help");
		mb1.add(menu1);
		mb1.add(menu2);
		mb1.add(menu3);
		mb1.add(menu4);
		mb1.add(menu5);
		this.setVisible(true);
	};
}
