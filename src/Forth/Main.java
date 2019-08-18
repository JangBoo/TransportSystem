package Forth;

import First.PublicTransportation;
import Second.CityBus;
import Second.Metro;
import Second.Tram;
import Thrid.Ferry;
// -----------------------------------------------------

// Due Date feb 20
// Assignment 2
// Part: part 1,2
// Written by: Janghyuk Boo 40005573
// -----------------------------------------------------
;

public class Main {

    public static void main(String[] args) {

        PublicTransportation pt1 = new PublicTransportation();
        PublicTransportation pt2 = new PublicTransportation(55, 5);
        PublicTransportation pt3 = new PublicTransportation(65, 10);
        CityBus cb1 = new CityBus();
        CityBus cb2 = new CityBus(23, 50, 5, 2015, "line cb2", "michael");
        CityBus cb3 = new CityBus(21, 55, 3, 2013, "line cb1", "john");
        Metro mtr1 = new Metro();
        Metro mtr2 = new Metro(22, 10, 3, 2011, "line mtr2", "lili", 3, "jeju");
        Metro mtr3 = new Metro(100, 1, 4, 2000, "line mtr3","lolo", 2, "seoul");
        Tram trm1 = new Tram();
        Tram trm2 = new Tram(14, 1, 3, 2002, "line trm2", "lala", 100);
        Tram trm3 = new Tram(1 ,3 ,1 ,2020, "linetrm3", "lele", 200);
        Ferry fry1 = new Ferry();
        Ferry fry2 = new Ferry(30, 10, 2012, "line fry2");
        Ferry fry3 = new Ferry(32, 1, 2020, "line fry3");
        AirCraft airc1 = new AirCraft();

        AirCraft airc2 = new AirCraft(23, 5, AirCraft.airTransport.Airline, AirCraft.maintenance.Montly );
        AirCraft airc3 = new AirCraft();
        System.out.println("testing equal");
        if(airc2.equals(airc3)){
            System.out.println(" it is equal");
        }else{ System.out.println("it is not equal");}

        System.out.println("testing tostring");
        System.out.println(pt1 +"\n"+ cb2 +"\n"+ mtr3 +"\n"+ trm1 +"\n"+fry1 +"\n"+ airc1);

        PublicTransportation[] publicTransportArray = new PublicTransportation[15];
        publicTransportArray[0] = pt1;
        publicTransportArray[1] = pt2;
        publicTransportArray[2] = pt3;
        publicTransportArray[3] = cb1;
        publicTransportArray[4] = cb2;
        publicTransportArray[5] = cb3;
        publicTransportArray[6] = mtr1;
        publicTransportArray[7] = mtr2;
        publicTransportArray[8] = mtr3;
        publicTransportArray[9] = trm1;
        publicTransportArray[10] = trm2;
        publicTransportArray[11] = trm3;
        publicTransportArray[12] = fry1;
        publicTransportArray[13] = fry2;
        publicTransportArray[14] = airc1;
        System.out.println("it is the most least");
        displayMostLeast(publicTransportArray);
        System.out.println("it is the bad copy");
        PublicTransportation[] copy = badcopy(publicTransportArray);
       // System.out.println("it is after the copy");
        display(copy);
        System.out.println("it is good copy citybus");
        PublicTransportation[] copytwo = copyCityBusstwo(publicTransportArray);
        display(copytwo);


    }
    public static void displayMostLeast(PublicTransportation[] pta){
        double min = pta[0].getTicketPrice();
        int mincount = 0;
        for(int i = 0; i<pta.length; i++){
            if(pta[i].getTicketPrice()<min){
                min =pta[i].getTicketPrice();
                mincount= i;
            }

        }

        System.out.println("The index of least expensive is " +mincount);
        System.out.println(pta[mincount]);
        double max = pta[0].getTicketPrice();
        int maxcount = 0;
        for(int i = 0; i<pta.length; i++){
            if(pta[i].getTicketPrice()>max){
                max =pta[i].getTicketPrice();
                maxcount= i;
            }
        }


        System.out.println("The index of most expensive is " +maxcount);
        System.out.println(pta[maxcount]);


    }

    public static PublicTransportation[] badcopy(PublicTransportation[] pt){
        int count= 0;

        for(int i =0 ; i<pt.length; i++){
            if(pt[i].getClass().toString().substring(13).equals("CityBus") ){
                count++;
            }
        }
        PublicTransportation[] badcopy = new PublicTransportation[count];
        int counttwo = 0;
        for(int i =0 ; i<pt.length; i++){
            if(pt[i].getClass().toString().substring(13).equals("CityBus")) {
                badcopy[counttwo] = new PublicTransportation(pt[i]);
                counttwo++;
            }
        }
        return badcopy;// doesn't work because of the limitations of the copy constructor . it should use clone instead it also uses copyconstructor.
    }
    public static PublicTransportation[] copyCityBusstwo(PublicTransportation[] pt){
        int count= 0;

        for(int i =0 ; i<pt.length; i++){
            if(pt[i].getClass().toString().substring(13).equals("CityBus") ){

                count++;
            }
        }
        PublicTransportation[] ptCopy = new PublicTransportation[count];
        int counttwo = 0;
        for(int i =0 ; i<pt.length; i++) {
            if(pt[i].getClass().toString().substring(13).equals("CityBus")) {
                ptCopy[counttwo] = pt[i].clone();
                counttwo++;
            }
        }
        return ptCopy;// doesn't work because of the limitations of the copy constructor . it should use clone instead it also uses copyconstructor.
    }
    public static void display(PublicTransportation[] pt){
        for(int i =0; i<pt.length; i++){
            System.out.println(pt[i]);
        }

    }
}
