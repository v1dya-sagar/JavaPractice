package com.vsk.practice.miscellaneous.datatype;

public class datatypes {
    public static void main (String[] args){
        int myNumber = Integer.MAX_VALUE;
        System.out.println("Maximum Number = " + (myNumber));

        byte myByteSmall = Byte.MIN_VALUE;
        byte myByteBig = Byte.MAX_VALUE;
        System.out.println("Max Byte = " + myByteBig);
        System.out.println("Min Byte = " + myByteSmall);

        short myShortSmall = Short.MIN_VALUE;
        short myShortBig = Short.MAX_VALUE;
        System.out.println("Max Short = " + myShortBig);
        System.out.println("Min Short = " + myShortSmall);

        long myLongValue = 100L;
        long mylongSmall = Long.MIN_VALUE;
        long mylongBig = Long.MAX_VALUE;
        System.out.println("Max long = " + mylongBig);
        System.out.println("Min long = " + mylongSmall);

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000L + ( (myByte + myShort + myInt) * 10L);
        System.out.println(myLong);

        

    }
}
