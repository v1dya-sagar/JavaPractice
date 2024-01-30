package com.vsk.practice.oops;

public class Objects {
    private int roll_no;
    private String name;
    private int age;

    public Objects(int roll_no, String name, int age) {
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void properties(){
        System.out.println("The Properties : Roll_no name age");
    }

    public static void main(String[] args) {
        Objects student = new Objects(101,"padhu", 80);
        student.properties();
    }
}
