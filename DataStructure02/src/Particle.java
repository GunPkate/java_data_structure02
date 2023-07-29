import java.awt.Color;
import java.awt.Graphics;

public class Particle {
	private double x, y; //position
	private double vx, vy; //velocity
	private double ax,ay; //
	
	private int age;
	private Color color;
	private Boolean isAlive;
	
	public Particle() { //Function which has same name as Class used to set default values to object
		x = 250;
		y = 250;
		vx = (int)(Math.random() * 6-3);
		vy = (int)(Math.random() * 6-3);
		ax = 0;
		ay = 0.5;
		color = new Color((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
		age = 1;
		isAlive = true;
	}
	
	public void move() {
		age++;
		if(age >200) {isAlive = false;}
		x = x + vx;
		y = y + vy;
		
		vx =vx+ax;
		vy =vy+ay;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval((int)x, (int)y, 8, 8);
	}
	
	public boolean isAlive() {
		return isAlive;
	}
}
