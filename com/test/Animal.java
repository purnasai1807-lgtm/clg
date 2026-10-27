package com.test;

abstract public class Animal {
    abstract public void sound();
    
    abstract public void eat();
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog is eating cheekar ");
    }
    @Override
    public void sound(){
        System.out.println("dog is barking ");
    }
}

class cheekar extend Animal{
    @Override
    public void eat(){
        System.out.println("cheekar is eating  ");
    }
    @Override
    public void sound(){
        System.out.println("cheekar is barking ");
    }



}