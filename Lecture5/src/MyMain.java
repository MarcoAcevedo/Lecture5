import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyMain {
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame();
		frame.setSize(800, 400);
		frame.setTitle("CIIC 4010 / ICOM 4015 Developers");	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		CarStage theComponent = new CarStage();
		frame.add(theComponent);
		
		while(!theComponent.someCarWon()) {
			frame.repaint();
			Thread.sleep(100);
		}
		JOptionPane.showMessageDialog(null, "END OF RACE Car#"+CarStage.Win + " Won!!!");
		System.exit(0);
	}
}