package com.vsk.practice.oops;

import java.util.ArrayList;
import java.util.Scanner;

public class Marks {
    private int mark;
    private String name;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Marks(int mark, String name) {
        this.mark = mark;
        this.name = name;
    }

    public static void main(String[] args) {
        Marks student1 = new Marks(56,"student1");
        Marks student2 = new Marks(50,"student2");
        Marks student3 = new Marks(86,"student3");
        Marks student4 = new Marks(16,"student4");
        Marks student5 = new Marks(46,"student5");
        ArrayList<Marks> a = new ArrayList<>();
        a.add(student1);
        a.add(student2);
        a.add(student3);
        a.add(student4);
        a.add(student5);
        //Scanner scan = new Scanner(System.in);
        String name = "student3";
        for(int i = 0; i <a.size(); i++){
            if(a.get(i).getName() == name){
                System.out.println(a.get(i).getMark());
            }
        }

    }
}
