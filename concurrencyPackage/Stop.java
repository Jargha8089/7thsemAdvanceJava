package concurrencyPackage;

public class Stop extends Thread{
	@Override
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				sleep(2000);
			}catch(InterruptedException e) {
				
			}
		}
	}

	public static void main(String[] args) {
		Stop t1 = new Stop();
		t1.start();
		Stop t2 = new Stop();
		t2.start();
		t2.stop();
		System.out.println("t2 is stopped");
	}

}
