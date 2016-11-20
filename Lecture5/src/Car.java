import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Car {
	
	private double xPos = 0;
	private double yPos = 0;
	
	public Car(double x, double y) {
		xPos = x;
		yPos = y;
	}
	
	public void draw(Graphics g) {
				
		Graphics2D g2 = (Graphics2D) g;

		Point2D.Double rearWindowStart = new Point2D.Double(this.xPos+10, this.yPos+10);
		Point2D.Double rearWindowEnd = new Point2D.Double(this.xPos+20,this.yPos+0);
		Line2D.Double rearWindow = new Line2D.Double(rearWindowStart,rearWindowEnd);

		Point2D.Double frontWindowStart = new Point2D.Double(this.xPos+40,this.yPos+0);
		Point2D.Double frontWindowEnd = new Point2D.Double(this.xPos+50,this.yPos+10);
		Line2D.Double frontWindow = new Line2D.Double(frontWindowStart,frontWindowEnd);

		Point2D.Double roofStart = new Point2D.Double(this.xPos+20,this.yPos+0);
		Point2D.Double roofEnd = new Point2D.Double(this.xPos+40,this.yPos+0);
		Line2D.Double roof = new Line2D.Double(roofStart,roofEnd);

		Ellipse2D.Double rearTire = new Ellipse2D.Double(this.xPos+10,this.yPos+20,10,10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(this.xPos+40,this.yPos+20,10,10);

		Rectangle.Double body = new Rectangle.Double(this.xPos+0,this.yPos+10,60.0,10.0);

		g2.draw(rearTire);
		g2.draw(frontTire);
		g2.draw(body);
		g2.draw(rearWindow);
		g2.draw(frontWindow);
		g2.draw(roof);
	}
}
