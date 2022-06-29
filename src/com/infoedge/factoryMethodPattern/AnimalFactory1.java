package com.infoedge.factoryMethodPattern;

public class AnimalFactory1 extends AnimalFactory {

    AnimalFactory1(int weigth){
        super(weigth);
    }
    public Animal factoryMethod(){
        Animal obj;
        if(this.weight>15)
        obj=new Dog();
        else
            obj=new Cat();
        return obj;
    }
}
