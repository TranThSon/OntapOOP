package Week3;

public class namchietgia {
	public static void main(String[] args) {
		Dua[] danhSachDua = new Dua[5];
		for (int i = 0; i < 5; i++)
			danhSachDua[i] = new Dua();
		for (int i = 0; i < 5; i++) {
			ChietGia chietGia = new ChietGia(i, danhSachDua[i], danhSachDua[(i + 1) % 5]);
			new Thread(chietGia).start();
		}
	}
}

class Dua {
	private boolean daDuocLay = false;

	synchronized void lay() throws InterruptedException {
		while (daDuocLay)
			wait();
		daDuocLay = true;
	}

	synchronized void datXuong() {
		daDuocLay = false;
		notify();
	}
}

class ChietGia implements Runnable {
	private int soThuTu;
	private Dua benTrai, benPhai;

	public ChietGia(int soThuTu, Dua benTrai, Dua benPhai) {
		this.soThuTu = soThuTu;
		this.benTrai = benTrai;
		this.benPhai = benPhai;
	}

	public void run() {
		try {
			while (true) {
				suyNghi();
				if (soThuTu % 2 == 0) {
					benTrai.lay();
					benPhai.lay();
				} else {
					benPhai.lay();
					benTrai.lay();
				}
				an();
				benTrai.datXuong();
				benPhai.datXuong();
			}
		} catch (InterruptedException e) {
		}
	}

	private void suyNghi() throws InterruptedException {
		System.out.println("Triết gia " + soThuTu + " đang suy nghĩ...");
		Thread.sleep((int) (Math.random() * 1000));
	}

	private void an() throws InterruptedException {
		System.out.println("Triết gia " + soThuTu + " đang ăn...");
		Thread.sleep((int) (Math.random() * 1000));
	}
}
