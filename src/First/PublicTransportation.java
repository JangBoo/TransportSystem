package First;

// -----------------------------------------------------

// Due Date feb 20
// Assignment 2
// Part: part 1,2
// Written by: Janghyuk Boo 40005573
// -----------------------------------------------------
public class PublicTransportation {
    protected double ticketPrice;
    private int numOfStops;

    public PublicTransportation() { // must trigger its ancestor classes but it doesn't have ancestor class.
        this.ticketPrice = 10.00;
        this.numOfStops = 1;
    }
    public PublicTransportation(double ticketPrice, int numOfStops) {
        this.ticketPrice = ticketPrice;
        this.numOfStops = numOfStops;
    }
    public PublicTransportation(PublicTransportation pt) {
        this.ticketPrice = pt.ticketPrice;
        this.numOfStops = pt.numOfStops;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumOfStops() {
        return numOfStops;
    }

    public void setNumOfStops(int numOfStops) {
        this.numOfStops = numOfStops;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }else if(getClass() != obj.getClass()){     // or !(obj instanceof PublicTransportation)
            return false;
        }else{
            PublicTransportation a = (PublicTransportation) obj;
            return (ticketPrice == a.ticketPrice && numOfStops == a.numOfStops);
        }
    }

    @Override
    public String toString() {
        return "This Public Transportation's ticket price is " +
                " " + ticketPrice +
                " and its number of stops is " + numOfStops;
    }

    public PublicTransportation clone(){
        return new PublicTransportation(this);//create and return a new Public trnportation with copy constructor
    }

}
