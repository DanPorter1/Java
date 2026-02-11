package shapegame;

public enum ShapeTypes {
	Rectangle(1),
	ThreeDRectangle(2),
	RoundRectangle(3),
	Oval(4),
	Arc(5);

	private final int code;
	
	ShapeTypes(int code) {
		this.code = code;
	}
}
