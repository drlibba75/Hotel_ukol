import java.math.BigDecimal;

public class Room {

int numberOfRoom;
int numberOfBed;
boolean balcony;
boolean seaView;
BigDecimal pricePerNight;




    public Room (int numberOfRoom, int numberOfBed, boolean balcony, boolean seaView, BigDecimal pricePerNight) {
        this.numberOfRoom = numberOfRoom;
        this.numberOfBed = numberOfBed;
        this.balcony = balcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;

    }


    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }



    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }



    public boolean getBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }





    public boolean getSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }




    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }



    }