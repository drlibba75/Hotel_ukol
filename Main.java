import java.math.BigDecimal;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


    Guest guest1 = new Guest("Adéla Malíková",  LocalDate.of(1993, 3, 13));
            System.out.println(guest1.getName()+" "+" nar. "+ guest1.getBorn());

    Guest guest2 = new Guest("Jan Dvořáček", LocalDate.of(1995, 5, 5));
            System.out.println(guest2.getName()+" "+" nar. "+ guest2.getBorn());

    Room room1 = new Room(1, 1, true, true, BigDecimal.valueOf(1000));
            System.out.println("Pokoj č."+room1.getNumberOfRoom()+" - počet lůžek: "+room1.getNumberOfBed()+", s balkónem: "+room1.getBalcony()+", s výhledem na moře: "+room1.getSeaView()+", cena za noc: "+ room1.getPricePerNight()+" Kč");


    Room room2 = new Room(2, 1, true, true, BigDecimal.valueOf(1000));

           System.out.println("Pokoj č."+room2.getNumberOfRoom()+" - počet lůžek: "+room2.getNumberOfBed()+", s balkónem: "+room2.getBalcony()+", s výhledem na moře: "+room2.getSeaView()+", cena za noc: "+ room2.getPricePerNight()+" Kč");

    Room room3 = new Room(3, 3, false, true, BigDecimal.valueOf(2400));

           System.out.println("Pokoj č."+room3.getNumberOfRoom()+" - počet lůžek: "+room3.getNumberOfBed()+", s balkónem: "+room3.getBalcony()+", s výhledem na moře: "+room3.getSeaView()+", cena za noc: "+ room3.getPricePerNight()+" Kč");





        Booking booking1 = new Booking(1, guest1.getName(), room1.getNumberOfRoom(), LocalDate.of(2021,7,19), LocalDate.of(2021,7,26),"pracovní pobyt");

        System.out.println("č.rezervace: "+booking1.getNumberOfBooking() + " - Pokoj č."+room1.getNumberOfRoom()+ ", na jméno/a "   + guest1.getName()+", od "+ booking1.getFromDate()+" do "+booking1.getToDate()+", "+ booking1.getTypeOfVacation() );



        Guest couple1 = new Guest("Adéla Malíková a Jan Dvořáček");


        Booking booking2 = new Booking(2, couple1.getName(),  room3.getNumberOfRoom(), LocalDate.of(2021,9,1), LocalDate.of(2021,9,14),"rekreační pobyt");
        System.out.println("č.rezervace: "+booking2.getNumberOfBooking() + " - Pokoj č."+room3.getNumberOfRoom()+ ", na jméno/a "   + couple1.getName()+", od "+ booking2.getFromDate()+" do "+booking2.getToDate()+", "+ booking2.getTypeOfVacation() );



        List<Booking> listOfBookings = new ArrayList<>();
        listOfBookings.add(booking1);
        listOfBookings.add(booking2);

        System.out.println();
        System.out.println("Tabulka rezervací:");
        System.out.println();
        System.out.println(listOfBookings.get(0).getNumberOfBooking());
        System.out.println(listOfBookings.get(0).getGuestNamesForBooking());
        System.out.println("Pokoj č. "+listOfBookings.get(0).getRoomForbooking());
        System.out.print(listOfBookings.get(0).getFromDate()+" až ");
        System.out.println(listOfBookings.get(0).getToDate());
        System.out.println();

        System.out.println(listOfBookings.get(1).getNumberOfBooking());
        System.out.println(listOfBookings.get(1).getGuestNamesForBooking());
        System.out.println("Pokoj č. "+listOfBookings.get(1).getRoomForbooking());
        System.out.print(listOfBookings.get(1).getFromDate()+" až ");
        System.out.println(listOfBookings.get(1).getToDate());
        System.out.println();

    }
}


