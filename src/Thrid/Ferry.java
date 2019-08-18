package Thrid;

import First.PublicTransportation;
// -----------------------------------------------------

// Due Date feb 20
// Assignment 2
// Part: part 1,2
// Written by: Janghyuk Boo 40005573
// -----------------------------------------------------
public class Ferry extends PublicTransportation{
    private int buildYear;
    private String shipName;

    public Ferry() {
        this.buildYear = 1999;
        this.shipName = "default ship";
    }

    public Ferry(double ticketPrice, int numOfStops, int buildYear, String shipName) {
        super(ticketPrice, numOfStops);
        this.buildYear = buildYear;
        this.shipName = shipName;
    }

    public Ferry(Ferry fr) {
        setNumOfStops(fr.getNumOfStops());
        ticketPrice = fr.ticketPrice;
        this.buildYear = fr.buildYear;
        this.shipName = fr.shipName;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {     // or !(obj instanceof PublicTransportation)
            return false;
        } else {
            Ferry a = (Ferry) obj;
            return (buildYear == a.buildYear && shipName.equals(a.shipName) &&
                    getNumOfStops() == a.getNumOfStops() &&
                    ticketPrice == a.ticketPrice);
        }
    }
    @Override
    public String toString() {
        return "Ferry has a " + "ticket price " +
                ticketPrice +
                " and its number of stops is " + getNumOfStops() +
                " buildYear " + buildYear +
                ", shipName " + shipName ;
    }
}
