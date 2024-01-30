package com.vsk.practice.exercise;

public class student {
    private String name;
    private int roll_nol;
    private int age;

    public static void main(String[] args) {
        student padma = new student("padma",2,56);
        System.out.println(padma.getAge());
        
    }

    public student(String name, int roll_nol, int age) {
        this.name = name;
        this.roll_nol = roll_nol;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_nol() {
        return roll_nol;
    }

    public void setRoll_nol(int roll_nol) {
        this.roll_nol = roll_nol;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
