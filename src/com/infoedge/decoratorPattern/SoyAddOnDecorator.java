package com.infoedge.decoratorPattern;

public class SoyAddOnDecorator extends AddOnDecorator {
    Beverage obj;
    SoyAddOnDecorator(Beverage obj){
        this.obj=obj;
    }
    public int cost(){
        return this.obj.cost()+11;
    }
}
