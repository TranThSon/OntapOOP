package Bai1;

public class Counter {
	private int counter = 0;
	public synchronized void increment() {
		counter++;
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int getCounter() {
		return counter;
	}
	
}
