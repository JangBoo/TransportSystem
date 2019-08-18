package Forth;

import First.PublicTransportation;

// -----------------------------------------------------

// Due Date feb 20
// Assignment 2
// Part: part 1,2
// Written by: Janghyuk Boo 40005573
// -----------------------------------------------------
public class AirCraft extends PublicTransportation{
     enum airTransport {
        Helicopter,
        Airline,
        Glider,
        Ballon
    }

     enum maintenance{
        Weekly,
        Montly,
        Yearly}

    protected maintenance maint;        //part 2 answer: i couldn't make it private to use it in the mian. I put the main in the same package so i can use protected.
    protected airTransport airt;

    public AirCraft() { //default
        this.airt = airTransport.Airline;
        this.maint = maintenance.Weekly;    //the rest will be done by default base constructor.
    }

    public AirCraft(double ticketPrice, int numOfStops, airTransport airt, maintenance maint) {
        super(ticketPrice, numOfStops);
        this.airt = airt;
        this.maint = maint;
    }

    public AirCraft(AirCraft airc) {        //all the base class attribute should be declared here.
        this.airt = airc.airt;
        this.maint = airc.maint;
        setNumOfStops(airc.getNumOfStops());
        ticketPrice = airc.ticketPrice;
    }

    public maintenance getMaint() {
        return maint;
    }

    public void setMaint(maintenance maint) {
        this.maint = maint;
    }

    public airTransport getAirt() {
        return airt;
    }

    public void setAirt(airTransport airt) {
        this.airt = airt;
    }

    @Override
    public String toString() {
        return "AirCraft has ticket price " +
                ticketPrice +
                " and its number of stops is " + getNumOfStops() +
                "maintenance is by " + maint +
                ", airTransport is " + airt;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }else if(getClass() != obj.getClass()){     // or !(obj instanceof PublicTransportation)
            return false;
        }else{
            AirCraft a = (AirCraft) obj;
            return (maint.equals(a.maint)&& airt.equals(a.airt) &&
                    getNumOfStops()== a.getNumOfStops() &&
                    ticketPrice == a.ticketPrice);       //  numofstop is private and it is also from base class, it also has to be checked
        }
    }
}
