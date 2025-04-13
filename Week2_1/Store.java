package Week2_1;

public class Store {
	int maxN = 50;
	long[] a;
	int n;

	public Store() {
		n = 0;
		a = new long[maxN];
	}

	private boolean empty() {
		return n == 0;
	}

	private boolean full() {
		return n == maxN;
	}

	public boolean put(long x) {
		if (full()) {
			return false;
		}
		a[n++] = x;
		n++;
		try {
			Thread.sleep(250);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return true;
	}

	public long get() {
		long result = 0;
		if (!empty()) {
			result = a[0];
			for (int i = 0; i < n - 1; i++) {
				a[i] = a[i + 1];
				n--;
			}
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		return result;
	}

	public static void main(String[] args) {
		Store st = new Store();
		Producer pr = new Producer(st);
		Consumer cs = new Consumer(st);
		pr.start();
		;
		cs.start();
		;
	}
}
