package business;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class ImageProcessor {
	
	private Image image;
	private BufferedImage bufferedImage;
	private List imageList; 
	
	

	public ImageProcessor(String filePath){
		 try {
	            image = ImageIO.read(new File(filePath));
	     } catch (IOException e) {
	            e.printStackTrace();
	     }
	}
	
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public List getImageList() {
		return imageList;
	}

	public void setImageList(List imageList) {
		this.imageList = imageList;
	}

}
