package com.infoedge.decoratorPattern;

public class CaramelAddOnDecorator extends AddOnDecorator{
    Beverage obj;
    CaramelAddOnDecorator(Beverage obj){
        this.obj =obj;
    }
    public int cost(){
        return this.obj.cost()+10;
    }
}
