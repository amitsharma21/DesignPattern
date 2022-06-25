package com.infoedge.strategypattern;

import com.infoedge.strategypattern.Strategy;

public class SubstractOperation implements Strategy {
    public int doOperation(int num1,int num2){
        return num1-num2;
    }
}
