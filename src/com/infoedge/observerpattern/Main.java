package com.infoedge.observerpattern;

public class Main {
    public static void main(String[] args){
        WeatherStation station1=new WeatherStation();
        Phone p1=new Phone(station1);
        Phone p2=new Phone(station1);
        station1.attach(p2);
        station1.attach(p1);
        station1.setTemprature();
        station1.setTemprature();
    }
}
