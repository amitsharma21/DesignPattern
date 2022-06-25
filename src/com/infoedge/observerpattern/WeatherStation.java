package com.infoedge.observerpattern;
import java.util.*;
//this class is similar to ConcreteObservale
public class WeatherStation implements Iobservable {
    private int temprature;
    ArrayList<Iobserver> l1=new ArrayList<Iobserver>();
    public void attach(Iobserver obj){
        l1.add(obj);
    }
    public void detach(Iobserver obj){
        System.out.println("element removed");
    }
    public void notifyobserver(){
        for(int i=0;i<l1.size();i++){
            l1.get(i).update();
        }
    }
    public int getTemprature(){
        return this.temprature;
    }
    public void setTemprature(){
        this.temprature=(int)(Math.random()*100);
        this.notifyobserver();
    }
}
