package shapegame;

public class Shape {
	
	public int x, y, w, h;
	private int dirX, dirY;
	public static int worldW;
	public static int worldH;
	private ShapeTypes shapeType;
	
	public Shape(int x, int y, int w, int h, int dirX, int dirY, ShapeTypes shape) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
		this.shapeType = shape;
//		System.out.println("Shape Created: " + shapeType);
	}
	
	public Shape(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	public void move() { 
		this.x += this.dirX; 
		this.y += this.dirY; 
		this.dirX = (this.x < 0 - this.w || this.x > worldW - this.w) ? -this.dirX : this.dirX;
		this.dirY = (this.y < 0 - this.y || this.y > worldH - this.h) ? -this.dirY : this.dirY;
	}
	
	public static void setWorld(int w, int h) {
		worldW = w;
		worldH = h;
	}
	
	public ShapeTypes getShape() {
		return this.shapeType;
	}
}

