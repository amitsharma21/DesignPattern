package com.infoedge.strategypattern;

public class MultiplyOperation implements Strategy {
    public int doOperation(int num1,int num2){
        return num1*num2;
    }
}
