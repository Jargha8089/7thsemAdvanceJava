package concurrencyPackage;

public class Yield extends Thread{
	@Override
	public void run() {//thread-0
		Thread.yield();
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" in control");
		}
	}

	public static void main(String[] args) {//main-thread
		//Thread.yield();
		Yield y = new Yield();
		y.start();
		Thread.yield();
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" in control");
		}
	}

}
