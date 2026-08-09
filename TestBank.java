package com.atm;

import com.atm.Bank;

class TestBank{
    public static void main(String[] args) {
        Bank b1 = new Bank("Srikar",1234,1000);
        Bank b2 = new Bank("Sushant",9876,2000);
        b1.deposit(5000);
        b2.withdraw(7000);
        b1.printBalance();
        b2.printBalance();
    }
}