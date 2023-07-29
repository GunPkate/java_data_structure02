import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel {
	MyArraylistT<Particle> list = new MyArraylistT<Particle>();
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
							list.add(new Particle());
//							System.out.println(list.get(i).toString());
//							System.out.println((i));
						}// add particle to list
						
						for (int i = 0; i < list.size(); i++) {
							list.get(i).move();				
						}
						
						repaint();
					}		
				}
			}
		);
		t.start();

		JFrame f = new JFrame();
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setVisible(true);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).draw(g);				
		}
	}
	
	public static void main(String args[]) {
		new GUI();
	}
}
