import java.time.LocalDate;

public class Booking {

   int numberOfBooking;

   LocalDate fromDate;
   LocalDate toDate;
   String typeOfVacation;


   String guestNamesForBooking;




   int roomForBooking;



   public Booking (int numberOfBooking, String guestNamesForBooking, int roomForBooking, LocalDate fromDate, LocalDate toDate, String typeOfVacation ) {
      this.numberOfBooking = numberOfBooking;
      this.guestNamesForBooking = guestNamesForBooking;
      this.roomForBooking = roomForBooking;
      this.fromDate = fromDate;
      this.toDate = toDate;
      this.typeOfVacation = typeOfVacation;

   }



   public int getNumberOfBooking() {
      return numberOfBooking;
   }

   public void setNumberOfBooking(int numberOfBooking) {
      this.numberOfBooking = numberOfBooking;
   }


   public String getGuestNamesForBooking() {
      return guestNamesForBooking;
   }

   public void setGuestNamesForBooking(String guestNamesForBooking) {
      this.guestNamesForBooking = guestNamesForBooking;
   }

   public int getRoomForbooking() {
      return roomForBooking;
   }

   public void setRoomForbooking(int roomForbooking) {
      this.roomForBooking = roomForbooking;
   }

   public LocalDate getFromDate() {
      return fromDate;
   }

   public void setFromDate(LocalDate fromDate) {
      this.fromDate = fromDate;
   }

   public LocalDate getToDate() {
      return toDate;
   }

   public void setToDate(LocalDate toDate) {
      this.toDate = toDate;
   }

   public String getTypeOfVacation() {
      return typeOfVacation;
   }

   public void setTypeOfVacation(String typeOfVacation) {
      this.typeOfVacation = typeOfVacation;
   }
}
