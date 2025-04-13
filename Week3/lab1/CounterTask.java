package Bai1;

public class CounterTask implements Runnable{
	private Counter counter;
	
	public CounterTask(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 1000; i++) {
			counter.increment();
			System.out.println("Gia tri: " + i);
		}
	}	
}
