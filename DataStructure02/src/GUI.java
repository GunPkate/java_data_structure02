import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel {
	public GUI() {
					
		JFrame f = new JFrame();
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setVisible(true);
	}
	
//	public void paint(Graphics g) {
//		
//	}
	
	public static void main(String args[]) {
		new GUI();
	}
}
