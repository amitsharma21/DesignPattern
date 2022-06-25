package com.infoedge.observerpattern;

//we are taking example of weather station where WeatherStation is Observable and other stuff like phone laptops are observers.
public interface Iobservable {
    void attach(Iobserver obj);
    void detach(Iobserver obj);
    void notifyobserver();
}
