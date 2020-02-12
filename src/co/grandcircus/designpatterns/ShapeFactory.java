package co.grandcircus.designpatterns;
public class ShapeFactory {

	public static Shape getShape(String str) {
		if ("CIRCLE".equalsIgnoreCase(str)) {
			return new Circle();
		} else if ("SQUARE".equalsIgnoreCase(str)) {
			return new Square();
		} else {
			throw new IllegalArgumentException("CIRCLE and SQUARE are the only valid shapes."); 
		}
	}
}
