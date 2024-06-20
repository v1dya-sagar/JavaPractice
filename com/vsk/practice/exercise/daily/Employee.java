package com.vsk.practice.exercise.daily;

public class Employee {
    private String name;
    private String title;
    private float salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void raiseSalary(float percentage){
        float hike = (percentage/100) * this.salary;
        this.salary = hike + this.salary;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setSalary(10000);
        emp1.setName("mike");
        emp1.setTitle("manager");
        emp1.raiseSalary(20);
        System.out.println(emp1.getSalary());
    }
}
