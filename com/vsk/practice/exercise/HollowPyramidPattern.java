package com.vsk.practice.exercise;

public class HollowPyramidPattern {
        public static void main(String[] args) {
            int n = 10;
            int middle_spaces = 1;
            for(int i = 1; i <= n; i++){
                int spaces = n - i;
                while(spaces != 0){
                    System.out.print(" ");
                    spaces--;
                }

                if(i == 1){
                    System.out.print("*");
                } else {

                    if(i == n){
                        for(int k = 1; k <= 2*n - 1; k++){
                            System.out.print("*");
                        }
                    }else{
                        System.out.print("*");
                        for(int a = 1; a <= middle_spaces; a++){
                            System.out.print(" ");
                        }
                        System.out.print("*");
                        middle_spaces+=2;
                    }
                }
                System.out.println();
            }
        }
}

//class HelloWorld {
//    public static void main(String[] args) {
//        int n = 5;
//        for(int i = 1; i <= n - 1; i++){
//            int spaces = n - i;
//            int j = 0;
//            while(spaces != 0){
//                System.out.print(" ");
//                spaces--;
//                j++;
//            }
//
//            for(; j <= n + i - 1;j++){
//                // System.out.print("*");
//                if(j == n - i || j == n + i - 2){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//
//            System.out.println();
//        }
//        for(int k = 1; k <= 2*n - 1; k++){
//            System.out.print("*");
//        }
//    }
//}

