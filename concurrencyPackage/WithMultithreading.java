package concurrencyPackage;

class Good1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Good");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}// 1sec
		}
	}
}

class Morning1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Morning");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}// 1sec
		}
	}
}

public class WithMultithreading {

	public static void main(String[] args) throws InterruptedException {
		Good1 g = new Good1();
		g.start();// start invokes run method
		Morning1 m = new Morning1();
		m.start();// start invokes run method
	}

}

//1.using thread class 
//class A extends threads{
//	
//}
//2.using runnable interface
//class A implements Runnable{
//	
//}
//3.class thread{
//void run() {
//	
//}
//interface Runnable{
//	void run();
//}
//}