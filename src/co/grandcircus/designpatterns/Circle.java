package co.grandcircus.designpatterns;


public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println(" .--.");
		System.out.println("/    \\");         
		System.out.println("\\    /");
		System.out.println(" '--'");
	}

}
