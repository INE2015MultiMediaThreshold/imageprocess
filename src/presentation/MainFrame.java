package presentation;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	
	private JMenuBar mb;
	
	private JMenu menuFile, menuImage, menuBgr, menuNeuro, menuHelp;
	private JMenuItem openItem, saveItem, saveAsItem, quitItem, undoItem, redoItem, resizeItem, greyScaleItem,
			whiteNoiseItem, extraLineItem, threItem, edItem, knnSettingItem, knnTrainingItem, knnTestingItem,aboutItem, manualItem;
	
	private ImagePanel panel;
	private JScrollPane imageSp;
	private BufferedImage bufImage;
	
	private JPanel toolJP = new JPanel();
	
	private JFileChooser fileChooser = new JFileChooser();
	
	
	
	public MainFrame(){
		
		super("Image Process");
		this.setSize(800, 600);
		this.setLocation(300, 50);
		
		mb = new JMenuBar();
		this.setJMenuBar(mb);
		
		panel = new ImagePanel();
		this.add(panel,BorderLayout.CENTER);
		
		
		
		
		// create file chooser
		fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File("."));
		
		// create menu for menu bar
		menuFile = new JMenu("File");
		menuImage = new JMenu("Image");
		menuBgr= new JMenu("BG remove");
		menuNeuro= new JMenu("Neuro");
		menuHelp= new JMenu("Help");
		
		// menu item for File menu
		openItem = new JMenuItem("Open");
		saveItem = new JMenuItem("Save");
		saveAsItem = new JMenuItem("Save as");
		quitItem = new JMenuItem("Quit");
		menuFile.add(openItem);
		menuFile.add(saveItem);
		menuFile.add(saveAsItem);
		menuFile.addSeparator();
		menuFile.add(quitItem);
		
		// menu item for Image menu
		undoItem = new JMenuItem("Undo");
		redoItem = new JMenuItem("Redo");
		resizeItem = new JMenuItem("Resize");
		greyScaleItem = new JMenuItem("Greyscale");
		whiteNoiseItem = new JMenuItem("White noise");
		extraLineItem = new JMenuItem("Extra line");
		menuImage.add(undoItem);
		menuImage.add(redoItem);
		menuImage.add(resizeItem);
		menuImage.add(greyScaleItem);
		menuImage.add(whiteNoiseItem);
		menuImage.add(extraLineItem);
		
		// menu item for BG remove menu
		threItem = new JMenuItem("Thresholding");
		edItem = new JMenuItem("Edge detecting");
		menuBgr.add(threItem);
		menuBgr.add(edItem);
		
		// menu item for Neuro menu
		knnSettingItem = new JMenuItem("KNN setting");
		knnTrainingItem = new JMenuItem("KNN training");
		knnTestingItem = new JMenuItem("KNN testing");
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
		
		// add menuItem listener
		openItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 int result = fileChooser.showOpenDialog(null);
				 if(result==JFileChooser.APPROVE_OPTION){
	                    String name = fileChooser.getSelectedFile().getPath();
	                    //System.out.println(name);
	                  panel.setImage(name);
	                  panel.repaint();
	                    
	                    
	                    
	             }
				
			}
			
		});
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
}
