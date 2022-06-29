package com.infoedge.factoryMethodPattern;

public abstract class AnimalFactory {
    int weight;
    AnimalFactory(int weight){
        this.weight=weight;
    }
    public Animal doSomething(){
        Animal obj=factoryMethod();
        return obj;
    }
    public abstract Animal factoryMethod();
}
