public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;

// main constructor
  public Reservation(int count, int capacity, boolean open) {
    // looks to see if reservation are to small = 0 or large = +8
    if (count < 1 || count > 8) {
      System.out.println("Invalid reservation!");
    }
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }
  // confirmed reservations & prints out confirmed or denied by looking at guestCount
  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
			isConfirmed = false;
    }
  }
  // User Confimed message 
  public void informUser() {
    if (!isConfirmed) {
      System.out.println("Unable to confirm reservation, please contact restaurant.");
    } else {
      System.out.println("Please enjoy your meal!");
    }
  }

  public static void main(String[] args) {
    // Create instances here

  }
}
