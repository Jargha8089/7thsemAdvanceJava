package concurrencyPackage;

class Hi implements Runnable{//implementing Runnable interface
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}// 1sec
		}
	}
}

class Hello implements Runnable{//implementing Runnable interface
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}// 1sec
		}
	}
}

public class UsingRunnableInterface {

	public static void main(String[] args) {
		Hi i = new Hi();//this is not thread
		Thread t1 = new Thread(i);
		Hello e = new Hello();
		Thread t2 = new Thread(e);
		t1.start();
		t2.start();

	}

}
