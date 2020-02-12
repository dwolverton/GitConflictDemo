package co.grandcircus.designpatterns;


public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("_____");
		System.out.println("|   |");         
		System.out.println("|___|");
	}

}
