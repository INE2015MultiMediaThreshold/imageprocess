package presentation;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRootPane;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	
	private JMenuBar mb;
	private JPanel imageJP = new JPanel();
	private JPanel toolJP = new JPanel();
	private MenubarListener mbListener = new MenubarListener();
	private ToolbarListener tbListener = new ToolbarListener();
	
	
	public MainFrame(){
		
		super("Image Process");
		this.setSize(800, 600);
		this.setLocation(300, 50);
		JRootPane rp = new JRootPane();
		super.setContentPane(rp);
		mb = new JMenuBar();
		rp.setJMenuBar(mb);
		rp.add(imageJP);
		
		JMenu menuFile = new JMenu("File");
		JMenu menuImage = new JMenu("Image");
		JMenu menuBgr= new JMenu("BG remove");
		JMenu menuNeuro= new JMenu("Neuro");
		JMenu menuHelp= new JMenu("Help");
		
		// menu item for File menu
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem saveAsItem = new JMenuItem("Save as");
		JMenuItem quitItem = new JMenuItem("Quit");
		menuFile.add(openItem);
		menuFile.add(saveItem);
		menuFile.add(saveAsItem);
		menuFile.addSeparator();
		menuFile.add(quitItem);
		
		// menu item for Image menu
		JMenuItem undoItem = new JMenuItem("Undo");
		JMenuItem redoItem = new JMenuItem("Redo");
		JMenuItem resizeItem = new JMenuItem("Resize");
		JMenuItem greyScaleItem = new JMenuItem("Greyscale");
		JMenuItem whiteNoiseItem = new JMenuItem("White noise");
		JMenuItem extraLineItem = new JMenuItem("Extra line");
		menuImage.add(undoItem);
		menuImage.add(redoItem);
		menuImage.add(resizeItem);
		menuImage.add(greyScaleItem);
		menuImage.add(whiteNoiseItem);
		menuImage.add(extraLineItem);
		
		// menu item for BG remove menu
		JMenuItem threItem = new JMenuItem("Thresholding");
		JMenuItem edItem = new JMenuItem("Edge detecting");
		menuBgr.add(threItem);
		menuBgr.add(edItem);
		
		// menu item for Neuro menu
		JMenuItem knnSettingItem = new JMenuItem("KNN setting");
		JMenuItem knnTrainingItem = new JMenuItem("KNN training");
		JMenuItem knnTestingItem = new JMenuItem("KNN testing");
		menuNeuro.add(knnSettingItem);
		menuNeuro.add(knnTrainingItem);
		menuNeuro.add(knnTestingItem);
		
		// menu item for Help menu
		JMenuItem aboutItem = new JMenuItem("About");
		JMenuItem manualItem = new JMenuItem("Manual");
		menuHelp.add(aboutItem);
		menuHelp.add(manualItem);
		
		// add menu to menu bar
		mb.add(menuFile);
		mb.add(menuImage);
		mb.add(menuBgr);
		mb.add(menuNeuro);
		mb.add(menuHelp);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	};
}
