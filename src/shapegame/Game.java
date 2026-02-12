package shapegame;

import java.awt .*;
import java.awt.event .*;
import java.util .*;
import java.util. Timer;
import javax.swing .*;

public class Game extends Canvas {
	private ArrayList<Shape> shape = new ArrayList<>(); 

	Game() {
		shape.add(new Shape(15,15,15,15,20,80, ShapeTypes.Oval, Color.BLUE));
		shape.add(new Shape(10,10,10,10,40,40, ShapeTypes.RoundRectangle, Color.BLUE));
		shape.add(new Shape(400,400,20,20,80,20, ShapeTypes.ThreeDRectangle, Color.BLUE));
		shape.add(new Shape(400,400,20,20,60,30));
		shape.add(new Shape(400,400,20,20,50,40));
		shape.add(new Shape(400,400,20,20,40,50));
		shape.add(new Shape(400,400,20,20,30,60));
		shape.add(new Shape(400,400,20,20,20,70));
		shape.add(new Shape(400,400,20,20,10,80));
		
		
//		balls = new Shape[3]; 
//		balls[0] = new Shape(15,15,15,15,15,15, ShapeTypes.Oval, Color.GREEN); 
//		balls[1] = new Shape(10,10,10,10,10,10, ShapeTypes.RoundRectangle, Color.GREEN); 
//		balls[2] = new Shape(20,20,20,20,20,20, ShapeTypes.ThreeDRectangle, Color.GREEN);
		
		Shape.setWorld(800,800);
		
//		Shape test = new Shape(1,1,1,1,1,1, ShapeTypes.Arc);
//		System.out.println(test.getShape());
		
		// Creates Form
		JFrame frame = new JFrame();
		this.setSize(800, 800);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);
	
		// Creates Timer to call the draw() method every 50ms
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				draw();
			}
		};
	
		t.schedule(tt, 0, 50);
		
		// Runs when the window is closed
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				t.cancel();
				tt.cancel();
			}
		});
	}
	
	
	// Invokes the repaint which will run the paint() method
	public void draw() {
		//Some logic
		for(Shape sha : shape) {
			sha.move();
		}
		this.repaint();
	}
	
	public void paint(Graphics g) {
		g.drawRect(0, 0, Shape.worldW, Shape.worldH);
		// Logic
		for(Shape sha : shape) {
			g.setColor(sha.getColor());
			switch (sha.getShape()){
			case Rectangle 			-> g.drawRect(sha.x, sha.y, sha.w, sha.h);
			case ThreeDRectangle 	-> g.draw3DRect(sha.x, sha.y, sha.w, sha.h, true);
			case RoundRectangle 	-> g.drawRoundRect(sha.x, sha.y, sha.w, sha.h, 20, 20);
			case Oval				-> g.drawOval(sha.x, sha.y, sha.w, sha.h);
			case Arc				-> g.drawArc(sha.x, sha.y, sha.w, sha.h, 0, 180);
			default 				-> g.drawOval(sha.x, sha.y, sha.w, sha.h);
			}
//			g.drawOval(ball.x, ball.y, ball.w, ball.h);
		}
	}
}	