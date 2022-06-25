package com.infoedge.strategypattern;

public class Context {
    Strategy obj;
    Context(Strategy obj){
        this.obj=obj;
    }
    public int executeOperation(int num1,int num2){
        return obj.doOperation(num1,num2);
    }
}
