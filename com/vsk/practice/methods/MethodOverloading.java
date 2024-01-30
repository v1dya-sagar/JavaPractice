package com.vsk.practice.methods;

public class MethodOverloading {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet and inches");
            return -1;
        }
        double centimeter = (feet * 12) * 2.54;
        centimeter += inches * 2.54;
        System.out.println(centimeter);
        return centimeter;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0 ){
            return -1;
        }

        double feet = (int) inches /12;
        double remainingInches = (int) inches % 12;
        System.out.println("Inches is equal to " + feet + "feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet , remainingInches);
    }
    }


