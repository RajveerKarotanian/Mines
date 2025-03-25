import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 * @author Rajveer Karotanian
 *
 * Date: 3/24/25
 *
 * Description:	A class that defines a component - Picture
 * 				inherits from JComponent
 */
public class Picture extends JComponent{

	/*
	 * Instance Data - Attributes
	 */

	private Color color;
	private int xPos, yPos, myWidth, myHeight;

	/*
	 * Default Constructor
	 */

	public Picture() {
		// Initialize color, xPos, yPos, myWidth, and myHeight
		this.color = Color.RED;
		this.xPos = 0;
		this.yPos = 0;
		this.myWidth = 50;
		this.myHeight = 25;
	}

	/*
	 * Overloaded Constructor
	 */

	public Picture(int x, int y, int w, int h) {
		this.color = Color.RED;
		this.xPos = x;
		this.yPos = y;
		this.myWidth = w;
		this.myHeight = h;

	}


	public void setColor(Color color) {
		this.color = color;
	}

	/*
	 * Set color based on r, g, b
	 */
	public void setColor(int r, int g, int b) {
		this.color = new Color(r, g, b);
	}

	public Color getColor() {
		return color;
	}
	
	public int getxPos() {
		return xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}


	public void setyPos(int yPos) {
		this.yPos = yPos;
	}


	public int getMyWidth() {
		return myWidth;
	}

	public int getMyHeight() {
		return myHeight;
	}

	public void setMyWidth(int myWidth) {
		this.myWidth = myWidth;
	}


	public void setMyHeight(int myHeight) {
		this.myHeight = myHeight;
	}

	/*
	 * own paint method - Overrides JComponent's paint
	 */
	public void paint(Graphics g) {
		g.setColor(this.color);
		g.drawRect(this.xPos, this.yPos, this.myWidth, this.myHeight);

	}
}