package com.vsk.practice.nptel.week3;


public class Circle extends Point {
    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point();
        p1.setX(0);
        p1.setY(0);
        p2.setX(3);
        p2.setY(3);
        Circle c1 = new Circle();
        System.out.println((float)c1.distance(p1,p2));

    }
    
}
