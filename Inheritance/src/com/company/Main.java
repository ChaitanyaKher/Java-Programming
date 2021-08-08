package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal",1,1,5,50);

        Dog dog = new Dog("Yorkie",8,24,2,4,1,20,"Golden");
        dog.eat();
        System.out.println("name= "+dog.getName());
        System.out.println("brain= "+dog.getBrain());
        System.out.println("body= "+dog.getBody());
        System.out.println("size= "+dog.getSize());
        System.out.println("Animal size= "+animal.getSize());
        dog.walk();
        dog.run();
    }
}
