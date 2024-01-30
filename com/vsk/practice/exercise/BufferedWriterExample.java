package com.vsk.practice.exercise;

import java.io.*;
public class BufferedWriterExample {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("D:\\testout.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Reading from buffer.");
        buffer.close();
        System.out.println("Success");
    }
}
