package com.company;



import java.util.ArrayList;
public class Lab10 {

    private BusTime departure;
    private Number busNumber;
    private DayWeek day;
    private Seats freeSeats;
    private Route route;

    public Lab10(BusTime departure, Number busNumber, DayWeek day, Seats freeSeats, Route route) {
        this.departure = departure;
        this.busNumber = busNumber;
        this.day = day;
        this.freeSeats = freeSeats;
        this.route = route;
    }

    public BusTime getDeparture() {
        return departure;
    }

    public Number getBusNumber() {
        return busNumber;
    }

    public DayWeek getDay() {
        return day;
    }

    public Seats getFreeSeats() {
        return freeSeats;
    }

    public Route getRoute() {
        return route;
    }
}


class Direction {

    private String station;
    private String arrivalTime;

    public Direction(String station, String arrivalTime) {
        this.station = station;
        this.arrivalTime = arrivalTime;
    }

    public String getStation() {
        return station;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }
}



class Route {

    private ArrayList<Direction> route;

    public Route(ArrayList<Direction> route) {
        this.route = route;
    }

    public ArrayList<Direction> getRoute() {
        return route;
    }
}
class Seats {

    private int seats;

    public Seats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    private boolean hasFreeSeats() {
        return seats > 0;
    }
}
class Number {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isValid() {
        return this.number > 0;
    }


}