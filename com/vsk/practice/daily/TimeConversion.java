package com.vsk.practice.daily;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:59:56AM"));
    }
    public static String timeConversion(String s) {
        String meridian = s.substring(8,10);
        String hour = s.substring(0, 2);
        String minutesAndSeconds = s.substring(2, 8);
        String finalHour = "00" + minutesAndSeconds;

        if ("PM".equals(meridian)) {
            finalHour = !hour.equals("12") ? (String.valueOf(Integer.parseInt(hour) + 12) + minutesAndSeconds) : hour + minutesAndSeconds;
        } else {
            finalHour = !hour.equals("12") ? String.valueOf(hour) + minutesAndSeconds : finalHour;
        }
        return finalHour;
    }
}
