package com.infoedge.decoratorPattern;

public class Main {
    public static void main(String[] args){
        CaramelAddOnDecorator drink=new CaramelAddOnDecorator(new Espresso());
        System.out.println(drink.cost());
    }
}
