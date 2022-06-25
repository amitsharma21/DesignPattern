package com.infoedge.strategypattern;

public class Main {
    public static void main(String[] args){
        Context C1=new Context(new AddOperation());
        System.out.println("10 + 5 = "+C1.executeOperation(10,5));
        Context C2=new Context(new SubstractOperation());
        System.out.println("10 - 5 = "+C2.executeOperation(10,5));
        Context C3=new Context(new MultiplyOperation());
        System.out.println("10 * 5 = "+C3.executeOperation(10,5));
    }
}
