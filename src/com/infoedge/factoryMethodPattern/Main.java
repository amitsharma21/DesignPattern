package com.infoedge.factoryMethodPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int weight=sc.nextInt();
        AnimalFactory A=new AnimalFactory1(weight);
        Animal obj=A.doSomething();
        obj.sound();

    }
}
