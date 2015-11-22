package presentation;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import business.ImageProcessor;

public class ImagePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
    private Image image;
    //private int showWdith;
    //private int showHeight;
    private ImageProcessor imageP;
    
    
    public void setImage(String filePath) {
        // read image file
    	/*
        try {
            image = ImageIO.read(new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    	imageP = new ImageProcessor(filePath);
    	this.image = imageP.getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image == null)
            return;
        /*
        //get width and height of image
        int imageWidth = image.getWidth(this);
        int imageHeight = image.getHeight(this);
        //get width and height of panel
        int width = getWidth();
        int height = getHeight();
        // max value of display
        if(imageWidth>width){
            this.showWdith = width;
        }else{
            this.showWdith = imageWidth;
        }
        if(imageHeight>height){
            this.showHeight = height;
        }else{
            this.showHeight = imageHeight;
        }
        g.drawImage(image, 0, 0, showWdith, showHeight, null, null);
        */
        
        
        Graphics2D g2d = (Graphics2D) g;
        int x = (this.getWidth() - image.getWidth(null)) / 2;
        int y = (this.getHeight() - image.getHeight(null)) / 2;
        g2d.drawImage(image, x, y, null);
    }
}
