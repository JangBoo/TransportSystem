package Second;
// -----------------------------------------------------

// Due Date feb 20
// Assignment 2
// Part: part 1,2
// Written by: Janghyuk Boo 40005573
// -----------------------------------------------------
public class Metro extends CityBus {
    private int numVehicle;
    private String nameCity;

    public Metro() {
        this.numVehicle = 9;
        this.nameCity = "default city";
    }

    public Metro(double ticketPrice, int numOfStops, long routeNum, int beginOperationYear, String lineName, String driverName, int numVehicle, String nameCity) {
        super(ticketPrice, numOfStops, routeNum, beginOperationYear, lineName, driverName);
        this.numVehicle = numVehicle;
        this.nameCity = nameCity;
    }

    public Metro(Metro mt) {
        ticketPrice = mt.ticketPrice;
        setNumOfStops(mt.getNumOfStops());  //cuz it is private
        routeNum = mt.routeNum;
        beginOperationYear = mt.beginOperationYear;
        lineName = mt.lineName;
        driverName = mt.driverName;
        this.numVehicle = mt.numVehicle;
        this.nameCity = mt.nameCity;
    }

    public int getNumVehicle() {
        return numVehicle;
    }

    public void setNumVehicle(int numVehicle) {
        this.numVehicle = numVehicle;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    @Override
    public String toString() {
        return "Metro has ticket price " +
                ticketPrice +
                " and its number of stops is " + getNumOfStops()        //cuz it is private from base. need to use getter
                + " routeNum " + routeNum +
                ", beginOperationYear is " + beginOperationYear +
                ", lineName is " + lineName +
                ", driverName is " + driverName +
                "number of Vehicle is " + numVehicle +
                ", name of City is " + nameCity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {     // or !(obj instanceof PublicTransportation)
            return false;
        } else {
            Metro a = (Metro) obj;
            return (routeNum == a.routeNum && beginOperationYear == a.beginOperationYear &&
                    lineName.equals(a.lineName) && driverName.equals(a.driverName) &&
                    getNumOfStops() == a.getNumOfStops() &&
                    ticketPrice == a.ticketPrice &&
                    numVehicle == a.numVehicle &&
                    nameCity.equals(a.nameCity));       //  numofstop is private and it is also from base class, it also has to be checked
        }

    }
    public Metro clone(){
        return new Metro(this);
    }
}