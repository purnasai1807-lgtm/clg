package com.atm;
public class Bank {

    private String name;
    private long accno;
    private double bal;
    public Bank(String n,long a,double b){
            name=n;
            accno=a;
            bal=b;
    }
void printBalance(){
            System.out.println(name+" "+accno+" Your Current Bal is: "+bal);
    }
void deposit(double a){
    bal+= a;
}
void withdraw(double a){
    if(bal-a<500){
        System.out.println("Insufficent Balance");
        }
    else{
        bal-=a;
    }
}
}