package co.grandcircus.designpatterns;


public class DesignPatternsApp {

	public static void main(String[] args) {
		// Factory pattern
		Shape shape1 = ShapeFactory.getShape("circle");
		Shape shape2 = ShapeFactory.getShape("square");
		Shape shape3 = ShapeFactory.getShape("Circle");

		System.out.println("Shape 1...");
		shape1.draw();

		System.out.println("Shape 2...");
        shape2.draw();
        
        System.out.println("Shape 3...");
        shape3.draw();

        // Singleton pattern
		CounterSingleton counter1 = CounterSingleton.INSTANCE;
		CounterSingleton counter2 = CounterSingleton.INSTANCE;

		System.out.println("Counters Before: 1:" + counter1.getCount() + " 2:" + counter2.getCount());
		counter1.increment();
		counter1.increment();
		System.out.println("Counters After: 1:" + counter1.getCount() + " 2:" + counter2.getCount());

		CounterSingleton counter3 = CounterSingleton.INSTANCE;
		System.out.println("Counter 3:" + counter3.getCount());
	}
}
