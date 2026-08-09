package com.test;

public class Animal {
    public void eat(){
        System.out.println("Animal is eating");
    }
    
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog is eating cheekar ");
    }
}
class TestAnimal{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
    }
}