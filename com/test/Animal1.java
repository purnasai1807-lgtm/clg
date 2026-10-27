package com.test;

public class Animal {
    public void sound(){
        System.out.println("Animal is making sound");
    }
    public void eat(){
        System.out.println("Animal is eating cheekar");
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