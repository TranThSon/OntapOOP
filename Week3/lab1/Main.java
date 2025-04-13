package Bai1;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		CounterTask obj = new CounterTask(counter);
		Thread thread1 = new Thread(obj);
		Thread thread2 = new Thread(obj);
		
		thread1.start(); thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Gia tri cuoi cung cua Counter: " + counter.getCounter());
	}
}
