package com.vsk.practice.daily;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setAge(4);
        dog1.setName("limey");
        dog1.setBreed("labrador");
        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());
        System.out.println(dog1.getBreed());

    }
}

