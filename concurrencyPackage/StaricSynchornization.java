package concurrencyPackage;

class CSITBooking {
	static int csit_seats = 48;

	public static synchronized void bookSeat(int seats) {
		if (csit_seats >= seats) {
			System.out.println(seats + " seats are booked successfully");
			csit_seats = csit_seats - seats;
			System.out.println(csit_seats + " seats are available");
		} 
		else {
			System.out.println(seats + " seats are not available");
			System.out.println(csit_seats + " seats are available");
		}
	}
}

class Esewa extends Thread {
	static CSITBooking cb;
	int seats;

	public Esewa(CSITBooking cb, int seats) {
		this.cb = cb;
		this.seats = seats;
	}

	@Override
	public void run() {
		CSITBooking.bookSeat(seats);
	}
}

//class Khalti extends Thread {
//	CSITBooking cb;
//	int seats;
//
//	public Khalti(CSITBooking cb, int seats) {
//		this.cb = cb;
//		this.seats = seats;
//	}
//
//	@Override
//	public void run() {
//		cb.bookSeat(seats);
//	}
//}

public class StaricSynchornization {

	public static void main(String[] args) {
		 CSITBooking b1 = new CSITBooking();
		 Esewa e1 = new Esewa(b1,12);
		 e1.start();
		 
		 Esewa e2 = new Esewa(b1,14);
		 e2.start();
		 //different object
		 CSITBooking b2 = new CSITBooking();
		 Esewa e3 = new Esewa(b2,13);
		 e3.start();
	}

}
