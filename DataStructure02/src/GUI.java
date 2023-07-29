import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel {
	MyArraylist list = new MyArraylist();
	public GUI() {
		Thread t = new Thread(
			new Runnable() {	
				@Override
				public void run() {
					while(true) {
						try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						int n = (int)(Math.random()*50);
						for (int i = 0; i < n; i++) {
							list.add(n);
						}
					}		
				}
			}
		);
			
		JFrame f = new JFrame();
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setVisible(true);
	}
	
	public void paint(Graphics g) {
		
	}
	
	public static void main(String args[]) {
		new GUI();
	}
}
