package Second;

import First.PublicTransportation;

// -----------------------------------------------------

// Due Date feb 20
// Assignment 2
// Part: part 1,2
// Written by: Janghyuk Boo 40005573
// -----------------------------------------------------
public class CityBus extends PublicTransportation {
    protected long routeNum;            //answer 2 is at the bottom.
    protected int beginOperationYear;
    protected String lineName;
    protected String driverName;

    public CityBus() {
        routeNum= 999;
        beginOperationYear = 1999;
        lineName = "default line";
        driverName = "default driver";
    }

    public CityBus(double ticketPrice, int numOfStops, long routeNum, int beginOperationYear, String lineName, String driverName) {
        super(ticketPrice, numOfStops);
        this.routeNum = routeNum;
        this.beginOperationYear = beginOperationYear;
        this.lineName = lineName;
        this.driverName = driverName;
    }

    public CityBus(CityBus cb) {
        // if i can get direct access an atrribute by name from a base class, i must do it instead of using public method

        setNumOfStops(cb.getNumOfStops());
        ticketPrice = cb.ticketPrice;
        //answer 2.1: numOfStops =cb.numOfStops; it is incorrect because numOfStop is private.
        //setTicketPrice(pt.ticketPrice);    it is impossible to refer to its base class directly, even if they are protected
        this.routeNum = cb.routeNum;
        this.beginOperationYear = cb.beginOperationYear;
        this.lineName = cb.lineName;
        this.driverName = cb.driverName;
    }

    public long getRouteNum() {
        return routeNum;
    }

    public void setRouteNum(long routeNum) {
        this.routeNum = routeNum;
    }

    public int getBeginOperationYear() {
        return beginOperationYear;
    }

    public void setBeginOperationYear(int beginOperationYear) {
        this.beginOperationYear = beginOperationYear;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }else if(getClass() != obj.getClass()){     // or !(obj instanceof PublicTransportation)
            return false;
        }else{
            CityBus a = (CityBus) obj;
            return (routeNum == a.routeNum && beginOperationYear == a.beginOperationYear &&
                    lineName.equals(a.lineName)&& driverName.equals(a.driverName) &&
                    getNumOfStops()== a.getNumOfStops() &&
                    ticketPrice == a.ticketPrice);       //  numofstop is private and it is also from base class, it also has to be checked
        }
    }

    @Override
    public String toString() {
        return "CityBus has " + "ticket price " +
                ticketPrice +
                " and its number of stops is " + getNumOfStops()        //cuz it is private from base. need to use getter
                + " routeNum " + routeNum +
                ", beginOperationYear is " + beginOperationYear +
                ", lineName is " + lineName +
                ", driverName is " + driverName ;

        //Part 2 answer: it is impossible to refer to any of vehicle attributes directly, even if it is protected, because it is in different package.
        // for example the below is illegal.
        //PublicTrnsportation pt = new PublicTransportation();
        //return pt.numofDoors.
        // if it is system.out.println(cb.getNumOfStops()), it works.
    }
    public CityBus clone(){
        return new CityBus(this);
    }

}
