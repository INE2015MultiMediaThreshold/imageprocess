package presentation;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
    private Image image;
    private int showWdith;
    private int showHeight;
    public void setImage(String fileName) {
        // read image file
        try {
            image = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image == null)
            return;
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
    }
}
