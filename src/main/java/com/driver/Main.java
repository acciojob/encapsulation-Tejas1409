package com.driver;

public class Main {
    public static void main(String [] args){
   RWOnly obj;

    {
        obj = new RWOnly();
    }
   obj.setA("Tejas");

    obj.getA();
    }
}
