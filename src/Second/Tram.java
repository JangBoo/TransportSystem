package Second;
// -----------------------------------------------------

// Due Date feb 20
// Assignment 2
// Part: part 1,2
// Written by: Janghyuk Boo 40005573
// -----------------------------------------------------
public class Tram extends CityBus {
    private int maxSpeed;

    public Tram() {
        this.maxSpeed = 99;
    }
    // parametrized
    public Tram(double ticketPrice, int numOfStops, long routeNum, int beginOperationYear, String lineName, String driverName, int maxSpeed) {
        super(ticketPrice, numOfStops, routeNum, beginOperationYear, lineName, driverName);
        this.maxSpeed = maxSpeed;
    }

    public Tram(Tram tr) {
        ticketPrice = tr.ticketPrice;
        setNumOfStops(tr.getNumOfStops());  //cuz it is private
        routeNum = tr.routeNum;
        beginOperationYear = tr.beginOperationYear;
        lineName = tr.lineName;
        driverName = tr.driverName;
        this.maxSpeed = tr.maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }else if(getClass() != obj.getClass()){     // or !(obj instanceof PublicTransportation)
            return false;
        }else{
            Tram a = (Tram) obj;
            return (routeNum == a.routeNum && beginOperationYear == a.beginOperationYear &&
                    lineName.equals(a.lineName)&& driverName.equals(a.driverName) &&
                    getNumOfStops()== a.getNumOfStops() &&
                    ticketPrice == a.ticketPrice &&
                    maxSpeed == a.maxSpeed);       //  numofstop is private and it is also from base class, it also has to be checked
        }
    }

    @Override
    public String toString() {
        return "Tram has " + "ticket price " +
                ticketPrice +
                " and its number of stops is " + getNumOfStops()        //cuz it is private from base. need to use getter
                + " routeNum " + routeNum +
                ", beginOperationYear is " + beginOperationYear +
                ", lineName is " + lineName +
                ", driverName is " + driverName +
                " maxSpeed " + maxSpeed
                ;
    }
    public Tram clone(){
        return new Tram(this);
    }
}
