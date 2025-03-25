import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 * @author Rajveer Karotanian
 *
 * Date: 3/24/25
 *
 * Description:	Class for objects that display icons
 * 				Inherits from Picture
 */
public class ImagePicture extends Picture{

	/**
	 * Private Instance Variables
	 */
	private ImageIcon image; // for storing icons

	/**
	 * Constructor for showing an image
	 */
	public ImagePicture(ImageIcon img) {
		// call super class constructor
		super();
		this.image = img;
		setMyWidth(img.getIconWidth());
		setMyHeight(img.getIconHeight());
	}

	/**
	 * Overloaded constructor
	 */
	public ImagePicture(ImageIcon img, int x, int y) {
		// call the parent constructor
		super(x, y, img.getIconWidth(), img.getIconHeight());
		this.image = img;
	}

	// method to set Image
	public void setImage(ImageIcon image) {
		this.image = image;
	}
	
	// method to return iamge
	
	public ImageIcon getImage() {
		return this.image;
	}
	

	/**
	 * Override the paint from picture
	 */
	public void paint(Graphics g) {
		// paint the image
		this.image.paintIcon(this,  g ,  getxPos(), getyPos());
	}
}