package concurrencyPackage;

class Good{
	void display() throws InterruptedException{
		for(int i = 0;i<10;i++) {
			System.out.println("Good");
			Thread.sleep(1000);// 1sec
		}
	}
}

class Morning{
	void display() throws InterruptedException{
		for (int i =0;i<10;i++) {
			System.out.println("Morning");
			Thread.sleep(1000);// 1sec
		}
	}
}

public class WithoutMultithreading {

	public static void main(String[] args) throws InterruptedException{
		Good g = new Good();
		g.display();//10sec
		Morning m = new Morning();
		m.display();//10sec
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