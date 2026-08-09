package com.test;
public class TestSubscriber {

    public static void main(String[] args) {

        Subscriber sub1 = new Subscriber("Sai", "18", "1234567890");
        
        Subscriber sub2 = new Subscriber("havi", "18", "1234567890");
        
        Subscriber sub3 = new Subscriber("shui", "18", "1234567890");
        
        Subscriber sub4 = new Subscriber("cheekar", "18", "1234567890");
        

        WLS wls = new WLS();
        BBL bbl = new BBL();

        sub1.info();
        sub2.info();
        sub3.info();
        sub4.info();

        wls.info();
        bbl.info();

        sub1.makecall();
        sub1.receivecall();

        wls.sendMessage();
        wls.receiveMessage();
        wls.

    }
}
