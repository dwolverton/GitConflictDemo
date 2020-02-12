package co.grandcircus.designpatterns;
public class ShapeFactory {

	public static Shape getShape(String str) {
		if ("CIRCLE".equals(str)) {
			return new Circle();
		} else if ("SQUARE".equals(str)) {
			return new Square();
		} else {
			throw new IllegalArgumentException("CIRCLE and SQUARE are the only valid shapes."); 
		}
	}
}
