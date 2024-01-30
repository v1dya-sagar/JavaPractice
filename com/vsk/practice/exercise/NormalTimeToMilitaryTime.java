package com.vsk.practice.exercise;

public class NormalTimeToMilitaryTime {
    public static void main(String[] args) {
        normalTimeToMilitaryTime("04:59:56am");
        normalTimeToMilitaryTime("04:59:56am");
        normalTimeToMilitaryTime("01:01:00pm");
        normalTimeToMilitaryTime("12:01:00pm");
        normalTimeToMilitaryTime("07:59:56pm");
        normalTimeToMilitaryTime("08:31:00pm");
    }
    public static void normalTimeToMilitaryTime(String normalTime){
        String substring = normalTime.substring(0, normalTime.length() - 2);
        if(!isAm(normalTime.substring(normalTime.length() - 2))) {
            String hourString = normalTime.substring(0, 2);
            if (!hourString.equals("12")) {
                System.out.println(Integer.parseInt(hourString) + 12
                        + normalTime.substring(2, normalTime.length() - 2));
            } 
                else {
                    System.out.println(substring);
                }
            
        }
            else {
                System.out.println(substring);
            }

        }

    public static boolean isAm(String normalTimeSubString){
        return normalTimeSubString.equals("am");
    }
}

