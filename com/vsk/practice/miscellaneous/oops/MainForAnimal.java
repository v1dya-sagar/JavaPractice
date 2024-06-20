package com.vsk.practice.miscellaneous.oops;

public class MainForAnimal {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("dog",2,30,2,4,1,30,"fur");
//        dog.eat();
        dog.eat();
        animal.move(10);
        animal.eat();
//        dog.run();

    }
}
