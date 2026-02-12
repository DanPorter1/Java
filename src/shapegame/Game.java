package shapegame;

import java.awt .*;
import java.awt.event .*;
import java.util .*;
import java.util. Timer;
import javax.swing .*;

public class Game extends Canvas {
	private Shape[] balls; 

	Game() {
		balls = new Shape[3]; 
		balls[0] = new Shape(15,15,15,15,15,15, ShapeTypes.Oval, Color.GREEN); 
		balls[1] = new Shape(10,10,10,10,10,10, ShapeTypes.RoundRectangle, Color.GREEN); 
		balls[2] = new Shape(20,20,20,20,20,20, ShapeTypes.ThreeDRectangle, Color.GREEN);
		
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
		for(Shape ball : balls) {
			ball.move();
		}
		this.repaint();
	}
	
	public void paint(Graphics g) {
		g.drawRect(0, 0, Shape.worldW, Shape.worldH);
		// Logic
		for(Shape ball : balls) {
			switch (ball.getShape()){
			case Rectangle 			-> g.drawRect(ball.x, ball.y, ball.w, ball.h);
			case ThreeDRectangle 	-> g.draw3DRect(ball.x, ball.y, ball.w, ball.h, true);
			case RoundRectangle 	-> g.drawRoundRect(ball.x, ball.y, ball.w, ball.h, 20, 20);
			case Oval				-> g.drawOval(ball.x, ball.y, ball.w, ball.h);
			case Arc				-> g.drawArc(ball.x, ball.y, ball.w, ball.h, 0, 180);
			default 				-> g.drawOval(ball.x, ball.y, ball.w, ball.h);
			}
			g.setColor(ball.getColor());
//			g.drawOval(ball.x, ball.y, ball.w, ball.h);
		}
	}
}	