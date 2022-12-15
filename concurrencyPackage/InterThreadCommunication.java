package concurrencyPackage;

class TotalEarnings extends Thread {
	int total = 0;

	@Override
	public void run() {
		int totalseats = 48;
		synchronized(this) {
			for (int i = 0; i < totalseats; i++) {
				total += 100000;
			}
			this.notify();//lock is released
		}
		
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		TotalEarnings te = new TotalEarnings();
		te.start();
		synchronized (te) {
			try {
				te.wait();
			}
			catch(InterruptedException e){
				//wait till lock is released
			}
		}
		System.out.println("Total Earning: " + "Rs " + te.total);
	}

}
