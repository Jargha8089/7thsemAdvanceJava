package concurrencyPackage;

class CSITBookingSystem {
	int csit_seats = 48;

	public synchronized void bookSeat(int seats) {
		if (csit_seats >= seats) {
			System.out.println(seats + " seats are booked successfully");
			csit_seats = csit_seats - seats;
			System.out.println(csit_seats + " seats are available");
		} else {
			System.out.println(seats + " seats are not available");
			System.out.println(csit_seats + " seats are available");
		}
	}
}

public class WithoutSynchronization extends Thread{
	static CSITBookingSystem sbs;
	int seats;
	@Override
	public void run() {
		sbs.bookSeat(seats);
	}

	public static void main(String[] args) {
		sbs=new CSITBookingSystem();
		WithoutSynchronization subash = new WithoutSynchronization();
		subash.seats =15;
		subash.start();
		
		WithoutSynchronization deshant = new WithoutSynchronization();
		deshant.seats =10;
		deshant.start();
		
		WithoutSynchronization anjit = new WithoutSynchronization();
		anjit.seats =23;
		anjit.start();
		
		WithoutSynchronization kumar = new WithoutSynchronization();
		kumar.seats =5;
		kumar.start();
	}

}
