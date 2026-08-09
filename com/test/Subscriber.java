package com.test;

public class Subscriber {

    private String name;
    private String age;
    private String phonenumber;

    public Subscriber() {
        this.name = "Name";
        this.age = "Age";
        this.phonenumber = "Phone Number";
    }

    public Subscriber(String name, String age, String phonenumber) {
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
    }
    public void info() {
        System.out.println("Subscriber Name: " + name);
        System.out.println("Subscriber Age: " + age);
        System.out.println("Subscriber Phone Number: " + phonenumber);
    }
    public void makecall() {
        System.out.println("name  make call"+name );
    }
    public void receivecall() {
        System.out.println("Call received successfully!");
    }
}
class WLS extends Subscriber {
    long ime;
    public WLS (string name,long ime,long phonenumber){
        super(name,phonenumber);
        this.ime=ime;

    }
    public void sendMessage() {
        System.out.println("Message sent successfully!");
    }
    public void receiveMessage() {
        System.out.println("Message received successfully!");
    }
    public void endcall() {
        System.out.println("Call ended successfully!");
    }
    public void makecall() {
        System.out.println("Subscriber make call");
    }
    public void info() {
        super.info();
        System.out.println("WLS Information");
    }
    
}
