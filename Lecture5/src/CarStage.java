import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JComponent;
import java.lang.System;

public class CarStage extends JComponent {
	private static final long serialVersionUID = 1L;
	
	int counter = 0;
	boolean onAWall = false;
	boolean carReachedBottom = false;
	boolean someCarWon = false;
	Random randomNumber = new Random();
	int nextYPos=0;
	int numberOfLanes;
	int laneHeight = 50;
	MutableCar[] cars;
	int Height = this.getHeight();
	static int Win;
	
	public CarStage(){
		numberOfLanes = (400/laneHeight)-1;
		cars = new MutableCar[numberOfLanes];
		for(int i=0; i<numberOfLanes;i++){
		cars[i]=new MutableCar(0,nextYPos,Color.BLUE,10,1,i);
		nextYPos+=laneHeight;
		}
	}
	
	
	public boolean getReachedBottom() {
		return carReachedBottom;
		}
	
	public boolean someCarWon() {
		return someCarWon;
		}

	public void paintComponent (Graphics g) {
		for(MutableCar car : cars) {
			car.draw(g);
			int deltaxCar = randomNumber.nextInt(car.getHorizontalSpeed());
			car.moveInX(deltaxCar);
		
		
			if (car.getXPos()+60 >= this.getWidth()){
				//Car 1 hit wall
				car.setPosition(this.getWidth()-60, car.getYPos());
				someCarWon=true;
				Win=car.getNumber()+1;
				
			}
		}
		System.out.println(counter++);
	}
}