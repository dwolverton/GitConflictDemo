package co.grandcircus.designpatterns;


public class CounterSingleton {
	
	// Create one shared instance here.
	public static final CounterSingleton INSTANCE = new CounterSingleton();
	
	private int count = 0;
	
	// Private so that no other class can create an instance.
	private CounterSingleton() {}
	
	public int getCount() {
		return count;
	}
	
	public void increment() {
		count++;
	}

}
