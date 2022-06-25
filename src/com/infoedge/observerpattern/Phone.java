package com.infoedge.observerpattern;

public class Phone implements Iobserver{
    WeatherStation station;
    Phone(WeatherStation station){
        this.station=station;
    }

    public void update(){
        System.out.println("new temp is "+ this.station.getTemprature());
    }
}
